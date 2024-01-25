// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessTagsResponseBody</p>
 */
public class ListPrivateAccessTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private ListPrivateAccessTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tags = builder.tags;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tags> tags; 
        private Integer totalNum; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The internal access tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The total number of internal access tags.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListPrivateAccessTagsResponseBody build() {
            return new ListPrivateAccessTagsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("ApplicationIds")
        private java.util.List < String > applicationIds;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("PolicyIds")
        private java.util.List < String > policyIds;

        @NameInMap("TagId")
        private String tagId;

        @NameInMap("TagType")
        private String tagType;

        private Tags(Builder builder) {
            this.applicationIds = builder.applicationIds;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.policyIds = builder.policyIds;
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
         * @return applicationIds
         */
        public java.util.List < String > getApplicationIds() {
            return this.applicationIds;
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
         * @return policyIds
         */
        public java.util.List < String > getPolicyIds() {
            return this.policyIds;
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
            private java.util.List < String > applicationIds; 
            private String createTime; 
            private String description; 
            private String name; 
            private java.util.List < String > policyIds; 
            private String tagId; 
            private String tagType; 

            /**
             * The IDs of the internal access applications.
             */
            public Builder applicationIds(java.util.List < String > applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * The time when the internal access tag was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the internal access tag.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the internal access tag.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The IDs of the internal access policies.
             */
            public Builder policyIds(java.util.List < String > policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * The ID of the internal access tag.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * The type of the internal access tag. Valid values:
             * <p>
             * 
             * *   **Default**
             * *   **Custom**
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
}
