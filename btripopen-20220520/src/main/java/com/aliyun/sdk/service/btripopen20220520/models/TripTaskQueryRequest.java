// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TripTaskQueryRequest} extends {@link RequestModel}
 *
 * <p>TripTaskQueryRequest</p>
 */
public class TripTaskQueryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TripTaskQueryRequest(Builder builder) {
        super(builder);
        this.businessInstanceId = builder.businessInstanceId;
        this.thirdBusinessId = builder.thirdBusinessId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TripTaskQueryRequest create() {
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
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TripTaskQueryRequest, Builder> {
        private String businessInstanceId; 
        private String thirdBusinessId; 
        private String userId; 
        private String userName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TripTaskQueryRequest request) {
            super(request);
            this.businessInstanceId = request.businessInstanceId;
            this.thirdBusinessId = request.thirdBusinessId;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
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
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TripTaskQueryRequest build() {
            return new TripTaskQueryRequest(this);
        } 

    } 

}
