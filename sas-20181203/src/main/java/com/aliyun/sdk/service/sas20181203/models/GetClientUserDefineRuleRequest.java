// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClientUserDefineRuleRequest} extends {@link RequestModel}
 *
 * <p>GetClientUserDefineRuleRequest</p>
 */
public class GetClientUserDefineRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private GetClientUserDefineRuleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientUserDefineRuleRequest create() {
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

    public static final class Builder extends Request.Builder<GetClientUserDefineRuleRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetClientUserDefineRuleRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The ID of the custom defense rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200****</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetClientUserDefineRuleRequest build() {
            return new GetClientUserDefineRuleRequest(this);
        } 

    } 

}
