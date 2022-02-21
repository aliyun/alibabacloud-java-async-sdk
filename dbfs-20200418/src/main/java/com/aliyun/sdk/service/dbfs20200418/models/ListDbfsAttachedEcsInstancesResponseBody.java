// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsAttachedEcsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDbfsAttachedEcsInstancesResponseBody</p>
 */
public class ListDbfsAttachedEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    private java.util.List < EcsLabelInfo> ecsLabelInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListDbfsAttachedEcsInstancesResponseBody(Builder builder) {
        this.ecsLabelInfo = builder.ecsLabelInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDbfsAttachedEcsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ecsLabelInfo
     */
    public java.util.List < EcsLabelInfo> getEcsLabelInfo() {
        return this.ecsLabelInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EcsLabelInfo> ecsLabelInfo; 
        private String requestId; 

        /**
         * EcsLabelInfo.
         */
        public Builder ecsLabelInfo(java.util.List < EcsLabelInfo> ecsLabelInfo) {
            this.ecsLabelInfo = ecsLabelInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDbfsAttachedEcsInstancesResponseBody build() {
            return new ListDbfsAttachedEcsInstancesResponseBody(this);
        } 

    } 

    public static class EcsLabelInfo extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("MountPoint")
        private String mountPoint;

        @NameInMap("MountedTime")
        private String mountedTime;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("label")
        private String label;

        @NameInMap("value")
        private String value;

        private EcsLabelInfo(Builder builder) {
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.mountPoint = builder.mountPoint;
            this.mountedTime = builder.mountedTime;
            this.OSName = builder.OSName;
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsLabelInfo create() {
            return builder().build();
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return mountPoint
         */
        public String getMountPoint() {
            return this.mountPoint;
        }

        /**
         * @return mountedTime
         */
        public String getMountedTime() {
            return this.mountedTime;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String instanceTypeFamily; 
            private String mountPoint; 
            private String mountedTime; 
            private String OSName; 
            private String label; 
            private String value; 

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * MountPoint.
             */
            public Builder mountPoint(String mountPoint) {
                this.mountPoint = mountPoint;
                return this;
            }

            /**
             * MountedTime.
             */
            public Builder mountedTime(String mountedTime) {
                this.mountedTime = mountedTime;
                return this;
            }

            /**
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EcsLabelInfo build() {
                return new EcsLabelInfo(this);
            } 

        } 

    }
}
