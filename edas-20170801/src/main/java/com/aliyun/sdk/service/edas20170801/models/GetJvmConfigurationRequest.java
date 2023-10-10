// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJvmConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetJvmConfigurationRequest</p>
 */
public class GetJvmConfigurationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    private GetJvmConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJvmConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<GetJvmConfigurationRequest, Builder> {
        private String appId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetJvmConfigurationRequest request) {
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
         * *   If an ID is specified, this operation queries the JVM configuration information of the instance group.
         * *   If an ID is not specified, this operation queries the JVM configuration information of the application.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetJvmConfigurationRequest build() {
            return new GetJvmConfigurationRequest(this);
        } 

    } 

}
