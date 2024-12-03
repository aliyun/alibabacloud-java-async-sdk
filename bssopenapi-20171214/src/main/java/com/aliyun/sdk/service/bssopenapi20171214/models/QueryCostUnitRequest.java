// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCostUnitRequest} extends {@link RequestModel}
 *
 * <p>QueryCostUnitRequest</p>
 */
public class QueryCostUnitRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ParentUnitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long parentUnitId;

    private QueryCostUnitRequest(Builder builder) {
        super(builder);
        this.ownerUid = builder.ownerUid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parentUnitId = builder.parentUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostUnitRequest create() {
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
     * @return parentUnitId
     */
    public Long getParentUnitId() {
        return this.parentUnitId;
    }

    public static final class Builder extends Request.Builder<QueryCostUnitRequest, Builder> {
        private Long ownerUid; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long parentUnitId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCostUnitRequest request) {
            super(request);
            this.ownerUid = request.ownerUid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.parentUnitId = request.parentUnitId;
        } 

        /**
         * <p>The user ID of the cost center owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>28394563429587</p>
         */
        public Builder ownerUid(Long ownerUid) {
            this.putQueryParameter("OwnerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
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
         * <p>The number of entries per page. A maximum of 300 entries can be returned per page.</p>
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
         * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder parentUnitId(Long parentUnitId) {
            this.putQueryParameter("ParentUnitId", parentUnitId);
            this.parentUnitId = parentUnitId;
            return this;
        }

        @Override
        public QueryCostUnitRequest build() {
            return new QueryCostUnitRequest(this);
        } 

    } 

}
