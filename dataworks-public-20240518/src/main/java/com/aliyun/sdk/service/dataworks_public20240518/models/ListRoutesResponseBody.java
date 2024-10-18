// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutesResponseBody</p>
 */
public class ListRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteList")
    private java.util.List < RouteList> routeList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRoutesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeList = builder.routeList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeList
     */
    public java.util.List < RouteList> getRouteList() {
        return this.routeList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RouteList> routeList; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteList.
         */
        public Builder routeList(java.util.List < RouteList> routeList) {
            this.routeList = routeList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRoutesResponseBody build() {
            return new ListRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutesResponseBody</p>
     */
    public static class RouteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private Long networkId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private RouteList(Builder builder) {
            this.createTime = builder.createTime;
            this.destinationCidr = builder.destinationCidr;
            this.id = builder.id;
            this.networkId = builder.networkId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return networkId
         */
        public Long getNetworkId() {
            return this.networkId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private Long createTime; 
            private String destinationCidr; 
            private Long id; 
            private Long networkId; 
            private String resourceGroupId; 
            private String resourceId; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DestinationCidr.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(Long networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public RouteList build() {
                return new RouteList(this);
            } 

        } 

    }
}
