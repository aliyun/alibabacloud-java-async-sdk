// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateDedicatedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateDedicatedHostsResponseBody</p>
 */
public class AllocateDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("DedicatedHostIdSets")
    private DedicatedHostIdSets dedicatedHostIdSets;

    @NameInMap("RequestId")
    private String requestId;

    private AllocateDedicatedHostsResponseBody(Builder builder) {
        this.dedicatedHostIdSets = builder.dedicatedHostIdSets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateDedicatedHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostIdSets
     */
    public DedicatedHostIdSets getDedicatedHostIdSets() {
        return this.dedicatedHostIdSets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DedicatedHostIdSets dedicatedHostIdSets; 
        private String requestId; 

        /**
         * The IDs of the dedicated hosts.
         */
        public Builder dedicatedHostIdSets(DedicatedHostIdSets dedicatedHostIdSets) {
            this.dedicatedHostIdSets = dedicatedHostIdSets;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateDedicatedHostsResponseBody build() {
            return new AllocateDedicatedHostsResponseBody(this);
        } 

    } 

    public static class DedicatedHostIdSets extends TeaModel {
        @NameInMap("DedicatedHostId")
        private java.util.List < String > dedicatedHostId;

        private DedicatedHostIdSets(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostIdSets create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public java.util.List < String > getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private java.util.List < String > dedicatedHostId; 

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(java.util.List < String > dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public DedicatedHostIdSets build() {
                return new DedicatedHostIdSets(this);
            } 

        } 

    }
}
