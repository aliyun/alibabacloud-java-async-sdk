// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocumentTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDocumentTagsResponseBody</p>
 */
public class ListDocumentTagsResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagList")
    private java.util.List < TagList> tagList;

    @NameInMap("Total")
    private Integer total;

    private ListDocumentTagsResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tagList = builder.tagList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagList
     */
    public java.util.List < TagList> getTagList() {
        return this.tagList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TagList> tagList; 
        private Integer total; 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(java.util.List < TagList> tagList) {
            this.tagList = tagList;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDocumentTagsResponseBody build() {
            return new ListDocumentTagsResponseBody(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("TagId")
        private String tagId;

        private TagList(Builder builder) {
            this.name = builder.name;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
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

        public static final class Builder {
            private String name; 
            private String tagId; 

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

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
