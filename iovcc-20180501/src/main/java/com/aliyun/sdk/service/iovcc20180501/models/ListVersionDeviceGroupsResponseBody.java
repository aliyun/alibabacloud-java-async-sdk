// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVersionDeviceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVersionDeviceGroupsResponseBody</p>
 */
public class ListVersionDeviceGroupsResponseBody extends TeaModel {
    @NameInMap("DeviceGroupList")
    private java.util.List < DeviceGroupList> deviceGroupList;

    @NameInMap("RequestId")
    private String requestId;

    private ListVersionDeviceGroupsResponseBody(Builder builder) {
        this.deviceGroupList = builder.deviceGroupList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVersionDeviceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceGroupList
     */
    public java.util.List < DeviceGroupList> getDeviceGroupList() {
        return this.deviceGroupList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeviceGroupList> deviceGroupList; 
        private String requestId; 

        /**
         * DeviceGroupList.
         */
        public Builder deviceGroupList(java.util.List < DeviceGroupList> deviceGroupList) {
            this.deviceGroupList = deviceGroupList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVersionDeviceGroupsResponseBody build() {
            return new ListVersionDeviceGroupsResponseBody(this);
        } 

    } 

    public static class DeviceGroupList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private DeviceGroupList(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceGroupList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String gmtCreate; 
            private String gmtModify; 
            private String id; 
            private String name; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeviceGroupList build() {
                return new DeviceGroupList(this);
            } 

        } 

    }
}
