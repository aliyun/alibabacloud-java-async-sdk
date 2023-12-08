// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnterpriseTagRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseTagRequest</p>
 */
public class UpdateEnterpriseTagRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private Long tagId;

    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    private UpdateEnterpriseTagRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseTagRequest create() {
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

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<UpdateEnterpriseTagRequest, Builder> {
        private String agentKey; 
        private Long tagId; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnterpriseTagRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.tagId = request.tagId;
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
         * TagId.
         */
        public Builder tagId(Long tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
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
        public UpdateEnterpriseTagRequest build() {
            return new UpdateEnterpriseTagRequest(this);
        } 

    } 

}
