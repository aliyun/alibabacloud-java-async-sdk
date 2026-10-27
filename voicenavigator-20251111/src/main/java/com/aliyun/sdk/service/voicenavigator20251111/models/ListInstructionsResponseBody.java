// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link ListInstructionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstructionsResponseBody</p>
 */
public class ListInstructionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstructionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstructionsResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstructionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned for the list of instructions.</p>
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
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The result message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A list of request parameters that are echoed in the response.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstructionsResponseBody build() {
            return new ListInstructionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstructionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstructionsResponseBody</p>
     */
    public static class Instructions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Instructions(Builder builder) {
            this.code = builder.code;
            this.config = builder.config;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instructions create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String config; 
            private String instanceId; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Instructions model) {
                this.code = model.code;
                this.config = model.config;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The instruction code.</p>
             * 
             * <strong>example:</strong>
             * <p>Transfer00</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The instruction configuration, in a JSON string format.</p>
             * <blockquote>
             * <ul>
             * <li><p><code>providerId</code>: The ID of the call center provider. You can obtain this ID by calling the <code>ListCallCenterProviders</code> operation.</p>
             * </li>
             * <li><p><code>transferMethod</code>: The transfer method. Valid values: <code>BYE</code>, <code>BRIDGE</code>, and <code>REFER</code>.</p>
             * </li>
             * <li><p><code>transferType</code>: The transfer target type. Valid values: <code>External</code> (external number), <code>Agent</code> (agent), and <code>SkillGroup</code> (skill group).</p>
             * </li>
             * <li><p><code>transferTarget</code>: The transfer target.</p>
             * </li>
             * <li><p><code>transferor</code>: The caller ID. If not specified, the caller\&quot;s phone number is used.</p>
             * </li>
             * <li><p><code>timeoutSeconds</code>: The transfer timeout, in seconds. The default value is 30.</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;providerId&quot;: &quot;xxxxxxxxx&quot;,
             *     &quot;transferMethod&quot;: &quot;BYE&quot;,
             *     &quot;transferType&quot;: &quot;External&quot;,
             *     &quot;transferTarget&quot;: &quot;152******&quot;,
             *     &quot;transferor&quot;: &quot;01*****&quot;,
             *     &quot;timeoutSeconds&quot;: &quot;10&quot;
             * }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instruction name.</p>
             * 
             * <strong>example:</strong>
             * <p>转人工指令一</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The instruction type.</p>
             * 
             * <strong>example:</strong>
             * <p>TRANSFER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Instructions build() {
                return new Instructions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstructionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstructionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instructions")
        private java.util.List<Instructions> instructions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.instructions = builder.instructions;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instructions
         */
        public java.util.List<Instructions> getInstructions() {
            return this.instructions;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Instructions> instructions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instructions = model.instructions;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of instructions.</p>
             */
            public Builder instructions(java.util.List<Instructions> instructions) {
                this.instructions = instructions;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of instructions.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
