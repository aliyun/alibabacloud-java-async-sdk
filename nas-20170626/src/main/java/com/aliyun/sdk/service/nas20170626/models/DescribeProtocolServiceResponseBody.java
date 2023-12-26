// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtocolServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtocolServiceResponseBody</p>
 */
public class DescribeProtocolServiceResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ProtocolServices")
    private java.util.List < ProtocolServices> protocolServices;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeProtocolServiceResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.protocolServices = builder.protocolServices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtocolServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protocolServices
     */
    public java.util.List < ProtocolServices> getProtocolServices() {
        return this.protocolServices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < ProtocolServices> protocolServices; 
        private String requestId; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about protocol services.
         */
        public Builder protocolServices(java.util.List < ProtocolServices> protocolServices) {
            this.protocolServices = protocolServices;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtocolServiceResponseBody build() {
            return new DescribeProtocolServiceResponseBody(this);
        } 

    } 

    public static class ProtocolServices extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("InstanceBaseThroughput")
        private Integer instanceBaseThroughput;

        @NameInMap("InstanceBurstThroughput")
        private Integer instanceBurstThroughput;

        @NameInMap("InstanceRAM")
        private Integer instanceRAM;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("MountTargetCount")
        private Integer mountTargetCount;

        @NameInMap("ProtocolServiceId")
        private String protocolServiceId;

        @NameInMap("ProtocolSpec")
        private String protocolSpec;

        @NameInMap("ProtocolThroughput")
        private Integer protocolThroughput;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("Status")
        private String status;

        private ProtocolServices(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemId = builder.fileSystemId;
            this.instanceBaseThroughput = builder.instanceBaseThroughput;
            this.instanceBurstThroughput = builder.instanceBurstThroughput;
            this.instanceRAM = builder.instanceRAM;
            this.modifyTime = builder.modifyTime;
            this.mountTargetCount = builder.mountTargetCount;
            this.protocolServiceId = builder.protocolServiceId;
            this.protocolSpec = builder.protocolSpec;
            this.protocolThroughput = builder.protocolThroughput;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolServices create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return instanceBaseThroughput
         */
        public Integer getInstanceBaseThroughput() {
            return this.instanceBaseThroughput;
        }

        /**
         * @return instanceBurstThroughput
         */
        public Integer getInstanceBurstThroughput() {
            return this.instanceBurstThroughput;
        }

        /**
         * @return instanceRAM
         */
        public Integer getInstanceRAM() {
            return this.instanceRAM;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return mountTargetCount
         */
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
        }

        /**
         * @return protocolServiceId
         */
        public String getProtocolServiceId() {
            return this.protocolServiceId;
        }

        /**
         * @return protocolSpec
         */
        public String getProtocolSpec() {
            return this.protocolSpec;
        }

        /**
         * @return protocolThroughput
         */
        public Integer getProtocolThroughput() {
            return this.protocolThroughput;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String fileSystemId; 
            private Integer instanceBaseThroughput; 
            private Integer instanceBurstThroughput; 
            private Integer instanceRAM; 
            private String modifyTime; 
            private Integer mountTargetCount; 
            private String protocolServiceId; 
            private String protocolSpec; 
            private Integer protocolThroughput; 
            private String protocolType; 
            private String status; 

            /**
             * The time when the protocol service was created. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the protocol service.
             * <p>
             * 
             * Limits:
             * 
             * *   The description must be 2 to 128 characters in length.
             * *   The description must start with a letter and cannot start with `http://` or `https://`.
             * *   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The base throughput of the protocol service. Unit: MB/s.
             */
            public Builder instanceBaseThroughput(Integer instanceBaseThroughput) {
                this.instanceBaseThroughput = instanceBaseThroughput;
                return this;
            }

            /**
             * The burst throughput of the protocol service. Unit: MB/s.
             */
            public Builder instanceBurstThroughput(Integer instanceBurstThroughput) {
                this.instanceBurstThroughput = instanceBurstThroughput;
                return this;
            }

            /**
             * The memory cache size of the protocol service. Unit: GiB.
             */
            public Builder instanceRAM(Integer instanceRAM) {
                this.instanceRAM = instanceRAM;
                return this;
            }

            /**
             * The time when the protocol service was modified. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The total number of CPFS directories and filesets exported in the protocol service.
             */
            public Builder mountTargetCount(Integer mountTargetCount) {
                this.mountTargetCount = mountTargetCount;
                return this;
            }

            /**
             * The ID of the protocol service.
             */
            public Builder protocolServiceId(String protocolServiceId) {
                this.protocolServiceId = protocolServiceId;
                return this;
            }

            /**
             * The specification of the protocol service.
             * <p>
             * 
             * *   Valid value: General.
             * *   Default value: General.
             */
            public Builder protocolSpec(String protocolSpec) {
                this.protocolSpec = protocolSpec;
                return this;
            }

            /**
             * The throughput of the protocol service. Unit: MB/s.
             */
            public Builder protocolThroughput(Integer protocolThroughput) {
                this.protocolThroughput = protocolThroughput;
                return this;
            }

            /**
             * The protocol type supported by the protocol service.
             * <p>
             * 
             * Valid values:
             * 
             * *   NFS: The protocol service supports access over the Network File System (NFS) protocol.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The status of the protocol service.
             * <p>
             * 
             * Valid values:
             * 
             * *   Creating: The protocol service is being created.
             * *   Starting: The protocol service is being started.
             * *   Running: The protocol service is running.
             * *   Updating: The protocol service is being updated.
             * *   Deleting: The protocol service is being deleted.
             * *   Stopping: The protocol service is being stopped.
             * *   Stopped: The protocol service is stopped.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ProtocolServices build() {
                return new ProtocolServices(this);
            } 

        } 

    }
}
