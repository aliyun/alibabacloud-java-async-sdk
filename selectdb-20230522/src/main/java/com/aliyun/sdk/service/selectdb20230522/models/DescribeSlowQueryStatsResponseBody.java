// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeSlowQueryStatsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowQueryStatsResponseBody</p>
 */
public class DescribeSlowQueryStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ByDatabase")
    private Object byDatabase;

    @com.aliyun.core.annotation.NameInMap("ByTimeBucket")
    private Object byTimeBucket;

    @com.aliyun.core.annotation.NameInMap("ByUser")
    private Object byUser;

    @com.aliyun.core.annotation.NameInMap("Percentiles")
    private java.util.Map<String, ?> percentiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private java.util.Map<String, ?> summary;

    @com.aliyun.core.annotation.NameInMap("TopQueries")
    private Object topQueries;

    @com.aliyun.core.annotation.NameInMap("TopSqlDigests")
    private Object topSqlDigests;

    private DescribeSlowQueryStatsResponseBody(Builder builder) {
        this.byDatabase = builder.byDatabase;
        this.byTimeBucket = builder.byTimeBucket;
        this.byUser = builder.byUser;
        this.percentiles = builder.percentiles;
        this.requestId = builder.requestId;
        this.summary = builder.summary;
        this.topQueries = builder.topQueries;
        this.topSqlDigests = builder.topSqlDigests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowQueryStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return byDatabase
     */
    public Object getByDatabase() {
        return this.byDatabase;
    }

    /**
     * @return byTimeBucket
     */
    public Object getByTimeBucket() {
        return this.byTimeBucket;
    }

    /**
     * @return byUser
     */
    public Object getByUser() {
        return this.byUser;
    }

    /**
     * @return percentiles
     */
    public java.util.Map<String, ?> getPercentiles() {
        return this.percentiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summary
     */
    public java.util.Map<String, ?> getSummary() {
        return this.summary;
    }

    /**
     * @return topQueries
     */
    public Object getTopQueries() {
        return this.topQueries;
    }

    /**
     * @return topSqlDigests
     */
    public Object getTopSqlDigests() {
        return this.topSqlDigests;
    }

    public static final class Builder {
        private Object byDatabase; 
        private Object byTimeBucket; 
        private Object byUser; 
        private java.util.Map<String, ?> percentiles; 
        private String requestId; 
        private java.util.Map<String, ?> summary; 
        private Object topQueries; 
        private Object topSqlDigests; 

        private Builder() {
        } 

        private Builder(DescribeSlowQueryStatsResponseBody model) {
            this.byDatabase = model.byDatabase;
            this.byTimeBucket = model.byTimeBucket;
            this.byUser = model.byUser;
            this.percentiles = model.percentiles;
            this.requestId = model.requestId;
            this.summary = model.summary;
            this.topQueries = model.topQueries;
            this.topSqlDigests = model.topSqlDigests;
        } 

        /**
         * ByDatabase.
         */
        public Builder byDatabase(Object byDatabase) {
            this.byDatabase = byDatabase;
            return this;
        }

        /**
         * ByTimeBucket.
         */
        public Builder byTimeBucket(Object byTimeBucket) {
            this.byTimeBucket = byTimeBucket;
            return this;
        }

        /**
         * ByUser.
         */
        public Builder byUser(Object byUser) {
            this.byUser = byUser;
            return this;
        }

        /**
         * Percentiles.
         */
        public Builder percentiles(java.util.Map<String, ?> percentiles) {
            this.percentiles = percentiles;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(java.util.Map<String, ?> summary) {
            this.summary = summary;
            return this;
        }

        /**
         * TopQueries.
         */
        public Builder topQueries(Object topQueries) {
            this.topQueries = topQueries;
            return this;
        }

        /**
         * TopSqlDigests.
         */
        public Builder topSqlDigests(Object topSqlDigests) {
            this.topSqlDigests = topSqlDigests;
            return this;
        }

        public DescribeSlowQueryStatsResponseBody build() {
            return new DescribeSlowQueryStatsResponseBody(this);
        } 

    } 

}
