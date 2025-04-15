// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListFreeNodesRequest} extends {@link RequestModel}
 *
 * <p>ListFreeNodesRequest</p>
 */
public class ListFreeNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperatingStates")
    private java.util.List<String> operatingStates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListFreeNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.hpnZone = builder.hpnZone;
        this.machineType = builder.machineType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.operatingStates = builder.operatingStates;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFreeNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operatingStates
     */
    public java.util.List<String> getOperatingStates() {
        return this.operatingStates;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListFreeNodesRequest, Builder> {
        private String regionId; 
        private String hpnZone; 
        private String machineType; 
        private Long maxResults; 
        private String nextToken; 
        private java.util.List<String> operatingStates; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListFreeNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.hpnZone = request.hpnZone;
            this.machineType = request.machineType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.operatingStates = request.operatingStates;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Cluster number</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.putBodyParameter("HpnZone", hpnZone);
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>Machine type</p>
         * 
         * <strong>example:</strong>
         * <p>mock-machine-type2</p>
         */
        public Builder machineType(String machineType) {
            this.putBodyParameter("MachineType", machineType);
            this.machineType = machineType;
            return this;
        }

        /**
         * <p>Number of items per page for paginated queries, default is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Query token (Token), the value should be the NextToken parameter value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>a3f2224a5ec7224116c4f5246120abe4</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OperatingStates.
         */
        public Builder operatingStates(java.util.List<String> operatingStates) {
            this.putBodyParameter("OperatingStates", operatingStates);
            this.operatingStates = operatingStates;
            return this;
        }

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxno4vh5muoq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Tag information</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListFreeNodesRequest build() {
            return new ListFreeNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListFreeNodesRequest} extends {@link TeaModel}
     *
     * <p>ListFreeNodesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(maxLength = 129)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag object</p>
             * 
             * <strong>example:</strong>
             * <p>key_aa</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag object</p>
             * 
             * <strong>example:</strong>
             * <p>value_aa</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
