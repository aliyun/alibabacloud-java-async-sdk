// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetUserGroupInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserGroupInfoRequest</p>
 */
public class GetUserGroupInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyword;

    private GetUserGroupInfoRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGroupInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    public static final class Builder extends Request.Builder<GetUserGroupInfoRequest, Builder> {
        private String keyword; 

        private Builder() {
            super();
        } 

        private Builder(GetUserGroupInfoRequest request) {
            super(request);
            this.keyword = request.keyword;
        } 

        /**
         * <p>Keyword of the user group name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        @Override
        public GetUserGroupInfoRequest build() {
            return new GetUserGroupInfoRequest(this);
        } 

    } 

}
