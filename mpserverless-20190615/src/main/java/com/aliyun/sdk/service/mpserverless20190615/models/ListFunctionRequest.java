// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionRequest</p>
 */
public class ListFunctionRequest extends Request {
    @Body
    @NameInMap("FilterBy")
    private String filterBy;

    @Body
    @NameInMap("PageNum")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private ListFunctionRequest(Builder builder) {
        super(builder);
        this.filterBy = builder.filterBy;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterBy
     */
    public String getFilterBy() {
        return this.filterBy;
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
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<ListFunctionRequest, Builder> {
        private String filterBy; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionRequest request) {
            super(request);
            this.filterBy = request.filterBy;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.spaceId = request.spaceId;
        } 

        /**
         * FilterBy.
         */
        public Builder filterBy(String filterBy) {
            this.putBodyParameter("FilterBy", filterBy);
            this.filterBy = filterBy;
            return this;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public ListFunctionRequest build() {
            return new ListFunctionRequest(this);
        } 

    } 

}
