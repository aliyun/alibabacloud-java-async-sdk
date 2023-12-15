// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBotRequest} extends {@link RequestModel}
 *
 * <p>CreateBotRequest</p>
 */
public class CreateBotRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Avatar")
    private String avatar;

    @Query
    @NameInMap("Introduction")
    private String introduction;

    @Query
    @NameInMap("LanguageCode")
    @Validation(required = true)
    private String languageCode;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RobotType")
    private String robotType;

    private CreateBotRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.avatar = builder.avatar;
        this.introduction = builder.introduction;
        this.languageCode = builder.languageCode;
        this.name = builder.name;
        this.robotType = builder.robotType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBotRequest create() {
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
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return languageCode
     */
    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return robotType
     */
    public String getRobotType() {
        return this.robotType;
    }

    public static final class Builder extends Request.Builder<CreateBotRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String avatar; 
        private String introduction; 
        private String languageCode; 
        private String name; 
        private String robotType; 

        private Builder() {
            super();
        } 

        private Builder(CreateBotRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.avatar = request.avatar;
            this.introduction = request.introduction;
            this.languageCode = request.languageCode;
            this.name = request.name;
            this.robotType = request.robotType;
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
         * Avatar.
         */
        public Builder avatar(String avatar) {
            this.putQueryParameter("Avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * Introduction.
         */
        public Builder introduction(String introduction) {
            this.putQueryParameter("Introduction", introduction);
            this.introduction = introduction;
            return this;
        }

        /**
         * LanguageCode.
         */
        public Builder languageCode(String languageCode) {
            this.putQueryParameter("LanguageCode", languageCode);
            this.languageCode = languageCode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RobotType.
         */
        public Builder robotType(String robotType) {
            this.putQueryParameter("RobotType", robotType);
            this.robotType = robotType;
            return this;
        }

        @Override
        public CreateBotRequest build() {
            return new CreateBotRequest(this);
        } 

    } 

}
