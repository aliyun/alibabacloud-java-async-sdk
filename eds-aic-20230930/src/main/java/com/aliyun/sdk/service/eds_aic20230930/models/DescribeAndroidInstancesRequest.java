// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAndroidInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAndroidInstancesRequest</p>
 */
public class DescribeAndroidInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List < String > androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceName")
    private String androidInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeAndroidInstancesRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.androidInstanceName = builder.androidInstanceName;
        this.instanceGroupId = builder.instanceGroupId;
        this.keyPairId = builder.keyPairId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.saleMode = builder.saleMode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAndroidInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List < String > getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return androidInstanceName
     */
    public String getAndroidInstanceName() {
        return this.androidInstanceName;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeAndroidInstancesRequest, Builder> {
        private java.util.List < String > androidInstanceIds; 
        private String androidInstanceName; 
        private String instanceGroupId; 
        private String keyPairId; 
        private Integer maxResults; 
        private String nextToken; 
        private String saleMode; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAndroidInstancesRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.androidInstanceName = request.androidInstanceName;
            this.instanceGroupId = request.instanceGroupId;
            this.keyPairId = request.keyPairId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.saleMode = request.saleMode;
            this.status = request.status;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List < String > androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * AndroidInstanceName.
         */
        public Builder androidInstanceName(String androidInstanceName) {
            this.putQueryParameter("AndroidInstanceName", androidInstanceName);
            this.androidInstanceName = androidInstanceName;
            return this;
        }

        /**
         * InstanceGroupId.
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * KeyPairId.
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SaleMode.
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAndroidInstancesRequest build() {
            return new DescribeAndroidInstancesRequest(this);
        } 

    } 

}
