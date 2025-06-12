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
         * AnnotationMissionDataSourceType.
         */
        public Builder annotationMissionDataSourceType(Long annotationMissionDataSourceType) {
            this.putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType);
            this.annotationMissionDataSourceType = annotationMissionDataSourceType;
            return this;
        }

        /**
         * BotId.
         */
        public Builder botId(String botId) {
            this.putQueryParameter("BotId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(Long environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * UserNick.
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
