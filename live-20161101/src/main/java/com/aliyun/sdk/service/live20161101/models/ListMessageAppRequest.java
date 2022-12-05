// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageAppRequest} extends {@link RequestModel}
 *
 * <p>ListMessageAppRequest</p>
 */
public class ListMessageAppRequest extends Request {
    @Body
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("SortType")
    private Integer sortType;

    private ListMessageAppRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageAppRequest create() {
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
     * @return sortType
     */
    public Integer getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListMessageAppRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageAppRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
        } 

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(Integer sortType) {
            this.putBodyParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public ListMessageAppRequest build() {
            return new ListMessageAppRequest(this);
        } 

    } 

}
