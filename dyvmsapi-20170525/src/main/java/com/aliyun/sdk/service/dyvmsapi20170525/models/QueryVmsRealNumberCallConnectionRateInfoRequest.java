// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link QueryVmsRealNumberCallConnectionRateInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryVmsRealNumberCallConnectionRateInfoRequest</p>
 */
public class QueryVmsRealNumberCallConnectionRateInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealNumber")
    private String realNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePeriod")
    private String timePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualNumber")
    private String virtualNumber;

    private QueryVmsRealNumberCallConnectionRateInfoRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.realNumber = builder.realNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.timePeriod = builder.timePeriod;
        this.virtualNumber = builder.virtualNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVmsRealNumberCallConnectionRateInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return realNumber
     */
    public String getRealNumber() {
        return this.realNumber;
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
     * @return timePeriod
     */
    public String getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @return virtualNumber
     */
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

    public static final class Builder extends Request.Builder<QueryVmsRealNumberCallConnectionRateInfoRequest, Builder> {
        private Long ownerId; 
        private String realNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String timePeriod; 
        private String virtualNumber; 

        private Builder() {
            super();
        } 

        private Builder(QueryVmsRealNumberCallConnectionRateInfoRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.realNumber = request.realNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.timePeriod = request.timePeriod;
            this.virtualNumber = request.virtualNumber;
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
         * <p>真实号码</p>
         * 
         * <strong>example:</strong>
         * <p>131***1234</p>
         */
        public Builder realNumber(String realNumber) {
            this.putQueryParameter("RealNumber", realNumber);
            this.realNumber = realNumber;
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
         * <p>时间段</p>
         * 
         * <strong>example:</strong>
         * <p>1764666240123-1764686240567</p>
         */
        public Builder timePeriod(String timePeriod) {
            this.putQueryParameter("TimePeriod", timePeriod);
            this.timePeriod = timePeriod;
            return this;
        }

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>0571***1234</p>
         */
        public Builder virtualNumber(String virtualNumber) {
            this.putQueryParameter("VirtualNumber", virtualNumber);
            this.virtualNumber = virtualNumber;
            return this;
        }

        @Override
        public QueryVmsRealNumberCallConnectionRateInfoRequest build() {
            return new QueryVmsRealNumberCallConnectionRateInfoRequest(this);
        } 

    } 

}
