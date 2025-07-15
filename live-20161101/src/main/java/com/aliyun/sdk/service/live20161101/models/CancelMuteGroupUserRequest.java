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
 * {@link CancelMuteGroupUserRequest} extends {@link RequestModel}
 *
 * <p>CancelMuteGroupUserRequest</p>
 */
public class CancelMuteGroupUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BroadCastType")
    private Integer broadCastType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CancelMuteUserList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> cancelMuteUserList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperatorUserId")
    private String operatorUserId;

    private CancelMuteGroupUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.broadCastType = builder.broadCastType;
        this.cancelMuteUserList = builder.cancelMuteUserList;
        this.groupId = builder.groupId;
        this.operatorUserId = builder.operatorUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelMuteGroupUserRequest create() {
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
     * @return cancelMuteUserList
     */
    public java.util.List<String> getCancelMuteUserList() {
        return this.cancelMuteUserList;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return operatorUserId
     */
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public static final class Builder extends Request.Builder<CancelMuteGroupUserRequest, Builder> {
        private String appId; 
        private Integer broadCastType; 
        private java.util.List<String> cancelMuteUserList; 
        private String groupId; 
        private String operatorUserId; 

        private Builder() {
            super();
        } 

        private Builder(CancelMuteGroupUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.broadCastType = request.broadCastType;
            this.cancelMuteUserList = request.cancelMuteUserList;
            this.groupId = request.groupId;
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
         * <p>The IDs of the users.</p>
         * <p>This parameter is required.</p>
         */
        public Builder cancelMuteUserList(java.util.List<String> cancelMuteUserList) {
            String cancelMuteUserListShrink = shrink(cancelMuteUserList, "CancelMuteUserList", "simple");
            this.putBodyParameter("CancelMuteUserList", cancelMuteUserListShrink);
            this.cancelMuteUserList = cancelMuteUserList;
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
        public CancelMuteGroupUserRequest build() {
            return new CancelMuteGroupUserRequest(this);
        } 

    } 

}
