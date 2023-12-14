// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatasetItemRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatasetItemRequest</p>
 */
public class ModifyDatasetItemRequest extends Request {
    @Query
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    @Query
    @NameInMap("DatasetItemId")
    @Validation(required = true)
    private String datasetItemId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExpiredTime")
    private String expiredTime;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyDatasetItemRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetItemId = builder.datasetItemId;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatasetItemRequest create() {
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
     * @return datasetItemId
     */
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyDatasetItemRequest, Builder> {
        private String datasetId; 
        private String datasetItemId; 
        private String description; 
        private String expiredTime; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatasetItemRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetItemId = request.datasetItemId;
            this.description = request.description;
            this.expiredTime = request.expiredTime;
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
         * The ID of the data entry.
         */
        public Builder datasetItemId(String datasetItemId) {
            this.putQueryParameter("DatasetItemId", datasetItemId);
            this.datasetItemId = datasetItemId;
            return this;
        }

        /**
         * The description of the data entry. The description cannot exceed 180 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The time in UTC when the data entry expires. The time is in the **yyyy-MM-ddTHH:mm:ssZ** format.
         */
        public Builder expiredTime(String expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
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
        public ModifyDatasetItemRequest build() {
            return new ModifyDatasetItemRequest(this);
        } 

    } 

}
