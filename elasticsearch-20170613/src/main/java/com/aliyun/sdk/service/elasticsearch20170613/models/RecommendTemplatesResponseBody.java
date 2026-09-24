// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link RecommendTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>RecommendTemplatesResponseBody</p>
 */
public class RecommendTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private RecommendTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(RecommendTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66B060CF-7381-49C7-9B89-7757927FDA16</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public RecommendTemplatesResponseBody build() {
            return new RecommendTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecommendTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>RecommendTemplatesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        private Result(Builder builder) {
            this.content = builder.content;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String content; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The template configuration content.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n\t\&quot;persistent\&quot;: {\n\t\t\&quot;search\&quot;: {\n\t\t\t\&quot;max_buckets\&quot;: \&quot;10000\&quot;\n\t\t}\n\t}\n}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The template name. Valid values:</p>
             * <ul>
             * <li>staticSettings: cluster static configuration</li>
             * <li>dynamicSettings: cluster dynamic configuration</li>
             * <li>indexTemplate: index template configuration</li>
             * <li>ilmPolicy: index lifecycle configuration</li>
             * </ul>
             * <blockquote>
             * <p>Advanced Edition instances of version 6.7.0 or later support enabling the index lifecycle template.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dynamicSettings</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
