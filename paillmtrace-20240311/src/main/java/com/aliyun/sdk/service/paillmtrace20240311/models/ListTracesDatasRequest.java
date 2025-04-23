// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link ListTracesDatasRequest} extends {@link RequestModel}
 *
 * <p>ListTracesDatasRequest</p>
 */
public class ListTracesDatasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasEvents")
    private Boolean hasEvents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasStatusMessage")
    private Boolean hasStatusMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LlmAppName")
    private String llmAppName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTime")
    private String maxTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpentelemetryCompatible")
    private Boolean opentelemetryCompatible;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerSubId")
    private String ownerSubId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpanIds")
    private java.util.List<String> spanIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceIds")
    private java.util.List<String> traceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceReduceMethod")
    private String traceReduceMethod;

    private ListTracesDatasRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.filters = builder.filters;
        this.hasEvents = builder.hasEvents;
        this.hasStatusMessage = builder.hasStatusMessage;
        this.llmAppName = builder.llmAppName;
        this.maxTime = builder.maxTime;
        this.minTime = builder.minTime;
        this.opentelemetryCompatible = builder.opentelemetryCompatible;
        this.ownerId = builder.ownerId;
        this.ownerSubId = builder.ownerSubId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.spanIds = builder.spanIds;
        this.traceIds = builder.traceIds;
        this.traceReduceMethod = builder.traceReduceMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTracesDatasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return hasEvents
     */
    public Boolean getHasEvents() {
        return this.hasEvents;
    }

    /**
     * @return hasStatusMessage
     */
    public Boolean getHasStatusMessage() {
        return this.hasStatusMessage;
    }

    /**
     * @return llmAppName
     */
    public String getLlmAppName() {
        return this.llmAppName;
    }

    /**
     * @return maxTime
     */
    public String getMaxTime() {
        return this.maxTime;
    }

    /**
     * @return minTime
     */
    public String getMinTime() {
        return this.minTime;
    }

    /**
     * @return opentelemetryCompatible
     */
    public Boolean getOpentelemetryCompatible() {
        return this.opentelemetryCompatible;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ownerSubId
     */
    public String getOwnerSubId() {
        return this.ownerSubId;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return spanIds
     */
    public java.util.List<String> getSpanIds() {
        return this.spanIds;
    }

    /**
     * @return traceIds
     */
    public java.util.List<String> getTraceIds() {
        return this.traceIds;
    }

    /**
     * @return traceReduceMethod
     */
    public String getTraceReduceMethod() {
        return this.traceReduceMethod;
    }

    public static final class Builder extends Request.Builder<ListTracesDatasRequest, Builder> {
        private String endUserId; 
        private java.util.List<Filters> filters; 
        private Boolean hasEvents; 
        private Boolean hasStatusMessage; 
        private String llmAppName; 
        private String maxTime; 
        private String minTime; 
        private Boolean opentelemetryCompatible; 
        private String ownerId; 
        private String ownerSubId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String sortOrder; 
        private java.util.List<String> spanIds; 
        private java.util.List<String> traceIds; 
        private String traceReduceMethod; 

        private Builder() {
            super();
        } 

        private Builder(ListTracesDatasRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.filters = request.filters;
            this.hasEvents = request.hasEvents;
            this.hasStatusMessage = request.hasStatusMessage;
            this.llmAppName = request.llmAppName;
            this.maxTime = request.maxTime;
            this.minTime = request.minTime;
            this.opentelemetryCompatible = request.opentelemetryCompatible;
            this.ownerId = request.ownerId;
            this.ownerSubId = request.ownerSubId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.spanIds = request.spanIds;
            this.traceIds = request.traceIds;
            this.traceReduceMethod = request.traceReduceMethod;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(java.util.List<Filters> filters) {
            String filtersShrink = shrink(filters, "Filters", "json");
            this.putQueryParameter("Filters", filtersShrink);
            this.filters = filters;
            return this;
        }

        /**
         * HasEvents.
         */
        public Builder hasEvents(Boolean hasEvents) {
            this.putQueryParameter("HasEvents", hasEvents);
            this.hasEvents = hasEvents;
            return this;
        }

        /**
         * HasStatusMessage.
         */
        public Builder hasStatusMessage(Boolean hasStatusMessage) {
            this.putQueryParameter("HasStatusMessage", hasStatusMessage);
            this.hasStatusMessage = hasStatusMessage;
            return this;
        }

        /**
         * LlmAppName.
         */
        public Builder llmAppName(String llmAppName) {
            this.putQueryParameter("LlmAppName", llmAppName);
            this.llmAppName = llmAppName;
            return this;
        }

        /**
         * MaxTime.
         */
        public Builder maxTime(String maxTime) {
            this.putQueryParameter("MaxTime", maxTime);
            this.maxTime = maxTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-31
         * 2024-12-31 23:59:59</p>
         */
        public Builder minTime(String minTime) {
            this.putQueryParameter("MinTime", minTime);
            this.minTime = minTime;
            return this;
        }

        /**
         * OpentelemetryCompatible.
         */
        public Builder opentelemetryCompatible(Boolean opentelemetryCompatible) {
            this.putQueryParameter("OpentelemetryCompatible", opentelemetryCompatible);
            this.opentelemetryCompatible = opentelemetryCompatible;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * OwnerSubId.
         */
        public Builder ownerSubId(String ownerSubId) {
            this.putQueryParameter("OwnerSubId", ownerSubId);
            this.ownerSubId = ownerSubId;
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

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * SpanIds.
         */
        public Builder spanIds(java.util.List<String> spanIds) {
            String spanIdsShrink = shrink(spanIds, "SpanIds", "simple");
            this.putQueryParameter("SpanIds", spanIdsShrink);
            this.spanIds = spanIds;
            return this;
        }

        /**
         * TraceIds.
         */
        public Builder traceIds(java.util.List<String> traceIds) {
            String traceIdsShrink = shrink(traceIds, "TraceIds", "simple");
            this.putQueryParameter("TraceIds", traceIdsShrink);
            this.traceIds = traceIds;
            return this;
        }

        /**
         * TraceReduceMethod.
         */
        public Builder traceReduceMethod(String traceReduceMethod) {
            this.putQueryParameter("TraceReduceMethod", traceReduceMethod);
            this.traceReduceMethod = traceReduceMethod;
            return this;
        }

        @Override
        public ListTracesDatasRequest build() {
            return new ListTracesDatasRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTracesDatasRequest} extends {@link TeaModel}
     *
     * <p>ListTracesDatasRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.operator = model.operator;
                this.value = model.value;
            } 

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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
