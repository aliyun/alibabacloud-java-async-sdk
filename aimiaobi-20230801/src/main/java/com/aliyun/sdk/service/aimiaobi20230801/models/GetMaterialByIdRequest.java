// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMaterialByIdRequest} extends {@link RequestModel}
 *
 * <p>GetMaterialByIdRequest</p>
 */
public class GetMaterialByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private GetMaterialByIdRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMaterialByIdRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetMaterialByIdRequest, Builder> {
        private String agentKey; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetMaterialByIdRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.id = request.id;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetMaterialByIdRequest build() {
            return new GetMaterialByIdRequest(this);
        } 

    } 

}
