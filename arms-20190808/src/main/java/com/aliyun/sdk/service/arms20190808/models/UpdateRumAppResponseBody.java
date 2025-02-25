// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateRumAppResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRumAppResponseBody</p>
 */
public class UpdateRumAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private UpdateRumAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRumAppResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public UpdateRumAppResponseBody build() {
            return new UpdateRumAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRumAppResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateRumAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Limited")
        private Boolean limited;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Integer usage;

        private Data(Builder builder) {
            this.config = builder.config;
            this.limit = builder.limit;
            this.limited = builder.limited;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return limited
         */
        public Boolean getLimited() {
            return this.limited;
        }

        /**
         * @return usage
         */
        public Integer getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String config; 
            private Integer limit; 
            private Boolean limited; 
            private Integer usage; 

            /**
             * <p>The user configurations. This is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The QPS limit. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>Indicates whether the request is throttled due to the QPS limit. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder limited(Boolean limited) {
                this.limited = limited;
                return this;
            }

            /**
             * <p>The usage. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
