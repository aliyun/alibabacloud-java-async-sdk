// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyTrafficControlRequest} extends {@link RequestModel}
 *
 * <p>ModifyTrafficControlRequest</p>
 */
public class ModifyTrafficControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDefault")
    private Integer apiDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppDefault")
    private Integer appDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlName")
    private String trafficControlName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlUnit")
    private String trafficControlUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefault")
    private Integer userDefault;

    private ModifyTrafficControlRequest(Builder builder) {
        super(builder);
        this.apiDefault = builder.apiDefault;
        this.appDefault = builder.appDefault;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.trafficControlId = builder.trafficControlId;
        this.trafficControlName = builder.trafficControlName;
        this.trafficControlUnit = builder.trafficControlUnit;
        this.userDefault = builder.userDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrafficControlRequest create() {
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
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
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

    public static final class Builder extends Request.Builder<ModifyTrafficControlRequest, Builder> {
        private Integer apiDefault; 
        private Integer appDefault; 
        private String description; 
        private String securityToken; 
        private String trafficControlId; 
        private String trafficControlName; 
        private String trafficControlUnit; 
        private Integer userDefault; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTrafficControlRequest request) {
            super(request);
            this.apiDefault = request.apiDefault;
            this.appDefault = request.appDefault;
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.trafficControlId = request.trafficControlId;
            this.trafficControlName = request.trafficControlName;
            this.trafficControlUnit = request.trafficControlUnit;
            this.userDefault = request.userDefault;
        } 

        /**
         * <p>The default throttling value for each API.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder apiDefault(Integer apiDefault) {
            this.putQueryParameter("ApiDefault", apiDefault);
            this.apiDefault = apiDefault;
            return this;
        }

        /**
         * <p>The default throttling value for each app.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder appDefault(Integer appDefault) {
            this.putQueryParameter("AppDefault", appDefault);
            this.appDefault = appDefault;
            return this;
        }

        /**
         * <p>The description of the throttling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ThrottlingTestDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4223a10e-eed3-46a6-8b7c-23003f488153</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The ID of the throttling policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tf123456</p>
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        /**
         * <p>The throttling policy name. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It cannot start with an underscore.</p>
         * 
         * <strong>example:</strong>
         * <p>ThrottlingTest</p>
         */
        public Builder trafficControlName(String trafficControlName) {
            this.putQueryParameter("TrafficControlName", trafficControlName);
            this.trafficControlName = trafficControlName;
            return this;
        }

        /**
         * <p>The unit to be used in the throttling policy. Valid values:</p>
         * <ul>
         * <li><strong>SECOND</strong></li>
         * <li><strong>MINUTE</strong></li>
         * <li><strong>HOUR</strong></li>
         * <li><strong>DAY</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        public Builder trafficControlUnit(String trafficControlUnit) {
            this.putQueryParameter("TrafficControlUnit", trafficControlUnit);
            this.trafficControlUnit = trafficControlUnit;
            return this;
        }

        /**
         * <p>The default throttling value for each user.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder userDefault(Integer userDefault) {
            this.putQueryParameter("UserDefault", userDefault);
            this.userDefault = userDefault;
            return this;
        }

        @Override
        public ModifyTrafficControlRequest build() {
            return new ModifyTrafficControlRequest(this);
        } 

    } 

}
