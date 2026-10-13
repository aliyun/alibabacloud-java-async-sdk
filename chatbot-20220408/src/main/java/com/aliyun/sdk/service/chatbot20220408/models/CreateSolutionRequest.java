// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link CreateSolutionRequest} extends {@link RequestModel}
 *
 * <p>CreateSolutionRequest</p>
 */
public class CreateSolutionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private Integer contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long knowledgeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerspectiveCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> perspectiveCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIdList")
    private java.util.List<Long> tagIdList;

    private CreateSolutionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.knowledgeId = builder.knowledgeId;
        this.perspectiveCodes = builder.perspectiveCodes;
        this.tagIdList = builder.tagIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSolutionRequest create() {
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
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return perspectiveCodes
     */
    public java.util.List<String> getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    /**
     * @return tagIdList
     */
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

    public static final class Builder extends Request.Builder<CreateSolutionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String content; 
        private Integer contentType; 
        private Long knowledgeId; 
        private java.util.List<String> perspectiveCodes; 
        private java.util.List<Long> tagIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSolutionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.contentType = request.contentType;
            this.knowledgeId = request.knowledgeId;
            this.perspectiveCodes = request.perspectiveCodes;
            this.tagIdList = request.tagIdList;
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
         * <p>The key of the workspace. If this parameter is not specified, the default workspace is accessed. You can obtain the key on the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The content of the answer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Answer content</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The type of the answer. Valid values:</p>
         * <ul>
         * <li>0: plain text.</li>
         * <li>1: rich text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder contentType(Integer contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The knowledge ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001905617</p>
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>The list of perspective codes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder perspectiveCodes(java.util.List<String> perspectiveCodes) {
            this.putQueryParameter("PerspectiveCodes", perspectiveCodes);
            this.perspectiveCodes = perspectiveCodes;
            return this;
        }

        /**
         * <p>The list of tag IDs.</p>
         */
        public Builder tagIdList(java.util.List<Long> tagIdList) {
            String tagIdListShrink = shrink(tagIdList, "TagIdList", "json");
            this.putBodyParameter("TagIdList", tagIdListShrink);
            this.tagIdList = tagIdList;
            return this;
        }

        @Override
        public CreateSolutionRequest build() {
            return new CreateSolutionRequest(this);
        } 

    } 

}
