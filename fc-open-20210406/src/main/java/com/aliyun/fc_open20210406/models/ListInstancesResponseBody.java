// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("instances")
    private java.util.List < Instances> instances;


    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 

        /**
         * <p>instances.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("versionId")
        private String versionId;


        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String versionId; 

            /**
             * <p>instanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>versionId.</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
