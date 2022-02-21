// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostResponseBody</p>
 */
public class CreateDedicatedHostResponseBody extends TeaModel {
    @NameInMap("DedicateHostList")
    private DedicateHostList dedicateHostList;

    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedHostResponseBody(Builder builder) {
        this.dedicateHostList = builder.dedicateHostList;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicateHostList
     */
    public DedicateHostList getDedicateHostList() {
        return this.dedicateHostList;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DedicateHostList dedicateHostList; 
        private Long orderId; 
        private String requestId; 

        /**
         * DedicateHostList.
         */
        public Builder dedicateHostList(DedicateHostList dedicateHostList) {
            this.dedicateHostList = dedicateHostList;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDedicatedHostResponseBody build() {
            return new CreateDedicatedHostResponseBody(this);
        } 

    } 

    public static class DedicateHostListDedicateHostList extends TeaModel {
        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        private DedicateHostListDedicateHostList(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicateHostListDedicateHostList create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private String dedicatedHostId; 

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public DedicateHostListDedicateHostList build() {
                return new DedicateHostListDedicateHostList(this);
            } 

        } 

    }
    public static class DedicateHostList extends TeaModel {
        @NameInMap("DedicateHostList")
        private java.util.List < DedicateHostListDedicateHostList> dedicateHostList;

        private DedicateHostList(Builder builder) {
            this.dedicateHostList = builder.dedicateHostList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicateHostList create() {
            return builder().build();
        }

        /**
         * @return dedicateHostList
         */
        public java.util.List < DedicateHostListDedicateHostList> getDedicateHostList() {
            return this.dedicateHostList;
        }

        public static final class Builder {
            private java.util.List < DedicateHostListDedicateHostList> dedicateHostList; 

            /**
             * DedicateHostList.
             */
            public Builder dedicateHostList(java.util.List < DedicateHostListDedicateHostList> dedicateHostList) {
                this.dedicateHostList = dedicateHostList;
                return this;
            }

            public DedicateHostList build() {
                return new DedicateHostList(this);
            } 

        } 

    }
}
