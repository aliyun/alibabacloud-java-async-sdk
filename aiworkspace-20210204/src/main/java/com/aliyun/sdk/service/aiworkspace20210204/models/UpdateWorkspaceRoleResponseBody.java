// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link UpdateWorkspaceRoleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceRoleResponseBody</p>
 */
public class UpdateWorkspaceRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceJobId")
    private String instanceJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateWorkspaceRoleResponseBody(Builder builder) {
        this.instanceJobId = builder.instanceJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceJobId
     */
    public String getInstanceJobId() {
        return this.instanceJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateWorkspaceRoleResponseBody model) {
            this.instanceJobId = model.instanceJobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateWorkspaceCustomRole-role-<em><strong>abc</strong></em>****</p>
         */
        public Builder instanceJobId(String instanceJobId) {
            this.instanceJobId = instanceJobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A519F77D-28A0-52F5-AB82-5********8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateWorkspaceRoleResponseBody build() {
            return new UpdateWorkspaceRoleResponseBody(this);
        } 

    } 

}
