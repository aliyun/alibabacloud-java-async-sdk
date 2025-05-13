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
 * {@link PutWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>PutWorkspaceResponseBody</p>
 */
public class PutWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    private PutWorkspaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutWorkspaceResponseBody create() {
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

        private Builder(PutWorkspaceResponseBody model) {
            this.requestId = model.requestId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
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

        public PutWorkspaceResponseBody build() {
            return new PutWorkspaceResponseBody(this);
        } 

    } 

}
