// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyTokenRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyTokenRequest</p>
 */
public class DescribeVerifyTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackSeed")
    private String callbackSeed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceRetainedImageUrl")
    private String faceRetainedImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailedRedirectUrl")
    private String failedRedirectUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardBackImageUrl")
    private String idCardBackImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardFrontImageUrl")
    private String idCardFrontImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdCardNumber")
    private String idCardNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassedRedirectUrl")
    private String passedRedirectUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIp")
    private String userIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPhoneNumber")
    private String userPhoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserRegistTime")
    private Long userRegistTime;

    private DescribeVerifyTokenRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.callbackSeed = builder.callbackSeed;
        this.callbackUrl = builder.callbackUrl;
        this.faceRetainedImageUrl = builder.faceRetainedImageUrl;
        this.failedRedirectUrl = builder.failedRedirectUrl;
        this.idCardBackImageUrl = builder.idCardBackImageUrl;
        this.idCardFrontImageUrl = builder.idCardFrontImageUrl;
        this.idCardNumber = builder.idCardNumber;
        this.name = builder.name;
        this.passedRedirectUrl = builder.passedRedirectUrl;
        this.userId = builder.userId;
        this.userIp = builder.userIp;
        this.userPhoneNumber = builder.userPhoneNumber;
        this.userRegistTime = builder.userRegistTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return callbackSeed
     */
    public String getCallbackSeed() {
        return this.callbackSeed;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return faceRetainedImageUrl
     */
    public String getFaceRetainedImageUrl() {
        return this.faceRetainedImageUrl;
    }

    /**
     * @return failedRedirectUrl
     */
    public String getFailedRedirectUrl() {
        return this.failedRedirectUrl;
    }

    /**
     * @return idCardBackImageUrl
     */
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    /**
     * @return idCardFrontImageUrl
     */
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    /**
     * @return idCardNumber
     */
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return passedRedirectUrl
     */
    public String getPassedRedirectUrl() {
        return this.passedRedirectUrl;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userIp
     */
    public String getUserIp() {
        return this.userIp;
    }

    /**
     * @return userPhoneNumber
     */
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    /**
     * @return userRegistTime
     */
    public Long getUserRegistTime() {
        return this.userRegistTime;
    }

    public static final class Builder extends Request.Builder<DescribeVerifyTokenRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private String callbackSeed; 
        private String callbackUrl; 
        private String faceRetainedImageUrl; 
        private String failedRedirectUrl; 
        private String idCardBackImageUrl; 
        private String idCardFrontImageUrl; 
        private String idCardNumber; 
        private String name; 
        private String passedRedirectUrl; 
        private String userId; 
        private String userIp; 
        private String userPhoneNumber; 
        private Long userRegistTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyTokenRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.callbackSeed = request.callbackSeed;
            this.callbackUrl = request.callbackUrl;
            this.faceRetainedImageUrl = request.faceRetainedImageUrl;
            this.failedRedirectUrl = request.failedRedirectUrl;
            this.idCardBackImageUrl = request.idCardBackImageUrl;
            this.idCardFrontImageUrl = request.idCardFrontImageUrl;
            this.idCardNumber = request.idCardNumber;
            this.name = request.name;
            this.passedRedirectUrl = request.passedRedirectUrl;
            this.userId = request.userId;
            this.userIp = request.userIp;
            this.userPhoneNumber = request.userPhoneNumber;
            this.userRegistTime = request.userRegistTime;
        } 

        /**
         * <p>Verification ID. A unique ID that identifies a verification task, not exceeding 64 characters. For a single verification task, the system supports unlimited submissions until the final verification is passed and the task is completed.</p>
         * <blockquote>
         * <p>Different BizIds are required for different verification tasks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39ecf51e-2f81-4dc5-90ee-ff86125be683</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>Identifier for the business scenario using the real person authentication service. Please refer to <a href="https://help.aliyun.com/document_detail/127885.html">Business Settings</a> and complete the creation in the console first.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RPBasicTest</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>Callback seed.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder callbackSeed(String callbackSeed) {
            this.putQueryParameter("CallbackSeed", callbackSeed);
            this.callbackSeed = callbackSeed;
            return this;
        }

        /**
         * <p>Callback URL.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>HTTP or HTTPS link to the retained portrait photo.</p>
         * 
         * <strong>example:</strong>
         * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
         */
        public Builder faceRetainedImageUrl(String faceRetainedImageUrl) {
            this.putQueryParameter("FaceRetainedImageUrl", faceRetainedImageUrl);
            this.faceRetainedImageUrl = faceRetainedImageUrl;
            return this;
        }

        /**
         * <p>Redirect URL for failed verification.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder failedRedirectUrl(String failedRedirectUrl) {
            this.putQueryParameter("FailedRedirectUrl", failedRedirectUrl);
            this.failedRedirectUrl = failedRedirectUrl;
            return this;
        }

        /**
         * <p>HTTP or HTTPS link to the national emblem side of the ID card image.</p>
         * 
         * <strong>example:</strong>
         * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
         */
        public Builder idCardBackImageUrl(String idCardBackImageUrl) {
            this.putQueryParameter("IdCardBackImageUrl", idCardBackImageUrl);
            this.idCardBackImageUrl = idCardBackImageUrl;
            return this;
        }

        /**
         * <p>HTTP or HTTPS link to the portrait side of the ID card image.</p>
         * 
         * <strong>example:</strong>
         * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
         */
        public Builder idCardFrontImageUrl(String idCardFrontImageUrl) {
            this.putQueryParameter("IdCardFrontImageUrl", idCardFrontImageUrl);
            this.idCardFrontImageUrl = idCardFrontImageUrl;
            return this;
        }

        /**
         * <p>ID card number.</p>
         * 
         * <strong>example:</strong>
         * <p>330100xxxxxxxxxxxx</p>
         */
        public Builder idCardNumber(String idCardNumber) {
            this.putQueryParameter("IdCardNumber", idCardNumber);
            this.idCardNumber = idCardNumber;
            return this;
        }

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Redirect URL upon successful verification.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder passedRedirectUrl(String passedRedirectUrl) {
            this.putQueryParameter("PassedRedirectUrl", passedRedirectUrl);
            this.passedRedirectUrl = passedRedirectUrl;
            return this;
        }

        /**
         * <p>ID of the end user, such as the account ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>user111</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>User IP.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.<em><strong>.</strong></em></p>
         */
        public Builder userIp(String userIp) {
            this.putQueryParameter("UserIp", userIp);
            this.userIp = userIp;
            return this;
        }

        /**
         * <p>User phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>187********</p>
         */
        public Builder userPhoneNumber(String userPhoneNumber) {
            this.putQueryParameter("UserPhoneNumber", userPhoneNumber);
            this.userPhoneNumber = userPhoneNumber;
            return this;
        }

        /**
         * <p>User registration time. Expressed in timestamp format, unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1577808000000</p>
         */
        public Builder userRegistTime(Long userRegistTime) {
            this.putQueryParameter("UserRegistTime", userRegistTime);
            this.userRegistTime = userRegistTime;
            return this;
        }

        @Override
        public DescribeVerifyTokenRequest build() {
            return new DescribeVerifyTokenRequest(this);
        } 

    } 

}
