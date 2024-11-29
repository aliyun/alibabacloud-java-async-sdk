// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRouteEntriesResponseBody</p>
 */
public class DeleteRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("FailedRouteEntries")
    private java.util.List < FailedRouteEntries> failedRouteEntries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    private DeleteRouteEntriesResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.failedRouteEntries = builder.failedRouteEntries;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRouteEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedCount
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return failedRouteEntries
     */
    public java.util.List < FailedRouteEntries> getFailedRouteEntries() {
        return this.failedRouteEntries;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private Integer failedCount; 
        private java.util.List < FailedRouteEntries> failedRouteEntries; 
        private String requestId; 
        private Integer successCount; 

        /**
         * <p>The number of route entries that failed to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The information about the route entry that failed to be deleted.</p>
         */
        public Builder failedRouteEntries(java.util.List < FailedRouteEntries> failedRouteEntries) {
            this.failedRouteEntries = failedRouteEntries;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of route entries that were deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DeleteRouteEntriesResponseBody build() {
            return new DeleteRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteRouteEntriesResponseBody</p>
     */
    public static class FailedRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstCidrBlock")
        private String dstCidrBlock;

        @com.aliyun.core.annotation.NameInMap("FailedCode")
        private String failedCode;

        @com.aliyun.core.annotation.NameInMap("FailedMessage")
        private String failedMessage;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        private FailedRouteEntries(Builder builder) {
            this.dstCidrBlock = builder.dstCidrBlock;
            this.failedCode = builder.failedCode;
            this.failedMessage = builder.failedMessage;
            this.nextHop = builder.nextHop;
            this.routeEntryId = builder.routeEntryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedRouteEntries create() {
            return builder().build();
        }

        /**
         * @return dstCidrBlock
         */
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        /**
         * @return failedCode
         */
        public String getFailedCode() {
            return this.failedCode;
        }

        /**
         * @return failedMessage
         */
        public String getFailedMessage() {
            return this.failedMessage;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return routeEntryId
         */
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public static final class Builder {
            private String dstCidrBlock; 
            private String failedCode; 
            private String failedMessage; 
            private String nextHop; 
            private String routeEntryId; 

            /**
             * <p>The destination CIDR block of the route entry that failed to be deleted. IPv4 and IPv6 CIDR blocks are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX/24</p>
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC_ROUTER_ENTRY_NOT_EXIST</p>
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>vRouterEntry not exists</p>
             */
            public Builder failedMessage(String failedMessage) {
                this.failedMessage = failedMessage;
                return this;
            }

            /**
             * <p>The ID of the next hop that failed to be deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>i-j6c2fp57q8rr4jlu****</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The ID of the route entry that failed to be deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>rte-bp1mnnr2al0naomnpv****</p>
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            public FailedRouteEntries build() {
                return new FailedRouteEntries(this);
            } 

        } 

    }
}
