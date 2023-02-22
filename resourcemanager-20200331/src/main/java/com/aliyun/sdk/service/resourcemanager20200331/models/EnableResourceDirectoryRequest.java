// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>EnableResourceDirectoryRequest</p>
 */
public class EnableResourceDirectoryRequest extends Request {
    @Query
    @NameInMap("EnableMode")
    @Validation(required = true)
    private String enableMode;

    @Query
    @NameInMap("MAName")
    private String MAName;

    @Query
    @NameInMap("MASecureMobilePhone")
    private String MASecureMobilePhone;

    @Query
    @NameInMap("VerificationCode")
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
         * EnableMode.
         */
        public Builder enableMode(String enableMode) {
            this.putQueryParameter("EnableMode", enableMode);
            this.enableMode = enableMode;
            return this;
        }

        /**
         * MAName.
         */
        public Builder MAName(String MAName) {
            this.putQueryParameter("MAName", MAName);
            this.MAName = MAName;
            return this;
        }

        /**
         * MASecureMobilePhone.
         */
        public Builder MASecureMobilePhone(String MASecureMobilePhone) {
            this.putQueryParameter("MASecureMobilePhone", MASecureMobilePhone);
            this.MASecureMobilePhone = MASecureMobilePhone;
            return this;
        }

        /**
         * VerificationCode.
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
