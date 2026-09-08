// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link UpdateTableResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTableResponseBody</p>
 */
public class UpdateTableResponseBody extends TeaModel {
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

    private UpdateTableResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableResponseBody create() {
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

        private Builder(UpdateTableResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TableARN&quot;:&quot;acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace/table/my_table&quot;}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>API return message</p>
         * 
         * <strong>example:</strong>
         * <p>Operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateTableResponseBody build() {
            return new UpdateTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTableResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateTableResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableARN")
        private String tableARN;

        private Data(Builder builder) {
            this.tableARN = builder.tableARN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tableARN
         */
        public String getTableARN() {
            return this.tableARN;
        }

        public static final class Builder {
            private String tableARN; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.tableARN = model.tableARN;
            } 

            /**
             * <p>Table ARN</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace/table/my_table</p>
             */
            public Builder tableARN(String tableARN) {
                this.tableARN = tableARN;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
