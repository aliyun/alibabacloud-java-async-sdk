// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeployGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeployGroupRequest</p>
 */
public class DeleteDeployGroupRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    private DeleteDeployGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeployGroupRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<DeleteDeployGroupRequest, Builder> {
        private String appId; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeployGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupName = request.groupName;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the instance group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public DeleteDeployGroupRequest build() {
            return new DeleteDeployGroupRequest(this);
        } 

    } 

}
