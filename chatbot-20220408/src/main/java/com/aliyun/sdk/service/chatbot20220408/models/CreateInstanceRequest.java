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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Introduction")
    private String introduction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageCode")
    private String languageCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotType")
    private String robotType;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.introduction = builder.introduction;
        this.languageCode = builder.languageCode;
        this.name = builder.name;
        this.robotType = builder.robotType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String introduction; 
        private String languageCode; 
        private String name; 
        private String robotType; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
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
         * <p>The workspace key. If this parameter is not specified, the default workspace is accessed. Obtain the key value from the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The description of the chatbot. The description can be up to 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample chatbot for the mobile app</p>
         */
        public Builder introduction(String introduction) {
            this.putQueryParameter("Introduction", introduction);
            this.introduction = introduction;
            return this;
        }

        /**
         * <p>The language of the chatbot service, such as zh-cn or en-us. Default value: the default language of the workspace. Valid values: the languages supported by the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        public Builder languageCode(String languageCode) {
            this.putQueryParameter("LanguageCode", languageCode);
            this.languageCode = languageCode;
            return this;
        }

        /**
         * <p>The name of the chatbot. The name can be up to 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleChatbot</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the chatbot. Default value: scenario_im.</p>
         * 
         * <strong>example:</strong>
         * <p>scenario_im</p>
         */
        public Builder robotType(String robotType) {
            this.putQueryParameter("RobotType", robotType);
            this.robotType = robotType;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
