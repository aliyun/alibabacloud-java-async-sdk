// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagValueListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagValueListRequest</p>
 */
public class DescribeTagValueListRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TagKey")
    @Validation(required = true)
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
         * The key of the tag whose values you want to query.
         * <p>
         * 
         * For more information about how to obtain a tag key, see [DescribeTagKeyList](~~145558~~).
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The value 200 indicates that the call was successful.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The error message.
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
