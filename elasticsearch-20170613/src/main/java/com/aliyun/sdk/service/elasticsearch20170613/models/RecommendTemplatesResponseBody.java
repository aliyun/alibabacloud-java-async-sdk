// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
    private java.util.List < Result> result;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
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

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * <li></li>
             * <li></li>
             * <li></li>
             * </ul>
             * <p>**</p>
             * <hr>
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
