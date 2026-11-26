// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link AICoachScriptHotWordItem} extends {@link TeaModel}
 *
 * <p>AICoachScriptHotWordItem</p>
 */
public class AICoachScriptHotWordItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("hotWord")
    private String hotWord;

    @com.aliyun.core.annotation.NameInMap("hotWordId")
    private String hotWordId;

    @com.aliyun.core.annotation.NameInMap("modifierId")
    private String modifierId;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    private AICoachScriptHotWordItem(Builder builder) {
        this.creatorId = builder.creatorId;
        this.creatorName = builder.creatorName;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.hotWord = builder.hotWord;
        this.hotWordId = builder.hotWordId;
        this.modifierId = builder.modifierId;
        this.modifierName = builder.modifierName;
        this.scriptRecordId = builder.scriptRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AICoachScriptHotWordItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hotWord
     */
    public String getHotWord() {
        return this.hotWord;
    }

    /**
     * @return hotWordId
     */
    public String getHotWordId() {
        return this.hotWordId;
    }

    /**
     * @return modifierId
     */
    public String getModifierId() {
        return this.modifierId;
    }

    /**
     * @return modifierName
     */
    public String getModifierName() {
        return this.modifierName;
    }

    /**
     * @return scriptRecordId
     */
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    public static final class Builder {
        private String creatorId; 
        private String creatorName; 
        private String description; 
        private String gmtCreate; 
        private String gmtModified; 
        private String hotWord; 
        private String hotWordId; 
        private String modifierId; 
        private String modifierName; 
        private String scriptRecordId; 

        private Builder() {
        } 

        private Builder(AICoachScriptHotWordItem model) {
            this.creatorId = model.creatorId;
            this.creatorName = model.creatorName;
            this.description = model.description;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.hotWord = model.hotWord;
            this.hotWordId = model.hotWordId;
            this.modifierId = model.modifierId;
            this.modifierName = model.modifierName;
            this.scriptRecordId = model.scriptRecordId;
        } 

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * hotWord.
         */
        public Builder hotWord(String hotWord) {
            this.hotWord = hotWord;
            return this;
        }

        /**
         * hotWordId.
         */
        public Builder hotWordId(String hotWordId) {
            this.hotWordId = hotWordId;
            return this;
        }

        /**
         * modifierId.
         */
        public Builder modifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        /**
         * modifierName.
         */
        public Builder modifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }

        /**
         * scriptRecordId.
         */
        public Builder scriptRecordId(String scriptRecordId) {
            this.scriptRecordId = scriptRecordId;
            return this;
        }

        public AICoachScriptHotWordItem build() {
            return new AICoachScriptHotWordItem(this);
        } 

    } 

}
