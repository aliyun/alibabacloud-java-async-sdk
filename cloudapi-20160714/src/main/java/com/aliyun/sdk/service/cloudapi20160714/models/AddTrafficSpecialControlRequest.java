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
 * {@link AddTrafficSpecialControlRequest} extends {@link RequestModel}
 *
 * <p>AddTrafficSpecialControlRequest</p>
 */
public class AddTrafficSpecialControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecialKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specialKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecialType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer trafficValue;

    private AddTrafficSpecialControlRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.specialKey = builder.specialKey;
        this.specialType = builder.specialType;
        this.trafficControlId = builder.trafficControlId;
        this.trafficValue = builder.trafficValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTrafficSpecialControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return specialKey
     */
    public String getSpecialKey() {
        return this.specialKey;
    }

    /**
     * @return specialType
     */
    public String getSpecialType() {
        return this.specialType;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    /**
     * @return trafficValue
     */
    public Integer getTrafficValue() {
        return this.trafficValue;
    }

    public static final class Builder extends Request.Builder<AddTrafficSpecialControlRequest, Builder> {
        private String securityToken; 
        private String specialKey; 
        private String specialType; 
        private String trafficControlId; 
        private Integer trafficValue; 

        private Builder() {
            super();
        } 

        private Builder(AddTrafficSpecialControlRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.specialKey = request.specialKey;
            this.specialType = request.specialType;
            this.trafficControlId = request.trafficControlId;
            this.trafficValue = request.trafficValue;
        } 

        /**
         * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>fa876ffb-caab-4f0a-93b3-3409f2fa5199</p>
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The ID of the app or Alibaba Cloud account. Specify this parameter based on the value of the <strong>SpecialType</strong> parameter. You can view your account ID on the <a href="https://account.console.aliyun.com/?spm=a2c4g.11186623.2.15.3f053654YpMPwo#/secure">Account Management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3382463</p>
         */
        public Builder specialKey(String specialKey) {
            this.putQueryParameter("SpecialKey", specialKey);
            this.specialKey = specialKey;
            return this;
        }

        /**
         * <p>The type of the special throttling policy. Valid values:</p>
         * <ul>
         * <li><strong>APP</strong></li>
         * <li><strong>USER</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        public Builder specialType(String specialType) {
            this.putQueryParameter("SpecialType", specialType);
            this.specialType = specialType;
            return this;
        }

        /**
         * <p>The ID of the specified throttling policy.</p>
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
         * <p>The special throttling value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder trafficValue(Integer trafficValue) {
            this.putQueryParameter("TrafficValue", trafficValue);
            this.trafficValue = trafficValue;
            return this;
        }

        @Override
        public AddTrafficSpecialControlRequest build() {
            return new AddTrafficSpecialControlRequest(this);
        } 

    } 

}
