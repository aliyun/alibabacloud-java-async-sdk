// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeAndroidInstanceGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAndroidInstanceGroupsRequest</p>
 */
public class DescribeAndroidInstanceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List<String> instanceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupName")
    private String instanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeAndroidInstanceGroupsRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.instanceGroupIds = builder.instanceGroupIds;
        this.instanceGroupName = builder.instanceGroupName;
        this.keyPairId = builder.keyPairId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyGroupId = builder.policyGroupId;
        this.saleMode = builder.saleMode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAndroidInstanceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    /**
     * @return instanceGroupName
     */
    public String getInstanceGroupName() {
        return this.instanceGroupName;
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
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
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

    public static final class Builder extends Request.Builder<DescribeAndroidInstanceGroupsRequest, Builder> {
        private String bizRegionId; 
        private String chargeType; 
        private java.util.List<String> instanceGroupIds; 
        private String instanceGroupName; 
        private String keyPairId; 
        private Integer maxResults; 
        private String nextToken; 
        private String policyGroupId; 
        private String saleMode; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAndroidInstanceGroupsRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.instanceGroupIds = request.instanceGroupIds;
            this.instanceGroupName = request.instanceGroupName;
            this.keyPairId = request.keyPairId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyGroupId = request.policyGroupId;
            this.saleMode = request.saleMode;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The IDs of the instance groups.</p>
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.putQueryParameter("InstanceGroupIds", instanceGroupIds);
            this.instanceGroupIds = instanceGroupIds;
            return this;
        }

        /**
         * <p>The name of the instance group. Instance groups support fuzzy search by name.</p>
         * 
         * <strong>example:</strong>
         * <p>defaultInstanceGroup</p>
         */
        public Builder instanceGroupName(String instanceGroupName) {
            this.putQueryParameter("InstanceGroupName", instanceGroupName);
            this.instanceGroupName = instanceGroupName;
            return this;
        }

        /**
         * <p>The ID of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-5htf0ymsrnb7q****</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Value range: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-1b77w6xrqfubi****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The purchase mode of cloud phone instances.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Instance (default): the instance group mode.</li>
         * <li>Node: the matrix mode [whitelisted].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * <p>The status of the instance group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>UPDATING_FAILED: The image update for the instance group failed.</li>
         * <li>FAILED: The instance group failed to be created.</li>
         * <li>RUNNING: The instance group is available.</li>
         * <li>EXPIRED: The instance group expired.</li>
         * <li>DELETING: The instance group is being deleted.</li>
         * <li>DELETED: The instance group is deleted.</li>
         * <li>UPDATING: The instance group is undergoing an image update.</li>
         * <li>CREATING: The instance group is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAndroidInstanceGroupsRequest build() {
            return new DescribeAndroidInstanceGroupsRequest(this);
        } 

    } 

}
