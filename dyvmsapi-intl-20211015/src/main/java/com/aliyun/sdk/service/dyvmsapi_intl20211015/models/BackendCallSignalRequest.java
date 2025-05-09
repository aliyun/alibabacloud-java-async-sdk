// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi_intl20211015.models;

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
 * {@link BackendCallSignalRequest} extends {@link RequestModel}
 *
 * <p>BackendCallSignalRequest</p>
 */
public class BackendCallSignalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerIdNumber")
    private String callerIdNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryId")
    private String countryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTimes")
    private Long playTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private Long speed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsCode")
    private String ttsCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TtsParam")
    private String ttsParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Volume")
    private Long volume;

    private BackendCallSignalRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callerIdNumber = builder.callerIdNumber;
        this.countryId = builder.countryId;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.playTimes = builder.playTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.speed = builder.speed;
        this.ttsCode = builder.ttsCode;
        this.ttsParam = builder.ttsParam;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackendCallSignalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerIdNumber
     */
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    /**
     * @return countryId
     */
    public String getCountryId() {
        return this.countryId;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playTimes
     */
    public Long getPlayTimes() {
        return this.playTimes;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return speed
     */
    public Long getSpeed() {
        return this.speed;
    }

    /**
     * @return ttsCode
     */
    public String getTtsCode() {
        return this.ttsCode;
    }

    /**
     * @return ttsParam
     */
    public String getTtsParam() {
        return this.ttsParam;
    }

    /**
     * @return volume
     */
    public Long getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<BackendCallSignalRequest, Builder> {
        private String calledNumber; 
        private String callerIdNumber; 
        private String countryId; 
        private String outId; 
        private Long ownerId; 
        private Long playTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long speed; 
        private String ttsCode; 
        private String ttsParam; 
        private Long volume; 

        private Builder() {
            super();
        } 

        private Builder(BackendCallSignalRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callerIdNumber = request.callerIdNumber;
            this.countryId = request.countryId;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.playTimes = request.playTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.speed = request.speed;
            this.ttsCode = request.ttsCode;
            this.ttsParam = request.ttsParam;
            this.volume = request.volume;
        } 

        /**
         * <p>The phone number that receives the voice notification.</p>
         * <p>You must add the country code to the beginning of the phone number. Example: 85200****00.</p>
         * 
         * <strong>example:</strong>
         * <p>852****0000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The calling number.</p>
         * <p>If you do not specify this parameter, the system uses a local random number as the display number. If you use a dedicated number for outbound calls, you must specify the purchased number. You can specify only one number. You can log on to the VMS console and choose Number Management to view the purchased phone numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>852****0000</p>
         */
        public Builder callerIdNumber(String callerIdNumber) {
            this.putQueryParameter("CallerIdNumber", callerIdNumber);
            this.callerIdNumber = callerIdNumber;
            return this;
        }

        /**
         * <p>The ISO2 country code.</p>
         * 
         * <strong>example:</strong>
         * <p>HK</p>
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * <p>The ID reserved for the caller. This ID is returned to the caller in a receipt message.</p>
         * <p>The value must be of the STRING type and 1 to 15 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>22522****</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of times the voice notification is played back in a call. Valid values: 1 to 3. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder playTimes(Long playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The playback speed. Valid values: -500 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder speed(Long speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * <p>The ID of the approved voice verification code template.</p>
         * <p>You can log on to the VMS console and choose Voice Call Template to view the template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder ttsCode(String ttsCode) {
            this.putQueryParameter("TtsCode", ttsCode);
            this.ttsCode = ttsCode;
            return this;
        }

        /**
         * <p>The variables in the template, in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;1234&quot;}</p>
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * <p>The playback volume of the voice notification. Valid values: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder volume(Long volume) {
            this.putQueryParameter("Volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public BackendCallSignalRequest build() {
            return new BackendCallSignalRequest(this);
        } 

    } 

}
