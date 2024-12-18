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
 * {@link ListPrivateAccessTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessTagsResponseBody</p>
 */
public class ListPrivateAccessTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 
        private Integer totalNum; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54C1D236-CDB9-586C-B44D-AFDCEA195545</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The internal access tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The total number of internal access tags.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListPrivateAccessTagsResponseBody build() {
            return new ListPrivateAccessTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateAccessTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessTagsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationIds")
        private java.util.List<String> applicationIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagType")
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
        public java.util.List<String> getApplicationIds() {
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
        public java.util.List<String> getPolicyIds() {
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
            private java.util.List<String> applicationIds; 
            private String createTime; 
            private String description; 
            private String name; 
            private java.util.List<String> policyIds; 
            private String tagId; 
            private String tagType; 

            /**
             * <p>The IDs of the internal access applications.</p>
             */
            public Builder applicationIds(java.util.List<String> applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * <p>The time when the internal access tag was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-10 11:39:34</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the internal access tag.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the internal access tag.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The IDs of the internal access policies.</p>
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * <p>The ID of the internal access tag.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-d3f64e8bdd4a****</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The type of the internal access tag. Valid values:</p>
             * <ul>
             * <li><strong>Default</strong></li>
             * <li><strong>Custom</strong></li>
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
}
