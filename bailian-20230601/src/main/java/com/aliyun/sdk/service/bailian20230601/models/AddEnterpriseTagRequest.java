// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnterpriseTagRequest} extends {@link RequestModel}
 *
 * <p>AddEnterpriseTagRequest</p>
 */
public class AddEnterpriseTagRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    private AddEnterpriseTagRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEnterpriseTagRequest create() {
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
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<AddEnterpriseTagRequest, Builder> {
        private String agentKey; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(AddEnterpriseTagRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.tagName = request.tagName;
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
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public AddEnterpriseTagRequest build() {
            return new AddEnterpriseTagRequest(this);
        } 

    } 

}
