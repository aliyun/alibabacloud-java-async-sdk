// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVersionTransferResponseBody} extends {@link TeaModel}
 *
 * <p>CheckVersionTransferResponseBody</p>
 */
public class CheckVersionTransferResponseBody extends TeaModel {
    @NameInMap("CheckAccess")
    private CheckAccess checkAccess;

    @NameInMap("CheckCategory")
    private Boolean checkCategory;

    @NameInMap("CheckCode")
    private CheckCode checkCode;

    @NameInMap("CheckConnection")
    private Boolean checkConnection;

    @NameInMap("CheckStatus")
    private CheckStatus checkStatus;

    @NameInMap("CheckStorage")
    private Boolean checkStorage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeDuration")
    private String timeDuration;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private CheckVersionTransferResponseBody(Builder builder) {
        this.checkAccess = builder.checkAccess;
        this.checkCategory = builder.checkCategory;
        this.checkCode = builder.checkCode;
        this.checkConnection = builder.checkConnection;
        this.checkStatus = builder.checkStatus;
        this.checkStorage = builder.checkStorage;
        this.requestId = builder.requestId;
        this.timeDuration = builder.timeDuration;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVersionTransferResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkAccess
     */
    public CheckAccess getCheckAccess() {
        return this.checkAccess;
    }

    /**
     * @return checkCategory
     */
    public Boolean getCheckCategory() {
        return this.checkCategory;
    }

    /**
     * @return checkCode
     */
    public CheckCode getCheckCode() {
        return this.checkCode;
    }

    /**
     * @return checkConnection
     */
    public Boolean getCheckConnection() {
        return this.checkConnection;
    }

    /**
     * @return checkStatus
     */
    public CheckStatus getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * @return checkStorage
     */
    public Boolean getCheckStorage() {
        return this.checkStorage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeDuration
     */
    public String getTimeDuration() {
        return this.timeDuration;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CheckAccess checkAccess; 
        private Boolean checkCategory; 
        private CheckCode checkCode; 
        private Boolean checkConnection; 
        private CheckStatus checkStatus; 
        private Boolean checkStorage; 
        private String requestId; 
        private String timeDuration; 
        private Integer totalCount; 

        /**
         * CheckAccess.
         */
        public Builder checkAccess(CheckAccess checkAccess) {
            this.checkAccess = checkAccess;
            return this;
        }

        /**
         * CheckCategory.
         */
        public Builder checkCategory(Boolean checkCategory) {
            this.checkCategory = checkCategory;
            return this;
        }

        /**
         * CheckCode.
         */
        public Builder checkCode(CheckCode checkCode) {
            this.checkCode = checkCode;
            return this;
        }

        /**
         * CheckConnection.
         */
        public Builder checkConnection(Boolean checkConnection) {
            this.checkConnection = checkConnection;
            return this;
        }

        /**
         * CheckStatus.
         */
        public Builder checkStatus(CheckStatus checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }

        /**
         * CheckStorage.
         */
        public Builder checkStorage(Boolean checkStorage) {
            this.checkStorage = checkStorage;
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
         * TimeDuration.
         */
        public Builder timeDuration(String timeDuration) {
            this.timeDuration = timeDuration;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CheckVersionTransferResponseBody build() {
            return new CheckVersionTransferResponseBody(this);
        } 

    } 

    public static class CheckAccess extends TeaModel {
        @NameInMap("ErrCode")
        private Long errCode;

        @NameInMap("ErrMessage")
        private String errMessage;

        private CheckAccess(Builder builder) {
            this.errCode = builder.errCode;
            this.errMessage = builder.errMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckAccess create() {
            return builder().build();
        }

        /**
         * @return errCode
         */
        public Long getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        public static final class Builder {
            private Long errCode; 
            private String errMessage; 

            /**
             * ErrCode.
             */
            public Builder errCode(Long errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            public CheckAccess build() {
                return new CheckAccess(this);
            } 

        } 

    }
    public static class CheckCode extends TeaModel {
        @NameInMap("ErrCode")
        private Long errCode;

        @NameInMap("ErrMessage")
        private String errMessage;

        private CheckCode(Builder builder) {
            this.errCode = builder.errCode;
            this.errMessage = builder.errMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCode create() {
            return builder().build();
        }

        /**
         * @return errCode
         */
        public Long getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        public static final class Builder {
            private Long errCode; 
            private String errMessage; 

            /**
             * ErrCode.
             */
            public Builder errCode(Long errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            public CheckCode build() {
                return new CheckCode(this);
            } 

        } 

    }
    public static class CheckStatus extends TeaModel {
        @NameInMap("ErrCode")
        private Long errCode;

        @NameInMap("ErrMessage")
        private String errMessage;

        private CheckStatus(Builder builder) {
            this.errCode = builder.errCode;
            this.errMessage = builder.errMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckStatus create() {
            return builder().build();
        }

        /**
         * @return errCode
         */
        public Long getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        public static final class Builder {
            private Long errCode; 
            private String errMessage; 

            /**
             * ErrCode.
             */
            public Builder errCode(Long errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            public CheckStatus build() {
                return new CheckStatus(this);
            } 

        } 

    }
}
