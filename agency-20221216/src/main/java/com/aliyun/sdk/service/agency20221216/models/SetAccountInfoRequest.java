// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>SetAccountInfoRequest</p>
 */
public class SetAccountInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountNickname")
    private String accountNickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerBd")
    private String customerBd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long uid;

    private SetAccountInfoRequest(Builder builder) {
        super(builder);
        this.accountNickname = builder.accountNickname;
        this.customerBd = builder.customerBd;
        this.remark = builder.remark;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNickname
     */
    public String getAccountNickname() {
        return this.accountNickname;
    }

    /**
     * @return customerBd
     */
    public String getCustomerBd() {
        return this.customerBd;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<SetAccountInfoRequest, Builder> {
        private String accountNickname; 
        private String customerBd; 
        private String remark; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(SetAccountInfoRequest request) {
            super(request);
            this.accountNickname = request.accountNickname;
            this.customerBd = request.customerBd;
            this.remark = request.remark;
            this.uid = request.uid;
        } 

        /**
         * Result Code:
         * <p>
         * *   200 OK
         * *   1109 System error
         * *   3030 Sub Account Nickname exceeds maximum length,  maximum length 150 bytes.
         * *   3031 Remark exceeds maximum length,  maximum length 3000 bytes.
         */
        public Builder accountNickname(String accountNickname) {
            this.putQueryParameter("AccountNickname", accountNickname);
            this.accountNickname = accountNickname;
            return this;
        }

        /**
         * Customer manager（limited 50 character）
         */
        public Builder customerBd(String customerBd) {
            this.putQueryParameter("CustomerBd", customerBd);
            this.customerBd = customerBd;
            return this;
        }

        /**
         * success
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Request ID, Alibaba Cloud will track errors with this.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public SetAccountInfoRequest build() {
            return new SetAccountInfoRequest(this);
        } 

    } 

}
