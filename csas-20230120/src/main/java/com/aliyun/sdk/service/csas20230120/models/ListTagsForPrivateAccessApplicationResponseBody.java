// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsForPrivateAccessApplicationResponseBody</p>
 */
public class ListTagsForPrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("Applications")
    private java.util.List < Applications> applications;

    @NameInMap("RequestId")
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

    /**
     * @return applications
     */
    public java.util.List < Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Applications> applications; 
        private String requestId; 

        /**
         * Applications.
         */
        public Builder applications(java.util.List < Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagsForPrivateAccessApplicationResponseBody build() {
            return new ListTagsForPrivateAccessApplicationResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("TagId")
        private String tagId;

        @NameInMap("TagType")
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

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagType.
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
    public static class Applications extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List < Tags> tags; 

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
