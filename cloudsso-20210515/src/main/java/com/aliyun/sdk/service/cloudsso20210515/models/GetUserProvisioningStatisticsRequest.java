// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserProvisioningStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetUserProvisioningStatisticsRequest</p>
 */
public class GetUserProvisioningStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserProvisioningId")
    private String userProvisioningId;

    private GetUserProvisioningStatisticsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.userProvisioningId = builder.userProvisioningId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return userProvisioningId
     */
    public String getUserProvisioningId() {
        return this.userProvisioningId;
    }

    public static final class Builder extends Request.Builder<GetUserProvisioningStatisticsRequest, Builder> {
        private String directoryId; 
        private String userProvisioningId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserProvisioningStatisticsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.userProvisioningId = request.userProvisioningId;
        } 

        /**
         * The ID of the resource directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the RAM user provisioning.
         */
        public Builder userProvisioningId(String userProvisioningId) {
            this.putQueryParameter("UserProvisioningId", userProvisioningId);
            this.userProvisioningId = userProvisioningId;
            return this;
        }

        @Override
        public GetUserProvisioningStatisticsRequest build() {
            return new GetUserProvisioningStatisticsRequest(this);
        } 

    } 

}
