// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchImportDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchImportDeviceResponseBody</p>
 */
public class BatchImportDeviceResponseBody extends TeaModel {
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

        public BatchImportDeviceResponseBody build() {
            return new BatchImportDeviceResponseBody(this);
        } 

    } 

    public static class InvalidDeviceNameList extends TeaModel {
        @NameInMap("invalidDeviceName")
        private java.util.List < String > invalidDeviceName;

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
        public java.util.List < String > getInvalidDeviceName() {
            return this.invalidDeviceName;
        }

        public static final class Builder {
            private java.util.List < String > invalidDeviceName; 

            /**
             * invalidDeviceName.
             */
            public Builder invalidDeviceName(java.util.List < String > invalidDeviceName) {
                this.invalidDeviceName = invalidDeviceName;
                return this;
            }

            public InvalidDeviceNameList build() {
                return new InvalidDeviceNameList(this);
            } 

        } 

    }
    public static class InvalidDeviceSecretList extends TeaModel {
        @NameInMap("invalidDeviceSecret")
        private java.util.List < String > invalidDeviceSecret;

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
        public java.util.List < String > getInvalidDeviceSecret() {
            return this.invalidDeviceSecret;
        }

        public static final class Builder {
            private java.util.List < String > invalidDeviceSecret; 

            /**
             * invalidDeviceSecret.
             */
            public Builder invalidDeviceSecret(java.util.List < String > invalidDeviceSecret) {
                this.invalidDeviceSecret = invalidDeviceSecret;
                return this;
            }

            public InvalidDeviceSecretList build() {
                return new InvalidDeviceSecretList(this);
            } 

        } 

    }
    public static class InvalidSnList extends TeaModel {
        @NameInMap("invalidSn")
        private java.util.List < String > invalidSn;

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
        public java.util.List < String > getInvalidSn() {
            return this.invalidSn;
        }

        public static final class Builder {
            private java.util.List < String > invalidSn; 

            /**
             * invalidSn.
             */
            public Builder invalidSn(java.util.List < String > invalidSn) {
                this.invalidSn = invalidSn;
                return this;
            }

            public InvalidSnList build() {
                return new InvalidSnList(this);
            } 

        } 

    }
    public static class RepeatedDeviceNameList extends TeaModel {
        @NameInMap("repeatedDeviceName")
        private java.util.List < String > repeatedDeviceName;

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
        public java.util.List < String > getRepeatedDeviceName() {
            return this.repeatedDeviceName;
        }

        public static final class Builder {
            private java.util.List < String > repeatedDeviceName; 

            /**
             * repeatedDeviceName.
             */
            public Builder repeatedDeviceName(java.util.List < String > repeatedDeviceName) {
                this.repeatedDeviceName = repeatedDeviceName;
                return this;
            }

            public RepeatedDeviceNameList build() {
                return new RepeatedDeviceNameList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApplyId")
        private Long applyId;

        @NameInMap("InvalidDeviceNameList")
        private InvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidDeviceSecretList")
        private InvalidDeviceSecretList invalidDeviceSecretList;

        @NameInMap("InvalidSnList")
        private InvalidSnList invalidSnList;

        @NameInMap("RepeatedDeviceNameList")
        private RepeatedDeviceNameList repeatedDeviceNameList;

        private Data(Builder builder) {
            this.applyId = builder.applyId;
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
            private InvalidDeviceNameList invalidDeviceNameList; 
            private InvalidDeviceSecretList invalidDeviceSecretList; 
            private InvalidSnList invalidSnList; 
            private RepeatedDeviceNameList repeatedDeviceNameList; 

            /**
             * ApplyId.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
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
