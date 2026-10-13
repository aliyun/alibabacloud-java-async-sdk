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
 * {@link UpdateFaqRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaqRequest</p>
 */
public class UpdateFaqRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long knowledgeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIdList")
    private java.util.List<Long> tagIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private UpdateFaqRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.categoryId = builder.categoryId;
        this.endDate = builder.endDate;
        this.knowledgeId = builder.knowledgeId;
        this.startDate = builder.startDate;
        this.tagIdList = builder.tagIdList;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaqRequest create() {
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
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return tagIdList
     */
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateFaqRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long categoryId; 
        private String endDate; 
        private Long knowledgeId; 
        private String startDate; 
        private java.util.List<Long> tagIdList; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaqRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.categoryId = request.categoryId;
            this.endDate = request.endDate;
            this.knowledgeId = request.knowledgeId;
            this.startDate = request.startDate;
            this.tagIdList = request.tagIdList;
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
         * <p>The workspace key. If not specified, the default workspace is accessed. You can obtain the key value from the business management page of the Alibaba Cloud account.</p>
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
         * <p>The category ID of the knowledge entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000049006</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2030-12-31T16:00:00Z</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
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
            this.putBodyParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>The effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-27T05:18:20Z</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
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

        /**
         * <p>The title of the knowledge entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test title</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateFaqRequest build() {
            return new UpdateFaqRequest(this);
        } 

    } 

}
