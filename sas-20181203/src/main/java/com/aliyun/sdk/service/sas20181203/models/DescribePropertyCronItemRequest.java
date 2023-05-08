// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCronItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyCronItemRequest</p>
 */
public class DescribePropertyCronItemRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ForceFlush")
    private Boolean forceFlush;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Source")
    private String source;

    private DescribePropertyCronItemRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.forceFlush = builder.forceFlush;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCronItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return forceFlush
     */
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DescribePropertyCronItemRequest, Builder> {
        private Integer currentPage; 
        private Boolean forceFlush; 
        private Integer pageSize; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyCronItemRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.forceFlush = request.forceFlush;
            this.pageSize = request.pageSize;
            this.source = request.source;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ForceFlush.
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DescribePropertyCronItemRequest build() {
            return new DescribePropertyCronItemRequest(this);
        } 

    } 

}
