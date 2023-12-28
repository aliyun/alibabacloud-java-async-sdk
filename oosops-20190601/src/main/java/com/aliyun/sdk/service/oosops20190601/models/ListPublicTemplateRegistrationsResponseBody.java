// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicTemplateRegistrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicTemplateRegistrationsResponseBody</p>
 */
public class ListPublicTemplateRegistrationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Registrations")
    private java.util.List < Registrations> registrations;

    @NameInMap("RequestId")
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

    public static class Registrations extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("RegistrationId")
        private String registrationId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        private Registrations(Builder builder) {
            this.comment = builder.comment;
            this.detail = builder.detail;
            this.registrationId = builder.registrationId;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
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

        public static final class Builder {
            private String comment; 
            private String detail; 
            private String registrationId; 
            private String status; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
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

            public Registrations build() {
                return new Registrations(this);
            } 

        } 

    }
}
