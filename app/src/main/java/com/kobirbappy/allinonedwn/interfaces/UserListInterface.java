package com.kobirbappy.allinonedwn.interfaces;


import com.kobirbappy.allinonedwn.model.FBStoryModel.NodeModel;
import com.kobirbappy.allinonedwn.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
