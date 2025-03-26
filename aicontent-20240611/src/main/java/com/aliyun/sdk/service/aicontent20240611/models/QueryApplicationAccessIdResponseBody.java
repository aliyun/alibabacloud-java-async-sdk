// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link QueryApplicationAccessIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryApplicationAccessIdResponseBody</p>
 */
public class QueryApplicationAccessIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private QueryApplicationAccessIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryApplicationAccessIdResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryApplicationAccessIdResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryApplicationAccessIdResponseBody build() {
            return new QueryApplicationAccessIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryApplicationAccessIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationAccessIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationAccessId")
        private String applicationAccessId;

        @com.aliyun.core.annotation.NameInMap("applicationAccessSecret")
        private String applicationAccessSecret;

        private Data(Builder builder) {
            this.applicationAccessId = builder.applicationAccessId;
            this.applicationAccessSecret = builder.applicationAccessSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationAccessId
         */
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        /**
         * @return applicationAccessSecret
         */
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

        public static final class Builder {
            private String applicationAccessId; 
            private String applicationAccessSecret; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicationAccessId = model.applicationAccessId;
                this.applicationAccessSecret = model.applicationAccessSecret;
            } 

            /**
             * applicationAccessId.
             */
            public Builder applicationAccessId(String applicationAccessId) {
                this.applicationAccessId = applicationAccessId;
                return this;
            }

            /**
             * applicationAccessSecret.
             */
            public Builder applicationAccessSecret(String applicationAccessSecret) {
                this.applicationAccessSecret = applicationAccessSecret;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
