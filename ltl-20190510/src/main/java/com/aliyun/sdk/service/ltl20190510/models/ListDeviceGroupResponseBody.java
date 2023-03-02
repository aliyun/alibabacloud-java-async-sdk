// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceGroupResponseBody</p>
 */
public class ListDeviceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDeviceGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public ListDeviceGroupResponseBody build() {
            return new ListDeviceGroupResponseBody(this);
        } 

    } 

    public static class PageData extends TeaModel {
        @NameInMap("AuthorizeType")
        private String authorizeType;

        @NameInMap("DeviceGroupId")
        private String deviceGroupId;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("OwnerUid")
        private String ownerUid;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private String status;

        private PageData(Builder builder) {
            this.authorizeType = builder.authorizeType;
            this.deviceGroupId = builder.deviceGroupId;
            this.ownerName = builder.ownerName;
            this.ownerUid = builder.ownerUid;
            this.productKey = builder.productKey;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return authorizeType
         */
        public String getAuthorizeType() {
            return this.authorizeType;
        }

        /**
         * @return deviceGroupId
         */
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUid
         */
        public String getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String authorizeType; 
            private String deviceGroupId; 
            private String ownerName; 
            private String ownerUid; 
            private String productKey; 
            private String remark; 
            private String status; 

            /**
             * AuthorizeType.
             */
            public Builder authorizeType(String authorizeType) {
                this.authorizeType = authorizeType;
                return this;
            }

            /**
             * DeviceGroupId.
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUid.
             */
            public Builder ownerUid(String ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Num")
        private Integer num;

        @NameInMap("PageData")
        private java.util.List < PageData> pageData;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.num = builder.num;
            this.pageData = builder.pageData;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        /**
         * @return pageData
         */
        public java.util.List < PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer num; 
            private java.util.List < PageData> pageData; 
            private Integer size; 
            private Integer total; 

            /**
             * Num.
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            /**
             * PageData.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
