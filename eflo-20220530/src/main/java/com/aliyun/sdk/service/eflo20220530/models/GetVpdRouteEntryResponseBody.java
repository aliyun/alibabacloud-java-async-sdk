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
 * {@link GetVpdRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpdRouteEntryResponseBody</p>
 */
public class GetVpdRouteEntryResponseBody extends TeaModel {
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

    private GetVpdRouteEntryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdRouteEntryResponseBody create() {
        return builder().build();
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
         * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVpdRouteEntryResponseBody build() {
            return new GetVpdRouteEntryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpdRouteEntryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpdRouteEntryResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

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

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdRouteEntryId")
        private String vpdRouteEntryId;

        private Content(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.gmtModified = builder.gmtModified;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeType = builder.routeType;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.vpdId = builder.vpdId;
            this.vpdRouteEntryId = builder.vpdRouteEntryId;
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
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdRouteEntryId
         */
        public String getVpdRouteEntryId() {
            return this.vpdRouteEntryId;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String gmtModified; 
            private String nextHopId; 
            private String nextHopType; 
            private String regionId; 
            private String resourceGroupId; 
            private String routeType; 
            private String status; 
            private String tenantId; 
            private String vpdId; 
            private String vpdRouteEntryId; 

            /**
             * <p>Destination CIDR block</p>
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
             * <p>1678273219000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Next Hop Instance</p>
             * 
             * <strong>example:</strong>
             * <p>er-bmlqiym1</p>
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * <p>Next Hop Instance Type</p>
             * 
             * <strong>example:</strong>
             * <p>ER</p>
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
             * <p>rg-acfmv7mcq63uyhq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Route type</p>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
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
             * <p>Lingjun CIDR block instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-ze3na0wf</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>Lingjun CIDR block route entry ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-rte-toekyqel</p>
             */
            public Builder vpdRouteEntryId(String vpdRouteEntryId) {
                this.vpdRouteEntryId = vpdRouteEntryId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
