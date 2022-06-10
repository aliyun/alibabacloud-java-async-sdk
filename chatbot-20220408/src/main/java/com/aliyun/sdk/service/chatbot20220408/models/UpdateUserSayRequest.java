// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserSayRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserSayRequest</p>
 */
public class UpdateUserSayRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserSayDefinition")
    private UserSayDefinition userSayDefinition;

    @Query
    @NameInMap("UserSayId")
    @Validation(required = true)
    private Long userSayId;

    private UpdateUserSayRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String agentKey; 
        private String instanceId; 
        private String regionId; 
        private UserSayDefinition userSayDefinition; 
        private Long userSayId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserSayRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userSayDefinition = request.userSayDefinition;
            this.userSayId = request.userSayId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 机器人ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * UserSayDefinition.
         */
        public Builder userSayDefinition(UserSayDefinition userSayDefinition) {
            String userSayDefinitionShrink = shrink(userSayDefinition, "UserSayDefinition", "json");
            this.putQueryParameter("UserSayDefinition", userSayDefinitionShrink);
            this.userSayDefinition = userSayDefinition;
            return this;
        }

        /**
         * 用户话术ID
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

    public static class SlotInfos extends TeaModel {
        @NameInMap("EndIndex")
        private Integer endIndex;

        @NameInMap("SlotId")
        private String slotId;

        @NameInMap("StartIndex")
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
             * 槽位在意图话术中的结束下标（不含）
             */
            public Builder endIndex(Integer endIndex) {
                this.endIndex = endIndex;
                return this;
            }

            /**
             * 划槽ID
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * 槽位在意图话术中的起始下标
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
    public static class UserSayDefinition extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("IntentId")
        @Validation(required = true)
        private Long intentId;

        @NameInMap("SlotInfos")
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
             * 用户话术
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 意图ID
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * 划槽信息
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
