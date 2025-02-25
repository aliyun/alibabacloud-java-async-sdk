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
 * {@link QueryItemNextCycleRestrictionRequest} extends {@link RequestModel}
 *
 * <p>QueryItemNextCycleRestrictionRequest</p>
 */
public class QueryItemNextCycleRestrictionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LmItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> lmItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubBizId")
    private String subBizId;

    private QueryItemNextCycleRestrictionRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.lmItemId = builder.lmItemId;
        this.subBizId = builder.subBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryItemNextCycleRestrictionRequest create() {
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
     * @return lmItemId
     */
    public java.util.List<String> getLmItemId() {
        return this.lmItemId;
    }

    /**
     * @return subBizId
     */
    public String getSubBizId() {
        return this.subBizId;
    }

    public static final class Builder extends Request.Builder<QueryItemNextCycleRestrictionRequest, Builder> {
        private String bizId; 
        private java.util.List<String> lmItemId; 
        private String subBizId; 

        private Builder() {
            super();
        } 

        private Builder(QueryItemNextCycleRestrictionRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.lmItemId = request.lmItemId;
            this.subBizId = request.subBizId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder lmItemId(java.util.List<String> lmItemId) {
            String lmItemIdShrink = shrink(lmItemId, "LmItemId", "json");
            this.putBodyParameter("LmItemId", lmItemIdShrink);
            this.lmItemId = lmItemId;
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
        public QueryItemNextCycleRestrictionRequest build() {
            return new QueryItemNextCycleRestrictionRequest(this);
        } 

    } 

}
