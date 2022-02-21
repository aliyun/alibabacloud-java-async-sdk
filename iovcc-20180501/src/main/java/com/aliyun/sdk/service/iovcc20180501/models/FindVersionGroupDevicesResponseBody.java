// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionGroupDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>FindVersionGroupDevicesResponseBody</p>
 */
public class FindVersionGroupDevicesResponseBody extends TeaModel {
    @NameInMap("GroupDeviceList")
    private GroupDeviceList groupDeviceList;

    @NameInMap("RequestId")
    private String requestId;

    private FindVersionGroupDevicesResponseBody(Builder builder) {
        this.groupDeviceList = builder.groupDeviceList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindVersionGroupDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupDeviceList
     */
    public GroupDeviceList getGroupDeviceList() {
        return this.groupDeviceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupDeviceList groupDeviceList; 
        private String requestId; 

        /**
         * GroupDeviceList.
         */
        public Builder groupDeviceList(GroupDeviceList groupDeviceList) {
            this.groupDeviceList = groupDeviceList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FindVersionGroupDevicesResponseBody build() {
            return new FindVersionGroupDevicesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("Id")
        private String id;

        @NameInMap("IdType")
        private String idType;

        @NameInMap("OriginalId")
        private String originalId;

        private Items(Builder builder) {
            this.deviceId = builder.deviceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.id = builder.id;
            this.idType = builder.idType;
            this.originalId = builder.originalId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return originalId
         */
        public String getOriginalId() {
            return this.originalId;
        }

        public static final class Builder {
            private String deviceId; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String id; 
            private String idType; 
            private String originalId; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OriginalId.
             */
            public Builder originalId(String originalId) {
                this.originalId = originalId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class GroupDeviceList extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private GroupDeviceList(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupDeviceList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public GroupDeviceList build() {
                return new GroupDeviceList(this);
            } 

        } 

    }
}
