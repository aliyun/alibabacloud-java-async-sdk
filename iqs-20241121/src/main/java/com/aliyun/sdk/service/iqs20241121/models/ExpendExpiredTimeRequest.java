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
 * {@link ExpendExpiredTimeRequest} extends {@link RequestModel}
 *
 * <p>ExpendExpiredTimeRequest</p>
 */
public class ExpendExpiredTimeRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("testStartTime")
    private String testStartTime;

    private ExpendExpiredTimeRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.testStartTime = builder.testStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpendExpiredTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return testStartTime
     */
    public String getTestStartTime() {
        return this.testStartTime;
    }

    public static final class Builder extends Request.Builder<ExpendExpiredTimeRequest, Builder> {
        private String accountId; 
        private String testStartTime; 

        private Builder() {
            super();
        } 

        private Builder(ExpendExpiredTimeRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.testStartTime = request.testStartTime;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * testStartTime.
         */
        public Builder testStartTime(String testStartTime) {
            this.testStartTime = testStartTime;
            return this;
        }

        @Override
        public ExpendExpiredTimeRequest build() {
            return new ExpendExpiredTimeRequest(this);
        } 

    } 

}
