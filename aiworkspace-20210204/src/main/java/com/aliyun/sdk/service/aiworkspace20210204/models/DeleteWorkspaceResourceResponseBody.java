// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkspaceResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWorkspaceResourceResponseBody</p>
 */
public class DeleteWorkspaceResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    private DeleteWorkspaceResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceResourceResponseBody create() {
        return builder().build();
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
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > resourceIds; 

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
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        public DeleteWorkspaceResourceResponseBody build() {
            return new DeleteWorkspaceResourceResponseBody(this);
        } 

    } 

}
