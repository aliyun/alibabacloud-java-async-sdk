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
 * {@link GetApiPathFieldTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiPathFieldTemplateResponseBody</p>
 */
public class GetApiPathFieldTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetApiPathFieldTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiPathFieldTemplateResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApiPathFieldTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApiPathFieldTemplateResponseBody build() {
            return new GetApiPathFieldTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApiPathFieldTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetApiPathFieldTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("fieldPaths")
        private java.util.Map<String, java.util.List<DataFieldPathsValue>> fieldPaths;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        private Data(Builder builder) {
            this.description = builder.description;
            this.fieldPaths = builder.fieldPaths;
            this.path = builder.path;
            this.protocol = builder.protocol;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fieldPaths
         */
        public java.util.Map<String, java.util.List<DataFieldPathsValue>> getFieldPaths() {
            return this.fieldPaths;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String description; 
            private java.util.Map<String, java.util.List<DataFieldPathsValue>> fieldPaths; 
            private String path; 
            private String protocol; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.fieldPaths = model.fieldPaths;
                this.path = model.path;
                this.protocol = model.protocol;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The description text of the field template.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAI chat completion API..</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The set of fields defined by the field template, grouped by mapping key. Each group contains a set of template field items.</p>
             */
            public Builder fieldPaths(java.util.Map<String, java.util.List<DataFieldPathsValue>> fieldPaths) {
                this.fieldPaths = fieldPaths;
                return this;
            }

            /**
             * <p>The API request path corresponding to the field template.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The API protocol applicable to the field template, such as openai.</p>
             * 
             * <strong>example:</strong>
             * <p>openai</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The name of the field template.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAI Chat Completions</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
