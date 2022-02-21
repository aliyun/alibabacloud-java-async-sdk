// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferDeviceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TransferDeviceInstanceResponseBody</p>
 */
public class TransferDeviceInstanceResponseBody extends TeaModel {
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

    private TransferDeviceInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferDeviceInstanceResponseBody create() {
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

        public TransferDeviceInstanceResponseBody build() {
            return new TransferDeviceInstanceResponseBody(this);
        } 

    } 

    public static class FailedList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Message")
        private String message;

        private FailedList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String deviceName; 
            private String message; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public FailedList build() {
                return new FailedList(this);
            } 

        } 

    }
    public static class SuccessList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Message")
        private String message;

        private SuccessList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String deviceName; 
            private String message; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("FailedList")
        private java.util.List < FailedList> failedList;

        @NameInMap("SuccessList")
        private java.util.List < SuccessList> successList;

        private Data(Builder builder) {
            this.failedList = builder.failedList;
            this.successList = builder.successList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedList
         */
        public java.util.List < FailedList> getFailedList() {
            return this.failedList;
        }

        /**
         * @return successList
         */
        public java.util.List < SuccessList> getSuccessList() {
            return this.successList;
        }

        public static final class Builder {
            private java.util.List < FailedList> failedList; 
            private java.util.List < SuccessList> successList; 

            /**
             * FailedList.
             */
            public Builder failedList(java.util.List < FailedList> failedList) {
                this.failedList = failedList;
                return this;
            }

            /**
             * SuccessList.
             */
            public Builder successList(java.util.List < SuccessList> successList) {
                this.successList = successList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
