// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The mode in which you enable a resource directory. Valid values:</p>
         * <ul>
         * <li>CurrentAccount: The current account is used to enable a resource directory.</li>
         * <li>NewManagementAccount: A newly created account is used to enable a resource directory. If you select this mode, you must configure the <code>MAName</code>, <code>MASecureMobilePhone</code>, and <code>VerificationCode</code> parameters.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CurrentAccount</p>
         */
        public Builder enableMode(String enableMode) {
            this.putQueryParameter("EnableMode", enableMode);
            this.enableMode = enableMode;
            return this;
        }

        /**
         * <p>The name of the newly created account.</p>
         * <p>Specify the name in the <code>&lt;Prefix&gt;@rdadmin.aliyunid.com</code> format. The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start and end with a letter or digit. Valid special characters include underscores (<code>_</code>), periods (.), and hyphens (-). The prefix must be 2 to 50 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user01@rdadmin.aliyunid.com">user01@rdadmin.aliyunid.com</a></p>
         */
        public Builder MAName(String MAName) {
            this.putQueryParameter("MAName", MAName);
            this.MAName = MAName;
            return this;
        }

        /**
         * <p>The mobile phone number that is bound to the newly created account.</p>
         * <p>If you leave this parameter empty, the mobile phone number that is bound to the current account is used. The mobile phone number you specify must be the same as the mobile phone number that you specify when you call the <a href="~~SendVerificationCodeForEnableRD~~">SendVerificationCodeForEnableRD</a> operation to obtain a verification code.</p>
         * <p>Specify the mobile phone number in the <code>&lt;Country code&gt;-&lt;Mobile phone number&gt;</code> format.</p>
         * <blockquote>
         * <p>Mobile phone numbers in the <code>86-&lt;Mobile phone number&gt;</code> format in the Chinese mainland are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xx-13900001234</p>
         */
        public Builder MASecureMobilePhone(String MASecureMobilePhone) {
            this.putQueryParameter("MASecureMobilePhone", MASecureMobilePhone);
            this.MASecureMobilePhone = MASecureMobilePhone;
            return this;
        }

        /**
         * <p>The verification code.</p>
         * <p>You can call the <a href="~~SendVerificationCodeForEnableRD~~">SendVerificationCodeForEnableRD</a> operation to obtain the verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
