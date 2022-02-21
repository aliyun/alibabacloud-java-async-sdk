// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrafficControlRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficControlRequest</p>
 */
public class CreateTrafficControlRequest extends Request {
    @Query
    @NameInMap("ApiDefault")
    @Validation(required = true)
    private Integer apiDefault;

    @Query
    @NameInMap("AppDefault")
    private Integer appDefault;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TrafficControlName")
    @Validation(required = true)
    private String trafficControlName;

    @Query
    @NameInMap("TrafficControlUnit")
    @Validation(required = true)
    private String trafficControlUnit;

    @Query
    @NameInMap("UserDefault")
    private Integer userDefault;

    private CreateTrafficControlRequest(Builder builder) {
        super(builder);
        this.apiDefault = builder.apiDefault;
        this.appDefault = builder.appDefault;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.trafficControlName = builder.trafficControlName;
        this.trafficControlUnit = builder.trafficControlUnit;
        this.userDefault = builder.userDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiDefault
     */
    public Integer getApiDefault() {
        return this.apiDefault;
    }

    /**
     * @return appDefault
     */
    public Integer getAppDefault() {
        return this.appDefault;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return trafficControlName
     */
    public String getTrafficControlName() {
        return this.trafficControlName;
    }

    /**
     * @return trafficControlUnit
     */
    public String getTrafficControlUnit() {
        return this.trafficControlUnit;
    }

    /**
     * @return userDefault
     */
    public Integer getUserDefault() {
        return this.userDefault;
    }

    public static final class Builder extends Request.Builder<CreateTrafficControlRequest, Builder> {
        private Integer apiDefault; 
        private Integer appDefault; 
        private String description; 
        private String securityToken; 
        private String trafficControlName; 
        private String trafficControlUnit; 
        private Integer userDefault; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficControlRequest response) {
            super(response);
            this.apiDefault = response.apiDefault;
            this.appDefault = response.appDefault;
            this.description = response.description;
            this.securityToken = response.securityToken;
            this.trafficControlName = response.trafficControlName;
            this.trafficControlUnit = response.trafficControlUnit;
            this.userDefault = response.userDefault;
        } 

        /**
         * ApiDefault.
         */
        public Builder apiDefault(Integer apiDefault) {
            this.putQueryParameter("ApiDefault", apiDefault);
            this.apiDefault = apiDefault;
            return this;
        }

        /**
         * AppDefault.
         */
        public Builder appDefault(Integer appDefault) {
            this.putQueryParameter("AppDefault", appDefault);
            this.appDefault = appDefault;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * TrafficControlName.
         */
        public Builder trafficControlName(String trafficControlName) {
            this.putQueryParameter("TrafficControlName", trafficControlName);
            this.trafficControlName = trafficControlName;
            return this;
        }

        /**
         * TrafficControlUnit.
         */
        public Builder trafficControlUnit(String trafficControlUnit) {
            this.putQueryParameter("TrafficControlUnit", trafficControlUnit);
            this.trafficControlUnit = trafficControlUnit;
            return this;
        }

        /**
         * UserDefault.
         */
        public Builder userDefault(Integer userDefault) {
            this.putQueryParameter("UserDefault", userDefault);
            this.userDefault = userDefault;
            return this;
        }

        @Override
        public CreateTrafficControlRequest build() {
            return new CreateTrafficControlRequest(this);
        } 

    } 

}
