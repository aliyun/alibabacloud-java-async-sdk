// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDataByDataIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDataByDataIdResponseBody</p>
 */
public class GetEnterpriseDataByDataIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetEnterpriseDataByDataIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseDataByDataIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public GetEnterpriseDataByDataIdResponseBody build() {
            return new GetEnterpriseDataByDataIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("DataName")
        private String dataName;

        @NameInMap("DataSize")
        private String dataSize;

        @NameInMap("DataStatus")
        private String dataStatus;

        @NameInMap("DataStatusCode")
        private Integer dataStatusCode;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("DataTypeCode")
        private Integer dataTypeCode;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("StatusDetail")
        private String statusDetail;

        @NameInMap("StoreType")
        private String storeType;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("UploadTime")
        private String uploadTime;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.dataName = builder.dataName;
            this.dataSize = builder.dataSize;
            this.dataStatus = builder.dataStatus;
            this.dataStatusCode = builder.dataStatusCode;
            this.dataType = builder.dataType;
            this.dataTypeCode = builder.dataTypeCode;
            this.downloadUrl = builder.downloadUrl;
            this.statusDetail = builder.statusDetail;
            this.storeType = builder.storeType;
            this.tags = builder.tags;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return dataName
         */
        public String getDataName() {
            return this.dataName;
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
        }

        /**
         * @return dataStatus
         */
        public String getDataStatus() {
            return this.dataStatus;
        }

        /**
         * @return dataStatusCode
         */
        public Integer getDataStatusCode() {
            return this.dataStatusCode;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return dataTypeCode
         */
        public Integer getDataTypeCode() {
            return this.dataTypeCode;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return statusDetail
         */
        public String getStatusDetail() {
            return this.statusDetail;
        }

        /**
         * @return storeType
         */
        public String getStoreType() {
            return this.storeType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private String dataId; 
            private String dataName; 
            private String dataSize; 
            private String dataStatus; 
            private Integer dataStatusCode; 
            private String dataType; 
            private Integer dataTypeCode; 
            private String downloadUrl; 
            private String statusDetail; 
            private String storeType; 
            private String tags; 
            private String uploadTime; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * DataName.
             */
            public Builder dataName(String dataName) {
                this.dataName = dataName;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * DataStatus.
             */
            public Builder dataStatus(String dataStatus) {
                this.dataStatus = dataStatus;
                return this;
            }

            /**
             * DataStatusCode.
             */
            public Builder dataStatusCode(Integer dataStatusCode) {
                this.dataStatusCode = dataStatusCode;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DataTypeCode.
             */
            public Builder dataTypeCode(Integer dataTypeCode) {
                this.dataTypeCode = dataTypeCode;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * StatusDetail.
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * StoreType.
             */
            public Builder storeType(String storeType) {
                this.storeType = storeType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
