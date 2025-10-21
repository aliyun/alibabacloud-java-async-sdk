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
 * {@link ListTopicResponseBody} extends {@link TeaModel}
 *
 * <p>ListTopicResponseBody</p>
 */
public class ListTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicInfoList")
    private java.util.List<TopicInfoList> topicInfoList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicInfoList = builder.topicInfoList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicResponseBody create() {
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
     * @return topicInfoList
     */
    public java.util.List<TopicInfoList> getTopicInfoList() {
        return this.topicInfoList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TopicInfoList> topicInfoList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTopicResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topicInfoList = model.topicInfoList;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TopicInfoList.
         */
        public Builder topicInfoList(java.util.List<TopicInfoList> topicInfoList) {
            this.topicInfoList = topicInfoList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTopicResponseBody build() {
            return new ListTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicResponseBody</p>
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
     * {@link ListTopicResponseBody} extends {@link TeaModel}
     *
     * <p>ListTopicResponseBody</p>
     */
    public static class TopicInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("PolicyInfoList")
        private java.util.List<PolicyInfoList> policyInfoList;

        @com.aliyun.core.annotation.NameInMap("TopicDefinition")
        private String topicDefinition;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private TopicInfoList(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.policyInfoList = builder.policyInfoList;
            this.topicDefinition = builder.topicDefinition;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return policyInfoList
         */
        public java.util.List<PolicyInfoList> getPolicyInfoList() {
            return this.policyInfoList;
        }

        /**
         * @return topicDefinition
         */
        public String getTopicDefinition() {
            return this.topicDefinition;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long gmtModified; 
            private java.util.List<PolicyInfoList> policyInfoList; 
            private String topicDefinition; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(TopicInfoList model) {
                this.gmtModified = model.gmtModified;
                this.policyInfoList = model.policyInfoList;
                this.topicDefinition = model.topicDefinition;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
            } 

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * TopicDefinition.
             */
            public Builder topicDefinition(String topicDefinition) {
                this.topicDefinition = topicDefinition;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public TopicInfoList build() {
                return new TopicInfoList(this);
            } 

        } 

    }
}
