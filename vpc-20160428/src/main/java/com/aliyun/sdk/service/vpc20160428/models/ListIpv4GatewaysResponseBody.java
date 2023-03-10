// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpv4GatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpv4GatewaysResponseBody</p>
 */
public class ListIpv4GatewaysResponseBody extends TeaModel {
    @NameInMap("Ipv4GatewayModels")
    private java.util.List < Ipv4GatewayModels> ipv4GatewayModels;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListIpv4GatewaysResponseBody(Builder builder) {
        this.ipv4GatewayModels = builder.ipv4GatewayModels;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpv4GatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv4GatewayModels
     */
    public java.util.List < Ipv4GatewayModels> getIpv4GatewayModels() {
        return this.ipv4GatewayModels;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Ipv4GatewayModels> ipv4GatewayModels; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * Ipv4GatewayModels.
         */
        public Builder ipv4GatewayModels(java.util.List < Ipv4GatewayModels> ipv4GatewayModels) {
            this.ipv4GatewayModels = ipv4GatewayModels;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpv4GatewaysResponseBody build() {
            return new ListIpv4GatewaysResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Ipv4GatewayModels extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("Ipv4GatewayDescription")
        private String ipv4GatewayDescription;

        @NameInMap("Ipv4GatewayId")
        private String ipv4GatewayId;

        @NameInMap("Ipv4GatewayName")
        private String ipv4GatewayName;

        @NameInMap("Ipv4GatewayRouteTableId")
        private String ipv4GatewayRouteTableId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("VpcId")
        private String vpcId;

        private Ipv4GatewayModels(Builder builder) {
            this.enabled = builder.enabled;
            this.gmtCreate = builder.gmtCreate;
            this.ipv4GatewayDescription = builder.ipv4GatewayDescription;
            this.ipv4GatewayId = builder.ipv4GatewayId;
            this.ipv4GatewayName = builder.ipv4GatewayName;
            this.ipv4GatewayRouteTableId = builder.ipv4GatewayRouteTableId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4GatewayModels create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return ipv4GatewayDescription
         */
        public String getIpv4GatewayDescription() {
            return this.ipv4GatewayDescription;
        }

        /**
         * @return ipv4GatewayId
         */
        public String getIpv4GatewayId() {
            return this.ipv4GatewayId;
        }

        /**
         * @return ipv4GatewayName
         */
        public String getIpv4GatewayName() {
            return this.ipv4GatewayName;
        }

        /**
         * @return ipv4GatewayRouteTableId
         */
        public String getIpv4GatewayRouteTableId() {
            return this.ipv4GatewayRouteTableId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String gmtCreate; 
            private String ipv4GatewayDescription; 
            private String ipv4GatewayId; 
            private String ipv4GatewayName; 
            private String ipv4GatewayRouteTableId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String vpcId; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Ipv4GatewayDescription.
             */
            public Builder ipv4GatewayDescription(String ipv4GatewayDescription) {
                this.ipv4GatewayDescription = ipv4GatewayDescription;
                return this;
            }

            /**
             * Ipv4GatewayId.
             */
            public Builder ipv4GatewayId(String ipv4GatewayId) {
                this.ipv4GatewayId = ipv4GatewayId;
                return this;
            }

            /**
             * Ipv4GatewayName.
             */
            public Builder ipv4GatewayName(String ipv4GatewayName) {
                this.ipv4GatewayName = ipv4GatewayName;
                return this;
            }

            /**
             * Ipv4GatewayRouteTableId.
             */
            public Builder ipv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
                this.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Ipv4GatewayModels build() {
                return new Ipv4GatewayModels(this);
            } 

        } 

    }
}
