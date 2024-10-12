// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FetchImageTaskRequest} extends {@link RequestModel}
 *
 * <p>FetchImageTaskRequest</p>
 */
public class FetchImageTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ArticleTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String articleTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > taskIdList;

    private FetchImageTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.articleTaskId = builder.articleTaskId;
        this.taskIdList = builder.taskIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchImageTaskRequest create() {
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
     * @return articleTaskId
     */
    public String getArticleTaskId() {
        return this.articleTaskId;
    }

    /**
     * @return taskIdList
     */
    public java.util.List < String > getTaskIdList() {
        return this.taskIdList;
    }

    public static final class Builder extends Request.Builder<FetchImageTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String articleTaskId; 
        private java.util.List < String > taskIdList; 

        private Builder() {
            super();
        } 

        private Builder(FetchImageTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.articleTaskId = request.articleTaskId;
            this.taskIdList = request.taskIdList;
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
         * <p>cd327c3d5d5e44159cc716e23bfa530e_p_beebot_public</p>
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
         * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
         */
        public Builder articleTaskId(String articleTaskId) {
            this.putBodyParameter("ArticleTaskId", articleTaskId);
            this.articleTaskId = articleTaskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;9d8c9185-3f75-4a20-aca1-c5bb53dd97b3&quot;]</p>
         */
        public Builder taskIdList(java.util.List < String > taskIdList) {
            String taskIdListShrink = shrink(taskIdList, "TaskIdList", "json");
            this.putBodyParameter("TaskIdList", taskIdListShrink);
            this.taskIdList = taskIdList;
            return this;
        }

        @Override
        public FetchImageTaskRequest build() {
            return new FetchImageTaskRequest(this);
        } 

    } 

}
