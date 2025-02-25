// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryCostUnitResourceRequest} extends {@link RequestModel}
 *
 * <p>QueryCostUnitResourceRequest</p>
 */
public class QueryCostUnitResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ownerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long unitId;

    private QueryCostUnitResourceRequest(Builder builder) {
        super(builder);
        this.ownerUid = builder.ownerUid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.unitId = builder.unitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostUnitResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerUid
     */
    public Long getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return unitId
     */
    public Long getUnitId() {
        return this.unitId;
    }

    public static final class Builder extends Request.Builder<QueryCostUnitResourceRequest, Builder> {
        private Long ownerUid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long unitId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCostUnitResourceRequest request) {
            super(request);
            this.ownerUid = request.ownerUid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.unitId = request.unitId;
        } 

        /**
         * <p>The user ID of the cost center owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23453245</p>
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>The ID of the cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>235325</p>
         */
        public Builder unitId(Long unitId) {
            this.putQueryParameter("UnitId", unitId);
            this.unitId = unitId;
            return this;
        }

        @Override
        public QueryCostUnitResourceRequest build() {
            return new QueryCostUnitResourceRequest(this);
        } 

    } 

}
