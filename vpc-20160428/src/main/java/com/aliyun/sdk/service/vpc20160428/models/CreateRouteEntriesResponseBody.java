// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteEntriesResponseBody</p>
 */
public class CreateRouteEntriesResponseBody extends TeaModel {
    @NameInMap("FailedCount")
    private Integer failedCount;

    @NameInMap("FailedRouteEntries")
    private java.util.List < FailedRouteEntries> failedRouteEntries;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntryIds")
    private java.util.List < String > routeEntryIds;

    @NameInMap("SuccessCount")
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
         * FailedCount.
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * FailedRouteEntries.
         */
        public Builder failedRouteEntries(java.util.List < FailedRouteEntries> failedRouteEntries) {
            this.failedRouteEntries = failedRouteEntries;
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
         * RouteEntryIds.
         */
        public Builder routeEntryIds(java.util.List < String > routeEntryIds) {
            this.routeEntryIds = routeEntryIds;
            return this;
        }

        /**
         * SuccessCount.
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
        @NameInMap("DstCidrBlock")
        private String dstCidrBlock;

        @NameInMap("FailedCode")
        private String failedCode;

        @NameInMap("FailedMessage")
        private String failedMessage;

        @NameInMap("NextHop")
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
             * DstCidrBlock.
             */
            public Builder dstCidrBlock(String dstCidrBlock) {
                this.dstCidrBlock = dstCidrBlock;
                return this;
            }

            /**
             * FailedCode.
             */
            public Builder failedCode(String failedCode) {
                this.failedCode = failedCode;
                return this;
            }

            /**
             * FailedMessage.
             */
            public Builder failedMessage(String failedMessage) {
                this.failedMessage = failedMessage;
                return this;
            }

            /**
             * NextHop.
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
