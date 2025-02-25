// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDatasetItemRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetItemRequest</p>
 */
public class CreateDatasetItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private CreateDatasetItemRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.securityToken = builder.securityToken;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetItemRequest create() {
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

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateDatasetItemRequest, Builder> {
        private String datasetId; 
        private String description; 
        private String expiredTime; 
        private String securityToken; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetItemRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.description = request.description;
            this.expiredTime = request.expiredTime;
            this.securityToken = request.securityToken;
            this.value = request.value;
        } 

        /**
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExpiredTime.
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>106.43.XXX.XXX</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateDatasetItemRequest build() {
            return new CreateDatasetItemRequest(this);
        } 

    } 

}
