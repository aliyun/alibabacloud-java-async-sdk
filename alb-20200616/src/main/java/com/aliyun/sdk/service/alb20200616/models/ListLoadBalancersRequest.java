// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>ListLoadBalancersRequest</p>
 */
public class ListLoadBalancersRequest extends Request {
    @Query
    @NameInMap("AddressType")
    private String addressType;

    @Query
    @NameInMap("LoadBalancerBussinessStatus")
    private String loadBalancerBussinessStatus;

    @Query
    @NameInMap("LoadBalancerIds")
    private java.util.List < String > loadBalancerIds;

    @Query
    @NameInMap("LoadBalancerNames")
    private java.util.List < String > loadBalancerNames;

    @Query
    @NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VpcIds")
    private java.util.List < String > vpcIds;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ListLoadBalancersRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.loadBalancerBussinessStatus = builder.loadBalancerBussinessStatus;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.loadBalancerNames = builder.loadBalancerNames;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.payType = builder.payType;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vpcIds = builder.vpcIds;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return loadBalancerBussinessStatus
     */
    public String getLoadBalancerBussinessStatus() {
        return this.loadBalancerBussinessStatus;
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List < String > getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return loadBalancerNames
     */
    public java.util.List < String > getLoadBalancerNames() {
        return this.loadBalancerNames;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcIds
     */
    public java.util.List < String > getVpcIds() {
        return this.vpcIds;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListLoadBalancersRequest, Builder> {
        private String addressType; 
        private String loadBalancerBussinessStatus; 
        private java.util.List < String > loadBalancerIds; 
        private java.util.List < String > loadBalancerNames; 
        private String loadBalancerStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String payType; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > vpcIds; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListLoadBalancersRequest response) {
            super(response);
            this.addressType = response.addressType;
            this.loadBalancerBussinessStatus = response.loadBalancerBussinessStatus;
            this.loadBalancerIds = response.loadBalancerIds;
            this.loadBalancerNames = response.loadBalancerNames;
            this.loadBalancerStatus = response.loadBalancerStatus;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.payType = response.payType;
            this.resourceGroupId = response.resourceGroupId;
            this.tag = response.tag;
            this.vpcIds = response.vpcIds;
            this.zoneId = response.zoneId;
        } 

        /**
         * ???????????????????????????
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            this.putQueryParameter("LoadBalancerBussinessStatus", loadBalancerBussinessStatus);
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }

        /**
         * ??????ID?????????N????????????20
         */
        public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * ??????Name?????????N????????????10
         */
        public Builder loadBalancerNames(java.util.List < String > loadBalancerNames) {
            this.putQueryParameter("LoadBalancerNames", loadBalancerNames);
            this.loadBalancerNames = loadBalancerNames;
            return this;
        }

        /**
         * ????????????
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.putQueryParameter("LoadBalancerStatus", loadBalancerStatus);
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * ???????????????????????????????????????????????????????????????????????????1-100????????????????????????????????????20???
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * ?????????????????????????????????????????????????????????????????????
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ????????????
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * ?????????ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * tag??????
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * vpcId??????
         */
        public Builder vpcIds(java.util.List < String > vpcIds) {
            this.putQueryParameter("VpcIds", vpcIds);
            this.vpcIds = vpcIds;
            return this;
        }

        /**
         * ?????????ID
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListLoadBalancersRequest build() {
            return new ListLoadBalancersRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * ??????????????????
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * ??????????????????
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
