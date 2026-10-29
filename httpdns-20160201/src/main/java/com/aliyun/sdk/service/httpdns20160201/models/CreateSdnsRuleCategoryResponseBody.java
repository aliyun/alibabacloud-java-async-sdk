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
 * {@link CreateSdnsRuleCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSdnsRuleCategoryResponseBody</p>
 */
public class CreateSdnsRuleCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSdnsRuleCategoryResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSdnsRuleCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateSdnsRuleCategoryResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the policy created and saved in this request. This ID is consistent with the ID in the list and details, and is used for querying, updating, enabling, disabling, and deleting the policy. The ID is saved as a string to avoid precision loss of large integers.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012345678</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the request. This ID is used to troubleshoot call issues and is not the policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSdnsRuleCategoryResponseBody build() {
            return new CreateSdnsRuleCategoryResponseBody(this);
        } 

    } 

}
