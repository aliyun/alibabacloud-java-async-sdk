// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnQuestionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnQuestionRequest</p>
 */
public class UpdateConnQuestionRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("ConnQuestionId")
    @Validation(required = true)
    private Long connQuestionId;

    @Body
    @NameInMap("OutlineId")
    @Validation(required = true)
    private Long outlineId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateConnQuestionRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.connQuestionId = builder.connQuestionId;
        this.outlineId = builder.outlineId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnQuestionRequest create() {
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
     * @return connQuestionId
     */
    public Long getConnQuestionId() {
        return this.connQuestionId;
    }

    /**
     * @return outlineId
     */
    public Long getOutlineId() {
        return this.outlineId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateConnQuestionRequest, Builder> {
        private String agentKey; 
        private Long connQuestionId; 
        private Long outlineId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnQuestionRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.connQuestionId = request.connQuestionId;
            this.outlineId = request.outlineId;
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
         * ConnQuestionId.
         */
        public Builder connQuestionId(Long connQuestionId) {
            this.putBodyParameter("ConnQuestionId", connQuestionId);
            this.connQuestionId = connQuestionId;
            return this;
        }

        /**
         * OutlineId.
         */
        public Builder outlineId(Long outlineId) {
            this.putBodyParameter("OutlineId", outlineId);
            this.outlineId = outlineId;
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
        public UpdateConnQuestionRequest build() {
            return new UpdateConnQuestionRequest(this);
        } 

    } 

}
