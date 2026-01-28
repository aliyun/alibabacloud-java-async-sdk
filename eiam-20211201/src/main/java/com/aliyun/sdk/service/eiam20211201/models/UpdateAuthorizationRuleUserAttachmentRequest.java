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
 * {@link UpdateAuthorizationRuleUserAttachmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationRuleUserAttachmentRequest</p>
 */
public class UpdateAuthorizationRuleUserAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
    private ValidityPeriod validityPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String validityType;

    private UpdateAuthorizationRuleUserAttachmentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationRuleId = builder.authorizationRuleId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
        this.validityPeriod = builder.validityPeriod;
        this.validityType = builder.validityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationRuleUserAttachmentRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
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

    public static final class Builder extends Request.Builder<UpdateAuthorizationRuleUserAttachmentRequest, Builder> {
        private String regionId; 
        private String authorizationRuleId; 
        private String clientToken; 
        private String instanceId; 
        private String userId; 
        private ValidityPeriod validityPeriod; 
        private String validityType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationRuleUserAttachmentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationRuleId = request.authorizationRuleId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.userId = request.userId;
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
         * <p>账户ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
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
        public UpdateAuthorizationRuleUserAttachmentRequest build() {
            return new UpdateAuthorizationRuleUserAttachmentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAuthorizationRuleUserAttachmentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAuthorizationRuleUserAttachmentRequest</p>
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
