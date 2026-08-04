// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link CreateContacterRequest} extends {@link RequestModel}
 *
 * <p>CreateContacterRequest</p>
 */
public class CreateContacterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterAddress")
    private String contacterAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterDingding")
    private String contacterDingding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterEmail")
    private String contacterEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterMobile")
    private String contacterMobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contacterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterPosition")
    private String contacterPosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterStaffNo")
    private String contacterStaffNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterType")
    private String contacterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterWangwang")
    private String contacterWangwang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmailConfirmed")
    private Boolean emailConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileConfirmed")
    private Boolean mobileConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private CreateContacterRequest(Builder builder) {
        super(builder);
        this.contacterAddress = builder.contacterAddress;
        this.contacterDingding = builder.contacterDingding;
        this.contacterEmail = builder.contacterEmail;
        this.contacterMobile = builder.contacterMobile;
        this.contacterName = builder.contacterName;
        this.contacterPosition = builder.contacterPosition;
        this.contacterStaffNo = builder.contacterStaffNo;
        this.contacterType = builder.contacterType;
        this.contacterWangwang = builder.contacterWangwang;
        this.emailConfirmed = builder.emailConfirmed;
        this.mobileConfirmed = builder.mobileConfirmed;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContacterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contacterAddress
     */
    public String getContacterAddress() {
        return this.contacterAddress;
    }

    /**
     * @return contacterDingding
     */
    public String getContacterDingding() {
        return this.contacterDingding;
    }

    /**
     * @return contacterEmail
     */
    public String getContacterEmail() {
        return this.contacterEmail;
    }

    /**
     * @return contacterMobile
     */
    public String getContacterMobile() {
        return this.contacterMobile;
    }

    /**
     * @return contacterName
     */
    public String getContacterName() {
        return this.contacterName;
    }

    /**
     * @return contacterPosition
     */
    public String getContacterPosition() {
        return this.contacterPosition;
    }

    /**
     * @return contacterStaffNo
     */
    public String getContacterStaffNo() {
        return this.contacterStaffNo;
    }

    /**
     * @return contacterType
     */
    public String getContacterType() {
        return this.contacterType;
    }

    /**
     * @return contacterWangwang
     */
    public String getContacterWangwang() {
        return this.contacterWangwang;
    }

    /**
     * @return emailConfirmed
     */
    public Boolean getEmailConfirmed() {
        return this.emailConfirmed;
    }

    /**
     * @return mobileConfirmed
     */
    public Boolean getMobileConfirmed() {
        return this.mobileConfirmed;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateContacterRequest, Builder> {
        private String contacterAddress; 
        private String contacterDingding; 
        private String contacterEmail; 
        private String contacterMobile; 
        private String contacterName; 
        private String contacterPosition; 
        private String contacterStaffNo; 
        private String contacterType; 
        private String contacterWangwang; 
        private Boolean emailConfirmed; 
        private Boolean mobileConfirmed; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateContacterRequest request) {
            super(request);
            this.contacterAddress = request.contacterAddress;
            this.contacterDingding = request.contacterDingding;
            this.contacterEmail = request.contacterEmail;
            this.contacterMobile = request.contacterMobile;
            this.contacterName = request.contacterName;
            this.contacterPosition = request.contacterPosition;
            this.contacterStaffNo = request.contacterStaffNo;
            this.contacterType = request.contacterType;
            this.contacterWangwang = request.contacterWangwang;
            this.emailConfirmed = request.emailConfirmed;
            this.mobileConfirmed = request.mobileConfirmed;
            this.userId = request.userId;
        } 

        /**
         * ContacterAddress.
         */
        public Builder contacterAddress(String contacterAddress) {
            this.putQueryParameter("ContacterAddress", contacterAddress);
            this.contacterAddress = contacterAddress;
            return this;
        }

        /**
         * ContacterDingding.
         */
        public Builder contacterDingding(String contacterDingding) {
            this.putQueryParameter("ContacterDingding", contacterDingding);
            this.contacterDingding = contacterDingding;
            return this;
        }

        /**
         * ContacterEmail.
         */
        public Builder contacterEmail(String contacterEmail) {
            this.putQueryParameter("ContacterEmail", contacterEmail);
            this.contacterEmail = contacterEmail;
            return this;
        }

        /**
         * ContacterMobile.
         */
        public Builder contacterMobile(String contacterMobile) {
            this.putQueryParameter("ContacterMobile", contacterMobile);
            this.contacterMobile = contacterMobile;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contacterName(String contacterName) {
            this.putQueryParameter("ContacterName", contacterName);
            this.contacterName = contacterName;
            return this;
        }

        /**
         * ContacterPosition.
         */
        public Builder contacterPosition(String contacterPosition) {
            this.putQueryParameter("ContacterPosition", contacterPosition);
            this.contacterPosition = contacterPosition;
            return this;
        }

        /**
         * ContacterStaffNo.
         */
        public Builder contacterStaffNo(String contacterStaffNo) {
            this.putQueryParameter("ContacterStaffNo", contacterStaffNo);
            this.contacterStaffNo = contacterStaffNo;
            return this;
        }

        /**
         * ContacterType.
         */
        public Builder contacterType(String contacterType) {
            this.putQueryParameter("ContacterType", contacterType);
            this.contacterType = contacterType;
            return this;
        }

        /**
         * ContacterWangwang.
         */
        public Builder contacterWangwang(String contacterWangwang) {
            this.putQueryParameter("ContacterWangwang", contacterWangwang);
            this.contacterWangwang = contacterWangwang;
            return this;
        }

        /**
         * EmailConfirmed.
         */
        public Builder emailConfirmed(Boolean emailConfirmed) {
            this.putQueryParameter("EmailConfirmed", emailConfirmed);
            this.emailConfirmed = emailConfirmed;
            return this;
        }

        /**
         * MobileConfirmed.
         */
        public Builder mobileConfirmed(Boolean mobileConfirmed) {
            this.putQueryParameter("MobileConfirmed", mobileConfirmed);
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateContacterRequest build() {
            return new CreateContacterRequest(this);
        } 

    } 

}
