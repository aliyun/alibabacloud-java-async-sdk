// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentSubAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataAgentSubAccountInfoResponseBody</p>
 */
public class GetDataAgentSubAccountInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataAgentSubAccountInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentSubAccountInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataAgentSubAccountInfoResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public GetDataAgentSubAccountInfoResponseBody build() {
            return new GetDataAgentSubAccountInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataAgentSubAccountInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAgentSubAccountInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private Long createDate;

        @com.aliyun.core.annotation.NameInMap("MainAccountId")
        private String mainAccountId;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private Long updateDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.createDate = builder.createDate;
            this.mainAccountId = builder.mainAccountId;
            this.updateDate = builder.updateDate;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public Long getCreateDate() {
            return this.createDate;
        }

        /**
         * @return mainAccountId
         */
        public String getMainAccountId() {
            return this.mainAccountId;
        }

        /**
         * @return updateDate
         */
        public Long getUpdateDate() {
            return this.updateDate;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long createDate; 
            private String mainAccountId; 
            private Long updateDate; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createDate = model.createDate;
                this.mainAccountId = model.mainAccountId;
                this.updateDate = model.updateDate;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * CreateDate.
             */
            public Builder createDate(Long createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * MainAccountId.
             */
            public Builder mainAccountId(String mainAccountId) {
                this.mainAccountId = mainAccountId;
                return this;
            }

            /**
             * UpdateDate.
             */
            public Builder updateDate(Long updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
