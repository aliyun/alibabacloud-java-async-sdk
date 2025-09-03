// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    private java.util.List<RouteEntries> routeEntries;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<RouteEntries> routeEntries; 

        private Builder() {
        } 

        private Builder(ListVpcPublishedRouteEntriesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.routeEntries = model.routeEntries;
        } 

        /**
         * <p>Indicates whether there is a token for the next query. Values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, it means there is no next query.</li>
         * <li>If <strong>NextToken</strong> has a return value, this value indicates the token for the start of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1D0971B2-A35A-42C1-A44C-E91360C36C0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of route entry publishing status information.</p>
         */
        public Builder routeEntries(java.util.List<RouteEntries> routeEntries) {
            this.routeEntries = routeEntries;
            return this;
        }

        public ListVpcPublishedRouteEntriesResponseBody build() {
            return new ListVpcPublishedRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcPublishedRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcPublishedRouteEntriesResponseBody</p>
     */
    public static class RoutePublishTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("PublishTargetInstanceId")
        private String publishTargetInstanceId;

        @com.aliyun.core.annotation.NameInMap("PublishTargetType")
        private String publishTargetType;

        private RoutePublishTargets(Builder builder) {
            this.publishStatus = builder.publishStatus;
            this.publishTargetInstanceId = builder.publishTargetInstanceId;
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
         * @return publishTargetInstanceId
         */
        public String getPublishTargetInstanceId() {
            return this.publishTargetInstanceId;
        }

        /**
         * @return publishTargetType
         */
        public String getPublishTargetType() {
            return this.publishTargetType;
        }

        public static final class Builder {
            private String publishStatus; 
            private String publishTargetInstanceId; 
            private String publishTargetType; 

            private Builder() {
            } 

            private Builder(RoutePublishTargets model) {
                this.publishStatus = model.publishStatus;
                this.publishTargetInstanceId = model.publishTargetInstanceId;
                this.publishTargetType = model.publishTargetType;
            } 

            /**
             * <p>The publishing status of the route entry in the publishing target.</p>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>The ID of the route publishing target instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-xvuqdfma6x57ei****</p>
             */
            public Builder publishTargetInstanceId(String publishTargetInstanceId) {
                this.publishTargetInstanceId = publishTargetInstanceId;
                return this;
            }

            /**
             * <p>The type of the route publishing target.</p>
             * 
             * <strong>example:</strong>
             * <p>ECR</p>
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
    /**
     * 
     * {@link ListVpcPublishedRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcPublishedRouteEntriesResponseBody</p>
     */
    public static class RouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        @com.aliyun.core.annotation.NameInMap("RoutePublishTargets")
        private java.util.List<RoutePublishTargets> routePublishTargets;

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
        public java.util.List<RoutePublishTargets> getRoutePublishTargets() {
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
            private java.util.List<RoutePublishTargets> routePublishTargets; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(RouteEntries model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.routeEntryId = model.routeEntryId;
                this.routePublishTargets = model.routePublishTargets;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The destination CIDR block of the route entry.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the route entry.</p>
             * 
             * <strong>example:</strong>
             * <p>rte-bp1mnnr2al0naomnpv****</p>
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * <p>List of route entry publishing status information in the publishing targets.</p>
             */
            public Builder routePublishTargets(java.util.List<RoutePublishTargets> routePublishTargets) {
                this.routePublishTargets = routePublishTargets;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-2ze3jgygk9bmsj23s****</p>
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
