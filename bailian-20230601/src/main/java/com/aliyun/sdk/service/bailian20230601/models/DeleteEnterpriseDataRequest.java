// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnterpriseDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnterpriseDataRequest</p>
 */
public class DeleteEnterpriseDataRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    private DeleteEnterpriseDataRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataId = builder.dataId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnterpriseDataRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEnterpriseDataRequest, Builder> {
        private String agentKey; 
        private String dataId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnterpriseDataRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataId = request.dataId;
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

        @Override
        public DeleteEnterpriseDataRequest build() {
            return new DeleteEnterpriseDataRequest(this);
        } 

    } 

}
