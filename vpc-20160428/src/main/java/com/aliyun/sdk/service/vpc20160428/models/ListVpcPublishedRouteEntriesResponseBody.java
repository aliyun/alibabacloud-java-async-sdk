// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcPublishedRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcPublishedRouteEntriesResponseBody</p>
 */
public class ListVpcPublishedRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntries")
    private java.util.List < RouteEntries> routeEntries;

    private ListVpcPublishedRouteEntriesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeEntries = builder.routeEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcPublishedRouteEntriesResponseBody create() {
        return builder().build();
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
     * @return routeEntries
     */
    public java.util.List < RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < RouteEntries> routeEntries; 

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
         * RouteEntries.
         */
        public Builder routeEntries(java.util.List < RouteEntries> routeEntries) {
            this.routeEntries = routeEntries;
            return this;
        }

        public ListVpcPublishedRouteEntriesResponseBody build() {
            return new ListVpcPublishedRouteEntriesResponseBody(this);
        } 

    } 

    public static class RoutePublishTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("PublishTargetType")
        private String publishTargetType;

        private RoutePublishTargets(Builder builder) {
            this.publishStatus = builder.publishStatus;
            this.publishTargetType = builder.publishTargetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutePublishTargets create() {
            return builder().build();
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return publishTargetType
         */
        public String getPublishTargetType() {
            return this.publishTargetType;
        }

        public static final class Builder {
            private String publishStatus; 
            private String publishTargetType; 

            /**
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * PublishTargetType.
             */
            public Builder publishTargetType(String publishTargetType) {
                this.publishTargetType = publishTargetType;
                return this;
            }

            public RoutePublishTargets build() {
                return new RoutePublishTargets(this);
            } 

        } 

    }
    public static class RouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        @com.aliyun.core.annotation.NameInMap("RoutePublishTargets")
        private java.util.List < RoutePublishTargets> routePublishTargets;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        private RouteEntries(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.routeEntryId = builder.routeEntryId;
            this.routePublishTargets = builder.routePublishTargets;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntries create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return routeEntryId
         */
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        /**
         * @return routePublishTargets
         */
        public java.util.List < RoutePublishTargets> getRoutePublishTargets() {
            return this.routePublishTargets;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String routeEntryId; 
            private java.util.List < RoutePublishTargets> routePublishTargets; 
            private String routeTableId; 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * RouteEntryId.
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * RoutePublishTargets.
             */
            public Builder routePublishTargets(java.util.List < RoutePublishTargets> routePublishTargets) {
                this.routePublishTargets = routePublishTargets;
                return this;
            }

            /**
             * RouteTableId.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteEntries build() {
                return new RouteEntries(this);
            } 

        } 

    }
}
