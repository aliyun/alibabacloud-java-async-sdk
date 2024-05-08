// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatasetInfoRequest</p>
 */
public class DescribeDatasetInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeDatasetInfoRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetInfoRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeDatasetInfoRequest, Builder> {
        private String datasetId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatasetInfoRequest request) {
            super(request);
            this.datasetId = request.datasetId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeDatasetInfoRequest build() {
            return new DescribeDatasetInfoRequest(this);
        } 

    } 

}
