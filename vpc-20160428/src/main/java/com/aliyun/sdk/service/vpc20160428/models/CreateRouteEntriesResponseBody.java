// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteEntriesResponseBody</p>
 */
public class CreateRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Integer failedCount;

    @com.aliyun.core.annotation.NameInMap("FailedRouteEntries")
    private java.util.List < FailedRouteEntries> failedRouteEntries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntryIds")
    private java.util.List < String > routeEntryIds;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    private CreateRouteEntriesResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.failedRouteEntries = builder.failedRouteEntries;
        this.requestId = builder.requestId;
        this.routeEntryIds = builder.routeEntryIds;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteEntriesResponseBody create() {
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
     * @return routeEntryIds
     */
    public java.util.List < String > getRouteEntryIds() {
        return this.routeEntryIds;
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
        private java.util.List < String > routeEntryIds; 
        private Integer successCount; 

        /**
         * The number of custom route entries that failed to be added.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * The details about the custom route entry that failed to be added.
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
         * The information about the ID of the custom route entry that was successfully added.
         */
        public Builder routeEntryIds(java.util.List < String > routeEntryIds) {
            this.routeEntryIds = routeEntryIds;
            return this;
        }

        /**
         * The number of custom route entries that were successfully added.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public CreateRouteEntriesResponseBody build() {
            return new CreateRouteEntriesResponseBody(this);
        } 

    } 

    public static class FailedRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstCidrBlock")
        private String dstCidrBlock;

        @com.aliyun.core.annotation.NameInMap("FailedCode")
        private String failedCode;

        @com.aliyun.core.annotation.NameInMap("FailedMessage")
        private String failedMessage;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        private FailedRouteEntries(Builder builder) {
            this.dstCidrBlock = builder.dstCidrBlock;
            this.failedCode = builder.failedCode;
            this.failedMessage = builder.failedMessage;
            this.nextHop = builder.nextHop;
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

        public static final class Builder {
            private String dstCidrBlock; 
            private String failedCode; 
            private String failedMessage; 
            private String nextHop; 

            /**
             * The destination CIDR block of the custom route entry that failed to be added.
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
             * The ID of the next hop of the custom route entry that failed to be added.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            public FailedRouteEntries build() {
                return new FailedRouteEntries(this);
            } 

        } 

    }
}
