// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeLogTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogTypeResponseBody</p>
 */
public class DescribeLogTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeLogTypeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogTypeResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeLogTypeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeLogTypeResponseBody build() {
            return new DescribeLogTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogTypeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("LogTypeName")
        private String logTypeName;

        private Data(Builder builder) {
            this.logType = builder.logType;
            this.logTypeName = builder.logTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return logTypeName
         */
        public String getLogTypeName() {
            return this.logTypeName;
        }

        public static final class Builder {
            private String logType; 
            private String logTypeName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.logType = model.logType;
                this.logTypeName = model.logTypeName;
            } 

            /**
             * <p>The log type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP_ACTIVITY</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The internal code of the log type.</p>
             * 
             * <strong>example:</strong>
             * <p>sas.cloudsiem.prod.http_activity</p>
             */
            public Builder logTypeName(String logTypeName) {
                this.logTypeName = logTypeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
