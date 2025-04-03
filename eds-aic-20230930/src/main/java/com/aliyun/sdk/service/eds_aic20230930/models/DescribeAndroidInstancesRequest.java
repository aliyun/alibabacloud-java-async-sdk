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
 * {@link DescribeAndroidInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAndroidInstancesRequest</p>
 */
public class DescribeAndroidInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceName")
    private String androidInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

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
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeAndroidInstancesRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.androidInstanceName = builder.androidInstanceName;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.instanceGroupId = builder.instanceGroupId;
        this.instanceGroupIds = builder.instanceGroupIds;
        this.instanceGroupName = builder.instanceGroupName;
        this.keyPairId = builder.keyPairId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.saleMode = builder.saleMode;
        this.status = builder.status;
        this.tag = builder.tag;
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
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return androidInstanceName
     */
    public String getAndroidInstanceName() {
        return this.androidInstanceName;
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
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
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

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeAndroidInstancesRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private String androidInstanceName; 
        private String bizRegionId; 
        private String chargeType; 
        private String instanceGroupId; 
        private java.util.List<String> instanceGroupIds; 
        private String instanceGroupName; 
        private String keyPairId; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeId; 
        private String nodeName; 
        private String saleMode; 
        private String status; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAndroidInstancesRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.androidInstanceName = request.androidInstanceName;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.instanceGroupId = request.instanceGroupId;
            this.instanceGroupIds = request.instanceGroupIds;
            this.instanceGroupName = request.instanceGroupName;
            this.keyPairId = request.keyPairId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.saleMode = request.saleMode;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * <p>The IDs of the instances.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder androidInstanceName(String androidInstanceName) {
            this.putQueryParameter("AndroidInstanceName", androidInstanceName);
            this.androidInstanceName = androidInstanceName;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/2807298.html">DescribeRegions</a> operation to query the regions where Cloud Phone is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
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
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-25nt4kk9whjh****</p>
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
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
         * <p>The name of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceGroupName(String instanceGroupName) {
            this.putQueryParameter("InstanceGroupName", instanceGroupName);
            this.instanceGroupName = instanceGroupName;
            return this;
        }

        /**
         * <p>The ID of the bound key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-5hh431emkpuoi****</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_id</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_name</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The sales mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Instance: the standard mode.</li>
         * <li>Node: the node mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * <p>The state of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>BACKUPING: The instance is being backed up.</li>
         * <li>STARTING: The instance is being started.</li>
         * <li>RUNNING: The instance group is available.</li>
         * <li>DELETING: The instance is being deleted.</li>
         * <li>BACKUP_FAILED: The backup operation failed.</li>
         * <li>DELETED: The instance is deleted.</li>
         * <li>FAILED: The instance failed to be created.</li>
         * <li>STOPPED: The instance is stopped.</li>
         * <li>RECOVERING: The instance has an ongoing file recovery task.</li>
         * <li>UNAVAILABLE: The instance has an exception.</li>
         * <li>REBOOTING: The instance is being restarted.</li>
         * <li>RESETTING: The instance is being reset.</li>
         * <li>STOPPING: The instance is being stopped.</li>
         * <li>RECOVER_FAILED: The file recovery task failed.</li>
         * <li>CREATING: The instance is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the resources.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeAndroidInstancesRequest build() {
            return new DescribeAndroidInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAndroidInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeAndroidInstancesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
