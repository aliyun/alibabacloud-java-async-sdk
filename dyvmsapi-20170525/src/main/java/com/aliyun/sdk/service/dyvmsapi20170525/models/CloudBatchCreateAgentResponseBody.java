// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudBatchCreateAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CloudBatchCreateAgentResponseBody</p>
 */
public class CloudBatchCreateAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudBatchCreateAgentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudBatchCreateAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudBatchCreateAgentResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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

        public CloudBatchCreateAgentResponseBody build() {
            return new CloudBatchCreateAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudBatchCreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudBatchCreateAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cnos")
        private String cnos;

        @com.aliyun.core.annotation.NameInMap("Fail")
        private String fail;

        @com.aliyun.core.annotation.NameInMap("Other")
        private String other;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        private Data(Builder builder) {
            this.cnos = builder.cnos;
            this.fail = builder.fail;
            this.other = builder.other;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cnos
         */
        public String getCnos() {
            return this.cnos;
        }

        /**
         * @return fail
         */
        public String getFail() {
            return this.fail;
        }

        /**
         * @return other
         */
        public String getOther() {
            return this.other;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String cnos; 
            private String fail; 
            private String other; 
            private String success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cnos = model.cnos;
                this.fail = model.fail;
                this.other = model.other;
                this.success = model.success;
            } 

            /**
             * <p>成功创建的座席号</p>
             * 
             * <strong>example:</strong>
             * <p>100,101,102,103</p>
             */
            public Builder cnos(String cnos) {
                this.cnos = cnos;
                return this;
            }

            /**
             * <p>创建座席失败数量</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fail(String fail) {
                this.fail = fail;
                return this;
            }

            /**
             * <p>座席创建成功,绑定技能失败的数量</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder other(String other) {
                this.other = other;
                return this;
            }

            /**
             * <p>创建座席成功数量</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
