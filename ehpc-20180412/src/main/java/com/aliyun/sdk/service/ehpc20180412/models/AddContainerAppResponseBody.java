// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddContainerAppResponseBody} extends {@link TeaModel}
 *
 * <p>AddContainerAppResponseBody</p>
 */
public class AddContainerAppResponseBody extends TeaModel {
    @NameInMap("ContainerId")
    private ContainerId containerId;

    @NameInMap("RequestId")
    private String requestId;

    private AddContainerAppResponseBody(Builder builder) {
        this.containerId = builder.containerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddContainerAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerId
     */
    public ContainerId getContainerId() {
        return this.containerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContainerId containerId; 
        private String requestId; 

        /**
         * ContainerId.
         */
        public Builder containerId(ContainerId containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * The ID of the container.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddContainerAppResponseBody build() {
            return new AddContainerAppResponseBody(this);
        } 

    } 

    public static class ContainerId extends TeaModel {
        @NameInMap("ContainerId")
        private java.util.List < String > containerId;

        private ContainerId(Builder builder) {
            this.containerId = builder.containerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerId create() {
            return builder().build();
        }

        /**
         * @return containerId
         */
        public java.util.List < String > getContainerId() {
            return this.containerId;
        }

        public static final class Builder {
            private java.util.List < String > containerId; 

            /**
             * ContainerId.
             */
            public Builder containerId(java.util.List < String > containerId) {
                this.containerId = containerId;
                return this;
            }

            public ContainerId build() {
                return new ContainerId(this);
            } 

        } 

    }
}
