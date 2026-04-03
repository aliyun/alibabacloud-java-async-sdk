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
 * {@link UpdateIMBotInput} extends {@link TeaModel}
 *
 * <p>UpdateIMBotInput</p>
 */
public class UpdateIMBotInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("botBizId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String botBizId;

    @com.aliyun.core.annotation.NameInMap("botBizSecret")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String botBizSecret;

    @com.aliyun.core.annotation.NameInMap("botBizType")
    private String botBizType;

    @com.aliyun.core.annotation.NameInMap("botMode")
    private String botMode;

    @com.aliyun.core.annotation.NameInMap("botName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String botName;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String description;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private IMBotMetadata metadata;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Integer minInstances;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateIMBotInput(Builder builder) {
        this.botBizId = builder.botBizId;
        this.botBizSecret = builder.botBizSecret;
        this.botBizType = builder.botBizType;
        this.botMode = builder.botMode;
        this.botName = builder.botName;
        this.description = builder.description;
        this.metadata = builder.metadata;
        this.minInstances = builder.minInstances;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIMBotInput create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String status; 

        private Builder() {
        } 

        private Builder(UpdateIMBotInput model) {
            this.botBizId = model.botBizId;
            this.botBizSecret = model.botBizSecret;
            this.botBizType = model.botBizType;
            this.botMode = model.botMode;
            this.botName = model.botName;
            this.description = model.description;
            this.metadata = model.metadata;
            this.minInstances = model.minInstances;
            this.status = model.status;
        } 

        /**
         * botBizId.
         */
        public Builder botBizId(String botBizId) {
            this.botBizId = botBizId;
            return this;
        }

        /**
         * <p>若提供则不可为空字符串</p>
         */
        public Builder botBizSecret(String botBizSecret) {
            this.botBizSecret = botBizSecret;
            return this;
        }

        /**
         * botBizType.
         */
        public Builder botBizType(String botBizType) {
            this.botBizType = botBizType;
            return this;
        }

        /**
         * <p>不可与租户已固定的 deployment 模式冲突</p>
         */
        public Builder botMode(String botMode) {
            this.botMode = botMode;
            return this;
        }

        /**
         * botName.
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
         * metadata.
         */
        public Builder metadata(IMBotMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>≥ 1，更新账号级 FC 最小实例</p>
         */
        public Builder minInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateIMBotInput build() {
            return new UpdateIMBotInput(this);
        } 

    } 

}
