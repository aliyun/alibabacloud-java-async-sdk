// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListPoolsRequest} extends {@link RequestModel}
 *
 * <p>ListPoolsRequest</p>
 */
public class ListPoolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListPoolsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoolsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
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

    public static final class Builder extends Request.Builder<ListPoolsRequest, Builder> {
        private Filter filter; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListPoolsRequest request) {
            super(request);
            this.filter = request.filter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public ListPoolsRequest build() {
            return new ListPoolsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPoolsRequest} extends {@link TeaModel}
     *
     * <p>ListPoolsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PoolName")
        private java.util.List<String> poolName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private java.util.List<String> status;

        @com.aliyun.core.annotation.NameInMap("TimeCreatedAfter")
        private Integer timeCreatedAfter;

        @com.aliyun.core.annotation.NameInMap("TimeCreatedBefore")
        private Integer timeCreatedBefore;

        private Filter(Builder builder) {
            this.poolName = builder.poolName;
            this.status = builder.status;
            this.timeCreatedAfter = builder.timeCreatedAfter;
            this.timeCreatedBefore = builder.timeCreatedBefore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return poolName
         */
        public java.util.List<String> getPoolName() {
            return this.poolName;
        }

        /**
         * @return status
         */
        public java.util.List<String> getStatus() {
            return this.status;
        }

        /**
         * @return timeCreatedAfter
         */
        public Integer getTimeCreatedAfter() {
            return this.timeCreatedAfter;
        }

        /**
         * @return timeCreatedBefore
         */
        public Integer getTimeCreatedBefore() {
            return this.timeCreatedBefore;
        }

        public static final class Builder {
            private java.util.List<String> poolName; 
            private java.util.List<String> status; 
            private Integer timeCreatedAfter; 
            private Integer timeCreatedBefore; 

            /**
             * PoolName.
             */
            public Builder poolName(java.util.List<String> poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(java.util.List<String> status) {
                this.status = status;
                return this;
            }

            /**
             * TimeCreatedAfter.
             */
            public Builder timeCreatedAfter(Integer timeCreatedAfter) {
                this.timeCreatedAfter = timeCreatedAfter;
                return this;
            }

            /**
             * TimeCreatedBefore.
             */
            public Builder timeCreatedBefore(Integer timeCreatedBefore) {
                this.timeCreatedBefore = timeCreatedBefore;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
