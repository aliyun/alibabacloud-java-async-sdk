// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetAccountRequest} extends {@link RequestModel}
 *
 * <p>GetAccountRequest</p>
 */
public class GetAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeTags")
    private Boolean includeTags;

    private GetAccountRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.includeTags = builder.includeTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountRequest create() {
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
     * @return includeTags
     */
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public static final class Builder extends Request.Builder<GetAccountRequest, Builder> {
        private String accountId; 
        private Boolean includeTags; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.includeTags = request.includeTags;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>181761095690****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>Specifies whether to return the information of tags. Valid values:</p>
         * <ul>
         * <li>false (default value)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeTags(Boolean includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        @Override
        public GetAccountRequest build() {
            return new GetAccountRequest(this);
        } 

    } 

}
