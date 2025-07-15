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
 * {@link LeaveMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>LeaveMessageGroupRequest</p>
 */
public class LeaveMessageGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BroadCastStatistics")
    private Boolean broadCastStatistics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BroadCastType")
    private Integer broadCastType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private LeaveMessageGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.broadCastStatistics = builder.broadCastStatistics;
        this.broadCastType = builder.broadCastType;
        this.groupId = builder.groupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LeaveMessageGroupRequest create() {
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
     * @return broadCastStatistics
     */
    public Boolean getBroadCastStatistics() {
        return this.broadCastStatistics;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<LeaveMessageGroupRequest, Builder> {
        private String appId; 
        private Boolean broadCastStatistics; 
        private Integer broadCastType; 
        private String groupId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(LeaveMessageGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.broadCastStatistics = request.broadCastStatistics;
            this.broadCastType = request.broadCastType;
            this.groupId = request.groupId;
            this.userId = request.userId;
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
         * <p>Specifies whether to broadcast statistical messages. If you set the value to true, statistical messages of the message group are broadcasted after the users join the message group. The client can receive and process these messages. Valid values:</p>
         * <ul>
         * <li>true: broadcasts statistical messages.</li>
         * <li>false: does not broadcast statistical messages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder broadCastStatistics(Boolean broadCastStatistics) {
            this.putBodyParameter("BroadCastStatistics", broadCastStatistics);
            this.broadCastStatistics = broadCastStatistics;
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
         * <p>The ID of the user. Each user has a unique ID in the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de1**a0</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public LeaveMessageGroupRequest build() {
            return new LeaveMessageGroupRequest(this);
        } 

    } 

}
