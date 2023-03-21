// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccesskeyLeakListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccesskeyLeakListRequest</p>
 */
public class DescribeAccesskeyLeakListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Query")
    private String query;

    @Query
    @NameInMap("StartTs")
    private Long startTs;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeAccesskeyLeakListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.startTs = builder.startTs;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccesskeyLeakListRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeAccesskeyLeakListRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String query; 
        private Long startTs; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccesskeyLeakListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.startTs = request.startTs;
            this.status = request.status;
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page.\
         * <p>
         * Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The AccessKey ID that you want to query. Only exact match is supported.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * The beginning of the time range to query. You can query all AccessKey pair leaks that are detected later than this time point. The value of this parameter is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * Specifies whether an AccessKey pair leak is handled. Valid values:
         * <p>
         * 
         * *   **pending**: unhandled
         * *   **dealed**: handled
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAccesskeyLeakListRequest build() {
            return new DescribeAccesskeyLeakListRequest(this);
        } 

    } 

}
