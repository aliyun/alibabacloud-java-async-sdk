// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateUserSayRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserSayRequest</p>
 */
public class UpdateUserSayRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserSayDefinition")
    private UserSayDefinition userSayDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userSayId;

    private UpdateUserSayRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.userSayDefinition = builder.userSayDefinition;
        this.userSayId = builder.userSayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserSayRequest create() {
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
     * @return userSayDefinition
     */
    public UserSayDefinition getUserSayDefinition() {
        return this.userSayDefinition;
    }

    /**
     * @return userSayId
     */
    public Long getUserSayId() {
        return this.userSayId;
    }

    public static final class Builder extends Request.Builder<UpdateUserSayRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private UserSayDefinition userSayDefinition; 
        private Long userSayId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserSayRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.userSayDefinition = request.userSayDefinition;
            this.userSayId = request.userSayId;
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
         * UserSayDefinition.
         */
        public Builder userSayDefinition(UserSayDefinition userSayDefinition) {
            String userSayDefinitionShrink = shrink(userSayDefinition, "UserSayDefinition", "json");
            this.putQueryParameter("UserSayDefinition", userSayDefinitionShrink);
            this.userSayDefinition = userSayDefinition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34512323</p>
         */
        public Builder userSayId(Long userSayId) {
            this.putQueryParameter("UserSayId", userSayId);
            this.userSayId = userSayId;
            return this;
        }

        @Override
        public UpdateUserSayRequest build() {
            return new UpdateUserSayRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserSayRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSayRequest</p>
     */
    public static class SlotInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIndex")
        private Integer endIndex;

        @com.aliyun.core.annotation.NameInMap("SlotId")
        private String slotId;

        @com.aliyun.core.annotation.NameInMap("StartIndex")
        private Integer startIndex;

        private SlotInfos(Builder builder) {
            this.endIndex = builder.endIndex;
            this.slotId = builder.slotId;
            this.startIndex = builder.startIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotInfos create() {
            return builder().build();
        }

        /**
         * @return endIndex
         */
        public Integer getEndIndex() {
            return this.endIndex;
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return startIndex
         */
        public Integer getStartIndex() {
            return this.startIndex;
        }

        public static final class Builder {
            private Integer endIndex; 
            private String slotId; 
            private Integer startIndex; 

            /**
             * EndIndex.
             */
            public Builder endIndex(Integer endIndex) {
                this.endIndex = endIndex;
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
             * StartIndex.
             */
            public Builder startIndex(Integer startIndex) {
                this.startIndex = startIndex;
                return this;
            }

            public SlotInfos build() {
                return new SlotInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateUserSayRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserSayRequest</p>
     */
    public static class UserSayDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("SlotInfos")
        private java.util.List < SlotInfos> slotInfos;

        private UserSayDefinition(Builder builder) {
            this.content = builder.content;
            this.intentId = builder.intentId;
            this.slotInfos = builder.slotInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSayDefinition create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return slotInfos
         */
        public java.util.List < SlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

        public static final class Builder {
            private String content; 
            private Long intentId; 
            private java.util.List < SlotInfos> slotInfos; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * SlotInfos.
             */
            public Builder slotInfos(java.util.List < SlotInfos> slotInfos) {
                this.slotInfos = slotInfos;
                return this;
            }

            public UserSayDefinition build() {
                return new UserSayDefinition(this);
            } 

        } 

    }
}
