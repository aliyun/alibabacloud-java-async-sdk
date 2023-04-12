// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountsRequest} extends {@link RequestModel}
 *
 * <p>ListAccountsRequest</p>
 */
public class ListAccountsRequest extends Request {
    @Query
    @NameInMap("IncludeTags")
    private Boolean includeTags;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryKeyword")
    private String queryKeyword;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListAccountsRequest(Builder builder) {
        super(builder);
        this.includeTags = builder.includeTags;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryKeyword = builder.queryKeyword;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeTags
     */
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryKeyword
     */
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListAccountsRequest, Builder> {
        private Boolean includeTags; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryKeyword; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListAccountsRequest request) {
            super(request);
            this.includeTags = request.includeTags;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryKeyword = request.queryKeyword;
            this.tag = request.tag;
        } 

        /**
         * Specifies whether to return the information of tags. Valid values:
         * <p>
         * 
         * false (default value) true
         */
        public Builder includeTags(Boolean includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keyword used for the query, such as the display name of a member.
         * <p>
         * 
         * Fuzzy match is supported.
         */
        public Builder queryKeyword(String queryKeyword) {
            this.putQueryParameter("QueryKeyword", queryKeyword);
            this.queryKeyword = queryKeyword;
            return this;
        }

        /**
         * The tags. This parameter specifies a filter condition.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListAccountsRequest build() {
            return new ListAccountsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
