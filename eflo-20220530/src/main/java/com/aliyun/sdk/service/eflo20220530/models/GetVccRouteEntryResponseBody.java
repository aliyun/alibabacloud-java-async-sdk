// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetVccRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>GetVccRouteEntryResponseBody</p>
 */
public class GetVccRouteEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVccRouteEntryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVccRouteEntryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVccRouteEntryResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVccRouteEntryResponseBody build() {
            return new GetVccRouteEntryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVccRouteEntryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVccRouteEntryResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("VccId")
        private String vccId;

        @com.aliyun.core.annotation.NameInMap("VccRouteEntryId")
        private String vccRouteEntryId;

        private Content(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.gmtModified = builder.gmtModified;
            this.message = builder.message;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeType = builder.routeType;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.vccId = builder.vccId;
            this.vccRouteEntryId = builder.vccRouteEntryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return vccId
         */
        public String getVccId() {
            return this.vccId;
        }

        /**
         * @return vccRouteEntryId
         */
        public String getVccRouteEntryId() {
            return this.vccRouteEntryId;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String gmtModified; 
            private String message; 
            private String nextHopId; 
            private String nextHopType; 
            private String regionId; 
            private String resourceGroupId; 
            private String routeType; 
            private String status; 
            private String tenantId; 
            private String vccId; 
            private String vccRouteEntryId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.gmtModified = model.gmtModified;
                this.message = model.message;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.routeType = model.routeType;
                this.status = model.status;
                this.tenantId = model.tenantId;
                this.vccId = model.vccId;
                this.vccRouteEntryId = model.vccRouteEntryId;
            } 

            /**
             * <p>Destination CIDR Block</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The time when the agent was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Next Hop Instance</p>
             * 
             * <strong>example:</strong>
             * <p>local</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>Next Hop Type</p>
             * 
             * <strong>example:</strong>
             * <p>VCC</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2l4sq6l7u***</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Route type</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1655449505171</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the Lingjun connection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-cn-zvp2w222001</p>
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            /**
             * <p>The ID of the route entry.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-rte-31ocvdhq</p>
             */
            public Builder vccRouteEntryId(String vccRouteEntryId) {
                this.vccRouteEntryId = vccRouteEntryId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
