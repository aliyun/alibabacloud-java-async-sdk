// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListIntentionsRequest} extends {@link RequestModel}
 *
 * <p>ListIntentionsRequest</p>
 */
public class ListIntentionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionDataSourceType")
    private Long annotationMissionDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BotId")
    private String botId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private Long environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentId")
    private Long intentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    private ListIntentionsRequest(Builder builder) {
        super(builder);
        this.annotationMissionDataSourceType = builder.annotationMissionDataSourceType;
        this.botId = builder.botId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.scriptId = builder.scriptId;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotationMissionDataSourceType
     */
    public Long getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    /**
     * @return botId
     */
    public String getBotId() {
        return this.botId;
    }

    /**
     * @return environment
     */
    public Long getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<ListIntentionsRequest, Builder> {
        private Long annotationMissionDataSourceType; 
        private String botId; 
        private Long environment; 
        private String instanceId; 
        private Long intentId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String scriptId; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(ListIntentionsRequest request) {
            super(request);
            this.annotationMissionDataSourceType = request.annotationMissionDataSourceType;
            this.botId = request.botId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.scriptId = request.scriptId;
            this.userNick = request.userNick;
        } 

        /**
         * <blockquote>
         * <p>Notice: This parameter is required. Select a value based on the scenario.</p>
         * </blockquote>
         * <p>The annotation data source. Valid values:</p>
         * <ul>
         * <li>1: outbound call</li>
         * <li>2: navigation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder annotationMissionDataSourceType(Long annotationMissionDataSourceType) {
            this.putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType);
            this.annotationMissionDataSourceType = annotationMissionDataSourceType;
            return this;
        }

        /**
         * <p>The robot ID.</p>
         * <blockquote>
         * <p>You can obtain this value from the DescribeScript operation, which corresponds to the ChatbotId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-n7QmzrUnNe</p>
         */
        public Builder botId(String botId) {
            this.putQueryParameter("BotId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li>1: private cloud</li>
         * <li>2: public cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder environment(Long environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The intent name.</p>
         * <blockquote>
         * <p>Supports fuzzy match by keyword as a filter condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>know</p>
         */
        public Builder userNick(String userNick) {
            this.putQueryParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public ListIntentionsRequest build() {
            return new ListIntentionsRequest(this);
        } 

    } 

}
