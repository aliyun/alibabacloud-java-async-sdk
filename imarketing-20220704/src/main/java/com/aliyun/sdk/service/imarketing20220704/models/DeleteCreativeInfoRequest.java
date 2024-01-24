// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCreativeInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteCreativeInfoRequest</p>
 */
public class DeleteCreativeInfoRequest extends Request {
    @Query
    @NameInMap("AccountNo")
    private String accountNo;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("MainId")
    private Long mainId;

    @Query
    @NameInMap("UpdateUser")
    private String updateUser;

    private DeleteCreativeInfoRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.bizId = builder.bizId;
        this.id = builder.id;
        this.mainId = builder.mainId;
        this.updateUser = builder.updateUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCreativeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mainId
     */
    public Long getMainId() {
        return this.mainId;
    }

    /**
     * @return updateUser
     */
    public String getUpdateUser() {
        return this.updateUser;
    }

    public static final class Builder extends Request.Builder<DeleteCreativeInfoRequest, Builder> {
        private String accountNo; 
        private String bizId; 
        private Long id; 
        private Long mainId; 
        private String updateUser; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCreativeInfoRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.bizId = request.bizId;
            this.id = request.id;
            this.mainId = request.mainId;
            this.updateUser = request.updateUser;
        } 

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.putQueryParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MainId.
         */
        public Builder mainId(Long mainId) {
            this.putQueryParameter("MainId", mainId);
            this.mainId = mainId;
            return this;
        }

        /**
         * UpdateUser.
         */
        public Builder updateUser(String updateUser) {
            this.putQueryParameter("UpdateUser", updateUser);
            this.updateUser = updateUser;
            return this;
        }

        @Override
        public DeleteCreativeInfoRequest build() {
            return new DeleteCreativeInfoRequest(this);
        } 

    } 

}
