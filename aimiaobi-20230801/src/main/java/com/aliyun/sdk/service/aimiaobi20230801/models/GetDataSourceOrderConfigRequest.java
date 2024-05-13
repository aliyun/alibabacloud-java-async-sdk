// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceOrderConfigRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceOrderConfigRequest</p>
 */
public class GetDataSourceOrderConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    private GetDataSourceOrderConfigRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceOrderConfigRequest create() {
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<GetDataSourceOrderConfigRequest, Builder> {
        private String agentKey; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceOrderConfigRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.productCode = request.productCode;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public GetDataSourceOrderConfigRequest build() {
            return new GetDataSourceOrderConfigRequest(this);
        } 

    } 

}
