// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCheckDeviceNamesResponseBody</p>
 */
public class BatchCheckDeviceNamesResponseBody extends TeaModel {
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

    private BatchCheckDeviceNamesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckDeviceNamesResponseBody create() {
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

        public BatchCheckDeviceNamesResponseBody build() {
            return new BatchCheckDeviceNamesResponseBody(this);
        } 

    } 

    public static class InvalidDeviceNameList extends TeaModel {
        @NameInMap("InvalidDeviceName")
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
             * InvalidDeviceName.
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
    public static class InvalidDeviceNicknameList extends TeaModel {
        @NameInMap("InvalidDeviceNickname")
        private java.util.List < String > invalidDeviceNickname;

        private InvalidDeviceNicknameList(Builder builder) {
            this.invalidDeviceNickname = builder.invalidDeviceNickname;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidDeviceNicknameList create() {
            return builder().build();
        }

        /**
         * @return invalidDeviceNickname
         */
        public java.util.List < String > getInvalidDeviceNickname() {
            return this.invalidDeviceNickname;
        }

        public static final class Builder {
            private java.util.List < String > invalidDeviceNickname; 

            /**
             * InvalidDeviceNickname.
             */
            public Builder invalidDeviceNickname(java.util.List < String > invalidDeviceNickname) {
                this.invalidDeviceNickname = invalidDeviceNickname;
                return this;
            }

            public InvalidDeviceNicknameList build() {
                return new InvalidDeviceNicknameList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApplyId")
        private Long applyId;

        @NameInMap("InvalidDeviceNameList")
        private InvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidDeviceNicknameList")
        private InvalidDeviceNicknameList invalidDeviceNicknameList;

        private Data(Builder builder) {
            this.applyId = builder.applyId;
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
            this.invalidDeviceNicknameList = builder.invalidDeviceNicknameList;
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
         * @return invalidDeviceNicknameList
         */
        public InvalidDeviceNicknameList getInvalidDeviceNicknameList() {
            return this.invalidDeviceNicknameList;
        }

        public static final class Builder {
            private Long applyId; 
            private InvalidDeviceNameList invalidDeviceNameList; 
            private InvalidDeviceNicknameList invalidDeviceNicknameList; 

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
             * InvalidDeviceNicknameList.
             */
            public Builder invalidDeviceNicknameList(InvalidDeviceNicknameList invalidDeviceNicknameList) {
                this.invalidDeviceNicknameList = invalidDeviceNicknameList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
