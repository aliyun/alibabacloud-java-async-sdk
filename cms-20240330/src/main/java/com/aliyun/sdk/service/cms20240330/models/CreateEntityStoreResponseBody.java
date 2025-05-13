// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateEntityStoreResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEntityStoreResponseBody</p>
 */
public class CreateEntityStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    private CreateEntityStoreResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEntityStoreResponseBody create() {
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
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private String requestId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(CreateEntityStoreResponseBody model) {
            this.requestId = model.requestId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public CreateEntityStoreResponseBody build() {
            return new CreateEntityStoreResponseBody(this);
        } 

    } 

}
