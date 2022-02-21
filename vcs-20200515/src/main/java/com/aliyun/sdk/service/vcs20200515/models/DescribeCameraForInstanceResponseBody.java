// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCameraForInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCameraForInstanceResponseBody</p>
 */
public class DescribeCameraForInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCameraForInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCameraForInstanceResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * 返回错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回数据
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCameraForInstanceResponseBody build() {
            return new DescribeCameraForInstanceResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CameraAddress")
        private String cameraAddress;

        @NameInMap("CameraId")
        private String cameraId;

        @NameInMap("CameraName")
        private String cameraName;

        @NameInMap("CameraStatus")
        private Long cameraStatus;

        private Records(Builder builder) {
            this.cameraAddress = builder.cameraAddress;
            this.cameraId = builder.cameraId;
            this.cameraName = builder.cameraName;
            this.cameraStatus = builder.cameraStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return cameraAddress
         */
        public String getCameraAddress() {
            return this.cameraAddress;
        }

        /**
         * @return cameraId
         */
        public String getCameraId() {
            return this.cameraId;
        }

        /**
         * @return cameraName
         */
        public String getCameraName() {
            return this.cameraName;
        }

        /**
         * @return cameraStatus
         */
        public Long getCameraStatus() {
            return this.cameraStatus;
        }

        public static final class Builder {
            private String cameraAddress; 
            private String cameraId; 
            private String cameraName; 
            private Long cameraStatus; 

            /**
             * 设备地址
             */
            public Builder cameraAddress(String cameraAddress) {
                this.cameraAddress = cameraAddress;
                return this;
            }

            /**
             * 设备编号
             */
            public Builder cameraId(String cameraId) {
                this.cameraId = cameraId;
                return this;
            }

            /**
             * 设备名称
             */
            public Builder cameraName(String cameraName) {
                this.cameraName = cameraName;
                return this;
            }

            /**
             * 设备在线状态。 1表示在线，0表示离线, 2表示待注册
             */
            public Builder cameraStatus(Long cameraStatus) {
                this.cameraStatus = cameraStatus;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * 当前页序号
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 每页显示多少条
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 返回数据条目
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * 总数据数
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
