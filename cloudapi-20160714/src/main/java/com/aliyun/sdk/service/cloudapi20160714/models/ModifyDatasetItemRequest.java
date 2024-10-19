// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDatasetItemRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatasetItemRequest</p>
 */
public class ModifyDatasetItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
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
         * <p>The ID of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a25a6589b2584ff490e891cc********</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The ID of the data entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5045****</p>
         */
        public Builder datasetItemId(String datasetItemId) {
            this.putQueryParameter("DatasetItemId", datasetItemId);
            this.datasetItemId = datasetItemId;
            return this;
        }

        /**
         * <p>The description of the data entry. The description cannot exceed 180 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The time in UTC when the data entry expires. The time is in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-22T12:00:00Z</p>
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
