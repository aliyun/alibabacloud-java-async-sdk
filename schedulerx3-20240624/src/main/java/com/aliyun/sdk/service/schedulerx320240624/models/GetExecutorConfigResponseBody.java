// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetExecutorConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetExecutorConfigResponseBody</p>
 */
public class GetExecutorConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetExecutorConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecutorConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetExecutorConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configuration data for the Executor.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetExecutorConfigResponseBody build() {
            return new GetExecutorConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExecutorConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetExecutorConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ExecutorType")
        private String executorType;

        private Data(Builder builder) {
            this.config = builder.config;
            this.executorType = builder.executorType;
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
         * @return executorType
         */
        public String getExecutorType() {
            return this.executorType;
        }

        public static final class Builder {
            private String config; 
            private String executorType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.executorType = model.executorType;
            } 

            /**
             * <p>The default global configuration for Data Integration tasks. This configuration specifies the default handling policies for different types of DDL messages. Example:
             * <code>{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</code></p>
             * <p>The DDL message types are as follows:</p>
             * <ul>
             * <li><p>RENAMECOLUMN: <code>RENAME COLUMN</code></p>
             * </li>
             * <li><p>DROPTABLE: <code>DROP TABLE</code></p>
             * </li>
             * <li><p>CREATETABLE: <code>CREATE TABLE</code></p>
             * </li>
             * <li><p>MODIFYCOLUMN: <code>MODIFY COLUMN</code></p>
             * </li>
             * <li><p>TRUNCATETABLE: <code>TRUNCATE TABLE</code></p>
             * </li>
             * <li><p>DROPCOLUMN: <code>DROP COLUMN</code></p>
             * </li>
             * <li><p>ADDCOLUMN: <code>ADD COLUMN</code></p>
             * </li>
             * <li><p>RENAMETABLE: <code>RENAME TABLE</code></p>
             * </li>
             * </ul>
             * <p>When DataWorks receives a DDL message, it applies one of the following handling policies:</p>
             * <ul>
             * <li><p>WARNING: Discards the message and logs a warning in the Real-time Synchronization Task log.</p>
             * </li>
             * <li><p>IGNORE: Discards the message without sending it to the Destination Data Source.</p>
             * </li>
             * <li><p>CRITICAL: Causes the Real-time Synchronization Task to fail.</p>
             * </li>
             * <li><p>NORMAL: Forwards the message to the Destination Data Source. Because handling of DDL messages can vary by Destination Data Source, DataWorks only forwards the message.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;cluster&quot;:&quot;c2c619b5129e0400fa3df263b249622aa&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;service&quot;:&quot;xxljob-http-demo1-svc&quot;}]</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The type of the Executor.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s_service</p>
             */
            public Builder executorType(String executorType) {
                this.executorType = executorType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
