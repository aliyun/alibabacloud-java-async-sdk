// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBizItemsRequest} extends {@link RequestModel}
 *
 * <p>DeleteBizItemsRequest</p>
 */
public class DeleteBizItemsRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ItemIdList")
    @Validation(required = true)
    private java.util.List < Long > itemIdList;

    @Query
    @NameInMap("SubBizId")
    private String subBizId;

    private DeleteBizItemsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemIdList = builder.itemIdList;
        this.subBizId = builder.subBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBizItemsRequest create() {
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
     * @return itemIdList
     */
    public java.util.List < Long > getItemIdList() {
        return this.itemIdList;
    }

    /**
     * @return subBizId
     */
    public String getSubBizId() {
        return this.subBizId;
    }

    public static final class Builder extends Request.Builder<DeleteBizItemsRequest, Builder> {
        private String bizId; 
        private java.util.List < Long > itemIdList; 
        private String subBizId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBizItemsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemIdList = request.itemIdList;
            this.subBizId = request.subBizId;
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
         * ItemIdList.
         */
        public Builder itemIdList(java.util.List < Long > itemIdList) {
            this.putQueryParameter("ItemIdList", itemIdList);
            this.itemIdList = itemIdList;
            return this;
        }

        /**
         * SubBizId.
         */
        public Builder subBizId(String subBizId) {
            this.putQueryParameter("SubBizId", subBizId);
            this.subBizId = subBizId;
            return this;
        }

        @Override
        public DeleteBizItemsRequest build() {
            return new DeleteBizItemsRequest(this);
        } 

    } 

}
