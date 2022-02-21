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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RobotType")
    private String robotType;

    private CreateBotRequest(Builder builder) {
        super(builder);
        this.avatar = builder.avatar;
        this.introduction = builder.introduction;
        this.languageCode = builder.languageCode;
        this.name = builder.name;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return robotType
     */
    public String getRobotType() {
        return this.robotType;
    }

    public static final class Builder extends Request.Builder<CreateBotRequest, Builder> {
        private String avatar; 
        private String introduction; 
        private String languageCode; 
        private String name; 
        private String regionId; 
        private String robotType; 

        private Builder() {
            super();
        } 

        private Builder(CreateBotRequest response) {
            super(response);
            this.avatar = response.avatar;
            this.introduction = response.introduction;
            this.languageCode = response.languageCode;
            this.name = response.name;
            this.regionId = response.regionId;
            this.robotType = response.robotType;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
