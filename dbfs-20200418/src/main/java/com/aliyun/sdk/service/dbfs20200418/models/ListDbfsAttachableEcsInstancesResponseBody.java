// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDbfsAttachableEcsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDbfsAttachableEcsInstancesResponseBody</p>
 */
public class ListDbfsAttachableEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    private java.util.List < EcsLabelInfo> ecsLabelInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDbfsAttachableEcsInstancesResponseBody(Builder builder) {
        this.ecsLabelInfo = builder.ecsLabelInfo;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDbfsAttachableEcsInstancesResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < EcsLabelInfo> ecsLabelInfo; 
        private String requestId; 
        private Integer totalCount; 

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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDbfsAttachableEcsInstancesResponseBody build() {
            return new ListDbfsAttachableEcsInstancesResponseBody(this);
        } 

    } 

    public static class EcsLabelInfo extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("label")
        private String label;

        @NameInMap("value")
        private String value;

        private EcsLabelInfo(Builder builder) {
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.OSName = builder.OSName;
            this.status = builder.status;
            this.zoneId = builder.zoneId;
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
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
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
            private String OSName; 
            private String status; 
            private String zoneId; 
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
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
