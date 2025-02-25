// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List < Versions> versions;

    private ListTemplateVersionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateVersionsResponseBody create() {
        return builder().build();
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
     * @return versions
     */
    public java.util.List < Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Versions> versions; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The versions.</p>
         */
        public Builder versions(java.util.List < Versions> versions) {
            this.versions = versions;
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
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Versions(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateTime; 

            /**
             * <p>The time when the version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The template ID. This parameter applies to shared and private templates. For a shared template, the template ID is the same as the Alibaba Cloud Resource Name (ARN) of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name that corresponds to the specified version.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The version number.</p>
             * <p>For a shared template, this parameter is returned only if VersionOption is set to AllVersions.</p>
             * <p>Valid values: v1 to v100.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The time when the version was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
