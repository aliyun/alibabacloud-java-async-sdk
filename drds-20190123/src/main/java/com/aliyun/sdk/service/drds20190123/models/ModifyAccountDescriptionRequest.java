// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountDescriptionRequest</p>
 */
public class ModifyAccountDescriptionRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private ModifyAccountDescriptionRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.description = builder.description;
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountDescriptionRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyAccountDescriptionRequest, Builder> {
        private String accountName; 
        private String description; 
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountDescriptionRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.description = request.description;
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
         * The description of the account.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the ApsaraDB RDS for PostgreSQL instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public ModifyAccountDescriptionRequest build() {
            return new ModifyAccountDescriptionRequest(this);
        } 

    } 

}
