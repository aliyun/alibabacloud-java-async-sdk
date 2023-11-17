// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadDeviceNameListResponseBody} extends {@link TeaModel}
 *
 * <p>UploadDeviceNameListResponseBody</p>
 */
public class UploadDeviceNameListResponseBody extends TeaModel {
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

    private UploadDeviceNameListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDeviceNameListResponseBody create() {
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

        public UploadDeviceNameListResponseBody build() {
            return new UploadDeviceNameListResponseBody(this);
        } 

    } 

    public static class InvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        private InvalidDetailList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.errorMsg = builder.errorMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDetailList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public static final class Builder {
            private String deviceName; 
            private String errorMsg; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            public InvalidDetailList build() {
                return new InvalidDetailList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BatchId")
        private String batchId;

        @NameInMap("InvalidDetailList")
        private java.util.List < InvalidDetailList> invalidDetailList;

        @NameInMap("InvalidDeviceNameList")
        private java.util.List < String > invalidDeviceNameList;

        @NameInMap("RepeatedDeviceNameList")
        private java.util.List < String > repeatedDeviceNameList;

        private Data(Builder builder) {
            this.batchId = builder.batchId;
            this.invalidDetailList = builder.invalidDetailList;
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
            this.repeatedDeviceNameList = builder.repeatedDeviceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return invalidDetailList
         */
        public java.util.List < InvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidDeviceNameList
         */
        public java.util.List < String > getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        /**
         * @return repeatedDeviceNameList
         */
        public java.util.List < String > getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private String batchId; 
            private java.util.List < InvalidDetailList> invalidDetailList; 
            private java.util.List < String > invalidDeviceNameList; 
            private java.util.List < String > repeatedDeviceNameList; 

            /**
             * BatchId.
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(java.util.List < InvalidDetailList> invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(java.util.List < String > invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            /**
             * RepeatedDeviceNameList.
             */
            public Builder repeatedDeviceNameList(java.util.List < String > repeatedDeviceNameList) {
                this.repeatedDeviceNameList = repeatedDeviceNameList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
