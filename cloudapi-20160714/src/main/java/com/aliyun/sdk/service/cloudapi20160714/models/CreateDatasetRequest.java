// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @Query
    @NameInMap("DatasetName")
    @Validation(required = true)
    private String datasetName;

    @Query
    @NameInMap("DatasetType")
    @Validation(required = true)
    private String datasetType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.datasetName = builder.datasetName;
        this.datasetType = builder.datasetType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String datasetName; 
        private String datasetType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.datasetName = request.datasetName;
            this.datasetType = request.datasetType;
            this.securityToken = request.securityToken;
        } 

        /**
         * Dataset Name
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * The type of the dataset. Valid values:
         * <p>
         * 
         * *   JWT_BLOCKING: a JSON Web Token (JWT) blacklist
         * *   IP_WHITELIST_CIDR : an IP address whitelist
         * *   PARAMETER_ACCESS : parameter-based access control
         */
        public Builder datasetType(String datasetType) {
            this.putQueryParameter("DatasetType", datasetType);
            this.datasetType = datasetType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

}
