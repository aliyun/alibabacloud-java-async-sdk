// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListAssetCountRequest} extends {@link RequestModel}
 *
 * <p>ListAssetCountRequest</p>
 */
public class ListAssetCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    private ListAssetCountRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.showSize = builder.showSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ListAssetCountRequest, Builder> {
        private Long currentPage; 
        private Long endDate; 
        private Long showSize; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetCountRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.showSize = request.showSize;
            this.startDate = request.startDate;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ListAssetCountRequest build() {
            return new ListAssetCountRequest(this);
        } 

    } 

}
