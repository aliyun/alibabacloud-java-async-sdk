// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTaobaoAccountRequest} extends {@link RequestModel}
 *
 * <p>ValidateTaobaoAccountRequest</p>
 */
public class ValidateTaobaoAccountRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizUid")
    @Validation(required = true)
    private String bizUid;

    @Query
    @NameInMap("ExtJson")
    private String extJson;

    @Query
    @NameInMap("MobileNo")
    private String mobileNo;

    @Query
    @NameInMap("TbUserNick")
    private String tbUserNick;

    private ValidateTaobaoAccountRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.extJson = builder.extJson;
        this.mobileNo = builder.mobileNo;
        this.tbUserNick = builder.tbUserNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTaobaoAccountRequest create() {
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
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return mobileNo
     */
    public String getMobileNo() {
        return this.mobileNo;
    }

    /**
     * @return tbUserNick
     */
    public String getTbUserNick() {
        return this.tbUserNick;
    }

    public static final class Builder extends Request.Builder<ValidateTaobaoAccountRequest, Builder> {
        private String bizId; 
        private String bizUid; 
        private String extJson; 
        private String mobileNo; 
        private String tbUserNick; 

        private Builder() {
            super();
        } 

        private Builder(ValidateTaobaoAccountRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.extJson = request.extJson;
            this.mobileNo = request.mobileNo;
            this.tbUserNick = request.tbUserNick;
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
         * BizUid.
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * MobileNo.
         */
        public Builder mobileNo(String mobileNo) {
            this.putQueryParameter("MobileNo", mobileNo);
            this.mobileNo = mobileNo;
            return this;
        }

        /**
         * TbUserNick.
         */
        public Builder tbUserNick(String tbUserNick) {
            this.putQueryParameter("TbUserNick", tbUserNick);
            this.tbUserNick = tbUserNick;
            return this;
        }

        @Override
        public ValidateTaobaoAccountRequest build() {
            return new ValidateTaobaoAccountRequest(this);
        } 

    } 

}
