// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckImportDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCheckImportDeviceResponseBody</p>
 */
public class BatchCheckImportDeviceResponseBody extends TeaModel {
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

    private BatchCheckImportDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckImportDeviceResponseBody create() {
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

        public BatchCheckImportDeviceResponseBody build() {
            return new BatchCheckImportDeviceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InvalidDeviceNameList")
        private java.util.List < String > invalidDeviceNameList;

        @NameInMap("InvalidDeviceSecretList")
        private java.util.List < String > invalidDeviceSecretList;

        @NameInMap("InvalidSnList")
        private java.util.List < String > invalidSnList;

        @NameInMap("RepeatedDeviceNameList")
        private java.util.List < String > repeatedDeviceNameList;

        private Data(Builder builder) {
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
            this.invalidDeviceSecretList = builder.invalidDeviceSecretList;
            this.invalidSnList = builder.invalidSnList;
            this.repeatedDeviceNameList = builder.repeatedDeviceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceNameList
         */
        public java.util.List < String > getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        /**
         * @return invalidDeviceSecretList
         */
        public java.util.List < String > getInvalidDeviceSecretList() {
            return this.invalidDeviceSecretList;
        }

        /**
         * @return invalidSnList
         */
        public java.util.List < String > getInvalidSnList() {
            return this.invalidSnList;
        }

        /**
         * @return repeatedDeviceNameList
         */
        public java.util.List < String > getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private java.util.List < String > invalidDeviceNameList; 
            private java.util.List < String > invalidDeviceSecretList; 
            private java.util.List < String > invalidSnList; 
            private java.util.List < String > repeatedDeviceNameList; 

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(java.util.List < String > invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            /**
             * InvalidDeviceSecretList.
             */
            public Builder invalidDeviceSecretList(java.util.List < String > invalidDeviceSecretList) {
                this.invalidDeviceSecretList = invalidDeviceSecretList;
                return this;
            }

            /**
             * InvalidSnList.
             */
            public Builder invalidSnList(java.util.List < String > invalidSnList) {
                this.invalidSnList = invalidSnList;
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
