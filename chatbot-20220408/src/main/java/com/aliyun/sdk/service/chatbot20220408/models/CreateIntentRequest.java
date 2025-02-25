// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIntentRequest} extends {@link RequestModel}
 *
 * <p>CreateIntentRequest</p>
 */
public class CreateIntentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentDefinition")
    private IntentDefinition intentDefinition;

    private CreateIntentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.intentDefinition = builder.intentDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntentRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentDefinition
     */
    public IntentDefinition getIntentDefinition() {
        return this.intentDefinition;
    }

    public static final class Builder extends Request.Builder<CreateIntentRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private IntentDefinition intentDefinition; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.intentDefinition = request.intentDefinition;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-yjzbyrEvqd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IntentDefinition.
         */
        public Builder intentDefinition(IntentDefinition intentDefinition) {
            String intentDefinitionShrink = shrink(intentDefinition, "IntentDefinition", "json");
            this.putQueryParameter("IntentDefinition", intentDefinitionShrink);
            this.intentDefinition = intentDefinition;
            return this;
        }

        @Override
        public CreateIntentRequest build() {
            return new CreateIntentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIntentRequest} extends {@link TeaModel}
     *
     * <p>CreateIntentRequest</p>
     */
    public static class SlotInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Array")
        private Boolean array;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private Boolean encrypt;

        @com.aliyun.core.annotation.NameInMap("Interactive")
        private Boolean interactive;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("SlotId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String slotId;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>fg452dfg3df23</p>
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link CreateIntentRequest} extends {@link TeaModel}
     *
     * <p>CreateIntentRequest</p>
     */
    public static class IntentDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("SlotInfos")
        private java.util.List < SlotInfos> slotInfos;

        private IntentDefinition(Builder builder) {
            this.aliasName = builder.aliasName;
            this.intentName = builder.intentName;
            this.slotInfos = builder.slotInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentDefinition create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return slotInfos
         */
        public java.util.List < SlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

        public static final class Builder {
            private String aliasName; 
            private String intentName; 
            private java.util.List < SlotInfos> slotInfos; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * SlotInfos.
             */
            public Builder slotInfos(java.util.List < SlotInfos> slotInfos) {
                this.slotInfos = slotInfos;
                return this;
            }

            public IntentDefinition build() {
                return new IntentDefinition(this);
            } 

        } 

    }
}
