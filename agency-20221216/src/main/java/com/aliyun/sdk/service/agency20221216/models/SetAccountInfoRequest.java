// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>SetAccountInfoRequest</p>
 */
public class SetAccountInfoRequest extends Request {
    @Query
    @NameInMap("AccountNickname")
    private String accountNickname;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private SetAccountInfoRequest(Builder builder) {
        super(builder);
        this.accountNickname = builder.accountNickname;
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
        private String remark; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(SetAccountInfoRequest request) {
            super(request);
            this.accountNickname = request.accountNickname;
            this.remark = request.remark;
            this.uid = request.uid;
        } 

        /**
         * AccountNickname.
         */
        public Builder accountNickname(String accountNickname) {
            this.putQueryParameter("AccountNickname", accountNickname);
            this.accountNickname = accountNickname;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Uid.
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
