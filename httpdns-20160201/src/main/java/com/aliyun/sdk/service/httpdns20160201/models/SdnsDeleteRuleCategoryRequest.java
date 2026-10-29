// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

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
 * {@link SdnsDeleteRuleCategoryRequest} extends {@link RequestModel}
 *
 * <p>SdnsDeleteRuleCategoryRequest</p>
 */
public class SdnsDeleteRuleCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private SdnsDeleteRuleCategoryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsDeleteRuleCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<SdnsDeleteRuleCategoryRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(SdnsDeleteRuleCategoryRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The policy ID of the current account. This parameter is required. You can obtain the ID from the Id field in the response of CreateSdnsRuleCategory or the list returned by SdnsListRuleCategories. Use a decimal string to prevent precision loss of large integers.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012345678</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public SdnsDeleteRuleCategoryRequest build() {
            return new SdnsDeleteRuleCategoryRequest(this);
        } 

    } 

}
