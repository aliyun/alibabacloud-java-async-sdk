// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ArticleTaskId.
         */
        public Builder articleTaskId(String articleTaskId) {
            this.putBodyParameter("ArticleTaskId", articleTaskId);
            this.articleTaskId = articleTaskId;
            return this;
        }

        /**
         * TaskIdList.
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
