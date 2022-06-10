// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPublishTaskStateRequest} extends {@link RequestModel}
 *
 * <p>GetPublishTaskStateRequest</p>
 */
public class GetPublishTaskStateRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Id")
    private Long id;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetPublishTaskStateRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.id = builder.id;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublishTaskStateRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetPublishTaskStateRequest, Builder> {
        private String agentKey; 
        private Long id; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPublishTaskStateRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.id = request.id;
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
         * 任务ID
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public GetPublishTaskStateRequest build() {
            return new GetPublishTaskStateRequest(this);
        } 

    } 

}
