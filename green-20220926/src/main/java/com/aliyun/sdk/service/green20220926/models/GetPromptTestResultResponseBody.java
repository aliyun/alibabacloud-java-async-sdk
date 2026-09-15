// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetPromptTestResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetPromptTestResultResponseBody</p>
 */
public class GetPromptTestResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private GetPromptTestResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptTestResultResponseBody create() {
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

        private Builder(GetPromptTestResultResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public GetPromptTestResultResponseBody build() {
            return new GetPromptTestResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPromptTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetPromptTestResultResponseBody</p>
     */
    public static class LabelDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private LabelDetails(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelDetails create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private String reason; 

            private Builder() {
            } 

            private Builder(LabelDetails model) {
                this.description = model.description;
                this.label = model.label;
                this.reason = model.reason;
            } 

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>暴恐</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The labels.</p>
             * 
             * <strong>example:</strong>
             * <p>terrorism</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The reason why the model determined this risk level for the text.</p>
             * 
             * <strong>example:</strong>
             * <p>该文本涉及暴力恐怖信息</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public LabelDetails build() {
                return new LabelDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPromptTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetPromptTestResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("LabelDetails")
        private java.util.List<LabelDetails> labelDetails;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Result(Builder builder) {
            this.content = builder.content;
            this.labelDetails = builder.labelDetails;
            this.riskLevel = builder.riskLevel;
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
         * @return labelDetails
         */
        public java.util.List<LabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<LabelDetails> labelDetails; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.labelDetails = model.labelDetails;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The content.</p>
             * 
             * <strong>example:</strong>
             * <p>测试文本</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The labels.</p>
             */
            public Builder labelDetails(java.util.List<LabelDetails> labelDetails) {
                this.labelDetails = labelDetails;
                return this;
            }

            /**
             * <p>The risk level, which is returned based on the configured high and low risk scores. Valid values:</p>
             * <ul>
             * <li><p>high: High risk.</p>
             * </li>
             * <li><p>medium: Medium risk.</p>
             * </li>
             * <li><p>low: Low risk.</p>
             * </li>
             * <li><p>none: No risk detected.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
