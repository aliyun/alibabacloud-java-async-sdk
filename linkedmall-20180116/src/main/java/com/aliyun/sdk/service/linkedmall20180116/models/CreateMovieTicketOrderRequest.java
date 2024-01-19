// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMovieTicketOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateMovieTicketOrderRequest</p>
 */
public class CreateMovieTicketOrderRequest extends Request {
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
    @NameInMap("LockSeatAppKey")
    @Validation(required = true)
    private String lockSeatAppKey;

    @Query
    @NameInMap("OutTradeId")
    private String outTradeId;

    private CreateMovieTicketOrderRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.extJson = builder.extJson;
        this.lockSeatAppKey = builder.lockSeatAppKey;
        this.outTradeId = builder.outTradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMovieTicketOrderRequest create() {
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
     * @return lockSeatAppKey
     */
    public String getLockSeatAppKey() {
        return this.lockSeatAppKey;
    }

    /**
     * @return outTradeId
     */
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public static final class Builder extends Request.Builder<CreateMovieTicketOrderRequest, Builder> {
        private String bizId; 
        private String bizUid; 
        private String extJson; 
        private String lockSeatAppKey; 
        private String outTradeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMovieTicketOrderRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.extJson = request.extJson;
            this.lockSeatAppKey = request.lockSeatAppKey;
            this.outTradeId = request.outTradeId;
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
         * LockSeatAppKey.
         */
        public Builder lockSeatAppKey(String lockSeatAppKey) {
            this.putQueryParameter("LockSeatAppKey", lockSeatAppKey);
            this.lockSeatAppKey = lockSeatAppKey;
            return this;
        }

        /**
         * OutTradeId.
         */
        public Builder outTradeId(String outTradeId) {
            this.putQueryParameter("OutTradeId", outTradeId);
            this.outTradeId = outTradeId;
            return this;
        }

        @Override
        public CreateMovieTicketOrderRequest build() {
            return new CreateMovieTicketOrderRequest(this);
        } 

    } 

}
