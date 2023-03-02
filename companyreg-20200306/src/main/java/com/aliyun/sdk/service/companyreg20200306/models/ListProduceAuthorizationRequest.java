// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProduceAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ListProduceAuthorizationRequest</p>
 */
public class ListProduceAuthorizationRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    private ListProduceAuthorizationRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProduceAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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

    public static final class Builder extends Request.Builder<ListProduceAuthorizationRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListProduceAuthorizationRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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

        @Override
        public ListProduceAuthorizationRequest build() {
            return new ListProduceAuthorizationRequest(this);
        } 

    } 

}
