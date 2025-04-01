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
 * {@link UpdateWorkspaceResourceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceResourceResponseBody</p>
 */
public class UpdateWorkspaceResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List<String> resourceIds;

    private UpdateWorkspaceResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceResourceResponseBody create() {
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
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> resourceIds; 

        private Builder() {
        } 

        private Builder(UpdateWorkspaceResourceResponseBody model) {
            this.requestId = model.requestId;
            this.resourceIds = model.resourceIds;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        public UpdateWorkspaceResourceResponseBody build() {
            return new UpdateWorkspaceResourceResponseBody(this);
        } 

    } 

}
