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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
             * <p>The default global configuration content for the Data Integration synchronization Solutions node, which specifies the default processing policy for different DDL message types. Example:
             * {&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
             * <p>DDL message types:</p>
             * <ul>
             * <li>RENAMECOLUMN: Rename a column.</li>
             * <li>DROPTABLE: Delete a table.</li>
             * <li>CREATETABLE: Create a table.</li>
             * <li>MODIFYCOLUMN: Modify a column type.</li>
             * <li>TRUNCATETABLE: Truncate a table.</li>
             * <li>DROPCOLUMN: Delete a column.</li>
             * <li>ADDCOLUMN: Add a column.</li>
             * <li>RENAMETABLE: Rename a table.</li>
             * </ul>
             * <p>When DataWorks receives a DDL message of the corresponding type, the processing policy is as follows:</p>
             * <ul>
             * <li>WARNING: Discard the message directly and record alerting information in the real-time synchronization log, indicating that the message was discarded due to an execute error.</li>
             * <li>IGNORE: Discard the message directly without sending it to the destination data source.</li>
             * <li>CRITICAL: Set the real-time synchronization node to the error state and stop the node.</li>
             * <li>NORMAL: Forward the message to the destination data source for processing. Because different destination data sources may have a different processing policy for DDL messages, DataWorks only forwards the message.</li>
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
             * <p>The executor type.</p>
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
