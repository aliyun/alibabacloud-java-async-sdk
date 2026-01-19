// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateResourceServerScopeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceServerScopeResponseBody</p>
 */
public class CreateResourceServerScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeId")
    private String resourceServerScopeId;

    private CreateResourceServerScopeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceServerScopeId = builder.resourceServerScopeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceServerScopeResponseBody create() {
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

    /**
     * @return resourceServerScopeId
     */
    public String getResourceServerScopeId() {
        return this.resourceServerScopeId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceServerScopeId; 

        private Builder() {
        } 

        private Builder(CreateResourceServerScopeResponseBody model) {
            this.requestId = model.requestId;
            this.resourceServerScopeId = model.resourceServerScopeId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceServerScopeId.
         */
        public Builder resourceServerScopeId(String resourceServerScopeId) {
            this.resourceServerScopeId = resourceServerScopeId;
            return this;
        }

        public CreateResourceServerScopeResponseBody build() {
            return new CreateResourceServerScopeResponseBody(this);
        } 

    } 

}
