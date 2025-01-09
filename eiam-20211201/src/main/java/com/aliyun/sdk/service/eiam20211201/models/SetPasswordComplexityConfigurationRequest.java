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
 * {@link SetPasswordComplexityConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetPasswordComplexityConfigurationRequest</p>
 */
public class SetPasswordComplexityConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordComplexityRules")
    private java.util.List<PasswordComplexityRules> passwordComplexityRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordMinLength")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
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
    public java.util.List<PasswordComplexityRules> getPasswordComplexityRules() {
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
        private java.util.List<PasswordComplexityRules> passwordComplexityRules; 
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
         * <p>The instance ID.</p>
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
         * <p>The password complexity rules.</p>
         */
        public Builder passwordComplexityRules(java.util.List<PasswordComplexityRules> passwordComplexityRules) {
            this.putQueryParameter("PasswordComplexityRules", passwordComplexityRules);
            this.passwordComplexityRules = passwordComplexityRules;
            return this;
        }

        /**
         * <p>The minimum number of characters in a password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

    /**
     * 
     * {@link SetPasswordComplexityConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetPasswordComplexityConfigurationRequest</p>
     */
    public static class PasswordComplexityRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PasswordCheckType")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
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
             * <p>The type of the password check. Valid values:</p>
             * <ul>
             * <li>inclusion_upper_case: The password must contain uppercase letters.</li>
             * <li>inclusion_lower_case: The password must contain lowercase letters.</li>
             * <li>inclusion_special_case: The password must contain one or more of the following special characters: @ % + \ / &quot; ! # $ ^ ? : , ( ) { } [ ] ~ - _ .</li>
             * <li>inclusion_number: The password must contain digits.</li>
             * <li>exclusion_username: The password cannot contain a username.</li>
             * <li>exclusion_email: The password cannot contain an email prefix.</li>
             * <li>exclusion_phone_number: The password cannot contain a mobile number.</li>
             * <li>exclusion_display_name: The password cannot contain a display name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>inclusion_upper_case</p>
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
