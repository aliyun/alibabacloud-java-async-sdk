// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchCheckImportDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCheckImportDeviceResponseBody</p>
 */
public class BatchCheckImportDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BatchCheckImportDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the request succeeds. The data includes the information about devices that failed to be verified.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>A system exception occurred.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchCheckImportDeviceResponseBody build() {
            return new BatchCheckImportDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCheckImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckImportDeviceResponseBody</p>
     */
    public static class InvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        private InvalidDetailList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.errorMsg = builder.errorMsg;
            this.sn = builder.sn;
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
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceSecret; 
            private String errorMsg; 
            private String sn; 

            private Builder() {
            } 

            private Builder(InvalidDetailList model) {
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.errorMsg = model.errorMsg;
                this.sn = model.sn;
            } 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceSecret.
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
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
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public InvalidDetailList build() {
                return new InvalidDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCheckImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckImportDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private java.util.List<InvalidDetailList> invalidDetailList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNameList")
        private java.util.List<String> invalidDeviceNameList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceSecretList")
        private java.util.List<String> invalidDeviceSecretList;

        @com.aliyun.core.annotation.NameInMap("InvalidSnList")
        private java.util.List<String> invalidSnList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceNameList")
        private java.util.List<String> repeatedDeviceNameList;

        private Data(Builder builder) {
            this.invalidDetailList = builder.invalidDetailList;
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
         * @return invalidDetailList
         */
        public java.util.List<InvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidDeviceNameList
         */
        public java.util.List<String> getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        /**
         * @return invalidDeviceSecretList
         */
        public java.util.List<String> getInvalidDeviceSecretList() {
            return this.invalidDeviceSecretList;
        }

        /**
         * @return invalidSnList
         */
        public java.util.List<String> getInvalidSnList() {
            return this.invalidSnList;
        }

        /**
         * @return repeatedDeviceNameList
         */
        public java.util.List<String> getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private java.util.List<InvalidDetailList> invalidDetailList; 
            private java.util.List<String> invalidDeviceNameList; 
            private java.util.List<String> invalidDeviceSecretList; 
            private java.util.List<String> invalidSnList; 
            private java.util.List<String> repeatedDeviceNameList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.invalidDetailList = model.invalidDetailList;
                this.invalidDeviceNameList = model.invalidDeviceNameList;
                this.invalidDeviceSecretList = model.invalidDeviceSecretList;
                this.invalidSnList = model.invalidSnList;
                this.repeatedDeviceNameList = model.repeatedDeviceNameList;
            } 

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(java.util.List<InvalidDetailList> invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(java.util.List<String> invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            /**
             * InvalidDeviceSecretList.
             */
            public Builder invalidDeviceSecretList(java.util.List<String> invalidDeviceSecretList) {
                this.invalidDeviceSecretList = invalidDeviceSecretList;
                return this;
            }

            /**
             * InvalidSnList.
             */
            public Builder invalidSnList(java.util.List<String> invalidSnList) {
                this.invalidSnList = invalidSnList;
                return this;
            }

            /**
             * RepeatedDeviceNameList.
             */
            public Builder repeatedDeviceNameList(java.util.List<String> repeatedDeviceNameList) {
                this.repeatedDeviceNameList = repeatedDeviceNameList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
