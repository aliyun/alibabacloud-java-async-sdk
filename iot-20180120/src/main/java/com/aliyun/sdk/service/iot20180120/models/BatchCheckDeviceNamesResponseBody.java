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
 * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCheckDeviceNamesResponseBody</p>
 */
public class BatchCheckDeviceNamesResponseBody extends TeaModel {
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

        private Builder(BatchCheckDeviceNamesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
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
         * <p>The application ID (ApplyId) returned if the call is successful. When you call the <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a> operation to register the devices, this parameter is required.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The list of invalid device aliases returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of invalid DeviceNames returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchCheckDeviceNamesResponseBody build() {
            return new BatchCheckDeviceNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesResponseBody</p>
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
     * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesResponseBody</p>
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
     * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesResponseBody</p>
     */
    public static class InvalidDeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDeviceName")
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
             * InvalidDeviceName.
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
     * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesResponseBody</p>
     */
    public static class InvalidDeviceNicknameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNickname")
        private java.util.List<String> invalidDeviceNickname;

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
        public java.util.List<String> getInvalidDeviceNickname() {
            return this.invalidDeviceNickname;
        }

        public static final class Builder {
            private java.util.List<String> invalidDeviceNickname; 

            private Builder() {
            } 

            private Builder(InvalidDeviceNicknameList model) {
                this.invalidDeviceNickname = model.invalidDeviceNickname;
            } 

            /**
             * InvalidDeviceNickname.
             */
            public Builder invalidDeviceNickname(java.util.List<String> invalidDeviceNickname) {
                this.invalidDeviceNickname = invalidDeviceNickname;
                return this;
            }

            public InvalidDeviceNicknameList build() {
                return new InvalidDeviceNicknameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesResponseBody</p>
     */
    public static class RepeatedDeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RepeatDevieNameList")
        private java.util.List<String> repeatDevieNameList;

        private RepeatedDeviceNameList(Builder builder) {
            this.repeatDevieNameList = builder.repeatDevieNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepeatedDeviceNameList create() {
            return builder().build();
        }

        /**
         * @return repeatDevieNameList
         */
        public java.util.List<String> getRepeatDevieNameList() {
            return this.repeatDevieNameList;
        }

        public static final class Builder {
            private java.util.List<String> repeatDevieNameList; 

            private Builder() {
            } 

            private Builder(RepeatedDeviceNameList model) {
                this.repeatDevieNameList = model.repeatDevieNameList;
            } 

            /**
             * RepeatDevieNameList.
             */
            public Builder repeatDevieNameList(java.util.List<String> repeatDevieNameList) {
                this.repeatDevieNameList = repeatDevieNameList;
                return this;
            }

            public RepeatedDeviceNameList build() {
                return new RepeatedDeviceNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCheckDeviceNamesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyId")
        private Long applyId;

        @com.aliyun.core.annotation.NameInMap("InvalidDetailList")
        private DataInvalidDetailList invalidDetailList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNameList")
        private InvalidDeviceNameList invalidDeviceNameList;

        @com.aliyun.core.annotation.NameInMap("InvalidDeviceNicknameList")
        private InvalidDeviceNicknameList invalidDeviceNicknameList;

        @com.aliyun.core.annotation.NameInMap("RepeatedDeviceNameList")
        private RepeatedDeviceNameList repeatedDeviceNameList;

        private Data(Builder builder) {
            this.applyId = builder.applyId;
            this.invalidDetailList = builder.invalidDetailList;
            this.invalidDeviceNameList = builder.invalidDeviceNameList;
            this.invalidDeviceNicknameList = builder.invalidDeviceNicknameList;
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
         * @return invalidDeviceNicknameList
         */
        public InvalidDeviceNicknameList getInvalidDeviceNicknameList() {
            return this.invalidDeviceNicknameList;
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
            private InvalidDeviceNicknameList invalidDeviceNicknameList; 
            private RepeatedDeviceNameList repeatedDeviceNameList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyId = model.applyId;
                this.invalidDetailList = model.invalidDetailList;
                this.invalidDeviceNameList = model.invalidDeviceNameList;
                this.invalidDeviceNicknameList = model.invalidDeviceNicknameList;
                this.repeatedDeviceNameList = model.repeatedDeviceNameList;
            } 

            /**
             * ApplyId.
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
             * InvalidDeviceNicknameList.
             */
            public Builder invalidDeviceNicknameList(InvalidDeviceNicknameList invalidDeviceNicknameList) {
                this.invalidDeviceNicknameList = invalidDeviceNicknameList;
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
