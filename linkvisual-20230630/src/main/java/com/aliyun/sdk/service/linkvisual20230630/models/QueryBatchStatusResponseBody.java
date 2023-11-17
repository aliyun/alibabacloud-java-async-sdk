// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBatchStatusResponseBody</p>
 */
public class QueryBatchStatusResponseBody extends TeaModel {
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

    private QueryBatchStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchStatusResponseBody create() {
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

        public QueryBatchStatusResponseBody build() {
            return new QueryBatchStatusResponseBody(this);
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
        @NameInMap("InvalidDetailList")
        private java.util.List < InvalidDetailList> invalidDetailList;

        @NameInMap("InvalidList")
        private java.util.List < String > invalidList;

        @NameInMap("Status")
        private String status;

        @NameInMap("ValidList")
        private java.util.List < String > validList;

        private Data(Builder builder) {
            this.invalidDetailList = builder.invalidDetailList;
            this.invalidList = builder.invalidList;
            this.status = builder.status;
            this.validList = builder.validList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidDetailList
         */
        public java.util.List < InvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidList
         */
        public java.util.List < String > getInvalidList() {
            return this.invalidList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return validList
         */
        public java.util.List < String > getValidList() {
            return this.validList;
        }

        public static final class Builder {
            private java.util.List < InvalidDetailList> invalidDetailList; 
            private java.util.List < String > invalidList; 
            private String status; 
            private java.util.List < String > validList; 

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(java.util.List < InvalidDetailList> invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * InvalidList.
             */
            public Builder invalidList(java.util.List < String > invalidList) {
                this.invalidList = invalidList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ValidList.
             */
            public Builder validList(java.util.List < String > validList) {
                this.validList = validList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
