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
 * {@link CancelMuteAllGroupUserRequest} extends {@link RequestModel}
 *
 * <p>CancelMuteAllGroupUserRequest</p>
 */
public class CancelMuteAllGroupUserRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OperatorUserId")
    private String operatorUserId;

    private CancelMuteAllGroupUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.broadCastType = builder.broadCastType;
        this.groupId = builder.groupId;
        this.operatorUserId = builder.operatorUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelMuteAllGroupUserRequest create() {
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
     * @return operatorUserId
     */
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public static final class Builder extends Request.Builder<CancelMuteAllGroupUserRequest, Builder> {
        private String appId; 
        private Integer broadCastType; 
        private String groupId; 
        private String operatorUserId; 

        private Builder() {
            super();
        } 

        private Builder(CancelMuteAllGroupUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.broadCastType = request.broadCastType;
            this.groupId = request.groupId;
            this.operatorUserId = request.operatorUserId;
        } 

        /**
         * <p>Interactive message application ID.</p>
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
         * <p>系统消息扩散类型，取值：</p>
         * <ul>
         * <li><p>0：不扩散。</p>
         * </li>
         * <li><p>1：扩散到指定人。</p>
         * </li>
         * <li><p>2：扩散到群组。</p>
         * </li>
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
         * <p>Message group ID.</p>
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
         * <p>Operator&quot;s UserId. &gt; This parameter is required and the user must be the creator of the group.</p>
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
        public CancelMuteAllGroupUserRequest build() {
            return new CancelMuteAllGroupUserRequest(this);
        } 

    } 

}
