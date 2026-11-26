// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link FindUserlistToAuthLoginWithPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>FindUserlistToAuthLoginWithPhoneNumberRequest</p>
 */
public class FindUserlistToAuthLoginWithPhoneNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private FindUserlistToAuthLoginWithPhoneNumberRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.phoneNumber = builder.phoneNumber;
        this.region = builder.region;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserlistToAuthLoginWithPhoneNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<FindUserlistToAuthLoginWithPhoneNumberRequest, Builder> {
        private String code; 
        private String phoneNumber; 
        private String region; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(FindUserlistToAuthLoginWithPhoneNumberRequest request) {
            super(request);
            this.code = request.code;
            this.phoneNumber = request.phoneNumber;
            this.region = request.region;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Text message verification code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Phone number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18612345678</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>Region encoding</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>+86</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>Session ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public FindUserlistToAuthLoginWithPhoneNumberRequest build() {
            return new FindUserlistToAuthLoginWithPhoneNumberRequest(this);
        } 

    } 

}
