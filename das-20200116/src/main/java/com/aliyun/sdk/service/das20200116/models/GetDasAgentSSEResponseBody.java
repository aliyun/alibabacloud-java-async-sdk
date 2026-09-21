// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetDasAgentSSEResponseBody} extends {@link TeaModel}
 *
 * <p>GetDasAgentSSEResponseBody</p>
 */
public class GetDasAgentSSEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Metadata metadata;

    private GetDasAgentSSEResponseBody(Builder builder) {
        this.answer = builder.answer;
        this.event = builder.event;
        this.id = builder.id;
        this.metadata = builder.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDasAgentSSEResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    public static final class Builder {
        private String answer; 
        private String event; 
        private String id; 
        private Metadata metadata; 

        private Builder() {
        } 

        private Builder(GetDasAgentSSEResponseBody model) {
            this.answer = model.answer;
            this.event = model.event;
            this.id = model.id;
            this.metadata = model.metadata;
        } 

        /**
         * <p>The answer content.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxx</p>
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * <p>The type of the returned answer information.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The session ID, which is the same as the SessionId in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The metadata.</p>
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public GetDasAgentSSEResponseBody build() {
            return new GetDasAgentSSEResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDasAgentSSEResponseBody} extends {@link TeaModel}
     *
     * <p>GetDasAgentSSEResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharCount")
        private Long charCount;

        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        @com.aliyun.core.annotation.NameInMap("ToolParams")
        private java.util.List<String> toolParams;

        private Metadata(Builder builder) {
            this.charCount = builder.charCount;
            this.code = builder.code;
            this.requestId = builder.requestId;
            this.toolName = builder.toolName;
            this.toolParams = builder.toolParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return charCount
         */
        public Long getCharCount() {
            return this.charCount;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        /**
         * @return toolParams
         */
        public java.util.List<String> getToolParams() {
            return this.toolParams;
        }

        public static final class Builder {
            private Long charCount; 
            private Integer code; 
            private String requestId; 
            private String toolName; 
            private java.util.List<String> toolParams; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.charCount = model.charCount;
                this.code = model.code;
                this.requestId = model.requestId;
                this.toolName = model.toolName;
                this.toolParams = model.toolParams;
            } 

            /**
             * <p>The number of characters in the answer.</p>
             * 
             * <strong>example:</strong>
             * <p>1403</p>
             */
            public Builder charCount(Long charCount) {
                this.charCount = charCount;
                return this;
            }

            /**
             * <p>The error type returned when an exception occurs. This field is empty when no exception occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>-1810001</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>04930480-9404-50CB-8252-Axxxxxxxx</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The tool command that is called.</p>
             * 
             * <strong>example:</strong>
             * <p>SqlFilter</p>
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            /**
             * <p>The tool parameters.</p>
             */
            public Builder toolParams(java.util.List<String> toolParams) {
                this.toolParams = toolParams;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
}
