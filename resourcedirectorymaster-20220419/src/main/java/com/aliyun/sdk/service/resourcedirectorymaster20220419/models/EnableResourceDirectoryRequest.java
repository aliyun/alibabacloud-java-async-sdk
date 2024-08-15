// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>EnableResourceDirectoryRequest</p>
 */
public class EnableResourceDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MAName")
    private String MAName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MASecureMobilePhone")
    private String MASecureMobilePhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationCode")
    private String verificationCode;

    private EnableResourceDirectoryRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.enableMode = builder.enableMode;
        this.MAName = builder.MAName;
        this.MASecureMobilePhone = builder.MASecureMobilePhone;
        this.verificationCode = builder.verificationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableResourceDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableMode
     */
    public String getEnableMode() {
        return this.enableMode;
    }

    /**
     * @return MAName
     */
    public String getMAName() {
        return this.MAName;
    }

    /**
     * @return MASecureMobilePhone
     */
    public String getMASecureMobilePhone() {
        return this.MASecureMobilePhone;
    }

    /**
     * @return verificationCode
     */
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public static final class Builder extends Request.Builder<EnableResourceDirectoryRequest, Builder> {
        private Boolean dryRun; 
        private String enableMode; 
        private String MAName; 
        private String MASecureMobilePhone; 
        private String verificationCode; 

        private Builder() {
            super();
        } 

        private Builder(EnableResourceDirectoryRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.enableMode = request.enableMode;
            this.MAName = request.MAName;
            this.MASecureMobilePhone = request.MASecureMobilePhone;
            this.verificationCode = request.verificationCode;
        } 

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run.
         * *   **false** (default): performs a dry run and performs the actual request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The mode in which you enable a resource directory. Valid values:
         * <p>
         * 
         * *   CurrentAccount: The current account is used to enable a resource directory.
         * *   NewManagementAccount: A newly created account is used to enable a resource directory. If you select this mode, you must configure the `MAName`, `MASecureMobilePhone`, and `VerificationCode` parameters.
         */
        public Builder enableMode(String enableMode) {
            this.putQueryParameter("EnableMode", enableMode);
            this.enableMode = enableMode;
            return this;
        }

        /**
         * The name of the newly created account.
         * <p>
         * 
         * Specify the name in the `<Prefix>@rdadmin.aliyunid.com` format. The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start and end with a letter or digit. Valid special characters include underscores (`_`), periods (.), and hyphens (-). The prefix must be 2 to 50 characters in length.
         */
        public Builder MAName(String MAName) {
            this.putQueryParameter("MAName", MAName);
            this.MAName = MAName;
            return this;
        }

        /**
         * The mobile phone number that is bound to the newly created account.
         * <p>
         * 
         * If you leave this parameter empty, the mobile phone number that is bound to the current account is used. The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the [SendVerificationCodeForEnableRD](~~SendVerificationCodeForEnableRD~~) operation to obtain a verification code.
         * 
         * Specify the mobile phone number in the `<Country code>-<Mobile phone number>` format.
         * 
         * > Mobile phone numbers in the `86-<Mobile phone number>` format in the Chinese mainland are not supported.
         */
        public Builder MASecureMobilePhone(String MASecureMobilePhone) {
            this.putQueryParameter("MASecureMobilePhone", MASecureMobilePhone);
            this.MASecureMobilePhone = MASecureMobilePhone;
            return this;
        }

        /**
         * The verification code.
         * <p>
         * 
         * You can call the [SendVerificationCodeForEnableRD](~~SendVerificationCodeForEnableRD~~) operation to obtain the verification code.
         */
        public Builder verificationCode(String verificationCode) {
            this.putQueryParameter("VerificationCode", verificationCode);
            this.verificationCode = verificationCode;
            return this;
        }

        @Override
        public EnableResourceDirectoryRequest build() {
            return new EnableResourceDirectoryRequest(this);
        } 

    } 

}
