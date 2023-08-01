// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSolutionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSolutionRequest</p>
 */
public class UpdateSolutionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("ContentType")
    private Integer contentType;

    @Body
    @NameInMap("PerspectiveCodes")
    @Validation(required = true)
    private java.util.List < String > perspectiveCodes;

    @Body
    @NameInMap("SolutionId")
    @Validation(required = true)
    private Long solutionId;

    private UpdateSolutionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.perspectiveCodes = builder.perspectiveCodes;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSolutionRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public Integer getContentType() {
        return this.contentType;
    }

    /**
     * @return perspectiveCodes
     */
    public java.util.List < String > getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    /**
     * @return solutionId
     */
    public Long getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<UpdateSolutionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String content; 
        private Integer contentType; 
        private java.util.List < String > perspectiveCodes; 
        private Long solutionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSolutionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.contentType = request.contentType;
            this.perspectiveCodes = request.perspectiveCodes;
            this.solutionId = request.solutionId;
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
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(Integer contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * PerspectiveCodes.
         */
        public Builder perspectiveCodes(java.util.List < String > perspectiveCodes) {
            this.putBodyParameter("PerspectiveCodes", perspectiveCodes);
            this.perspectiveCodes = perspectiveCodes;
            return this;
        }

        /**
         * SolutionId.
         */
        public Builder solutionId(Long solutionId) {
            this.putBodyParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public UpdateSolutionRequest build() {
            return new UpdateSolutionRequest(this);
        } 

    } 

}
