// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyInstanceTwoFactorRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTwoFactorRequest</p>
 */
public class ModifyInstanceTwoFactorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTwoFactor")
    private String enableTwoFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipTwoFactorTime")
    private String skipTwoFactorTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TwoFactorMethods")
    private String twoFactorMethods;

    private ModifyInstanceTwoFactorRequest(Builder builder) {
        super(builder);
        this.enableTwoFactor = builder.enableTwoFactor;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.skipTwoFactorTime = builder.skipTwoFactorTime;
        this.twoFactorMethods = builder.twoFactorMethods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTwoFactorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableTwoFactor
     */
    public String getEnableTwoFactor() {
        return this.enableTwoFactor;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skipTwoFactorTime
     */
    public String getSkipTwoFactorTime() {
        return this.skipTwoFactorTime;
    }

    /**
     * @return twoFactorMethods
     */
    public String getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTwoFactorRequest, Builder> {
        private String enableTwoFactor; 
        private String instanceId; 
        private String regionId; 
        private String skipTwoFactorTime; 
        private String twoFactorMethods; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTwoFactorRequest request) {
            super(request);
            this.enableTwoFactor = request.enableTwoFactor;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.skipTwoFactorTime = request.skipTwoFactorTime;
            this.twoFactorMethods = request.twoFactorMethods;
        } 

        /**
         * <p>Specifies whether to enable two-factor authentication. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTwoFactor(String enableTwoFactor) {
            this.putQueryParameter("EnableTwoFactor", enableTwoFactor);
            this.enableTwoFactor = enableTwoFactor;
            return this;
        }

        /**
         * <p>The ID of the bastion host.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The duration within which two-factor authentication is not required after a user passes two-factor authentication. Valid values: 0 to 168. Unit: hours. If you set this parameter to 0, the user must pass two-factor authentication every time the user logs on to the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skipTwoFactorTime(String skipTwoFactorTime) {
            this.putQueryParameter("SkipTwoFactorTime", skipTwoFactorTime);
            this.skipTwoFactorTime = skipTwoFactorTime;
            return this;
        }

        /**
         * <p>The method used to send a verification code for two-factor authentication. If EnableTwoFactor is set to true, you must specify at least one method. Valid values:</p>
         * <ul>
         * <li><strong>sms:</strong> text message.</li>
         * <li><strong>email</strong>: email.</li>
         * <li><strong>dingtalk</strong>: notice in DingTalk.</li>
         * <li><strong>totp</strong>: one-time password (OTP) token.</li>
         * <li><strong>gmusbkey</strong>: SM-based USB key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sms&quot;]</p>
         */
        public Builder twoFactorMethods(String twoFactorMethods) {
            this.putQueryParameter("TwoFactorMethods", twoFactorMethods);
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }

        @Override
        public ModifyInstanceTwoFactorRequest build() {
            return new ModifyInstanceTwoFactorRequest(this);
        } 

    } 

}
