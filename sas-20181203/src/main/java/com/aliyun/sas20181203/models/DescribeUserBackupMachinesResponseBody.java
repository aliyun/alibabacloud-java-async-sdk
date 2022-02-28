// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBackupMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBackupMachinesResponseBody</p>
 */
public class DescribeUserBackupMachinesResponseBody extends TeaModel {
    @NameInMap("Machines")
    private java.util.List < Machines> machines;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserBackupMachinesResponseBody(Builder builder) {
        this.machines = builder.machines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBackupMachinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return machines
     */
    public java.util.List < Machines> getMachines() {
        return this.machines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Machines> machines; 
        private String requestId; 

        /**
         * Machines.
         */
        public Builder machines(java.util.List < Machines> machines) {
            this.machines = machines;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserBackupMachinesResponseBody build() {
            return new DescribeUserBackupMachinesResponseBody(this);
        } 

    } 

    public static class Machines extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("Uuid")
        private String uuid;

        private Machines(Builder builder) {
            this.id = builder.id;
            this.policyName = builder.policyName;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Machines create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long id; 
            private String policyName; 
            private String uuid; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Machines build() {
                return new Machines(this);
            } 

        } 

    }
}
