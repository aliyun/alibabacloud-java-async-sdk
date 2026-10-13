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
 * {@link CreateFaqRequest} extends {@link RequestModel}
 *
 * <p>CreateFaqRequest</p>
 */
public class CreateFaqRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SolutionContent")
    private String solutionContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SolutionType")
    private Integer solutionType;

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

    private CreateFaqRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.categoryId = builder.categoryId;
        this.endDate = builder.endDate;
        this.solutionContent = builder.solutionContent;
        this.solutionType = builder.solutionType;
        this.startDate = builder.startDate;
        this.tagIdList = builder.tagIdList;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFaqRequest create() {
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
     * @return solutionContent
     */
    public String getSolutionContent() {
        return this.solutionContent;
    }

    /**
     * @return solutionType
     */
    public Integer getSolutionType() {
        return this.solutionType;
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

    public static final class Builder extends Request.Builder<CreateFaqRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long categoryId; 
        private String endDate; 
        private String solutionContent; 
        private Integer solutionType; 
        private String startDate; 
        private java.util.List<Long> tagIdList; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateFaqRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.categoryId = request.categoryId;
            this.endDate = request.endDate;
            this.solutionContent = request.solutionContent;
            this.solutionType = request.solutionType;
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
         * <p>The key of the business space. If this parameter is not set, the default business space is accessed. You can obtain the key value from the business management page of the main account.</p>
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
         * <p>1000053274</p>
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
         * <p>The default answer content. This parameter is required if the fallback perspective is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Test answer</p>
         */
        public Builder solutionContent(String solutionContent) {
            this.putBodyParameter("SolutionContent", solutionContent);
            this.solutionContent = solutionContent;
            return this;
        }

        /**
         * <p>The type of the default answer. Valid values:</p>
         * <ul>
         * <li>0: plain text.</li>
         * <li>1: rich text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder solutionType(Integer solutionType) {
            this.putBodyParameter("SolutionType", solutionType);
            this.solutionType = solutionType;
            return this;
        }

        /**
         * <p>The effective period.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25T16:28:36Z</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The list of label IDs.</p>
         */
        public Builder tagIdList(java.util.List<Long> tagIdList) {
            String tagIdListShrink = shrink(tagIdList, "TagIdList", "json");
            this.putBodyParameter("TagIdList", tagIdListShrink);
            this.tagIdList = tagIdList;
            return this;
        }

        /**
         * <p>The title of the knowledge entry. Maximum length: 120 characters.</p>
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
        public CreateFaqRequest build() {
            return new CreateFaqRequest(this);
        } 

    } 

}
