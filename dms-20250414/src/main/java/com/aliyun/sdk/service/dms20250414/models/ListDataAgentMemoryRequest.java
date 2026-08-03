// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentMemoryRequest} extends {@link RequestModel}
 *
 * <p>ListDataAgentMemoryRequest</p>
 */
public class ListDataAgentMemoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentPattern")
    private String contentPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromId")
    private String fromId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemFrom")
    private String memFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryAll")
    private Boolean queryAll;

    private ListDataAgentMemoryRequest(Builder builder) {
        super(builder);
        this.contentPattern = builder.contentPattern;
        this.DMSUnit = builder.DMSUnit;
        this.fromId = builder.fromId;
        this.memFrom = builder.memFrom;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryAll = builder.queryAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentPattern
     */
    public String getContentPattern() {
        return this.contentPattern;
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return fromId
     */
    public String getFromId() {
        return this.fromId;
    }

    /**
     * @return memFrom
     */
    public String getMemFrom() {
        return this.memFrom;
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
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryAll
     */
    public Boolean getQueryAll() {
        return this.queryAll;
    }

    public static final class Builder extends Request.Builder<ListDataAgentMemoryRequest, Builder> {
        private String contentPattern; 
        private String DMSUnit; 
        private String fromId; 
        private String memFrom; 
        private String order; 
        private String orderBy; 
        private Long pageNum; 
        private Long pageSize; 
        private Boolean queryAll; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAgentMemoryRequest request) {
            super(request);
            this.contentPattern = request.contentPattern;
            this.DMSUnit = request.DMSUnit;
            this.fromId = request.fromId;
            this.memFrom = request.memFrom;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryAll = request.queryAll;
        } 

        /**
         * ContentPattern.
         */
        public Builder contentPattern(String contentPattern) {
            this.putQueryParameter("ContentPattern", contentPattern);
            this.contentPattern = contentPattern;
            return this;
        }

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * FromId.
         */
        public Builder fromId(String fromId) {
            this.putQueryParameter("FromId", fromId);
            this.fromId = fromId;
            return this;
        }

        /**
         * MemFrom.
         */
        public Builder memFrom(String memFrom) {
            this.putQueryParameter("MemFrom", memFrom);
            this.memFrom = memFrom;
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
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryAll.
         */
        public Builder queryAll(Boolean queryAll) {
            this.putQueryParameter("QueryAll", queryAll);
            this.queryAll = queryAll;
            return this;
        }

        @Override
        public ListDataAgentMemoryRequest build() {
            return new ListDataAgentMemoryRequest(this);
        } 

    } 

}
