// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.displayName = builder.displayName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupRequest create() {
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String accountId; 
        private String displayName; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.displayName = request.displayName;
            this.name = request.name;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
        } 

    } 

}
