// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDocumentTagRequest} extends {@link RequestModel}
 *
 * <p>UpdateDocumentTagRequest</p>
 */
public class UpdateDocumentTagRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private String tagId;

    private UpdateDocumentTagRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.name = builder.name;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDocumentTagRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<UpdateDocumentTagRequest, Builder> {
        private String agentKey; 
        private String name; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDocumentTagRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.name = request.name;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public UpdateDocumentTagRequest build() {
            return new UpdateDocumentTagRequest(this);
        } 

    } 

}
