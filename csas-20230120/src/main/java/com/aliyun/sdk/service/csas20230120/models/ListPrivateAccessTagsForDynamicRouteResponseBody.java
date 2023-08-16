// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessTagsForDynamicRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessTagsForDynamicRouteResponseBody</p>
 */
public class ListPrivateAccessTagsForDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRoutes")
    private java.util.List < DynamicRoutes> dynamicRoutes;

    @NameInMap("RequestId")
    private String requestId;

    private ListPrivateAccessTagsForDynamicRouteResponseBody(Builder builder) {
        this.dynamicRoutes = builder.dynamicRoutes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessTagsForDynamicRouteResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicRoutes
     */
    public java.util.List < DynamicRoutes> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DynamicRoutes> dynamicRoutes; 
        private String requestId; 

        /**
         * DynamicRoutes.
         */
        public Builder dynamicRoutes(java.util.List < DynamicRoutes> dynamicRoutes) {
            this.dynamicRoutes = dynamicRoutes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBody build() {
            return new ListPrivateAccessTagsForDynamicRouteResponseBody(this);
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
    public static class DynamicRoutes extends TeaModel {
        @NameInMap("DynamicRouteId")
        private String dynamicRouteId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private DynamicRoutes(Builder builder) {
            this.dynamicRouteId = builder.dynamicRouteId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicRoutes create() {
            return builder().build();
        }

        /**
         * @return dynamicRouteId
         */
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String dynamicRouteId; 
            private java.util.List < Tags> tags; 

            /**
             * DynamicRouteId.
             */
            public Builder dynamicRouteId(String dynamicRouteId) {
                this.dynamicRouteId = dynamicRouteId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DynamicRoutes build() {
                return new DynamicRoutes(this);
            } 

        } 

    }
}
