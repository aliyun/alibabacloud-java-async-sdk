// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDatasetItemInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatasetItemInfoRequest</p>
 */
public class DescribeDatasetItemInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetItemId")
    private String datasetItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeDatasetItemInfoRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetItemId = builder.datasetItemId;
        this.securityToken = builder.securityToken;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetItemInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDatasetItemInfoRequest, Builder> {
        private String datasetId; 
        private String datasetItemId; 
        private String securityToken; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatasetItemInfoRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetItemId = request.datasetItemId;
            this.securityToken = request.securityToken;
            this.value = request.value;
        } 

        /**
         * <p>The ID of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>62b91a790a693238********</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The ID of the data entry.</p>
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The value of the data entry.</p>
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
        public DescribeDatasetItemInfoRequest build() {
            return new DescribeDatasetItemInfoRequest(this);
        } 

    } 

}
