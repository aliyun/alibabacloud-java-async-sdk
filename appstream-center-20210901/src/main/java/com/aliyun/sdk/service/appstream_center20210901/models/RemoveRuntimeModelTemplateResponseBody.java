// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link RemoveRuntimeModelTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveRuntimeModelTemplateResponseBody</p>
 */
public class RemoveRuntimeModelTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private RemoveRuntimeModelTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveRuntimeModelTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(RemoveRuntimeModelTemplateResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of removal results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public RemoveRuntimeModelTemplateResponseBody build() {
            return new RemoveRuntimeModelTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveRuntimeModelTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveRuntimeModelTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
        private Integer httpStatusCode;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RuntimeId")
        private String runtimeId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.code = builder.code;
            this.httpStatusCode = builder.httpStatusCode;
            this.message = builder.message;
            this.runtimeId = builder.runtimeId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return httpStatusCode
         */
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private Integer httpStatusCode; 
            private String message; 
            private String runtimeId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.httpStatusCode = model.httpStatusCode;
                this.message = model.message;
                this.runtimeId = model.runtimeId;
                this.success = model.success;
            } 

            /**
             * <p>The error code returned when the operation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Runtime.NotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The HTTP status code returned when the operation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder httpStatusCode(Integer httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * <p>The error message returned when the operation fails.</p>
             * 
             * <strong>example:</strong>
             * <p>The runtime is not found.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The Agent runtime ID. The ID mapping is as follows:</p>
             * <ul>
             * <li>JVS Computer: JVS Computer ID, in the format of jvs-xxxx.</li>
             * <li>OpenClaw: cloud computer ID, in the format of ecd-xxxx.</li>
             * <li>Hermes Agent: Hermes Agent ID, in the format of jvs-xxxx.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>jvs-xxxxx</p>
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            /**
             * <p>Indicates whether the operation was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
