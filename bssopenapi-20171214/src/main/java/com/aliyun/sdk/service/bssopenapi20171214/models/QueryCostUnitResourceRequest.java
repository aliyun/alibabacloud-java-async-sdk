// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCostUnitResourceRequest} extends {@link RequestModel}
 *
 * <p>QueryCostUnitResourceRequest</p>
 */
public class QueryCostUnitResourceRequest extends Request {
    @Query
    @NameInMap("OwnerUid")
    @Validation(required = true)
    private Long ownerUid;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("UnitId")
    @Validation(required = true)
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
         * OwnerUid.
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * UnitId.
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
