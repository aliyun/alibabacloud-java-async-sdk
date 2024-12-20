// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListSyntheticDetailRequest} extends {@link RequestModel}
 *
 * <p>ListSyntheticDetailRequest</p>
 */
public class ListSyntheticDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedFilters")
    private java.util.List<AdvancedFilters> advancedFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExactFilters")
    private java.util.List<ExactFilters> exactFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.Map<String, String> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyntheticType")
    private Integer syntheticType;

    private ListSyntheticDetailRequest(Builder builder) {
        super(builder);
        this.advancedFilters = builder.advancedFilters;
        this.category = builder.category;
        this.detail = builder.detail;
        this.endTime = builder.endTime;
        this.exactFilters = builder.exactFilters;
        this.filters = builder.filters;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.syntheticType = builder.syntheticType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSyntheticDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedFilters
     */
    public java.util.List<AdvancedFilters> getAdvancedFilters() {
        return this.advancedFilters;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return exactFilters
     */
    public java.util.List<ExactFilters> getExactFilters() {
        return this.exactFilters;
    }

    /**
     * @return filters
     */
    public java.util.Map<String, String> getFilters() {
        return this.filters;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return syntheticType
     */
    public Integer getSyntheticType() {
        return this.syntheticType;
    }

    public static final class Builder extends Request.Builder<ListSyntheticDetailRequest, Builder> {
        private java.util.List<AdvancedFilters> advancedFilters; 
        private String category; 
        private String detail; 
        private Long endTime; 
        private java.util.List<ExactFilters> exactFilters; 
        private java.util.Map<String, String> filters; 
        private String order; 
        private String orderBy; 
        private Integer page; 
        private Integer pageSize; 
        private String regionId; 
        private Long startTime; 
        private Integer syntheticType; 

        private Builder() {
            super();
        } 

        private Builder(ListSyntheticDetailRequest request) {
            super(request);
            this.advancedFilters = request.advancedFilters;
            this.category = request.category;
            this.detail = request.detail;
            this.endTime = request.endTime;
            this.exactFilters = request.exactFilters;
            this.filters = request.filters;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.syntheticType = request.syntheticType;
        } 

        /**
         * <p>An array of filter conditions. This parameter is required.</p>
         * <ul>
         * <li>To query the list of synthetic test results, set this parameter in the following format: [{&quot;Key&quot;:&quot;taskType&quot;,&quot;OpType&quot;:&quot;in&quot;,&quot;Value&quot;:[Task type]}].</li>
         * <li>To query the result details of a synthetic monitoring task, set this parameter in the following format: [{&quot;Key&quot;:&quot;dataId&quot;,&quot;OpType&quot;:&quot;eq&quot;,&quot;Value&quot;:&quot;dataId&quot;}]. dataId is returned when you query the list of synthetic test results.</li>
         * </ul>
         */
        public Builder advancedFilters(java.util.List<AdvancedFilters> advancedFilters) {
            String advancedFiltersShrink = shrink(advancedFilters, "AdvancedFilters", "json");
            this.putQueryParameter("AdvancedFilters", advancedFiltersShrink);
            this.advancedFilters = advancedFilters;
            return this;
        }

        /**
         * <p>The type of the results. Set the value to SYNTHETIC.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNTHETIC</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The type of the list that contains the results. This parameter is required. Valid values:</p>
         * <ul>
         * <li>ICMP_LIST</li>
         * <li>TCP_LIST</li>
         * <li>DNS_LIST</li>
         * <li>HTTP_LIST</li>
         * <li>WEBSITE_LIST</li>
         * <li>DOWNLOAD_LIST</li>
         * <li>ALL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ICMP_LIST</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>The timestamp of the end time of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684480557772</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>A reserved field.</p>
         */
        public Builder exactFilters(java.util.List<ExactFilters> exactFilters) {
            String exactFiltersShrink = shrink(exactFilters, "ExactFilters", "json");
            this.putQueryParameter("ExactFilters", exactFiltersShrink);
            this.exactFilters = exactFilters;
            return this;
        }

        /**
         * <p>The filter condition. This parameter is required.</p>
         * <ul>
         * <li>To query the result of a synthetic monitoring task, set this parameter in the following format: {&quot;taskId&quot;:&quot;${taskId}&quot;}.</li>
         * <li>To query the result details of a synthetic monitoring task, set this parameter in the following format: {&quot;taskId&quot;:&quot;${taskId}&quot;,&quot;dataId&quot;:&quot;${dataId}&quot;}.</li>
         * </ul>
         */
        public Builder filters(java.util.Map<String, String> filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The order in which results are sorted. Valid values:</p>
         * <ul>
         * <li><code>ASC</code>: ascending order</li>
         * <li><code>DESC</code>: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The field based on which results are sorted. Set the value to timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>timestamp</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region. Set the value to cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The timestamp of the start time of the query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684110343127</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of the synthetic test. Valid values: 1 and 2. 1 represents an immediate test, and 2 represents a scheduled test.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder syntheticType(Integer syntheticType) {
            this.putQueryParameter("SyntheticType", syntheticType);
            this.syntheticType = syntheticType;
            return this;
        }

        @Override
        public ListSyntheticDetailRequest build() {
            return new ListSyntheticDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSyntheticDetailRequest} extends {@link TeaModel}
     *
     * <p>ListSyntheticDetailRequest</p>
     */
    public static class AdvancedFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private AdvancedFilters(Builder builder) {
            this.key = builder.key;
            this.opType = builder.opType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String opType; 
            private Object value; 

            /**
             * <p>The filter condition. The taskType and dataId fields are supported.</p>
             * <ul>
             * <li>To query the list of synthetic test results, set the key to taskType.</li>
             * <li>To query the result details of a synthetic monitoring task, set the key to dataId.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>taskType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The type of the filter condition. Valid values: eq and in. eq: equal to. in: include.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The value of the filter condition. The type of the task. Valid values: 1: ICMP 2: TCP 3: DNS 4: HTTP 5: website speed measurement 6: file download</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public AdvancedFilters build() {
                return new AdvancedFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSyntheticDetailRequest} extends {@link TeaModel}
     *
     * <p>ListSyntheticDetailRequest</p>
     */
    public static class ExactFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private ExactFilters(Builder builder) {
            this.key = builder.key;
            this.opType = builder.opType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExactFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String opType; 
            private Object value; 

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public ExactFilters build() {
                return new ExactFilters(this);
            } 

        } 

    }
}
