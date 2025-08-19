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
         * <p>ID number:</p>
         * <ul>
         * <li>When <code>paramType</code> is <code>normal</code>: Enter the plain text of the ID number.</li>
         * <li>When <code>paramType</code> is <code>md5</code>:
         * The first 6 digits (plain text) + date of birth (encrypted) + last 4 digits (plain text).</li>
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
         * <p>Parameter type:</p>
         * <ul>
         * <li>normal: Unencrypted.</li>
         * <li>md5: MD5 encrypted.</li>
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
         * <p>Name.</p>
         * <ul>
         * <li>When <code>paramType</code> = <code>normal</code>: Enter the plain text of the name.</li>
         * <li>When <code>paramType</code> = <code>md5</code>: The first character of the name MD5 encrypted (32 lowercase MD5) + the rest of the name in plain text.</li>
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
         * <p>End date of ID validity, format: YYYYMMDD</p>
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
         * <p>Start date of ID validity, format: YYYYMMDD</p>
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
