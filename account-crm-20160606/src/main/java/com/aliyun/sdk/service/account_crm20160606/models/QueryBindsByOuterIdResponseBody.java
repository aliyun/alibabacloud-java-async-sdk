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
 * {@link QueryBindsByOuterIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBindsByOuterIdResponseBody</p>
 */
public class QueryBindsByOuterIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryBindsByOuterIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBindsByOuterIdResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryBindsByOuterIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
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
        public Builder data(java.util.List<Data> data) {
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

        public QueryBindsByOuterIdResponseBody build() {
            return new QueryBindsByOuterIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBindsByOuterIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBindsByOuterIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindData")
        private java.util.Map<String, ?> bindData;

        @com.aliyun.core.annotation.NameInMap("MinorOuterId")
        private String minorOuterId;

        @com.aliyun.core.annotation.NameInMap("OuterId")
        private String outerId;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private Data(Builder builder) {
            this.bindData = builder.bindData;
            this.minorOuterId = builder.minorOuterId;
            this.outerId = builder.outerId;
            this.pk = builder.pk;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindData
         */
        public java.util.Map<String, ?> getBindData() {
            return this.bindData;
        }

        /**
         * @return minorOuterId
         */
        public String getMinorOuterId() {
            return this.minorOuterId;
        }

        /**
         * @return outerId
         */
        public String getOuterId() {
            return this.outerId;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> bindData; 
            private String minorOuterId; 
            private String outerId; 
            private String pk; 
            private String status; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindData = model.bindData;
                this.minorOuterId = model.minorOuterId;
                this.outerId = model.outerId;
                this.pk = model.pk;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * BindData.
             */
            public Builder bindData(java.util.Map<String, ?> bindData) {
                this.bindData = bindData;
                return this;
            }

            /**
             * MinorOuterId.
             */
            public Builder minorOuterId(String minorOuterId) {
                this.minorOuterId = minorOuterId;
                return this;
            }

            /**
             * OuterId.
             */
            public Builder outerId(String outerId) {
                this.outerId = outerId;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
