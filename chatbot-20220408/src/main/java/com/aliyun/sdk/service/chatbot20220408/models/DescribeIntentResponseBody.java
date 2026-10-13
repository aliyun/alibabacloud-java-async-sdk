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
    private java.util.List<SlotInfos> slotInfos;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SlotInfos> getSlotInfos() {
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
        private java.util.List<SlotInfos> slotInfos; 

        private Builder() {
        } 

        private Builder(DescribeIntentResponseBody model) {
            this.aliasName = model.aliasName;
            this.createTime = model.createTime;
            this.createUserId = model.createUserId;
            this.createUserName = model.createUserName;
            this.intentId = model.intentId;
            this.intentName = model.intentName;
            this.modifyTime = model.modifyTime;
            this.modifyUserId = model.modifyUserId;
            this.modifyUserName = model.modifyUserName;
            this.requestId = model.requestId;
            this.slotInfos = model.slotInfos;
        } 

        /**
         * <p>The intent alias.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckWeatherIntent</p>
         */
        public Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The unique identifier of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123231</p>
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * <p>The intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84243341</p>
         */
        public Builder intentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>CheckWeatherIntent</p>
         */
        public Builder intentName(String intentName) {
            this.intentName = intentName;
            return this;
        }

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-12T16:00:01Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The unique identifier of the user who last modified the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>123231</p>
         */
        public Builder modifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * <p>The name of the user who last modified the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a22afaf2adfasf2gr345fga45ada</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The slot information associated with the intent.</p>
         */
        public Builder slotInfos(java.util.List<SlotInfos> slotInfos) {
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

            private Builder() {
            } 

            private Builder(SlotInfos model) {
                this.array = model.array;
                this.encrypt = model.encrypt;
                this.interactive = model.interactive;
                this.name = model.name;
                this.slotId = model.slotId;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the slot is an array.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * <p>Indicates whether the slot is sensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypt(Boolean encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * <p>Indicates whether interactive slot filling is enabled. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * <p>The slot name.</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unique identifier of the slot.</p>
             * 
             * <strong>example:</strong>
             * <p>aa4d2a343a3ad4afad</p>
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * <p>The slot tagging result.</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
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
