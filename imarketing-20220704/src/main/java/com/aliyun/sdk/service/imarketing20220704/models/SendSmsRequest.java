// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendSmsRequest} extends {@link RequestModel}
 *
 * <p>SendSmsRequest</p>
 */
public class SendSmsRequest extends Request {
    @Query
    @NameInMap("NowStamp")
    private Long nowStamp;

    @Query
    @NameInMap("PhoneNumbers")
    @Validation(required = true)
    private String phoneNumbers;

    @Query
    @NameInMap("SignKey")
    @Validation(required = true)
    private String signKey;

    private SendSmsRequest(Builder builder) {
        super(builder);
        this.nowStamp = builder.nowStamp;
        this.phoneNumbers = builder.phoneNumbers;
        this.signKey = builder.signKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<SendSmsRequest, Builder> {
        private Long nowStamp; 
        private String phoneNumbers; 
        private String signKey; 

        private Builder() {
            super();
        } 

        private Builder(SendSmsRequest request) {
            super(request);
            this.nowStamp = request.nowStamp;
            this.phoneNumbers = request.phoneNumbers;
            this.signKey = request.signKey;
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
        public SendSmsRequest build() {
            return new SendSmsRequest(this);
        } 

    } 

}
