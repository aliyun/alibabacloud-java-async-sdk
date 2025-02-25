// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifySmsCodeRequest} extends {@link RequestModel}
 *
 * <p>VerifySmsCodeRequest</p>
 */
public class VerifySmsCodeRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("NowStamp")
    @Validation(required = true)
    private Long nowStamp;

    @Query
    @NameInMap("PhoneNumbers")
    @Validation(required = true)
    private String phoneNumbers;

    @Query
    @NameInMap("SignKey")
    @Validation(required = true)
    private String signKey;

    private VerifySmsCodeRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.nowStamp = builder.nowStamp;
        this.phoneNumbers = builder.phoneNumbers;
        this.signKey = builder.signKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifySmsCodeRequest create() {
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
     * @return nowStamp
     */
    public Long getNowStamp() {
        return this.nowStamp;
    }

    /**
     * @return phoneNumbers
     */
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return signKey
     */
    public String getSignKey() {
        return this.signKey;
    }

    public static final class Builder extends Request.Builder<VerifySmsCodeRequest, Builder> {
        private String code; 
        private Long nowStamp; 
        private String phoneNumbers; 
        private String signKey; 

        private Builder() {
            super();
        } 

        private Builder(VerifySmsCodeRequest request) {
            super(request);
            this.code = request.code;
            this.nowStamp = request.nowStamp;
            this.phoneNumbers = request.phoneNumbers;
            this.signKey = request.signKey;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * NowStamp.
         */
        public Builder nowStamp(Long nowStamp) {
            this.putQueryParameter("NowStamp", nowStamp);
            this.nowStamp = nowStamp;
            return this;
        }

        /**
         * PhoneNumbers.
         */
        public Builder phoneNumbers(String phoneNumbers) {
            this.putQueryParameter("PhoneNumbers", phoneNumbers);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * SignKey.
         */
        public Builder signKey(String signKey) {
            this.putQueryParameter("SignKey", signKey);
            this.signKey = signKey;
            return this;
        }

        @Override
        public VerifySmsCodeRequest build() {
            return new VerifySmsCodeRequest(this);
        } 

    } 

}
