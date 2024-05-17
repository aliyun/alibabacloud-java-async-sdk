// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDynamicRouteResponseBody} extends {@link TeaModel}
 *
 * <p>GetDynamicRouteResponseBody</p>
 */
public class GetDynamicRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicRoute")
    private DynamicRoute dynamicRoute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDynamicRouteResponseBody(Builder builder) {
        this.dynamicRoute = builder.dynamicRoute;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDynamicRouteResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicRoute
     */
    public DynamicRoute getDynamicRoute() {
        return this.dynamicRoute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DynamicRoute dynamicRoute; 
        private String requestId; 

        /**
         * DynamicRoute.
         */
        public Builder dynamicRoute(DynamicRoute dynamicRoute) {
            this.dynamicRoute = dynamicRoute;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDynamicRouteResponseBody build() {
            return new GetDynamicRouteResponseBody(this);
        } 

    } 

    public static class DynamicRoute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationIds")
        private java.util.List < String > applicationIds;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DynamicRouteId")
        private String dynamicRouteId;

        @com.aliyun.core.annotation.NameInMap("DynamicRouteType")
        private String dynamicRouteType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RegionIds")
        private java.util.List < String > regionIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List < String > tagIds;

        private DynamicRoute(Builder builder) {
            this.applicationIds = builder.applicationIds;
            this.applicationType = builder.applicationType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.dynamicRouteId = builder.dynamicRouteId;
            this.dynamicRouteType = builder.dynamicRouteType;
            this.name = builder.name;
            this.nextHop = builder.nextHop;
            this.priority = builder.priority;
            this.regionIds = builder.regionIds;
            this.status = builder.status;
            this.tagIds = builder.tagIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicRoute create() {
            return builder().build();
        }

        /**
         * @return applicationIds
         */
        public java.util.List < String > getApplicationIds() {
            return this.applicationIds;
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dynamicRouteId
         */
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

        /**
         * @return dynamicRouteType
         */
        public String getDynamicRouteType() {
            return this.dynamicRouteType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return regionIds
         */
        public java.util.List < String > getRegionIds() {
            return this.regionIds;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tagIds
         */
        public java.util.List < String > getTagIds() {
            return this.tagIds;
        }

        public static final class Builder {
            private java.util.List < String > applicationIds; 
            private String applicationType; 
            private String createTime; 
            private String description; 
            private String dynamicRouteId; 
            private String dynamicRouteType; 
            private String name; 
            private String nextHop; 
            private Integer priority; 
            private java.util.List < String > regionIds; 
            private String status; 
            private java.util.List < String > tagIds; 

            /**
             * ApplicationIds.
             */
            public Builder applicationIds(java.util.List < String > applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * ApplicationType.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DynamicRouteId.
             */
            public Builder dynamicRouteId(String dynamicRouteId) {
                this.dynamicRouteId = dynamicRouteId;
                return this;
            }

            /**
             * DynamicRouteType.
             */
            public Builder dynamicRouteType(String dynamicRouteType) {
                this.dynamicRouteType = dynamicRouteType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NextHop.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RegionIds.
             */
            public Builder regionIds(java.util.List < String > regionIds) {
                this.regionIds = regionIds;
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
             * TagIds.
             */
            public Builder tagIds(java.util.List < String > tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            public DynamicRoute build() {
                return new DynamicRoute(this);
            } 

        } 

    }
}
