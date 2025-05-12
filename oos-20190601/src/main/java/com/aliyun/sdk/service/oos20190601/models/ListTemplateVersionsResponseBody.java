// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListTemplateVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplateVersionsResponseBody</p>
 */
public class ListTemplateVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateVersions")
    private java.util.List<TemplateVersions> templateVersions;

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateVersions
     */
    public java.util.List<TemplateVersions> getTemplateVersions() {
        return this.templateVersions;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TemplateVersions> templateVersions; 

        private Builder() {
        } 

        private Builder(ListTemplateVersionsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.templateVersions = model.templateVersions;
        } 

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>NJSNDKLJS-SJKJDO090k30-JSDK232</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6CD612B-5889-4F1A-823F-8A4029E46</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The versions of the template.</p>
         */
        public Builder templateVersions(java.util.List<TemplateVersions> templateVersions) {
            this.templateVersions = templateVersions;
            return this;
        }

        public ListTemplateVersionsResponseBody build() {
            return new ListTemplateVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTemplateVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplateVersionsResponseBody</p>
     */
    public static class TemplateVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("TemplateFormat")
        private String templateFormat;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        @com.aliyun.core.annotation.NameInMap("VersionName")
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

            private Builder() {
            } 

            private Builder(TemplateVersions model) {
                this.description = model.description;
                this.templateFormat = model.templateFormat;
                this.templateVersion = model.templateVersion;
                this.updatedBy = model.updatedBy;
                this.updatedDate = model.updatedDate;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The description of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>Detach the eip from the special instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The format of the template content. Valid values: YAML and JSON.</p>
             * 
             * <strong>example:</strong>
             * <p>YAML</p>
             */
            public Builder templateFormat(String templateFormat) {
                this.templateFormat = templateFormat;
                return this;
            }

            /**
             * <p>The number of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The user who last updated the version.</p>
             * 
             * <strong>example:</strong>
             * <p>foo</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the version was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-19T06:05:41Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * <p>The name of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>baz</p>
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
