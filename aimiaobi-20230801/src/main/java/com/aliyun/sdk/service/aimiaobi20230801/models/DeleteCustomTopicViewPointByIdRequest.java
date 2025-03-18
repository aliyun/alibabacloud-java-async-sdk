// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteCustomTopicViewPointByIdRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomTopicViewPointByIdRequest</p>
 */
public class DeleteCustomTopicViewPointByIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomViewPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customViewPointId;

    private DeleteCustomTopicViewPointByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.customViewPointId = builder.customViewPointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomTopicViewPointByIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return customViewPointId
     */
    public String getCustomViewPointId() {
        return this.customViewPointId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomTopicViewPointByIdRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String customViewPointId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomTopicViewPointByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.customViewPointId = request.customViewPointId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dfd73894e6a94fd79fe7ffbe865796fb</p>
         */
        public Builder customViewPointId(String customViewPointId) {
            this.putBodyParameter("CustomViewPointId", customViewPointId);
            this.customViewPointId = customViewPointId;
            return this;
        }

        @Override
        public DeleteCustomTopicViewPointByIdRequest build() {
            return new DeleteCustomTopicViewPointByIdRequest(this);
        } 

    } 

}
