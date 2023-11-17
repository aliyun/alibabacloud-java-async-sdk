// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGenerateDevicesRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGenerateDevicesRecordResponseBody</p>
 */
public class QueryGenerateDevicesRecordResponseBody extends TeaModel {
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

    private QueryGenerateDevicesRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGenerateDevicesRecordResponseBody create() {
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

        public QueryGenerateDevicesRecordResponseBody build() {
            return new QueryGenerateDevicesRecordResponseBody(this);
        } 

    } 

    public static class ListData extends TeaModel {
        @NameInMap("ApplyDeviceCount")
        private Long applyDeviceCount;

        @NameInMap("BatchId")
        private String batchId;

        @NameInMap("BatchStatus")
        private String batchStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("OperateUid")
        private Long operateUid;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("SpecCode")
        private String specCode;

        @NameInMap("SuccessCount")
        private Long successCount;

        private ListData(Builder builder) {
            this.applyDeviceCount = builder.applyDeviceCount;
            this.batchId = builder.batchId;
            this.batchStatus = builder.batchStatus;
            this.createTime = builder.createTime;
            this.networkType = builder.networkType;
            this.operateUid = builder.operateUid;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.specCode = builder.specCode;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListData create() {
            return builder().build();
        }

        /**
         * @return applyDeviceCount
         */
        public Long getApplyDeviceCount() {
            return this.applyDeviceCount;
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return batchStatus
         */
        public String getBatchStatus() {
            return this.batchStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return operateUid
         */
        public Long getOperateUid() {
            return this.operateUid;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return specCode
         */
        public String getSpecCode() {
            return this.specCode;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Long applyDeviceCount; 
            private String batchId; 
            private String batchStatus; 
            private Long createTime; 
            private String networkType; 
            private Long operateUid; 
            private String productKey; 
            private String productName; 
            private String specCode; 
            private Long successCount; 

            /**
             * ApplyDeviceCount.
             */
            public Builder applyDeviceCount(Long applyDeviceCount) {
                this.applyDeviceCount = applyDeviceCount;
                return this;
            }

            /**
             * BatchId.
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * BatchStatus.
             */
            public Builder batchStatus(String batchStatus) {
                this.batchStatus = batchStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * OperateUid.
             */
            public Builder operateUid(Long operateUid) {
                this.operateUid = operateUid;
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
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SpecCode.
             */
            public Builder specCode(String specCode) {
                this.specCode = specCode;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            public ListData build() {
                return new ListData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ListData")
        private java.util.List < ListData> listData;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.listData = builder.listData;
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
         * @return listData
         */
        public java.util.List < ListData> getListData() {
            return this.listData;
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
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < ListData> listData; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * ListData.
             */
            public Builder listData(java.util.List < ListData> listData) {
                this.listData = listData;
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
