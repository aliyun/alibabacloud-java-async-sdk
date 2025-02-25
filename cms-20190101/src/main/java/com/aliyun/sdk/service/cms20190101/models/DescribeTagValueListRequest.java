// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTagValueListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagValueListRequest</p>
 */
public class DescribeTagValueListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagKey;

    private DescribeTagValueListRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagValueListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<DescribeTagValueListRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTagValueListRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100. Pages start from page 1. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The key of the tag whose values you want to query.</p>
         * <p>For more information about how to obtain a tag key, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey1</p>
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public DescribeTagValueListRequest build() {
            return new DescribeTagValueListRequest(this);
        } 

    } 

}
