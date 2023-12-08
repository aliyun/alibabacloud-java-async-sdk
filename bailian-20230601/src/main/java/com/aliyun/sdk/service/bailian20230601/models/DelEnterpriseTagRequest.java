// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelEnterpriseTagRequest} extends {@link RequestModel}
 *
 * <p>DelEnterpriseTagRequest</p>
 */
public class DelEnterpriseTagRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private Long tagId;

    private DelEnterpriseTagRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelEnterpriseTagRequest create() {
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
     * @return tagId
     */
    public Long getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<DelEnterpriseTagRequest, Builder> {
        private String agentKey; 
        private Long tagId; 

        private Builder() {
            super();
        } 

        private Builder(DelEnterpriseTagRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.tagId = request.tagId;
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
         * TagId.
         */
        public Builder tagId(Long tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public DelEnterpriseTagRequest build() {
            return new DelEnterpriseTagRequest(this);
        } 

    } 

}
