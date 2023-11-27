// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserProvisioningConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetUserProvisioningConfigurationRequest</p>
 */
public class GetUserProvisioningConfigurationRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetUserProvisioningConfigurationRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<GetUserProvisioningConfigurationRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserProvisioningConfigurationRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public GetUserProvisioningConfigurationRequest build() {
            return new GetUserProvisioningConfigurationRequest(this);
        } 

    } 

}
