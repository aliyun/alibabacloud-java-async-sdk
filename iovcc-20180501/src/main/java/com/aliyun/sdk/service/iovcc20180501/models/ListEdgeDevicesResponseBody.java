// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEdgeDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEdgeDevicesResponseBody</p>
 */
public class ListEdgeDevicesResponseBody extends TeaModel {
    @NameInMap("EdgeDevices")
    @Validation(required = true)
    private EdgeDevices edgeDevices;

    @NameInMap("RequestId")
    private String requestId;

    private ListEdgeDevicesResponseBody(Builder builder) {
        this.edgeDevices = builder.edgeDevices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return edgeDevices
     */
    public EdgeDevices getEdgeDevices() {
        return this.edgeDevices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EdgeDevices edgeDevices; 
        private String requestId; 

        /**
         * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
         */
        public Builder edgeDevices(EdgeDevices edgeDevices) {
            this.edgeDevices = edgeDevices;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEdgeDevicesResponseBody build() {
            return new ListEdgeDevicesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ActivateTime")
        private Long activateTime;

        @NameInMap("EdgeDeviceId")
        private String edgeDeviceId;

        @NameInMap("EdgeDeviceName")
        private String edgeDeviceName;

        @NameInMap("EdgeDeviceType")
        private Long edgeDeviceType;

        @NameInMap("LastOnlineTime")
        private Long lastOnlineTime;

        @NameInMap("OnlineStatus")
        private Long onlineStatus;

        private List(Builder builder) {
            this.activateTime = builder.activateTime;
            this.edgeDeviceId = builder.edgeDeviceId;
            this.edgeDeviceName = builder.edgeDeviceName;
            this.edgeDeviceType = builder.edgeDeviceType;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.onlineStatus = builder.onlineStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return activateTime
         */
        public Long getActivateTime() {
            return this.activateTime;
        }

        /**
         * @return edgeDeviceId
         */
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        /**
         * @return edgeDeviceName
         */
        public String getEdgeDeviceName() {
            return this.edgeDeviceName;
        }

        /**
         * @return edgeDeviceType
         */
        public Long getEdgeDeviceType() {
            return this.edgeDeviceType;
        }

        /**
         * @return lastOnlineTime
         */
        public Long getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        /**
         * @return onlineStatus
         */
        public Long getOnlineStatus() {
            return this.onlineStatus;
        }

        public static final class Builder {
            private Long activateTime; 
            private String edgeDeviceId; 
            private String edgeDeviceName; 
            private Long edgeDeviceType; 
            private Long lastOnlineTime; 
            private Long onlineStatus; 

            /**
             * ActivateTime.
             */
            public Builder activateTime(Long activateTime) {
                this.activateTime = activateTime;
                return this;
            }

            /**
             * EdgeDeviceId.
             */
            public Builder edgeDeviceId(String edgeDeviceId) {
                this.edgeDeviceId = edgeDeviceId;
                return this;
            }

            /**
             * EdgeDeviceName.
             */
            public Builder edgeDeviceName(String edgeDeviceName) {
                this.edgeDeviceName = edgeDeviceName;
                return this;
            }

            /**
             * EdgeDeviceType.
             */
            public Builder edgeDeviceType(Long edgeDeviceType) {
                this.edgeDeviceType = edgeDeviceType;
                return this;
            }

            /**
             * LastOnlineTime.
             */
            public Builder lastOnlineTime(Long lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Long onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageIndex")
        private Long pageIndex;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("TotalPageCount")
        private Long totalPageCount;

        private Pagination(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private Long pageIndex; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPageCount; 

            /**
             * PageIndex.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Long totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class EdgeDevices extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private EdgeDevices(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeDevices create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public EdgeDevices build() {
                return new EdgeDevices(this);
            } 

        } 

    }
}
