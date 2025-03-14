// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link CreateAliPayUrlResult} extends {@link TeaModel}
 *
 * <p>CreateAliPayUrlResult</p>
 */
public class CreateAliPayUrlResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("memberId")
    private String memberId;

    @com.aliyun.core.annotation.NameInMap("zftWithholdSignUrl")
    private String zftWithholdSignUrl;

    private CreateAliPayUrlResult(Builder builder) {
        this.accountId = builder.accountId;
        this.memberId = builder.memberId;
        this.zftWithholdSignUrl = builder.zftWithholdSignUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliPayUrlResult create() {
        return builder().build();
    }

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
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return zftWithholdSignUrl
     */
    public String getZftWithholdSignUrl() {
        return this.zftWithholdSignUrl;
    }

    public static final class Builder {
        private String accountId; 
        private String memberId; 
        private String zftWithholdSignUrl; 

        private Builder() {
        } 

        private Builder(CreateAliPayUrlResult model) {
            this.accountId = model.accountId;
            this.memberId = model.memberId;
            this.zftWithholdSignUrl = model.zftWithholdSignUrl;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * memberId.
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * zftWithholdSignUrl.
         */
        public Builder zftWithholdSignUrl(String zftWithholdSignUrl) {
            this.zftWithholdSignUrl = zftWithholdSignUrl;
            return this;
        }

        public CreateAliPayUrlResult build() {
            return new CreateAliPayUrlResult(this);
        } 

    } 

}
