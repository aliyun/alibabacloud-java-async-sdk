// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPublicTemplateRegistrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicTemplateRegistrationsResponseBody</p>
 */
public class ListPublicTemplateRegistrationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Registrations")
    private java.util.List < Registrations> registrations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPublicTemplateRegistrationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.registrations = builder.registrations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicTemplateRegistrationsResponseBody create() {
        return builder().build();
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
     * @return registrations
     */
    public java.util.List < Registrations> getRegistrations() {
        return this.registrations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < Registrations> registrations; 
        private String requestId; 

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
         * Registrations.
         */
        public Builder registrations(java.util.List < Registrations> registrations) {
            this.registrations = registrations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPublicTemplateRegistrationsResponseBody build() {
            return new ListPublicTemplateRegistrationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublicTemplateRegistrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicTemplateRegistrationsResponseBody</p>
     */
    public static class Registrations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("RegistrationId")
        private String registrationId;

        @com.aliyun.core.annotation.NameInMap("ShowPages")
        private String showPages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private Registrations(Builder builder) {
            this.comment = builder.comment;
            this.createdDate = builder.createdDate;
            this.detail = builder.detail;
            this.registrationId = builder.registrationId;
            this.showPages = builder.showPages;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Registrations create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return registrationId
         */
        public String getRegistrationId() {
            return this.registrationId;
        }

        /**
         * @return showPages
         */
        public String getShowPages() {
            return this.showPages;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String comment; 
            private String createdDate; 
            private String detail; 
            private String registrationId; 
            private String showPages; 
            private String status; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updatedDate; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * RegistrationId.
             */
            public Builder registrationId(String registrationId) {
                this.registrationId = registrationId;
                return this;
            }

            /**
             * ShowPages.
             */
            public Builder showPages(String showPages) {
                this.showPages = showPages;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * UpdatedDate.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public Registrations build() {
                return new Registrations(this);
            } 

        } 

    }
}
