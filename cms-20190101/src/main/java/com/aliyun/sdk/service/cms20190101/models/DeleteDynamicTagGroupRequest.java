// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDynamicTagGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteDynamicTagGroupRequest</p>
 */
public class DeleteDynamicTagGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicTagRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the tag rule.</p>
         * <p>For information about how to obtain the ID of a tag rule, see <a href="https://help.aliyun.com/document_detail/150126.html">DescribeDynamicTagRuleList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6b882d9a-5117-42e2-9d0c-4749a0c6****</p>
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
