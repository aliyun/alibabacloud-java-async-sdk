// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSyntheticDetailRequest} extends {@link RequestModel}
 *
 * <p>ListSyntheticDetailRequest</p>
 */
public class ListSyntheticDetailRequest extends Request {
    @Query
    @NameInMap("AdvancedFilters")
    private java.util.List < AdvancedFilters> advancedFilters;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Detail")
    private String detail;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("ExactFilters")
    private java.util.List < ExactFilters> exactFilters;

    @Query
    @NameInMap("Filters")
    private java.util.Map < String, String > filters;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("SyntheticType")
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
    public java.util.List < AdvancedFilters> getAdvancedFilters() {
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
    public java.util.List < ExactFilters> getExactFilters() {
        return this.exactFilters;
    }

    /**
     * @return filters
     */
    public java.util.Map < String, String > getFilters() {
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
        private java.util.List < AdvancedFilters> advancedFilters; 
        private String category; 
        private String detail; 
        private Long endTime; 
        private java.util.List < ExactFilters> exactFilters; 
        private java.util.Map < String, String > filters; 
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
         * AdvancedFilters.
         */
        public Builder advancedFilters(java.util.List < AdvancedFilters> advancedFilters) {
            String advancedFiltersShrink = shrink(advancedFilters, "AdvancedFilters", "json");
            this.putQueryParameter("AdvancedFilters", advancedFiltersShrink);
            this.advancedFilters = advancedFilters;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExactFilters.
         */
        public Builder exactFilters(java.util.List < ExactFilters> exactFilters) {
            String exactFiltersShrink = shrink(exactFilters, "ExactFilters", "json");
            this.putQueryParameter("ExactFilters", exactFiltersShrink);
            this.exactFilters = exactFilters;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(java.util.Map < String, String > filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SyntheticType.
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

    public static class AdvancedFilters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * Value.
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
    public static class ExactFilters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * Value.
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
