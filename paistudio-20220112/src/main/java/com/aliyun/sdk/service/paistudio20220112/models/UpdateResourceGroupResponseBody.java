// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link UpdateResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceGroupResponseBody</p>
 */
public class UpdateResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateResourceGroupResponseBody(Builder builder) {
        this.resourceGroupID = builder.resourceGroupID;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String resourceGroupID; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateResourceGroupResponseBody model) {
            this.resourceGroupID = model.resourceGroupID;
            this.requestId = model.requestId;
        } 

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateResourceGroupResponseBody build() {
            return new UpdateResourceGroupResponseBody(this);
        } 

    } 

}
