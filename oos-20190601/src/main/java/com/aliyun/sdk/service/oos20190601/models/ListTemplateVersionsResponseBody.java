// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplateVersionsResponseBody</p>
 */
public class ListTemplateVersionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateVersions")
    private java.util.List < TemplateVersions> templateVersions;

    private ListTemplateVersionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.templateVersions = builder.templateVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateVersionsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateVersions
     */
    public java.util.List < TemplateVersions> getTemplateVersions() {
        return this.templateVersions;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < TemplateVersions> templateVersions; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateVersions.
         */
        public Builder templateVersions(java.util.List < TemplateVersions> templateVersions) {
            this.templateVersions = templateVersions;
            return this;
        }

        public ListTemplateVersionsResponseBody build() {
            return new ListTemplateVersionsResponseBody(this);
        } 

    } 

    public static class TemplateVersions extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("TemplateFormat")
        private String templateFormat;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        @NameInMap("VersionName")
        private String versionName;

        private TemplateVersions(Builder builder) {
            this.description = builder.description;
            this.templateFormat = builder.templateFormat;
            this.templateVersion = builder.templateVersion;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateVersions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return templateFormat
         */
        public String getTemplateFormat() {
            return this.templateFormat;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String description; 
            private String templateFormat; 
            private String templateVersion; 
            private String updatedBy; 
            private String updatedDate; 
            private String versionName; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * TemplateFormat.
             */
            public Builder templateFormat(String templateFormat) {
                this.templateFormat = templateFormat;
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
             * UpdatedBy.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * UpdatedDate.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public TemplateVersions build() {
                return new TemplateVersions(this);
            } 

        } 

    }
}
