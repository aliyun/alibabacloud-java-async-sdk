// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserBackupMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBackupMachinesResponseBody</p>
 */
public class DescribeUserBackupMachinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Machines")
    private java.util.List < Machines> machines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array consisting of the servers to which the anti-ransomware policy is applied.</p>
         */
        public Builder machines(java.util.List < Machines> machines) {
            this.machines = machines;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA04B21</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserBackupMachinesResponseBody build() {
            return new DescribeUserBackupMachinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserBackupMachinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserBackupMachinesResponseBody</p>
     */
    public static class Machines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The ID of the anti-ransomware policy that is applied to the server.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the anti-ransomware policy that is applied to the server.</p>
             * 
             * <strong>example:</strong>
             * <p>policy_name_A</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The UUID of the server to which the anti-ransomware policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
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
