// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link QueryTagsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTagsResponseBody</p>
 */
public class QueryTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagInfos")
    private TagInfos tagInfos;

    private QueryTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagInfos = builder.tagInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagInfos
     */
    public TagInfos getTagInfos() {
        return this.tagInfos;
    }

    public static final class Builder {
        private String requestId; 
        private TagInfos tagInfos; 

        private Builder() {
        } 

        private Builder(QueryTagsResponseBody model) {
            this.requestId = model.requestId;
            this.tagInfos = model.tagInfos;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagInfos.
         */
        public Builder tagInfos(TagInfos tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }

        public QueryTagsResponseBody build() {
            return new QueryTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTagsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagsResponseBody</p>
     */
    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagInfo(Builder builder) {
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagInfo model) {
                this.tagName = model.tagName;
            } 

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTagsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagsResponseBody</p>
     */
    public static class TagInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List<TagInfo> tagInfo;

        private TagInfos(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfos create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List<TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List<TagInfo> tagInfo; 

            private Builder() {
            } 

            private Builder(TagInfos model) {
                this.tagInfo = model.tagInfo;
            } 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List<TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public TagInfos build() {
                return new TagInfos(this);
            } 

        } 

    }
}
