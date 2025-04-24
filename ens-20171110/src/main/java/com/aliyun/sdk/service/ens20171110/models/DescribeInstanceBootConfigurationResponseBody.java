// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstanceBootConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceBootConfigurationResponseBody</p>
 */
public class DescribeInstanceBootConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceBootConfigurationResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceBootConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instances instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceBootConfigurationResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Schema of Response</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceBootConfigurationResponseBody build() {
            return new DescribeInstanceBootConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceBootConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceBootConfigurationResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootSet")
        private String bootSet;

        @com.aliyun.core.annotation.NameInMap("BootType")
        private String bootType;

        @com.aliyun.core.annotation.NameInMap("DiskSet")
        private String diskSet;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private Instances(Builder builder) {
            this.bootSet = builder.bootSet;
            this.bootType = builder.bootType;
            this.diskSet = builder.diskSet;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return bootSet
         */
        public String getBootSet() {
            return this.bootSet;
        }

        /**
         * @return bootType
         */
        public String getBootType() {
            return this.bootType;
        }

        /**
         * @return diskSet
         */
        public String getDiskSet() {
            return this.diskSet;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String bootSet; 
            private String bootType; 
            private String diskSet; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.bootSet = model.bootSet;
                this.bootType = model.bootType;
                this.diskSet = model.diskSet;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The startup method.</p>
             * 
             * <strong>example:</strong>
             * <p>legacy</p>
             */
            public Builder bootSet(String bootSet) {
                this.bootSet = bootSet;
                return this;
            }

            /**
             * <p>The startup type.</p>
             * 
             * <strong>example:</strong>
             * <p>disk</p>
             */
            public Builder bootType(String bootType) {
                this.bootType = bootType;
                return this;
            }

            /**
             * <p>Specifies whether the startup depends on the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder diskSet(String diskSet) {
                this.diskSet = diskSet;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
