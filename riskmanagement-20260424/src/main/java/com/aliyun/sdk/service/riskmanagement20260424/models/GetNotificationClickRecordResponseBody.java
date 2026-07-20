// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetNotificationClickRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetNotificationClickRecordResponseBody</p>
 */
public class GetNotificationClickRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetNotificationClickRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNotificationClickRecordResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetNotificationClickRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetNotificationClickRecordResponseBody build() {
            return new GetNotificationClickRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNotificationClickRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetNotificationClickRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserCancel")
        private String userCancel;

        @com.aliyun.core.annotation.NameInMap("UserConfirm")
        private String userConfirm;

        private Data(Builder builder) {
            this.userCancel = builder.userCancel;
            this.userConfirm = builder.userConfirm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return userCancel
         */
        public String getUserCancel() {
            return this.userCancel;
        }

        /**
         * @return userConfirm
         */
        public String getUserConfirm() {
            return this.userConfirm;
        }

        public static final class Builder {
            private String userCancel; 
            private String userConfirm; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.userCancel = model.userCancel;
                this.userConfirm = model.userConfirm;
            } 

            /**
             * UserCancel.
             */
            public Builder userCancel(String userCancel) {
                this.userCancel = userCancel;
                return this;
            }

            /**
             * UserConfirm.
             */
            public Builder userConfirm(String userConfirm) {
                this.userConfirm = userConfirm;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
