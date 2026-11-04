// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link CreateAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessRuleResponseBody</p>
 */
public class CreateAccessRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessRuleId")
    private String accessRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccessRuleResponseBody(Builder builder) {
        this.accessRuleId = builder.accessRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessRuleId
     */
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAccessRuleResponseBody model) {
            this.accessRuleId = model.accessRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the access group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
         */
        public Builder accessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessRuleResponseBody build() {
            return new CreateAccessRuleResponseBody(this);
        } 

    } 

}
