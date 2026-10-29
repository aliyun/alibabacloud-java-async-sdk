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
 * {@link SdnsDeleteRuleCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>SdnsDeleteRuleCategoryResponseBody</p>
 */
public class SdnsDeleteRuleCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SdnsDeleteRuleCategoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdnsDeleteRuleCategoryResponseBody create() {
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

        private Builder(SdnsDeleteRuleCategoryResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID, which is used to troubleshoot API call issues. This is not the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SdnsDeleteRuleCategoryResponseBody build() {
            return new SdnsDeleteRuleCategoryResponseBody(this);
        } 

    } 

}
