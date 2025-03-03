// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetErrorsRequest} extends {@link RequestModel}
 *
 * <p>GetErrorsRequest</p>
 */
public class GetErrorsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizModule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DigestHash")
    private String digestHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private TimeRange timeRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Utdid")
    private String utdid;

    private GetErrorsRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.bizModule = builder.bizModule;
        this.digestHash = builder.digestHash;
        this.filter = builder.filter;
        this.os = builder.os;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.timeRange = builder.timeRange;
        this.utdid = builder.utdid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return bizModule
     */
    public String getBizModule() {
        return this.bizModule;
    }

    /**
     * @return digestHash
     */
    public String getDigestHash() {
        return this.digestHash;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return utdid
     */
    public String getUtdid() {
        return this.utdid;
    }

    public static final class Builder extends Request.Builder<GetErrorsRequest, Builder> {
        private Long appKey; 
        private String bizModule; 
        private String digestHash; 
        private Filter filter; 
        private String os; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private TimeRange timeRange; 
        private String utdid; 

        private Builder() {
            super();
        } 

        private Builder(GetErrorsRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.bizModule = request.bizModule;
            this.digestHash = request.digestHash;
            this.filter = request.filter;
            this.os = request.os;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.timeRange = request.timeRange;
            this.utdid = request.utdid;
        } 

        /**
         * <p>appKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24780725</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crash</p>
         */
        public Builder bizModule(String bizModule) {
            this.putBodyParameter("BizModule", bizModule);
            this.bizModule = bizModule;
            return this;
        }

        /**
         * DigestHash.
         */
        public Builder digestHash(String digestHash) {
            this.putBodyParameter("DigestHash", digestHash);
            this.digestHash = digestHash;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putBodyParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timeRange(TimeRange timeRange) {
            this.putBodyParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        /**
         * <p>utdid</p>
         * 
         * <strong>example:</strong>
         * <p>Z70g6V/MXJ8DABtD53eHzn4X</p>
         */
        public Builder utdid(String utdid) {
            this.putBodyParameter("Utdid", utdid);
            this.utdid = utdid;
            return this;
        }

        @Override
        public GetErrorsRequest build() {
            return new GetErrorsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetErrorsRequest} extends {@link TeaModel}
     *
     * <p>GetErrorsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("SubFilters")
        private java.util.List<String> subFilters;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<?> values;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.subFilters = builder.subFilters;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return subFilters
         */
        public java.util.List<String> getSubFilters() {
            return this.subFilters;
        }

        /**
         * @return values
         */
        public java.util.List<?> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List<String> subFilters; 
            private java.util.List<?> values; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * SubFilters.
             */
            public Builder subFilters(java.util.List<String> subFilters) {
                this.subFilters = subFilters;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<?> values) {
                this.values = values;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetErrorsRequest} extends {@link TeaModel}
     *
     * <p>GetErrorsRequest</p>
     */
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long startTime;

        private TimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1740499200000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1739894400000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
}
