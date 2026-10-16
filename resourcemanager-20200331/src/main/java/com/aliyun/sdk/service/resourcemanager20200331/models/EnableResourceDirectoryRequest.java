// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
        private String enableMode; 
        private String MAName; 
        private String MASecureMobilePhone; 
        private String verificationCode; 

        private Builder() {
            super();
        } 

        private Builder(EnableResourceDirectoryRequest request) {
            super(request);
            this.enableMode = request.enableMode;
            this.MAName = request.MAName;
            this.MASecureMobilePhone = request.MASecureMobilePhone;
            this.verificationCode = request.verificationCode;
        } 

        /**
         * <p>The method used to enable the resource directory. Valid values:</p>
         * <ul>
         * <li>CurrentAccount: enables the resource directory by using the current logon account.</li>
         * <li>NewManagementAccount: enables the resource directory by creating a new management account. If you select this method, you must configure <code>MAName</code>, <code>MASecureMobilePhone</code>, and <code>VerificationCode</code>.</li>
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
         * <p>The name of the new management account.</p>
         * <p>Format: <code>&lt;Prefix&gt;@rdadmin.aliyunid.com</code>. The prefix can contain letters, digits, and the special characters <code>_.-</code>. The prefix must start and end with a letter or digit, and cannot contain consecutive special characters. The prefix must be 2 to 50 characters in length.</p>
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
         * <p>The secure phone number of the new management account.</p>
         * <p>If you leave this parameter empty, the secure phone number of the current logon account is used. The phone number must be the same as the one used to authenticate and obtain the verification code in <a href="https://help.aliyun.com/document_detail/364248.html">SendVerificationCodeForEnableRD</a>.</p>
         * <p>Format: <code>&lt;Country code&gt;-&lt;Phone number&gt;</code>.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>Phone numbers from the Chinese mainland in the format <code>86-&lt;Phone number&gt;</code> are not supported.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>Only phone numbers from the Chinese mainland in the format <code>86-&lt;Phone number&gt;</code> are supported.</p>
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
         * <p>You can call <a href="https://help.aliyun.com/document_detail/364248.html">SendVerificationCodeForEnableRD</a> to obtain the verification code.</p>
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
