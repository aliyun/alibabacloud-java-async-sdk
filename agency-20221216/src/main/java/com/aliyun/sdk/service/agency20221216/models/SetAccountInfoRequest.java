// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
         * <p>Result Code:</p>
         * <ul>
         * <li>200 OK</li>
         * <li>1109 System error</li>
         * <li>3030 Sub Account Nickname exceeds maximum length,  maximum length 150 bytes.</li>
         * <li>3031 Remark exceeds maximum length,  maximum length 3000 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Message information</p>
         */
        public Builder accountNickname(String accountNickname) {
            this.putQueryParameter("AccountNickname", accountNickname);
            this.accountNickname = accountNickname;
            return this;
        }

        /**
         * <p>Customer manager（limited 50 character）</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder customerBd(String customerBd) {
            this.putQueryParameter("CustomerBd", customerBd);
            this.customerBd = customerBd;
            return this;
        }

        /**
         * <p>success</p>
         * 
         * <strong>example:</strong>
         * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Request ID, Alibaba Cloud will track errors with this.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1133166938931507</p>
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
