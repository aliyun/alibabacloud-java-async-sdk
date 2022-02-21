// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionDeviceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionDeviceGroupResponseBody</p>
 */
public class DescribeVersionDeviceGroupResponseBody extends TeaModel {
    @NameInMap("DeviceGroup")
    private DeviceGroup deviceGroup;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVersionDeviceGroupResponseBody(Builder builder) {
        this.deviceGroup = builder.deviceGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionDeviceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceGroup
     */
    public DeviceGroup getDeviceGroup() {
        return this.deviceGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceGroup deviceGroup; 
        private String requestId; 

        /**
         * DeviceGroup.
         */
        public Builder deviceGroup(DeviceGroup deviceGroup) {
            this.deviceGroup = deviceGroup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVersionDeviceGroupResponseBody build() {
            return new DescribeVersionDeviceGroupResponseBody(this);
        } 

    } 

    public static class DeviceGroup extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaxCount")
        private String maxCount;

        @NameInMap("Name")
        private String name;

        private DeviceGroup(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.maxCount = builder.maxCount;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceGroup create() {
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return maxCount
         */
        public String getMaxCount() {
            return this.maxCount;
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
            private Long id; 
            private String maxCount; 
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
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MaxCount.
             */
            public Builder maxCount(String maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeviceGroup build() {
                return new DeviceGroup(this);
            } 

        } 

    }
}
