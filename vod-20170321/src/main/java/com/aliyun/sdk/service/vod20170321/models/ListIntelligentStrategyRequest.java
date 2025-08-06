// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListIntelligentStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListIntelligentStrategyRequest</p>
 */
public class ListIntelligentStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    private String strategyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListIntelligentStrategyRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.state = builder.state;
        this.strategyIds = builder.strategyIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntelligentStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return strategyIds
     */
    public String getStrategyIds() {
        return this.strategyIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListIntelligentStrategyRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String state; 
        private String strategyIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListIntelligentStrategyRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.state = request.state;
            this.strategyIds = request.strategyIds;
            this.type = request.type;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * StrategyIds.
         */
        public Builder strategyIds(String strategyIds) {
            this.putQueryParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListIntelligentStrategyRequest build() {
            return new ListIntelligentStrategyRequest(this);
        } 

    } 

}
