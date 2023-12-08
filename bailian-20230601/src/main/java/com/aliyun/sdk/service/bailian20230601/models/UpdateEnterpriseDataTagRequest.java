// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnterpriseDataTagRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnterpriseDataTagRequest</p>
 */
public class UpdateEnterpriseDataTagRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Long > tags;

    private UpdateEnterpriseDataTagRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataId = builder.dataId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnterpriseDataTagRequest create() {
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
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return tags
     */
    public java.util.List < Long > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateEnterpriseDataTagRequest, Builder> {
        private String agentKey; 
        private String dataId; 
        private java.util.List < Long > tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnterpriseDataTagRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataId = request.dataId;
            this.tags = request.tags;
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
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Long > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateEnterpriseDataTagRequest build() {
            return new UpdateEnterpriseDataTagRequest(this);
        } 

    } 

}
