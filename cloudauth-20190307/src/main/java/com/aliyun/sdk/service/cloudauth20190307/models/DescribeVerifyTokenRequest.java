// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CallbackSeed.
         */
        public Builder callbackSeed(String callbackSeed) {
            this.putQueryParameter("CallbackSeed", callbackSeed);
            this.callbackSeed = callbackSeed;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * FaceRetainedImageUrl.
         */
        public Builder faceRetainedImageUrl(String faceRetainedImageUrl) {
            this.putQueryParameter("FaceRetainedImageUrl", faceRetainedImageUrl);
            this.faceRetainedImageUrl = faceRetainedImageUrl;
            return this;
        }

        /**
         * FailedRedirectUrl.
         */
        public Builder failedRedirectUrl(String failedRedirectUrl) {
            this.putQueryParameter("FailedRedirectUrl", failedRedirectUrl);
            this.failedRedirectUrl = failedRedirectUrl;
            return this;
        }

        /**
         * IdCardBackImageUrl.
         */
        public Builder idCardBackImageUrl(String idCardBackImageUrl) {
            this.putQueryParameter("IdCardBackImageUrl", idCardBackImageUrl);
            this.idCardBackImageUrl = idCardBackImageUrl;
            return this;
        }

        /**
         * IdCardFrontImageUrl.
         */
        public Builder idCardFrontImageUrl(String idCardFrontImageUrl) {
            this.putQueryParameter("IdCardFrontImageUrl", idCardFrontImageUrl);
            this.idCardFrontImageUrl = idCardFrontImageUrl;
            return this;
        }

        /**
         * IdCardNumber.
         */
        public Builder idCardNumber(String idCardNumber) {
            this.putQueryParameter("IdCardNumber", idCardNumber);
            this.idCardNumber = idCardNumber;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PassedRedirectUrl.
         */
        public Builder passedRedirectUrl(String passedRedirectUrl) {
            this.putQueryParameter("PassedRedirectUrl", passedRedirectUrl);
            this.passedRedirectUrl = passedRedirectUrl;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserIp.
         */
        public Builder userIp(String userIp) {
            this.putQueryParameter("UserIp", userIp);
            this.userIp = userIp;
            return this;
        }

        /**
         * UserPhoneNumber.
         */
        public Builder userPhoneNumber(String userPhoneNumber) {
            this.putQueryParameter("UserPhoneNumber", userPhoneNumber);
            this.userPhoneNumber = userPhoneNumber;
            return this;
        }

        /**
         * UserRegistTime.
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
