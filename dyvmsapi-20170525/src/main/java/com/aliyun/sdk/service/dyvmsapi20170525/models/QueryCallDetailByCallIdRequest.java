// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCallDetailByCallIdRequest} extends {@link RequestModel}
 *
 * <p>QueryCallDetailByCallIdRequest</p>
 */
public class QueryCallDetailByCallIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long prodId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long queryDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryCallDetailByCallIdRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.ownerId = builder.ownerId;
        this.prodId = builder.prodId;
        this.queryDate = builder.queryDate;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallDetailByCallIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodId
     */
    public Long getProdId() {
        return this.prodId;
    }

    /**
     * @return queryDate
     */
    public Long getQueryDate() {
        return this.queryDate;
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

    public static final class Builder extends Request.Builder<QueryCallDetailByCallIdRequest, Builder> {
        private String callId; 
        private Long ownerId; 
        private Long prodId; 
        private Long queryDate; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCallDetailByCallIdRequest request) {
            super(request);
            this.callId = request.callId;
            this.ownerId = request.ownerId;
            this.prodId = request.prodId;
            this.queryDate = request.queryDate;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The unique ID of the call.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The CallId parameter is included in the response parameters of the outbound call operation that you call to initiate a call.</p>
         * </li>
         * <li><p>The date when the call specified by CallId is started must be the same as the date specified by QueryDate.</p>
         * </li>
         * <li><p>The value of CallId must match the value of ProdId.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>116014888060^10281631****</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
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
         * <p>The service ID. Valid values:</p>
         * <ul>
         * <li><strong>11000000300006</strong>: voice notification. You can call the <a href="https://help.aliyun.com/document_detail/393517.html">SingleCallByVoice</a> operation to send a voice notification of the voice notification file type to the specified number.</li>
         * <li><strong>11010000138001</strong>: voice verification code. You can call the <a href="https://help.aliyun.com/document_detail/393519.html">SingleCallByTts</a> operation to send a voice verification code or a text-to-speech (TTS) voice notification to the specified number.</li>
         * <li><strong>11000000300005</strong>: IVR. You can call the <a href="https://help.aliyun.com/document_detail/393521.html">IvrCall</a> operation to initiate an interactive voice call to the specified number.</li>
         * <li><strong>11000000300009</strong>: Session Initiation Protocol (SIP) call.</li>
         * <li><strong>11030000180001</strong>: intelligent outbound call.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11000000300006</p>
         */
        public Builder prodId(Long prodId) {
            this.putQueryParameter("ProdId", prodId);
            this.prodId = prodId;
            return this;
        }

        /**
         * <p>The time at which call details are queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p>The system queries the call records that are generated within 24 hours after the specified point in time. For example, if you specify the time 20:00:01 on November 21, 2022, the system queries the call records that are generated for the specified call ID from 20:00:01 on November 21, 2022, to 20:00:01 on November 22, 2022.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1671552000000</p>
         */
        public Builder queryDate(Long queryDate) {
            this.putQueryParameter("QueryDate", queryDate);
            this.queryDate = queryDate;
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

        @Override
        public QueryCallDetailByCallIdRequest build() {
            return new QueryCallDetailByCallIdRequest(this);
        } 

    } 

}
