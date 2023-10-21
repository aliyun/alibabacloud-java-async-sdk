// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRouteEntriesResponseBody</p>
 */
public class DeleteRouteEntriesResponseBody extends TeaModel {
    @NameInMap("FailedCount")
    private Integer failedCount;

    @NameInMap("FailedRouteEntries")
    private java.util.List < FailedRouteEntries> failedRouteEntries;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
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
         * The number of route entries that failed to be deleted.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * The information about the route entry that failed to be deleted.
         */
        public Builder failedRouteEntries(java.util.List < FailedRouteEntries> failedRouteEntries) {
            this.failedRouteEntries = failedRouteEntries;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of route entries that were deleted.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DeleteRouteEntriesResponseBody build() {
            return new DeleteRouteEntriesResponseBody(this);
        } 

    } 

    public static class FailedRouteEntries extends TeaModel {
        @NameInMap("DstCidrBlock")
        private String dstCidrBlock;

        @NameInMap("FailedCode")
        private String failedCode;

        @NameInMap("FailedMessage")
        private String failedMessage;

        @NameInMap("NextHop")
        private String nextHop;

        @NameInMap("RouteEntryId")
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
             * The destination CIDR block of the route entry that failed to be deleted. IPv4 and IPv6 CIDR blocks are supported.
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * The error code.
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
                return this;
            }

            /**
             * The error message.
             */
            public Builder failedMessage(String failedMessage) {
                this.failedMessage = failedMessage;
                return this;
            }

            /**
             * The ID of the next hop that failed to be deleted.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * The ID of the route entry that failed to be deleted.
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
