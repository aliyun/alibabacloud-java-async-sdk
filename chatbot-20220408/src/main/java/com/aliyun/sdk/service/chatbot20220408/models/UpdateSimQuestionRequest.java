// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSimQuestionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSimQuestionRequest</p>
 */
public class UpdateSimQuestionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("SimQuestionId")
    @Validation(required = true)
    private Long simQuestionId;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private UpdateSimQuestionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.simQuestionId = builder.simQuestionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSimQuestionRequest create() {
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
     * @return simQuestionId
     */
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateSimQuestionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long simQuestionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSimQuestionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.simQuestionId = request.simQuestionId;
            this.title = request.title;
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
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 相似问ID
         */
        public Builder simQuestionId(Long simQuestionId) {
            this.putBodyParameter("SimQuestionId", simQuestionId);
            this.simQuestionId = simQuestionId;
            return this;
        }

        /**
         * 相似问标题，字数上限-120
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateSimQuestionRequest build() {
            return new UpdateSimQuestionRequest(this);
        } 

    } 

}
