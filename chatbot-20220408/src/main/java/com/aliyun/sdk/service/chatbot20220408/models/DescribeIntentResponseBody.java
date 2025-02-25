// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIntentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntentResponseBody</p>
 */
public class DescribeIntentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private String createUserId;

    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.NameInMap("IntentId")
    private Long intentId;

    @com.aliyun.core.annotation.NameInMap("IntentName")
    private String intentName;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("ModifyUserId")
    private String modifyUserId;

    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlotInfos")
    private java.util.List < SlotInfos> slotInfos;

    private DescribeIntentResponseBody(Builder builder) {
        this.aliasName = builder.aliasName;
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.intentId = builder.intentId;
        this.intentName = builder.intentName;
        this.modifyTime = builder.modifyTime;
        this.modifyUserId = builder.modifyUserId;
        this.modifyUserName = builder.modifyUserName;
        this.requestId = builder.requestId;
        this.slotInfos = builder.slotInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntentResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    /**
     * @return intentName
     */
    public String getIntentName() {
        return this.intentName;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserId
     */
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slotInfos
     */
    public java.util.List < SlotInfos> getSlotInfos() {
        return this.slotInfos;
    }

    public static final class Builder {
        private String aliasName; 
        private String createTime; 
        private String createUserId; 
        private String createUserName; 
        private Long intentId; 
        private String intentName; 
        private String modifyTime; 
        private String modifyUserId; 
        private String modifyUserName; 
        private String requestId; 
        private java.util.List < SlotInfos> slotInfos; 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }

        /**
         * IntentName.
         */
        public Builder intentName(String intentName) {
            this.intentName = intentName;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * ModifyUserId.
         */
        public Builder modifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlotInfos.
         */
        public Builder slotInfos(java.util.List < SlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }

        public DescribeIntentResponseBody build() {
            return new DescribeIntentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIntentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntentResponseBody</p>
     */
    public static class SlotInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Array")
        private Boolean array;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private Boolean encrypt;

        @com.aliyun.core.annotation.NameInMap("Interactive")
        private Boolean interactive;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SlotId")
        private String slotId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SlotInfos(Builder builder) {
            this.array = builder.array;
            this.encrypt = builder.encrypt;
            this.interactive = builder.interactive;
            this.name = builder.name;
            this.slotId = builder.slotId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotInfos create() {
            return builder().build();
        }

        /**
         * @return array
         */
        public Boolean getArray() {
            return this.array;
        }

        /**
         * @return encrypt
         */
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return interactive
         */
        public Boolean getInteractive() {
            return this.interactive;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean array; 
            private Boolean encrypt; 
            private Boolean interactive; 
            private String name; 
            private String slotId; 
            private String value; 

            /**
             * Array.
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * Encrypt.
             */
            public Builder encrypt(Boolean encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * Interactive.
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SlotId.
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SlotInfos build() {
                return new SlotInfos(this);
            } 

        } 

    }
}
