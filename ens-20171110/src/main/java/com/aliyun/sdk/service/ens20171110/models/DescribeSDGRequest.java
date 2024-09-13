// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSDGRequest} extends {@link RequestModel}
 *
 * <p>DescribeSDGRequest</p>
 */
public class DescribeSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGIds")
    private java.util.List < String > SDGIds;

    private DescribeSDGRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.SDGIds = builder.SDGIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGRequest create() {
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
     * @return SDGIds
     */
    public java.util.List < String > getSDGIds() {
        return this.SDGIds;
    }

    public static final class Builder extends Request.Builder<DescribeSDGRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > SDGIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSDGRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.SDGIds = request.SDGIds;
        } 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The IDs of SDGs that you want to query. By default, all SDGs are queried.
         */
        public Builder SDGIds(java.util.List < String > SDGIds) {
            String SDGIdsShrink = shrink(SDGIds, "SDGIds", "json");
            this.putQueryParameter("SDGIds", SDGIdsShrink);
            this.SDGIds = SDGIds;
            return this;
        }

        @Override
        public DescribeSDGRequest build() {
            return new DescribeSDGRequest(this);
        } 

    } 

}
