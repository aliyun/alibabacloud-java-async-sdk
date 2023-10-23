// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsResponseBody</p>
 */
public class ListTagsResponseBody extends TeaModel {
    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagInfos")
    private TagInfos tagInfos;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListTagsResponseBody(Builder builder) {
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tagInfos = builder.tagInfos;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private TagInfos tagInfos; 
        private Long totalCount; 

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * TagInfos.
         */
        public Builder tagInfos(TagInfos tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTagsResponseBody build() {
            return new ListTagsResponseBody(this);
        } 

    } 

    public static class TagInfo extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private TagInfo(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    public static class TagInfos extends TeaModel {
        @NameInMap("TagInfo")
        private java.util.List < TagInfo> tagInfo;

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
        public java.util.List < TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List < TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public TagInfos build() {
                return new TagInfos(this);
            } 

        } 

    }
}
