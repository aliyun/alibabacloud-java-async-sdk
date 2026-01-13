// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link GetAccountConfigInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountConfigInfoResponseBody</p>
 */
public class GetAccountConfigInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountStatus")
    private String accountStatus;

    @com.aliyun.core.annotation.NameInMap("availableTime")
    private String availableTime;

    @com.aliyun.core.annotation.NameInMap("billQps")
    private String billQps;

    @com.aliyun.core.annotation.NameInMap("ladderType")
    private String ladderType;

    @com.aliyun.core.annotation.NameInMap("mainAccountId")
    private String mainAccountId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAccountConfigInfoResponseBody(Builder builder) {
        this.accountStatus = builder.accountStatus;
        this.availableTime = builder.availableTime;
        this.billQps = builder.billQps;
        this.ladderType = builder.ladderType;
        this.mainAccountId = builder.mainAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountConfigInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountStatus
     */
    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * @return availableTime
     */
    public String getAvailableTime() {
        return this.availableTime;
    }

    /**
     * @return billQps
     */
    public String getBillQps() {
        return this.billQps;
    }

    /**
     * @return ladderType
     */
    public String getLadderType() {
        return this.ladderType;
    }

    /**
     * @return mainAccountId
     */
    public String getMainAccountId() {
        return this.mainAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountStatus; 
        private String availableTime; 
        private String billQps; 
        private String ladderType; 
        private String mainAccountId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccountConfigInfoResponseBody model) {
            this.accountStatus = model.accountStatus;
            this.availableTime = model.availableTime;
            this.billQps = model.billQps;
            this.ladderType = model.ladderType;
            this.mainAccountId = model.mainAccountId;
            this.requestId = model.requestId;
        } 

        /**
         * accountStatus.
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * availableTime.
         */
        public Builder availableTime(String availableTime) {
            this.availableTime = availableTime;
            return this;
        }

        /**
         * billQps.
         */
        public Builder billQps(String billQps) {
            this.billQps = billQps;
            return this;
        }

        /**
         * ladderType.
         */
        public Builder ladderType(String ladderType) {
            this.ladderType = ladderType;
            return this;
        }

        /**
         * mainAccountId.
         */
        public Builder mainAccountId(String mainAccountId) {
            this.mainAccountId = mainAccountId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6788a2c2-157d4ebe-ad979cd4f296</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountConfigInfoResponseBody build() {
            return new GetAccountConfigInfoResponseBody(this);
        } 

    } 

}
