// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRdsAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteRdsAccountRequest</p>
 */
public class DeleteRdsAccountRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    private DeleteRdsAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dbInstanceId = builder.dbInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRdsAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteRdsAccountRequest, Builder> {
        private String accountName; 
        private String dbInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRdsAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dbInstanceId = request.dbInstanceId;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putBodyParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        @Override
        public DeleteRdsAccountRequest build() {
            return new DeleteRdsAccountRequest(this);
        } 

    } 

}
