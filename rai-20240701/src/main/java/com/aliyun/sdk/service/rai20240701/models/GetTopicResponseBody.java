// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetTopicResponseBody} extends {@link TeaModel}
 *
 * <p>GetTopicResponseBody</p>
 */
public class GetTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PolicyInfoList")
    private java.util.List<PolicyInfoList> policyInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicDefinition")
    private String topicDefinition;

    @com.aliyun.core.annotation.NameInMap("TopicExampleInfoList")
    private java.util.List<TopicExampleInfoList> topicExampleInfoList;

    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    private GetTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.gmtModified = builder.gmtModified;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.policyInfoList = builder.policyInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicDefinition = builder.topicDefinition;
        this.topicExampleInfoList = builder.topicExampleInfoList;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicResponseBody create() {
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
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
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
     * @return policyInfoList
     */
    public java.util.List<PolicyInfoList> getPolicyInfoList() {
        return this.policyInfoList;
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

    /**
     * @return topicDefinition
     */
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    /**
     * @return topicExampleInfoList
     */
    public java.util.List<TopicExampleInfoList> getTopicExampleInfoList() {
        return this.topicExampleInfoList;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder {
        private String code; 
        private Long gmtModified; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<PolicyInfoList> policyInfoList; 
        private String requestId; 
        private Boolean success; 
        private String topicDefinition; 
        private java.util.List<TopicExampleInfoList> topicExampleInfoList; 
        private String topicName; 

        private Builder() {
        } 

        private Builder(GetTopicResponseBody model) {
            this.code = model.code;
            this.gmtModified = model.gmtModified;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.policyInfoList = model.policyInfoList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topicDefinition = model.topicDefinition;
            this.topicExampleInfoList = model.topicExampleInfoList;
            this.topicName = model.topicName;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PolicyInfoList.
         */
        public Builder policyInfoList(java.util.List<PolicyInfoList> policyInfoList) {
            this.policyInfoList = policyInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TopicDefinition.
         */
        public Builder topicDefinition(String topicDefinition) {
            this.topicDefinition = topicDefinition;
            return this;
        }

        /**
         * TopicExampleInfoList.
         */
        public Builder topicExampleInfoList(java.util.List<TopicExampleInfoList> topicExampleInfoList) {
            this.topicExampleInfoList = topicExampleInfoList;
            return this;
        }

        /**
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        public GetTopicResponseBody build() {
            return new GetTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTopicResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicResponseBody</p>
     */
    public static class PolicyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
        private String policyIdentifier;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private PolicyInfoList(Builder builder) {
            this.policyId = builder.policyId;
            this.policyIdentifier = builder.policyIdentifier;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyInfoList create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyIdentifier
         */
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private Long policyId; 
            private String policyIdentifier; 
            private String policyName; 

            private Builder() {
            } 

            private Builder(PolicyInfoList model) {
                this.policyId = model.policyId;
                this.policyIdentifier = model.policyIdentifier;
                this.policyName = model.policyName;
            } 

            /**
             * PolicyId.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyIdentifier.
             */
            public Builder policyIdentifier(String policyIdentifier) {
                this.policyIdentifier = policyIdentifier;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public PolicyInfoList build() {
                return new PolicyInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTopicResponseBody} extends {@link TeaModel}
     *
     * <p>GetTopicResponseBody</p>
     */
    public static class TopicExampleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ExampleId")
        private Long exampleId;

        @com.aliyun.core.annotation.NameInMap("ExampleType")
        private Integer exampleType;

        private TopicExampleInfoList(Builder builder) {
            this.content = builder.content;
            this.exampleId = builder.exampleId;
            this.exampleType = builder.exampleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicExampleInfoList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return exampleId
         */
        public Long getExampleId() {
            return this.exampleId;
        }

        /**
         * @return exampleType
         */
        public Integer getExampleType() {
            return this.exampleType;
        }

        public static final class Builder {
            private String content; 
            private Long exampleId; 
            private Integer exampleType; 

            private Builder() {
            } 

            private Builder(TopicExampleInfoList model) {
                this.content = model.content;
                this.exampleId = model.exampleId;
                this.exampleType = model.exampleType;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ExampleId.
             */
            public Builder exampleId(Long exampleId) {
                this.exampleId = exampleId;
                return this;
            }

            /**
             * ExampleType.
             */
            public Builder exampleType(Integer exampleType) {
                this.exampleType = exampleType;
                return this;
            }

            public TopicExampleInfoList build() {
                return new TopicExampleInfoList(this);
            } 

        } 

    }
}
