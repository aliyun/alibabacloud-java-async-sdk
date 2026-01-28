// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link AddApplicationToAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>AddApplicationToAuthorizationRuleRequest</p>
 */
public class AddApplicationToAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
    private ValidityPeriod validityPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String validityType;

    private AddApplicationToAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.authorizationRuleId = builder.authorizationRuleId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.validityPeriod = builder.validityPeriod;
        this.validityType = builder.validityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddApplicationToAuthorizationRuleRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return validityPeriod
     */
    public ValidityPeriod getValidityPeriod() {
        return this.validityPeriod;
    }

    /**
     * @return validityType
     */
    public String getValidityType() {
        return this.validityType;
    }

    public static final class Builder extends Request.Builder<AddApplicationToAuthorizationRuleRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String authorizationRuleId; 
        private String clientToken; 
        private String instanceId; 
        private ValidityPeriod validityPeriod; 
        private String validityType; 

        private Builder() {
            super();
        } 

        private Builder(AddApplicationToAuthorizationRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.authorizationRuleId = request.authorizationRuleId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.validityPeriod = request.validityPeriod;
            this.validityType = request.validityType;
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
         * <p>应用 ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>授权规则标识。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.putQueryParameter("AuthorizationRuleId", authorizationRuleId);
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>有效周期，当validityPeriodType为custom有效。</p>
         */
        public Builder validityPeriod(ValidityPeriod validityPeriod) {
            this.putQueryParameter("ValidityPeriod", validityPeriod);
            this.validityPeriod = validityPeriod;
            return this;
        }

        /**
         * <p>有效期类型，枚举值：permanent（永久），time_bound（自定义时间范围）。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        public Builder validityType(String validityType) {
            this.putQueryParameter("ValidityType", validityType);
            this.validityType = validityType;
            return this;
        }

        @Override
        public AddApplicationToAuthorizationRuleRequest build() {
            return new AddApplicationToAuthorizationRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddApplicationToAuthorizationRuleRequest} extends {@link TeaModel}
     *
     * <p>AddApplicationToAuthorizationRuleRequest</p>
     */
    public static class ValidityPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private Long startTime;

        private ValidityPeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidityPeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(ValidityPeriod model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>授权规则生效结束时间，采用unix纪元精确到毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1704062061000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>授权规则生效开始时间，采用unix纪元精确到毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1704042061000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public ValidityPeriod build() {
                return new ValidityPeriod(this);
            } 

        } 

    }
}
