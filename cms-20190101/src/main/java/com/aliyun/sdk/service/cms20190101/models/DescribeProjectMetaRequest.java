// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectMetaRequest} extends {@link RequestModel}
 *
 * <p>DescribeProjectMetaRequest</p>
 */
public class DescribeProjectMetaRequest extends Request {
    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeProjectMetaRequest(Builder builder) {
        super(builder);
        this.labels = builder.labels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
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

    public static final class Builder extends Request.Builder<DescribeProjectMetaRequest, Builder> {
        private String labels; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProjectMetaRequest request) {
            super(request);
            this.labels = request.labels;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The tags. Tags are used to filter services.
         * <p>
         * 
         * You can filter services only by the tag whose `name` is `product`. Example: {"name":"product","value":"ECS"}.
         * 
         * > We recommend that you do not use the special tags in the CloudMonitor console.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 1.
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
         * Valid values: 1 to 10000.
         * 
         * Default value: 30.
         * 
         * > The value of this parameter is not limited. You can view a large number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeProjectMetaRequest build() {
            return new DescribeProjectMetaRequest(this);
        } 

    } 

}
