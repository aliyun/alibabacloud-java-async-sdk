// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUuidsByVulNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUuidsByVulNamesResponseBody</p>
 */
public class DescribeUuidsByVulNamesResponseBody extends TeaModel {
    @NameInMap("MachineInfoStatistics")
    private java.util.List < MachineInfoStatistics> machineInfoStatistics;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUuidsByVulNamesResponseBody(Builder builder) {
        this.machineInfoStatistics = builder.machineInfoStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUuidsByVulNamesResponseBody create() {
        return builder().build();
    }

    /**
     * @return machineInfoStatistics
     */
    public java.util.List < MachineInfoStatistics> getMachineInfoStatistics() {
        return this.machineInfoStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MachineInfoStatistics> machineInfoStatistics; 
        private String requestId; 

        /**
         * An array that consists of the statistics about the assets.
         */
        public Builder machineInfoStatistics(java.util.List < MachineInfoStatistics> machineInfoStatistics) {
            this.machineInfoStatistics = machineInfoStatistics;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUuidsByVulNamesResponseBody build() {
            return new DescribeUuidsByVulNamesResponseBody(this);
        } 

    } 

    public static class MachineInfoStatistics extends TeaModel {
        @NameInMap("MachineInstanceId")
        private String machineInstanceId;

        @NameInMap("MachineIp")
        private String machineIp;

        @NameInMap("MachineName")
        private String machineName;

        @NameInMap("Os")
        private String os;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Uuid")
        private String uuid;

        private MachineInfoStatistics(Builder builder) {
            this.machineInstanceId = builder.machineInstanceId;
            this.machineIp = builder.machineIp;
            this.machineName = builder.machineName;
            this.os = builder.os;
            this.regionId = builder.regionId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineInfoStatistics create() {
            return builder().build();
        }

        /**
         * @return machineInstanceId
         */
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        /**
         * @return machineIp
         */
        public String getMachineIp() {
            return this.machineIp;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String machineInstanceId; 
            private String machineIp; 
            private String machineName; 
            private String os; 
            private String regionId; 
            private String uuid; 

            /**
             * The ID of the server.
             */
            public Builder machineInstanceId(String machineInstanceId) {
                this.machineInstanceId = machineInstanceId;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder machineIp(String machineIp) {
                this.machineIp = machineIp;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * The name of the operating system that the server runs.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The ID of the region in which the server resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public MachineInfoStatistics build() {
                return new MachineInfoStatistics(this);
            } 

        } 

    }
}
