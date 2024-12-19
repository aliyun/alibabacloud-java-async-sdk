// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeProtocolServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtocolServiceResponseBody</p>
 */
public class DescribeProtocolServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtocolServices")
    private java.util.List<ProtocolServices> protocolServices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ProtocolServices> getProtocolServices() {
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
        private java.util.List<ProtocolServices> protocolServices; 
        private String requestId; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>aBcdeg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about protocol services.</p>
         */
        public Builder protocolServices(java.util.List<ProtocolServices> protocolServices) {
            this.protocolServices = protocolServices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtocolServiceResponseBody build() {
            return new DescribeProtocolServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProtocolServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProtocolServiceResponseBody</p>
     */
    public static class ProtocolServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("InstanceBaseThroughput")
        private Integer instanceBaseThroughput;

        @com.aliyun.core.annotation.NameInMap("InstanceBurstThroughput")
        private Integer instanceBurstThroughput;

        @com.aliyun.core.annotation.NameInMap("InstanceRAM")
        private Integer instanceRAM;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("MountTargetCount")
        private Integer mountTargetCount;

        @com.aliyun.core.annotation.NameInMap("ProtocolServiceId")
        private String protocolServiceId;

        @com.aliyun.core.annotation.NameInMap("ProtocolSpec")
        private String protocolSpec;

        @com.aliyun.core.annotation.NameInMap("ProtocolThroughput")
        private Integer protocolThroughput;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the protocol service was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T07:28:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the protocol service.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The description must be 2 to 128 characters in length.</li>
             * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
             * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>cpfs-099394bd928c****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The base throughput of the protocol service. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder instanceBaseThroughput(Integer instanceBaseThroughput) {
                this.instanceBaseThroughput = instanceBaseThroughput;
                return this;
            }

            /**
             * <p>The burst throughput of the protocol service. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder instanceBurstThroughput(Integer instanceBurstThroughput) {
                this.instanceBurstThroughput = instanceBurstThroughput;
                return this;
            }

            /**
             * <p>The memory cache size of the protocol service. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceRAM(Integer instanceRAM) {
                this.instanceRAM = instanceRAM;
                return this;
            }

            /**
             * <p>The time when the protocol service was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T07:28:38Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The total number of CPFS directories and filesets exported in the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder mountTargetCount(Integer mountTargetCount) {
                this.mountTargetCount = mountTargetCount;
                return this;
            }

            /**
             * <p>The ID of the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>ptc-197ed6a00f2b****</p>
             */
            public Builder protocolServiceId(String protocolServiceId) {
                this.protocolServiceId = protocolServiceId;
                return this;
            }

            /**
             * <p>The specification of the protocol service.</p>
             * <ul>
             * <li>Valid value: General.</li>
             * <li>Default value: General.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>General</p>
             */
            public Builder protocolSpec(String protocolSpec) {
                this.protocolSpec = protocolSpec;
                return this;
            }

            /**
             * <p>The throughput of the protocol service. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder protocolThroughput(Integer protocolThroughput) {
                this.protocolThroughput = protocolThroughput;
                return this;
            }

            /**
             * <p>The protocol type supported by the protocol service.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NFS: The protocol service supports access over the Network File System (NFS) protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The status of the protocol service.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Creating: The protocol service is being created.</li>
             * <li>Starting: The protocol service is being started.</li>
             * <li>Running: The protocol service is running.</li>
             * <li>Updating: The protocol service is being updated.</li>
             * <li>Deleting: The protocol service is being deleted.</li>
             * <li>Stopping: The protocol service is being stopped.</li>
             * <li>Stopped: The protocol service is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
