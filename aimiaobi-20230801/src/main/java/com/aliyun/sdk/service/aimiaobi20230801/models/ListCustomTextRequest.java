// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomTextRequest} extends {@link RequestModel}
 *
 * <p>ListCustomTextRequest</p>
 */
public class ListCustomTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    private ListCustomTextRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.commodityCode = builder.commodityCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public static final class Builder extends Request.Builder<ListCustomTextRequest, Builder> {
        private String agentKey; 
        private String commodityCode; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomTextRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.commodityCode = request.commodityCode;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        @Override
        public ListCustomTextRequest build() {
            return new ListCustomTextRequest(this);
        } 

    } 

}
