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
 * {@link CreateTrafficControlRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficControlRequest</p>
 */
public class CreateTrafficControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDefault")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("TrafficControlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefault")
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

        private Builder(CreateTrafficControlRequest request) {
            super(request);
            this.apiDefault = request.apiDefault;
            this.appDefault = request.appDefault;
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.trafficControlName = request.trafficControlName;
            this.trafficControlUnit = request.trafficControlUnit;
            this.userDefault = request.userDefault;
        } 

        /**
         * <p>The default throttling value for each API.</p>
         * <p>This parameter is required.</p>
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
         * <p>436fa39b-b3b9-40c5-ae5d-ce3e000e38c5</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The name of the throttling policy. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). It cannot start with an underscore.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MINUTE</p>
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
        public CreateTrafficControlRequest build() {
            return new CreateTrafficControlRequest(this);
        } 

    } 

}
