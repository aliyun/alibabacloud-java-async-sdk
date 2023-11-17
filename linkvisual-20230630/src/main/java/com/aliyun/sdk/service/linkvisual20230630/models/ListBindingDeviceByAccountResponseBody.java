// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindingDeviceByAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindingDeviceByAccountResponseBody</p>
 */
public class ListBindingDeviceByAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListBindingDeviceByAccountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindingDeviceByAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBindingDeviceByAccountResponseBody build() {
            return new ListBindingDeviceByAccountResponseBody(this);
        } 

    } 

    public static class DeviceList extends TeaModel {
        @NameInMap("BindTime")
        private Long bindTime;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Owned")
        private Integer owned;

        @NameInMap("ProductKey")
        private String productKey;

        private DeviceList(Builder builder) {
            this.bindTime = builder.bindTime;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.nodeType = builder.nodeType;
            this.owned = builder.owned;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return bindTime
         */
        public Long getBindTime() {
            return this.bindTime;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return owned
         */
        public Integer getOwned() {
            return this.owned;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private Long bindTime; 
            private String deviceName; 
            private String iotId; 
            private String nodeType; 
            private Integer owned; 
            private String productKey; 

            /**
             * BindTime.
             */
            public Builder bindTime(Long bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Owned.
             */
            public Builder owned(Integer owned) {
                this.owned = owned;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DeviceList")
        private java.util.List < DeviceList> deviceList;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.deviceList = builder.deviceList;
            this.pageCount = builder.pageCount;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceList
         */
        public java.util.List < DeviceList> getDeviceList() {
            return this.deviceList;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < DeviceList> deviceList; 
            private Integer pageCount; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 

            /**
             * DeviceList.
             */
            public Builder deviceList(java.util.List < DeviceList> deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
