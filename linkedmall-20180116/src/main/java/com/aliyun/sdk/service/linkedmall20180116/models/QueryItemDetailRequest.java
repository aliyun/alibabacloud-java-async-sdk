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
 * {@link QueryItemDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryItemDetailRequest</p>
 */
public class QueryItemDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmItemId")
    private String lmItemId;

    private QueryItemDetailRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemId = builder.itemId;
        this.lmItemId = builder.lmItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemDetailRequest create() {
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

    public static final class Builder extends Request.Builder<QueryItemDetailRequest, Builder> {
        private String bizId; 
        private Long itemId; 
        private String lmItemId; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemDetailRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemId = request.itemId;
            this.lmItemId = request.lmItemId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20201228****</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>62501739****</p>
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putQueryParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        @Override
        public QueryItemDetailRequest build() {
            return new QueryItemDetailRequest(this);
        } 

    } 

}
