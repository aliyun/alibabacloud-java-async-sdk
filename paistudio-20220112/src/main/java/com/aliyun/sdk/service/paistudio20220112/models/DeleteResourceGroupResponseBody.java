// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteResourceGroupResponseBody</p>
 */
public class DeleteResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    private DeleteResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceGroupID; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        public DeleteResourceGroupResponseBody build() {
            return new DeleteResourceGroupResponseBody(this);
        } 

    } 

}
