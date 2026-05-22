// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListOpsNoticesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpsNoticesResponseBody</p>
 */
public class ListOpsNoticesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OpsNotices")
    private java.util.List<OpsNotices> opsNotices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOpsNoticesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.opsNotices = builder.opsNotices;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpsNoticesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return opsNotices
     */
    public java.util.List<OpsNotices> getOpsNotices() {
        return this.opsNotices;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<OpsNotices> opsNotices; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOpsNoticesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.opsNotices = model.opsNotices;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OpsNotices.
         */
        public Builder opsNotices(java.util.List<OpsNotices> opsNotices) {
            this.opsNotices = opsNotices;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOpsNoticesResponseBody build() {
            return new ListOpsNoticesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOpsNoticesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOpsNoticesResponseBody</p>
     */
    public static class OpsNotices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("NoticeId")
        private String noticeId;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceVersions")
        private java.util.List<String> serviceVersions;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Solutions")
        private String solutions;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OpsNotices(Builder builder) {
            this.attributes = builder.attributes;
            this.category = builder.category;
            this.content = builder.content;
            this.noticeId = builder.noticeId;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.serviceVersions = builder.serviceVersions;
            this.severity = builder.severity;
            this.solutions = builder.solutions;
            this.startTime = builder.startTime;
            this.success = builder.success;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpsNotices create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return noticeId
         */
        public String getNoticeId() {
            return this.noticeId;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceVersions
         */
        public java.util.List<String> getServiceVersions() {
            return this.serviceVersions;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return solutions
         */
        public String getSolutions() {
            return this.solutions;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String attributes; 
            private String category; 
            private String content; 
            private String noticeId; 
            private String serviceId; 
            private String serviceName; 
            private java.util.List<String> serviceVersions; 
            private String severity; 
            private String solutions; 
            private String startTime; 
            private String success; 
            private String type; 

            private Builder() {
            } 

            private Builder(OpsNotices model) {
                this.attributes = model.attributes;
                this.category = model.category;
                this.content = model.content;
                this.noticeId = model.noticeId;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.serviceVersions = model.serviceVersions;
                this.severity = model.severity;
                this.solutions = model.solutions;
                this.startTime = model.startTime;
                this.success = model.success;
                this.type = model.type;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * NoticeId.
             */
            public Builder noticeId(String noticeId) {
                this.noticeId = noticeId;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceVersions.
             */
            public Builder serviceVersions(java.util.List<String> serviceVersions) {
                this.serviceVersions = serviceVersions;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Solutions.
             */
            public Builder solutions(String solutions) {
                this.solutions = solutions;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OpsNotices build() {
                return new OpsNotices(this);
            } 

        } 

    }
}
