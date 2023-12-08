// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDataByDataIdRequest} extends {@link RequestModel}
 *
 * <p>GetEnterpriseDataByDataIdRequest</p>
 */
public class GetEnterpriseDataByDataIdRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private GetEnterpriseDataByDataIdRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataId = builder.dataId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseDataByDataIdRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<GetEnterpriseDataByDataIdRequest, Builder> {
        private String agentKey; 
        private String dataId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(GetEnterpriseDataByDataIdRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataId = request.dataId;
            this.ownerId = request.ownerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public GetEnterpriseDataByDataIdRequest build() {
            return new GetEnterpriseDataByDataIdRequest(this);
        } 

    } 

}
