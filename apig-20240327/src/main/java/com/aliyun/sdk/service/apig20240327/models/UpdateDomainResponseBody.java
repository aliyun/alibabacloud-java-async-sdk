// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateDomainResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDomainResponseBody</p>
 */
public class UpdateDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateDomainResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID, used for tracing the API call chain.</p>
         * 
         * <strong>example:</strong>
         * <p>4BACB05C-3FE2-588F-9148-700C5C026B74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDomainResponseBody build() {
            return new UpdateDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDomainResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDomainResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deployRevisionId")
        private String deployRevisionId;

        private Data(Builder builder) {
            this.deployRevisionId = builder.deployRevisionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deployRevisionId
         */
        public String getDeployRevisionId() {
            return this.deployRevisionId;
        }

        public static final class Builder {
            private String deployRevisionId; 

            /**
             * <p>Deploy revision id.</p>
             * 
             * <strong>example:</strong>
             * <p>apr-xxx</p>
             */
            public Builder deployRevisionId(String deployRevisionId) {
                this.deployRevisionId = deployRevisionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
