// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>GetFileProtectRuleRequest</p>
 */
public class GetFileProtectRuleRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    private GetFileProtectRuleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetFileProtectRuleRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetFileProtectRuleRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the rule.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetFileProtectRuleRequest build() {
            return new GetFileProtectRuleRequest(this);
        } 

    } 

}
