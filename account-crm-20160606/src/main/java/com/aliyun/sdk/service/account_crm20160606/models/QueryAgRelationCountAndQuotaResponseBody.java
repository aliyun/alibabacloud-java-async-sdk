// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryAgRelationCountAndQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAgRelationCountAndQuotaResponseBody</p>
 */
public class QueryAgRelationCountAndQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NullObject")
    private Boolean nullObject;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAgRelationCountAndQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.nullObject = builder.nullObject;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAgRelationCountAndQuotaResponseBody create() {
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
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nullObject
     */
    public Boolean getNullObject() {
        return this.nullObject;
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
        private String httpCode; 
        private String message; 
        private Boolean nullObject; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAgRelationCountAndQuotaResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.nullObject = model.nullObject;
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
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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
         * NullObject.
         */
        public Builder nullObject(Boolean nullObject) {
            this.nullObject = nullObject;
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

        public QueryAgRelationCountAndQuotaResponseBody build() {
            return new QueryAgRelationCountAndQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAgRelationCountAndQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAgRelationCountAndQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountCount")
        private Long accountCount;

        @com.aliyun.core.annotation.NameInMap("Mpk")
        private String mpk;

        @com.aliyun.core.annotation.NameInMap("NullObject")
        private Boolean nullObject;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Integer quota;

        private Data(Builder builder) {
            this.accountCount = builder.accountCount;
            this.mpk = builder.mpk;
            this.nullObject = builder.nullObject;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountCount
         */
        public Long getAccountCount() {
            return this.accountCount;
        }

        /**
         * @return mpk
         */
        public String getMpk() {
            return this.mpk;
        }

        /**
         * @return nullObject
         */
        public Boolean getNullObject() {
            return this.nullObject;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private Long accountCount; 
            private String mpk; 
            private Boolean nullObject; 
            private Integer quota; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountCount = model.accountCount;
                this.mpk = model.mpk;
                this.nullObject = model.nullObject;
                this.quota = model.quota;
            } 

            /**
             * AccountCount.
             */
            public Builder accountCount(Long accountCount) {
                this.accountCount = accountCount;
                return this;
            }

            /**
             * Mpk.
             */
            public Builder mpk(String mpk) {
                this.mpk = mpk;
                return this;
            }

            /**
             * NullObject.
             */
            public Builder nullObject(Boolean nullObject) {
                this.nullObject = nullObject;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
