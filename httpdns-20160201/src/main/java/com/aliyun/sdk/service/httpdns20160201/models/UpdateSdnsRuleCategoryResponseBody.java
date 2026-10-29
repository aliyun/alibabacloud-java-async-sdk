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
 * {@link UpdateSdnsRuleCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSdnsRuleCategoryResponseBody</p>
 */
public class UpdateSdnsRuleCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateSdnsRuleCategoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSdnsRuleCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateSdnsRuleCategoryResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request. You can use the ID to troubleshoot call issues. This ID is not the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSdnsRuleCategoryResponseBody build() {
            return new UpdateSdnsRuleCategoryResponseBody(this);
        } 

    } 

}
