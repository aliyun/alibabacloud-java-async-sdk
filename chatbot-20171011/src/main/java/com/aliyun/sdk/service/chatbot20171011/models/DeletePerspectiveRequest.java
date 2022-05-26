// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>DeletePerspectiveRequest</p>
 */
public class DeletePerspectiveRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("PerspectiveId")
    @Validation(required = true)
    private String perspectiveId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeletePerspectiveRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.perspectiveId = builder.perspectiveId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePerspectiveRequest create() {
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
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePerspectiveRequest, Builder> {
        private String agentKey; 
        private String perspectiveId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePerspectiveRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.perspectiveId = request.perspectiveId;
            this.regionId = request.regionId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeletePerspectiveRequest build() {
            return new DeletePerspectiveRequest(this);
        } 

    } 

}
