// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeUuidsByVulNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUuidsByVulNamesResponseBody</p>
 */
public class DescribeUuidsByVulNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineInfoStatistics")
    private java.util.List<MachineInfoStatistics> machineInfoStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulCount")
    private Integer vulCount;

    private DescribeUuidsByVulNamesResponseBody(Builder builder) {
        this.machineInfoStatistics = builder.machineInfoStatistics;
        this.requestId = builder.requestId;
        this.vulCount = builder.vulCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUuidsByVulNamesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineInfoStatistics
     */
    public java.util.List<MachineInfoStatistics> getMachineInfoStatistics() {
        return this.machineInfoStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulCount
     */
    public Integer getVulCount() {
        return this.vulCount;
    }

    public static final class Builder {
        private java.util.List<MachineInfoStatistics> machineInfoStatistics; 
        private String requestId; 
        private Integer vulCount; 

        private Builder() {
        } 

        private Builder(DescribeUuidsByVulNamesResponseBody model) {
            this.machineInfoStatistics = model.machineInfoStatistics;
            this.requestId = model.requestId;
            this.vulCount = model.vulCount;
        } 

        /**
         * <p>The statistics about the servers.</p>
         */
        public Builder machineInfoStatistics(java.util.List<MachineInfoStatistics> machineInfoStatistics) {
            this.machineInfoStatistics = machineInfoStatistics;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>97286A-4A6B-4A4-95FA-EC7E3E2451</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder vulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }

        public DescribeUuidsByVulNamesResponseBody build() {
            return new DescribeUuidsByVulNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUuidsByVulNamesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUuidsByVulNamesResponseBody</p>
     */
    public static class MachineInfoStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("MachineInstanceId")
        private String machineInstanceId;

        @com.aliyun.core.annotation.NameInMap("MachineIp")
        private String machineIp;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private MachineInfoStatistics(Builder builder) {
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
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
            private String internetIp; 
            private String intranetIp; 
            private String machineInstanceId; 
            private String machineIp; 
            private String machineName; 
            private String os; 
            private String regionId; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(MachineInfoStatistics model) {
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.machineInstanceId = model.machineInstanceId;
                this.machineIp = model.machineIp;
                this.machineName = model.machineName;
                this.os = model.os;
                this.regionId = model.regionId;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The public IP address of the server on which the exception was detected.</p>
             * 
             * <strong>example:</strong>
             * <p>47.98.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server on which the exception was detected.</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9gd1os5talju****</p>
             */
            public Builder machineInstanceId(String machineInstanceId) {
                this.machineInstanceId = machineInstanceId;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder machineIp(String machineIp) {
                this.machineIp = machineIp;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>TestMachine</p>
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * <p>The operating system that the server runs.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The region ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>18375c64-eaa2-4702-92b0-4ee7******</p>
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
