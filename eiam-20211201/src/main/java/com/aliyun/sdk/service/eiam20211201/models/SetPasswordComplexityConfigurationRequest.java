// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordComplexityConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordComplexityConfigurationRequest</p>
 */
public class SetPasswordComplexityConfigurationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("PasswordComplexityRules")
    private java.util.List < PasswordComplexityRules> passwordComplexityRules;

    @Query
    @NameInMap("PasswordMinLength")
    @Validation(required = true, maxLength = 32)
    private Integer passwordMinLength;

    private SetPasswordComplexityConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.passwordComplexityRules = builder.passwordComplexityRules;
        this.passwordMinLength = builder.passwordMinLength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordComplexityConfigurationRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return passwordComplexityRules
     */
    public java.util.List < PasswordComplexityRules> getPasswordComplexityRules() {
        return this.passwordComplexityRules;
    }

    /**
     * @return passwordMinLength
     */
    public Integer getPasswordMinLength() {
        return this.passwordMinLength;
    }

    public static final class Builder extends Request.Builder<SetPasswordComplexityConfigurationRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List < PasswordComplexityRules> passwordComplexityRules; 
        private Integer passwordMinLength; 

        private Builder() {
            super();
        } 

        private Builder(SetPasswordComplexityConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.passwordComplexityRules = request.passwordComplexityRules;
            this.passwordMinLength = request.passwordMinLength;
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
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 密码复杂度规则
         */
        public Builder passwordComplexityRules(java.util.List < PasswordComplexityRules> passwordComplexityRules) {
            this.putQueryParameter("PasswordComplexityRules", passwordComplexityRules);
            this.passwordComplexityRules = passwordComplexityRules;
            return this;
        }

        /**
         * 密码最小长度
         */
        public Builder passwordMinLength(Integer passwordMinLength) {
            this.putQueryParameter("PasswordMinLength", passwordMinLength);
            this.passwordMinLength = passwordMinLength;
            return this;
        }

        @Override
        public SetPasswordComplexityConfigurationRequest build() {
            return new SetPasswordComplexityConfigurationRequest(this);
        } 

    } 

    public static class PasswordComplexityRules extends TeaModel {
        @NameInMap("PasswordCheckType")
        @Validation(maxLength = 64)
        private String passwordCheckType;

        private PasswordComplexityRules(Builder builder) {
            this.passwordCheckType = builder.passwordCheckType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordComplexityRules create() {
            return builder().build();
        }

        /**
         * @return passwordCheckType
         */
        public String getPasswordCheckType() {
            return this.passwordCheckType;
        }

        public static final class Builder {
            private String passwordCheckType; 

            /**
             * 密码检查类型。枚举取值:inclusion\_upper\_case(包含大写字母)、inclusion\_lower\_case(包含小写字母)、inclusion\_special\_case(包含特殊字符)、inclusion\_number(包含数字)、exclusion\_username(不能包含用户名)、exclusion\_email(不能包含邮箱)、exclusion\_phone\_number(不能包含手机号)、exclusion\_display\_name(不能包含显示名)
             */
            public Builder passwordCheckType(String passwordCheckType) {
                this.passwordCheckType = passwordCheckType;
                return this;
            }

            public PasswordComplexityRules build() {
                return new PasswordComplexityRules(this);
            } 

        } 

    }
}
