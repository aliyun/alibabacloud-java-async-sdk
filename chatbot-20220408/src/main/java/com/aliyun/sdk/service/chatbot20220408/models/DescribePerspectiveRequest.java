// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>DescribePerspectiveRequest</p>
 */
public class DescribePerspectiveRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("PerspectiveId")
    private String perspectiveId;

    private DescribePerspectiveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.perspectiveId = builder.perspectiveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePerspectiveRequest create() {
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
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    public static final class Builder extends Request.Builder<DescribePerspectiveRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String perspectiveId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePerspectiveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.perspectiveId = request.perspectiveId;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * PerspectiveId.
         */
        public Builder perspectiveId(String perspectiveId) {
            this.putQueryParameter("PerspectiveId", perspectiveId);
            this.perspectiveId = perspectiveId;
            return this;
        }

        @Override
        public DescribePerspectiveRequest build() {
            return new DescribePerspectiveRequest(this);
        } 

    } 

}
