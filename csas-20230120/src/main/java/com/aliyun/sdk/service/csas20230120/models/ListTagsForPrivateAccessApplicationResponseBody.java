// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListTagsForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsForPrivateAccessApplicationResponseBody</p>
 */
public class ListTagsForPrivateAccessApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTagsForPrivateAccessApplicationResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsForPrivateAccessApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTagsForPrivateAccessApplicationResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of private network access applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>7241F45B-E8D3-5BA3-8172-8A58AC2AB0FC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagsForPrivateAccessApplicationResponseBody build() {
            return new ListTagsForPrivateAccessApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagsForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagsForPrivateAccessApplicationResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagType")
        private String tagType;

        private Tags(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.tagId = builder.tagId;
            this.tagType = builder.tagType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagType
         */
        public String getTagType() {
            return this.tagType;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String tagId; 
            private String tagType; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.tagId = model.tagId;
                this.tagType = model.tagType;
            } 

            /**
             * <p>Creation time of the private network access tag.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-01 16:05:26</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Description of the private network access tag.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条内网访问标签</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name of the internal network access tag.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Private network access tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-c0cb77857a99****</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>Private network access tag type. Values:</p>
             * <ul>
             * <li><p><strong>Default</strong>: Default.</p>
             * </li>
             * <li><p><strong>Custom</strong>: Custom.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder tagType(String tagType) {
                this.tagType = tagType;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTagsForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagsForPrivateAccessApplicationResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.tags = model.tags;
            } 

            /**
             * <p>Private network access application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-7a4445897856****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>Collection of private network access tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
