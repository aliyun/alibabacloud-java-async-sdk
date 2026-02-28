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
 * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchImportDeviceResponseBody</p>
 */
public class BatchImportDeviceResponseBody extends TeaModel {
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

    private BatchImportDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchImportDeviceResponseBody create() {
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

        private Builder(BatchImportDeviceResponseBody model) {
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
         * <p>The returned data.</p>
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

        public BatchImportDeviceResponseBody build() {
            return new BatchImportDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
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
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
     */
    public static class DataInvalidDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
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
             * InvalidDetailList.
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
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
     */
    public static class InvalidDeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidDeviceName")
        private java.util.List<String> invalidDeviceName;

        private InvalidDeviceNameList(Builder builder) {
            this.invalidDeviceName = builder.invalidDeviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDeviceNameList create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceName
         */
        public java.util.List<String> getInvalidDeviceName() {
            return this.invalidDeviceName;
        }

        public static final class Builder {
            private java.util.List<String> invalidDeviceName; 

            private Builder() {
            } 

            private Builder(InvalidDeviceNameList model) {
                this.invalidDeviceName = model.invalidDeviceName;
            } 

            /**
             * invalidDeviceName.
             */
            public Builder invalidDeviceName(java.util.List<String> invalidDeviceName) {
                this.invalidDeviceName = invalidDeviceName;
                return this;
            }

            public InvalidDeviceNameList build() {
                return new InvalidDeviceNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
     */
    public static class InvalidDeviceSecretList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidDeviceSecret")
        private java.util.List<String> invalidDeviceSecret;

        private InvalidDeviceSecretList(Builder builder) {
            this.invalidDeviceSecret = builder.invalidDeviceSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDeviceSecretList create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceSecret
         */
        public java.util.List<String> getInvalidDeviceSecret() {
            return this.invalidDeviceSecret;
        }

        public static final class Builder {
            private java.util.List<String> invalidDeviceSecret; 

            private Builder() {
            } 

            private Builder(InvalidDeviceSecretList model) {
                this.invalidDeviceSecret = model.invalidDeviceSecret;
            } 

            /**
             * invalidDeviceSecret.
             */
            public Builder invalidDeviceSecret(java.util.List<String> invalidDeviceSecret) {
                this.invalidDeviceSecret = invalidDeviceSecret;
                return this;
            }

            public InvalidDeviceSecretList build() {
                return new InvalidDeviceSecretList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
     */
    public static class InvalidSnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidSn")
        private java.util.List<String> invalidSn;

        private InvalidSnList(Builder builder) {
            this.invalidSn = builder.invalidSn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidSnList create() {
            return builder().build();
        }

        /**
         * @return invalidSn
         */
        public java.util.List<String> getInvalidSn() {
            return this.invalidSn;
        }

        public static final class Builder {
            private java.util.List<String> invalidSn; 

            private Builder() {
            } 

            private Builder(InvalidSnList model) {
                this.invalidSn = model.invalidSn;
            } 

            /**
             * invalidSn.
             */
            public Builder invalidSn(java.util.List<String> invalidSn) {
                this.invalidSn = invalidSn;
                return this;
            }

            public InvalidSnList build() {
                return new InvalidSnList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
     */
    public static class RepeatedDeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("repeatedDeviceName")
        private java.util.List<String> repeatedDeviceName;

        private RepeatedDeviceNameList(Builder builder) {
            this.repeatedDeviceName = builder.repeatedDeviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepeatedDeviceNameList create() {
            return builder().build();
        }

        /**
         * @return repeatedDeviceName
         */
        public java.util.List<String> getRepeatedDeviceName() {
            return this.repeatedDeviceName;
        }

        public static final class Builder {
            private java.util.List<String> repeatedDeviceName; 

            private Builder() {
            } 

            private Builder(RepeatedDeviceNameList model) {
                this.repeatedDeviceName = model.repeatedDeviceName;
            } 

            /**
             * repeatedDeviceName.
             */
            public Builder repeatedDeviceName(java.util.List<String> repeatedDeviceName) {
                this.repeatedDeviceName = repeatedDeviceName;
                return this;
            }

            public RepeatedDeviceNameList build() {
                return new RepeatedDeviceNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BatchImportDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyId")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private DataInvalidDetailList invalidDetailList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNameList")
        private InvalidDeviceNameList invalidDeviceNameList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceSecretList")
        private InvalidDeviceSecretList invalidDeviceSecretList;

        @com.aliyun.core.annotation.NameInMap("InvalidSnList")
        private InvalidSnList invalidSnList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceNameList")
        private RepeatedDeviceNameList repeatedDeviceNameList;

        private Data(Builder builder) {
            this.applyId = builder.applyId;
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
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return invalidDetailList
         */
        public DataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        /**
         * @return invalidDeviceNameList
         */
        public InvalidDeviceNameList getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        /**
         * @return invalidDeviceSecretList
         */
        public InvalidDeviceSecretList getInvalidDeviceSecretList() {
            return this.invalidDeviceSecretList;
        }

        /**
         * @return invalidSnList
         */
        public InvalidSnList getInvalidSnList() {
            return this.invalidSnList;
        }

        /**
         * @return repeatedDeviceNameList
         */
        public RepeatedDeviceNameList getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

        public static final class Builder {
            private Long applyId; 
            private DataInvalidDetailList invalidDetailList; 
            private InvalidDeviceNameList invalidDeviceNameList; 
            private InvalidDeviceSecretList invalidDeviceSecretList; 
            private InvalidSnList invalidSnList; 
            private RepeatedDeviceNameList repeatedDeviceNameList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyId = model.applyId;
                this.invalidDetailList = model.invalidDetailList;
                this.invalidDeviceNameList = model.invalidDeviceNameList;
                this.invalidDeviceSecretList = model.invalidDeviceSecretList;
                this.invalidSnList = model.invalidSnList;
                this.repeatedDeviceNameList = model.repeatedDeviceNameList;
            } 

            /**
             * <p>The application ID returned if the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>1295006</p>
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * InvalidDetailList.
             */
            public Builder invalidDetailList(DataInvalidDetailList invalidDetailList) {
                this.invalidDetailList = invalidDetailList;
                return this;
            }

            /**
             * InvalidDeviceNameList.
             */
            public Builder invalidDeviceNameList(InvalidDeviceNameList invalidDeviceNameList) {
                this.invalidDeviceNameList = invalidDeviceNameList;
                return this;
            }

            /**
             * InvalidDeviceSecretList.
             */
            public Builder invalidDeviceSecretList(InvalidDeviceSecretList invalidDeviceSecretList) {
                this.invalidDeviceSecretList = invalidDeviceSecretList;
                return this;
            }

            /**
             * InvalidSnList.
             */
            public Builder invalidSnList(InvalidSnList invalidSnList) {
                this.invalidSnList = invalidSnList;
                return this;
            }

            /**
             * RepeatedDeviceNameList.
             */
            public Builder repeatedDeviceNameList(RepeatedDeviceNameList repeatedDeviceNameList) {
                this.repeatedDeviceNameList = repeatedDeviceNameList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
