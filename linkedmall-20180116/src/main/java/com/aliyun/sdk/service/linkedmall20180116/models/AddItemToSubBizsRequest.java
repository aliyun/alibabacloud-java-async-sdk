// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link AddItemToSubBizsRequest} extends {@link RequestModel}
 *
 * <p>AddItemToSubBizsRequest</p>
 */
public class AddItemToSubBizsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemId")
    private Long itemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LmItemId")
    private String lmItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubBizIds")
    private java.util.Map<String, ?> subBizIds;

    private AddItemToSubBizsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemId = builder.itemId;
        this.lmItemId = builder.lmItemId;
        this.subBizIds = builder.subBizIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddItemToSubBizsRequest create() {
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
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return subBizIds
     */
    public java.util.Map<String, ?> getSubBizIds() {
        return this.subBizIds;
    }

    public static final class Builder extends Request.Builder<AddItemToSubBizsRequest, Builder> {
        private String bizId; 
        private Long itemId; 
        private String lmItemId; 
        private java.util.Map<String, ?> subBizIds; 

        private Builder() {
            super();
        } 

        private Builder(AddItemToSubBizsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemId = request.itemId;
            this.lmItemId = request.lmItemId;
            this.subBizIds = request.subBizIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20190325****</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putBodyParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putBodyParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        /**
         * SubBizIds.
         */
        public Builder subBizIds(java.util.Map<String, ?> subBizIds) {
            String subBizIdsShrink = shrink(subBizIds, "SubBizIds", "json");
            this.putBodyParameter("SubBizIds", subBizIdsShrink);
            this.subBizIds = subBizIds;
            return this;
        }

        @Override
        public AddItemToSubBizsRequest build() {
            return new AddItemToSubBizsRequest(this);
        } 

    } 

}
