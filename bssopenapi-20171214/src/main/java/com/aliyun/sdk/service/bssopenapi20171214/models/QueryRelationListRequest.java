// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRelationListRequest} extends {@link RequestModel}
 *
 * <p>QueryRelationListRequest</p>
 */
public class QueryRelationListRequest extends Request {
    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private Long userId;

    private QueryRelationListRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.statusList = builder.statusList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRelationListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryRelationListRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List < String > statusList; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRelationListRequest response) {
            super(response);
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.statusList = response.statusList;
            this.userId = response.userId;
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
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryRelationListRequest build() {
            return new QueryRelationListRequest(this);
        } 

    } 

}
