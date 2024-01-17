// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGeneratedContentRequest} extends {@link RequestModel}
 *
 * <p>GetGeneratedContentRequest</p>
 */
public class GetGeneratedContentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private GetGeneratedContentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGeneratedContentRequest create() {
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

    public static final class Builder extends Request.Builder<GetGeneratedContentRequest, Builder> {
        private String agentKey; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetGeneratedContentRequest request) {
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
        public GetGeneratedContentRequest build() {
            return new GetGeneratedContentRequest(this);
        } 

    } 

}
