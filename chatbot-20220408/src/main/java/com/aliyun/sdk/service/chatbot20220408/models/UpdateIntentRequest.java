// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntentRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntentRequest</p>
 */
public class UpdateIntentRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IntentDefinition")
    private IntentDefinition intentDefinition;

    @Query
    @NameInMap("IntentId")
    @Validation(required = true)
    private Long intentId;

    private UpdateIntentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.intentDefinition = builder.intentDefinition;
        this.intentId = builder.intentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntentRequest create() {
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

    /**
     * @return intentId
     */
    public Long getIntentId() {
        return this.intentId;
    }

    public static final class Builder extends Request.Builder<UpdateIntentRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private IntentDefinition intentDefinition; 
        private Long intentId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.intentDefinition = request.intentDefinition;
            this.intentId = request.intentId;
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
         * InstanceId.
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

        /**
         * IntentId.
         */
        public Builder intentId(Long intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        @Override
        public UpdateIntentRequest build() {
            return new UpdateIntentRequest(this);
        } 

    } 

    public static class SlotInfos extends TeaModel {
        @NameInMap("Array")
        private Boolean array;

        @NameInMap("Encrypt")
        private Boolean encrypt;

        @NameInMap("Interactive")
        private Boolean interactive;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("SlotId")
        @Validation(required = true)
        private String slotId;

        @NameInMap("Value")
        @Validation(required = true)
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
    public static class IntentDefinition extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("IntentName")
        @Validation(required = true)
        private String intentName;

        @NameInMap("SlotInfos")
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
             * IntentName.
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
