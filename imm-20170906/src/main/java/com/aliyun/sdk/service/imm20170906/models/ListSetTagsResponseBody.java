// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSetTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSetTagsResponseBody</p>
 */
public class ListSetTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private ListSetTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSetTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String requestId; 
        private String setId; 
        private java.util.List < Tags> tags; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public ListSetTagsResponseBody build() {
            return new ListSetTagsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagCount")
        private Integer tagCount;

        @NameInMap("TagLevel")
        private Integer tagLevel;

        @NameInMap("TagName")
        private String tagName;

        private Tags(Builder builder) {
            this.tagCount = builder.tagCount;
            this.tagLevel = builder.tagLevel;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagCount
         */
        public Integer getTagCount() {
            return this.tagCount;
        }

        /**
         * @return tagLevel
         */
        public Integer getTagLevel() {
            return this.tagLevel;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private Integer tagCount; 
            private Integer tagLevel; 
            private String tagName; 

            /**
             * TagCount.
             */
            public Builder tagCount(Integer tagCount) {
                this.tagCount = tagCount;
                return this;
            }

            /**
             * TagLevel.
             */
            public Builder tagLevel(Integer tagLevel) {
                this.tagLevel = tagLevel;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
