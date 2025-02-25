// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>RemoveInstanceAccountRequest</p>
 */
public class RemoveInstanceAccountRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private RemoveInstanceAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInstanceAccountRequest create() {
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
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<RemoveInstanceAccountRequest, Builder> {
        private String accountName; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInstanceAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The name of the member account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The ID of the DRDS instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public RemoveInstanceAccountRequest build() {
            return new RemoveInstanceAccountRequest(this);
        } 

    } 

}
