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
 * {@link Id2MetaPeriodVerifyRequest} extends {@link RequestModel}
 *
 * <p>Id2MetaPeriodVerifyRequest</p>
 */
public class Id2MetaPeriodVerifyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifyNum")
    private String identifyNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityEndDate")
    private String validityEndDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityStartDate")
    private String validityStartDate;

    private Id2MetaPeriodVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identifyNum = builder.identifyNum;
        this.paramType = builder.paramType;
        this.userName = builder.userName;
        this.validityEndDate = builder.validityEndDate;
        this.validityStartDate = builder.validityStartDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Id2MetaPeriodVerifyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return identifyNum
     */
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return validityEndDate
     */
    public String getValidityEndDate() {
        return this.validityEndDate;
    }

    /**
     * @return validityStartDate
     */
    public String getValidityStartDate() {
        return this.validityStartDate;
    }

    public static final class Builder extends Request.Builder<Id2MetaPeriodVerifyRequest, Builder> {
        private String regionId; 
        private String identifyNum; 
        private String paramType; 
        private String userName; 
        private String validityEndDate; 
        private String validityStartDate; 

        private Builder() {
            super();
        } 

        private Builder(Id2MetaPeriodVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identifyNum = request.identifyNum;
            this.paramType = request.paramType;
            this.userName = request.userName;
            this.validityEndDate = request.validityEndDate;
            this.validityStartDate = request.validityStartDate;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID card number.</p>
         * <ul>
         * <li>If paramType is set to normal, enter the ID card number in plaintext.</li>
         * <li>If paramType is set to md5, the value is in the following format: first 6 digits of the ID card number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID card number (plaintext).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4****************1</p>
         */
        public Builder identifyNum(String identifyNum) {
            this.putBodyParameter("IdentifyNum", identifyNum);
            this.identifyNum = identifyNum;
            return this;
        }

        /**
         * <p>The parameter type. Valid values:</p>
         * <ul>
         * <li>normal: not encrypted.</li>
         * <li>md5: MD5-encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder paramType(String paramType) {
            this.putBodyParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>The name.</p>
         * <ul>
         * <li>paramType = normal: enter the name in plaintext.</li>
         * <li>paramType = md5: the first character of the name is MD5-encrypted (32-bit lowercase MD5) + the remaining characters of the name in plaintext.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>张*</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The expiration date of the ID card validity period. Format: YYYYMMDD.</p>
         * 
         * <strong>example:</strong>
         * <p>20301001</p>
         */
        public Builder validityEndDate(String validityEndDate) {
            this.putBodyParameter("ValidityEndDate", validityEndDate);
            this.validityEndDate = validityEndDate;
            return this;
        }

        /**
         * <p>The start date of the ID card validity period. Format: YYYYMMDD.</p>
         * 
         * <strong>example:</strong>
         * <p>20201001</p>
         */
        public Builder validityStartDate(String validityStartDate) {
            this.putBodyParameter("ValidityStartDate", validityStartDate);
            this.validityStartDate = validityStartDate;
            return this;
        }

        @Override
        public Id2MetaPeriodVerifyRequest build() {
            return new Id2MetaPeriodVerifyRequest(this);
        } 

    } 

}
