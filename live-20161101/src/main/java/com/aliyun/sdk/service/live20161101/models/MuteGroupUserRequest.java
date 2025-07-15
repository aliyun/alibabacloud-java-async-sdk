// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MuteGroupUserRequest} extends {@link RequestModel}
 *
 * <p>MuteGroupUserRequest</p>
 */
public class MuteGroupUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BroadCastType")
    private Integer broadCastType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MuteTime")
    private Integer muteTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MuteUserList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> muteUserList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperatorUserId")
    private String operatorUserId;

    private MuteGroupUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.broadCastType = builder.broadCastType;
        this.groupId = builder.groupId;
        this.muteTime = builder.muteTime;
        this.muteUserList = builder.muteUserList;
        this.operatorUserId = builder.operatorUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MuteGroupUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return broadCastType
     */
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return muteTime
     */
    public Integer getMuteTime() {
        return this.muteTime;
    }

    /**
     * @return muteUserList
     */
    public java.util.List<String> getMuteUserList() {
        return this.muteUserList;
    }

    /**
     * @return operatorUserId
     */
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public static final class Builder extends Request.Builder<MuteGroupUserRequest, Builder> {
        private String appId; 
        private Integer broadCastType; 
        private String groupId; 
        private Integer muteTime; 
        private java.util.List<String> muteUserList; 
        private String operatorUserId; 

        private Builder() {
            super();
        } 

        private Builder(MuteGroupUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.broadCastType = request.broadCastType;
            this.groupId = request.groupId;
            this.muteTime = request.muteTime;
            this.muteUserList = request.muteUserList;
            this.operatorUserId = request.operatorUserId;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The mode in which system messages are broadcasted. Valid values:</p>
         * <ul>
         * <li>0: specifies that system messages are not broadcasted. This is the default value.</li>
         * <li>1: specifies that system messages are broadcasted to specified users.</li>
         * <li>2: specifies that system messages are broadcasted to the message group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder broadCastType(Integer broadCastType) {
            this.putBodyParameter("BroadCastType", broadCastType);
            this.broadCastType = broadCastType;
            return this;
        }

        /**
         * <p>The ID of the message group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The duration of the mute. Unit: seconds.</p>
         * <blockquote>
         * <p>If you do not specify this parameter or set the value to 0, the default duration of 86,400 seconds is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder muteTime(Integer muteTime) {
            this.putBodyParameter("MuteTime", muteTime);
            this.muteTime = muteTime;
            return this;
        }

        /**
         * <p>Details about the mute.</p>
         * <p>This parameter is required.</p>
         */
        public Builder muteUserList(java.util.List<String> muteUserList) {
            String muteUserListShrink = shrink(muteUserList, "MuteUserList", "simple");
            this.putBodyParameter("MuteUserList", muteUserListShrink);
            this.muteUserList = muteUserList;
            return this;
        }

        /**
         * <p>The ID of the user who performs the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>de1**a0</p>
         */
        public Builder operatorUserId(String operatorUserId) {
            this.putBodyParameter("OperatorUserId", operatorUserId);
            this.operatorUserId = operatorUserId;
            return this;
        }

        @Override
        public MuteGroupUserRequest build() {
            return new MuteGroupUserRequest(this);
        } 

    } 

}
