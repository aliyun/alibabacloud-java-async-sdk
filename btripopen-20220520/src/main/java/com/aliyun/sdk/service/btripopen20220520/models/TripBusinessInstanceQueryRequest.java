// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TripBusinessInstanceQueryRequest} extends {@link RequestModel}
 *
 * <p>TripBusinessInstanceQueryRequest</p>
 */
public class TripBusinessInstanceQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("business_instance_id")
    private String businessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("third_business_id")
    private String thirdBusinessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private TripBusinessInstanceQueryRequest(Builder builder) {
        super(builder);
        this.businessInstanceId = builder.businessInstanceId;
        this.thirdBusinessId = builder.thirdBusinessId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TripBusinessInstanceQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessInstanceId
     */
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

    /**
     * @return thirdBusinessId
     */
    public String getThirdBusinessId() {
        return this.thirdBusinessId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<TripBusinessInstanceQueryRequest, Builder> {
        private String businessInstanceId; 
        private String thirdBusinessId; 
        private String userId; 
        private String userName; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TripBusinessInstanceQueryRequest request) {
            super(request);
            this.businessInstanceId = request.businessInstanceId;
            this.thirdBusinessId = request.thirdBusinessId;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * business_instance_id.
         */
        public Builder businessInstanceId(String businessInstanceId) {
            this.putQueryParameter("business_instance_id", businessInstanceId);
            this.businessInstanceId = businessInstanceId;
            return this;
        }

        /**
         * third_business_id.
         */
        public Builder thirdBusinessId(String thirdBusinessId) {
            this.putQueryParameter("third_business_id", thirdBusinessId);
            this.thirdBusinessId = thirdBusinessId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public TripBusinessInstanceQueryRequest build() {
            return new TripBusinessInstanceQueryRequest(this);
        } 

    } 

}
