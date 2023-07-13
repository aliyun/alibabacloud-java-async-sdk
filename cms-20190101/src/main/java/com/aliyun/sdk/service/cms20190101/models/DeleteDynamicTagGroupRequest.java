// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDynamicTagGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDynamicTagGroupRequest</p>
 */
public class DeleteDynamicTagGroupRequest extends Request {
    @Query
    @NameInMap("DynamicTagRuleId")
    @Validation(required = true)
    private String dynamicTagRuleId;

    private DeleteDynamicTagGroupRequest(Builder builder) {
        super(builder);
        this.dynamicTagRuleId = builder.dynamicTagRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDynamicTagGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicTagRuleId
     */
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteDynamicTagGroupRequest, Builder> {
        private String dynamicTagRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDynamicTagGroupRequest request) {
            super(request);
            this.dynamicTagRuleId = request.dynamicTagRuleId;
        } 

        /**
         * The ID of the request.
         */
        public Builder dynamicTagRuleId(String dynamicTagRuleId) {
            this.putQueryParameter("DynamicTagRuleId", dynamicTagRuleId);
            this.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }

        @Override
        public DeleteDynamicTagGroupRequest build() {
            return new DeleteDynamicTagGroupRequest(this);
        } 

    } 

}
