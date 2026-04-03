// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateIMBotInput} extends {@link TeaModel}
 *
 * <p>CreateIMBotInput</p>
 */
public class CreateIMBotInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("botBizId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String botBizId;

    @com.aliyun.core.annotation.NameInMap("botBizSecret")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048)
    private String botBizSecret;

    @com.aliyun.core.annotation.NameInMap("botBizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String botBizType;

    @com.aliyun.core.annotation.NameInMap("botMode")
    private String botMode;

    @com.aliyun.core.annotation.NameInMap("botName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String botName;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String description;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private IMBotMetadata metadata;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Integer minInstances;

    private CreateIMBotInput(Builder builder) {
        this.botBizId = builder.botBizId;
        this.botBizSecret = builder.botBizSecret;
        this.botBizType = builder.botBizType;
        this.botMode = builder.botMode;
        this.botName = builder.botName;
        this.description = builder.description;
        this.metadata = builder.metadata;
        this.minInstances = builder.minInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIMBotInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return botBizId
     */
    public String getBotBizId() {
        return this.botBizId;
    }

    /**
     * @return botBizSecret
     */
    public String getBotBizSecret() {
        return this.botBizSecret;
    }

    /**
     * @return botBizType
     */
    public String getBotBizType() {
        return this.botBizType;
    }

    /**
     * @return botMode
     */
    public String getBotMode() {
        return this.botMode;
    }

    /**
     * @return botName
     */
    public String getBotName() {
        return this.botName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metadata
     */
    public IMBotMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return minInstances
     */
    public Integer getMinInstances() {
        return this.minInstances;
    }

    public static final class Builder {
        private String botBizId; 
        private String botBizSecret; 
        private String botBizType; 
        private String botMode; 
        private String botName; 
        private String description; 
        private IMBotMetadata metadata; 
        private Integer minInstances; 

        private Builder() {
        } 

        private Builder(CreateIMBotInput model) {
            this.botBizId = model.botBizId;
            this.botBizSecret = model.botBizSecret;
            this.botBizType = model.botBizType;
            this.botMode = model.botMode;
            this.botName = model.botName;
            this.description = model.description;
            this.metadata = model.metadata;
            this.minInstances = model.minInstances;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder botBizId(String botBizId) {
            this.botBizId = botBizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder botBizSecret(String botBizSecret) {
            this.botBizSecret = botBizSecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder botBizType(String botBizType) {
            this.botBizType = botBizType;
            return this;
        }

        /**
         * <p>standard、custom；不传时可能继承租户已有部署模式</p>
         */
        public Builder botMode(String botMode) {
            this.botMode = botMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder botName(String botName) {
            this.botName = botName;
            return this;
        }

        /**
         * <p>Bot 描述信息</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>botMode 为 standard 时条件必填；custom 模式不进行标准运行时绑定校验</p>
         */
        public Builder metadata(IMBotMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>FC 最小实例数，≥ 1；与租户账号级配置相关</p>
         */
        public Builder minInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public CreateIMBotInput build() {
            return new CreateIMBotInput(this);
        } 

    } 

}
