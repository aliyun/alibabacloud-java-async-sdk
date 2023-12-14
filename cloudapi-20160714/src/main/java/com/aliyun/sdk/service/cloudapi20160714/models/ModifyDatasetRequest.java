// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatasetRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatasetRequest</p>
 */
public class ModifyDatasetRequest extends Request {
    @Query
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    @Query
    @NameInMap("DatasetName")
    @Validation(required = true)
    private String datasetName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyDatasetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetName = builder.datasetName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatasetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyDatasetRequest, Builder> {
        private String datasetId; 
        private String datasetName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatasetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetName = request.datasetName;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the dataset.
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * The name of the dataset.
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
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
        public ModifyDatasetRequest build() {
            return new ModifyDatasetRequest(this);
        } 

    } 

}
