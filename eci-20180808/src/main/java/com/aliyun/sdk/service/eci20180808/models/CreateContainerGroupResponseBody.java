// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContainerGroupResponseBody</p>
 */
public class CreateContainerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
    private String containerGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateContainerGroupResponseBody(Builder builder) {
        this.containerGroupId = builder.containerGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContainerGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerGroupId
     */
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String containerGroupId; 
        private String requestId; 

        /**
         * The ID of the instance.
         */
        public Builder containerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateContainerGroupResponseBody build() {
            return new CreateContainerGroupResponseBody(this);
        } 

    } 

}
