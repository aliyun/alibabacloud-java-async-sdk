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
 * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
 */
public class QueryBatchRegisterDeviceStatusResponseBody extends TeaModel {
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

    private QueryBatchRegisterDeviceStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchRegisterDeviceStatusResponseBody create() {
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

        private Builder(QueryBatchRegisterDeviceStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * <blockquote>
         * <p> X.509 certificates are available only for devices in the China (Shanghai) region. If devices do not reside in the China (Shanghai) region, you cannot generate X.509 certificates for the devices and the iot.device.RegionNotSupportX509 error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status information returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryBatchRegisterDeviceStatusResponseBody build() {
            return new QueryBatchRegisterDeviceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
     */
    public static class InvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private InvalidDetailList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.errorMsg = builder.errorMsg;
            this.nickName = builder.nickName;
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

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String deviceName; 
            private String errorMsg; 
            private String nickName; 

            private Builder() {
            } 

            private Builder(InvalidDetailList model) {
                this.deviceName = model.deviceName;
                this.errorMsg = model.errorMsg;
                this.nickName = model.nickName;
            } 

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

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public InvalidDetailList build() {
                return new InvalidDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
     */
    public static class DataInvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidDetailList")
        private java.util.List<InvalidDetailList> invalidDetailList;

        private DataInvalidDetailList(Builder builder) {
            this.invalidDetailList = builder.invalidDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInvalidDetailList create() {
            return builder().build();
        }

        /**
         * @return invalidDetailList
         */
        public java.util.List<InvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public static final class Builder {
            private java.util.List<InvalidDetailList> invalidDetailList; 

            private Builder() {
            } 

            private Builder(DataInvalidDetailList model) {
                this.invalidDetailList = model.invalidDetailList;
            } 

            /**
             * invalidDetailList.
             */
            public Builder invalidDetailList(java.util.List<InvalidDetailList> invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            public DataInvalidDetailList build() {
                return new DataInvalidDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
     */
    public static class InvalidList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private java.util.List<String> name;

        private InvalidList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public java.util.List<String> getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> name; 

            private Builder() {
            } 

            private Builder(InvalidList model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(java.util.List<String> name) {
                this.name = name;
                return this;
            }

            public InvalidList build() {
                return new InvalidList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
     */
    public static class ValidList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private java.util.List<String> name;

        private ValidList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public java.util.List<String> getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> name; 

            private Builder() {
            } 

            private Builder(ValidList model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(java.util.List<String> name) {
                this.name = name;
                return this;
            }

            public ValidList build() {
                return new ValidList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBatchRegisterDeviceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBatchRegisterDeviceStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private DataInvalidDetailList invalidDetailList;

        @com.aliyun.core.annotation.NameInMap("InvalidList")
        private InvalidList invalidList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ValidList")
        private ValidList validList;

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
        public DataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidList
         */
        public InvalidList getInvalidList() {
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
        public ValidList getValidList() {
            return this.validList;
        }

        public static final class Builder {
            private DataInvalidDetailList invalidDetailList; 
            private InvalidList invalidList; 
            private String status; 
            private ValidList validList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.invalidDetailList = model.invalidDetailList;
                this.invalidList = model.invalidList;
                this.status = model.status;
                this.validList = model.validList;
            } 

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(DataInvalidDetailList invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * <ul>
             * <li>If the value of the <strong>Status</strong> parameter is <strong>CHECK_FAILED</strong> or <strong>CREATE_FAILED</strong>, some devices failed to be created and the names of the devices that failed to be created are returned in this parameter.</li>
             * <li>If the value of the <strong>Status</strong> parameter is <strong>CHECK_SUCCESS</strong> or <strong>CREATE_SUCCESS</strong>, all devices are created and an empty array is returned in this parameter.</li>
             * </ul>
             */
            public Builder invalidList(InvalidList invalidList) {
                this.invalidList = invalidList;
                return this;
            }

            /**
             * <p>The processing status and result. Valid values:</p>
             * <ul>
             * <li><p><strong>CHECK</strong>: The system is verifying device names.</p>
             * </li>
             * <li><p><strong>CHECK_SUCCESS</strong>: All devices in the application form are verified.</p>
             * </li>
             * <li><p><strong>CHECK_FAILED</strong>: All devices in the application form failed to be verified.</p>
             * </li>
             * <li><p><strong>CREATE</strong>: The system is creating devices.</p>
             * </li>
             * <li><p><strong>CREATE_SUCCESS</strong>: All devices in the application form are created.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If the authentication type of the product to which the devices belong is X.509, all devices and the related X.509 certificates are created.</p>
             * </blockquote>
             * <ul>
             * <li><strong>CREATE_FAILED</strong>: Some devices in the application form failed to be created.</li>
             * </ul>
             * <blockquote>
             * <p>If a device or X.509 certificate fails to be created in the current batch when the authentication type is X.509, all devices fail to be created.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CREATE_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <ul>
             * <li>If the value of the <strong>Status</strong> parameter is <strong>CHECK_FAILED</strong> or <strong>CREATE_FAILED</strong>, some devices failed to be created and the names of the created devices are returned in this parameter.</li>
             * <li>If the value of the <strong>Status</strong> parameter is <strong>CHECK_SUCCESS</strong> or <strong>CREATE_SUCCESS</strong>, all devices are created and an empty array is returned in this parameter.</li>
             * </ul>
             */
            public Builder validList(ValidList validList) {
                this.validList = validList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
