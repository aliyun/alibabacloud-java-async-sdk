// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDynamicRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDynamicRoutesResponseBody</p>
 */
public class ListDynamicRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicRoutes")
    private java.util.List<DynamicRoutes> dynamicRoutes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListDynamicRoutesResponseBody(Builder builder) {
        this.dynamicRoutes = builder.dynamicRoutes;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicRoutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicRoutes
     */
    public java.util.List<DynamicRoutes> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<DynamicRoutes> dynamicRoutes; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListDynamicRoutesResponseBody model) {
            this.dynamicRoutes = model.dynamicRoutes;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of dynamic routes.</p>
         */
        public Builder dynamicRoutes(java.util.List<DynamicRoutes> dynamicRoutes) {
            this.dynamicRoutes = dynamicRoutes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of dynamic routes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListDynamicRoutesResponseBody build() {
            return new ListDynamicRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDynamicRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicRoutesResponseBody</p>
     */
    public static class DynamicRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationIds")
        private java.util.List<String> applicationIds;

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
        private java.util.List<String> regionIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List<String> tagIds;

        private DynamicRoutes(Builder builder) {
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

        public static DynamicRoutes create() {
            return builder().build();
        }

        /**
         * @return applicationIds
         */
        public java.util.List<String> getApplicationIds() {
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
        public java.util.List<String> getRegionIds() {
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
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public static final class Builder {
            private java.util.List<String> applicationIds; 
            private String applicationType; 
            private String createTime; 
            private String description; 
            private String dynamicRouteId; 
            private String dynamicRouteType; 
            private String name; 
            private String nextHop; 
            private Integer priority; 
            private java.util.List<String> regionIds; 
            private String status; 
            private java.util.List<String> tagIds; 

            private Builder() {
            } 

            private Builder(DynamicRoutes model) {
                this.applicationIds = model.applicationIds;
                this.applicationType = model.applicationType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.dynamicRouteId = model.dynamicRouteId;
                this.dynamicRouteType = model.dynamicRouteType;
                this.name = model.name;
                this.nextHop = model.nextHop;
                this.priority = model.priority;
                this.regionIds = model.regionIds;
                this.status = model.status;
                this.tagIds = model.tagIds;
            } 

            /**
             * <p>The IDs of the private access applications for the dynamic route. This field has a value when the application type is <strong>Application</strong>.</p>
             */
            public Builder applicationIds(java.util.List<String> applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * <p>The application type of the dynamic route. Valid values:</p>
             * <ul>
             * <li><p><strong>All</strong>: All applications.</p>
             * </li>
             * <li><p><strong>Application</strong>: A specific application.</p>
             * </li>
             * <li><p><strong>Tag</strong>: A specific tag.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Application</p>
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * <p>The time when the dynamic route was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-21 11:50:03</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the dynamic route.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条动态路由</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the dynamic route.</p>
             * 
             * <strong>example:</strong>
             * <p>dr-a0ca843f53cf****</p>
             */
            public Builder dynamicRouteId(String dynamicRouteId) {
                this.dynamicRouteId = dynamicRouteId;
                return this;
            }

            /**
             * <p>The type of the dynamic route. Valid value: <strong>connector</strong>, which indicates a private leased line.</p>
             * 
             * <strong>example:</strong>
             * <p>connector</p>
             */
            public Builder dynamicRouteType(String dynamicRouteType) {
                this.dynamicRouteType = dynamicRouteType;
                return this;
            }

            /**
             * <p>The name of the dynamic route.</p>
             * 
             * <strong>example:</strong>
             * <p>dynamic_route_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the next hop instance for the dynamic route.</p>
             * 
             * <strong>example:</strong>
             * <p>connector-8ccb13b6f52c****</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The priority of the dynamic route. A value of 1 indicates the highest priority. The priority is consistent with the order in the list query results.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The list of regions where the SASE POP cluster endpoint is supported.</p>
             */
            public Builder regionIds(java.util.List<String> regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * <p>The status of the dynamic route. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: The dynamic route is enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: The dynamic route is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The IDs of the private access tags for the dynamic route. This field has a value when the application type is <strong>Tag</strong>.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            public DynamicRoutes build() {
                return new DynamicRoutes(this);
            } 

        } 

    }
}
