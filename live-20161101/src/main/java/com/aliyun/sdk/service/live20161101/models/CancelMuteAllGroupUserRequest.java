// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelMuteAllGroupUserRequest} extends {@link RequestModel}
 *
 * <p>CancelMuteAllGroupUserRequest</p>
 */
public class CancelMuteAllGroupUserRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("OperatorUserId")
    private String operatorUserId;

    private CancelMuteAllGroupUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
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
        private String groupId; 
        private String operatorUserId; 

        private Builder() {
            super();
        } 

        private Builder(CancelMuteAllGroupUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.operatorUserId = request.operatorUserId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OperatorUserId.
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
