// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceResponseBody</p>
 */
public class CreateWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private CreateWorkspaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private Long workspaceId; 

        private Builder() {
        } 

        private Builder(CreateWorkspaceResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateWorkspaceResponseBody build() {
            return new CreateWorkspaceResponseBody(this);
        } 

    } 

}
