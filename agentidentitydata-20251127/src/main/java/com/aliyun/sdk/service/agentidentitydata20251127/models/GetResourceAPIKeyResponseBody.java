// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link GetResourceAPIKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceAPIKeyResponseBody</p>
 */
public class GetResourceAPIKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APIKey")
    private String APIKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceAPIKeyResponseBody(Builder builder) {
        this.APIKey = builder.APIKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceAPIKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return APIKey
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String APIKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceAPIKeyResponseBody model) {
            this.APIKey = model.APIKey;
            this.requestId = model.requestId;
        } 

        /**
         * APIKey.
         */
        public Builder APIKey(String APIKey) {
            this.APIKey = APIKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceAPIKeyResponseBody build() {
            return new GetResourceAPIKeyResponseBody(this);
        } 

    } 

}
