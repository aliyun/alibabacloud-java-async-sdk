// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetContainerConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetContainerConfigurationRequest</p>
 */
public class GetContainerConfigurationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    private GetContainerConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContainerConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<GetContainerConfigurationRequest, Builder> {
        private String appId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetContainerConfigurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
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
         * The ID of the instance group.
         * <p>
         * 
         * *   If this parameter is specified, this operation queries the Tomcat configuration of the instance group.
         * *   If this parameter is not specified, this operation queries the Tomcat configuration of the application.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetContainerConfigurationRequest build() {
            return new GetContainerConfigurationRequest(this);
        } 

    } 

}
