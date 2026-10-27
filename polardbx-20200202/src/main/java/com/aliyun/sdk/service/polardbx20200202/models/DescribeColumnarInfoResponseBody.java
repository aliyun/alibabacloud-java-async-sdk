// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeColumnarInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColumnarInfoResponseBody</p>
 */
public class DescribeColumnarInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private DescribeColumnarInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColumnarInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeColumnarInfoResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>14036EBE-****-44DB-ACE9-AC6157D3A6FC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeColumnarInfoResponseBody build() {
            return new DescribeColumnarInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeColumnarInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColumnarInfoResponseBody</p>
     */
    public static class PhysicalNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AZone")
        private String aZone;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("NodeClass")
        private String nodeClass;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PhysicalNodes(Builder builder) {
            this.aZone = builder.aZone;
            this.disk = builder.disk;
            this.nodeClass = builder.nodeClass;
            this.nodeId = builder.nodeId;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalNodes create() {
            return builder().build();
        }

        /**
         * @return aZone
         */
        public String getAZone() {
            return this.aZone;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return nodeClass
         */
        public String getNodeClass() {
            return this.nodeClass;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String aZone; 
            private Integer disk; 
            private String nodeClass; 
            private String nodeId; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(PhysicalNodes model) {
                this.aZone = model.aZone;
                this.disk = model.disk;
                this.nodeClass = model.nodeClass;
                this.nodeId = model.nodeId;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The zone where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder aZone(String aZone) {
                this.aZone = aZone;
                return this;
            }

            /**
             * <p>The disk size, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>204800</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The instance specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.n8.medium.col</p>
             */
            public Builder nodeClass(String nodeClass) {
                this.nodeClass = nodeClass;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PhysicalNodes build() {
                return new PhysicalNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeColumnarInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColumnarInfoResponseBody</p>
     */
    public static class InstanceTopologyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PhysicalNodes")
        private java.util.List<PhysicalNodes> physicalNodes;

        private InstanceTopologyList(Builder builder) {
            this.comment = builder.comment;
            this.instanceName = builder.instanceName;
            this.physicalNodes = builder.physicalNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTopologyList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return physicalNodes
         */
        public java.util.List<PhysicalNodes> getPhysicalNodes() {
            return this.physicalNodes;
        }

        public static final class Builder {
            private String comment; 
            private String instanceName; 
            private java.util.List<PhysicalNodes> physicalNodes; 

            private Builder() {
            } 

            private Builder(InstanceTopologyList model) {
                this.comment = model.comment;
                this.instanceName = model.instanceName;
                this.physicalNodes = model.physicalNodes;
            } 

            /**
             * <p>The instance type description.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The node array.</p>
             */
            public Builder physicalNodes(java.util.List<PhysicalNodes> physicalNodes) {
                this.physicalNodes = physicalNodes;
                return this;
            }

            public InstanceTopologyList build() {
                return new InstanceTopologyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeColumnarInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColumnarInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BinlogPersistTime")
        private Integer binlogPersistTime;

        @com.aliyun.core.annotation.NameInMap("BinlogSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer binlogSize;

        @com.aliyun.core.annotation.NameInMap("CheckSumSwitch")
        private String checkSumSwitch;

        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ColumnarNewVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnarNewVersion;

        @com.aliyun.core.annotation.NameInMap("ColumnarVersion")
        private String columnarVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceTopologyList")
        private java.util.List<InstanceTopologyList> instanceTopologyList;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer serverId;

        private Data(Builder builder) {
            this.binlogPersistTime = builder.binlogPersistTime;
            this.binlogSize = builder.binlogSize;
            this.checkSumSwitch = builder.checkSumSwitch;
            this.classCode = builder.classCode;
            this.columnarNewVersion = builder.columnarNewVersion;
            this.columnarVersion = builder.columnarVersion;
            this.instanceTopologyList = builder.instanceTopologyList;
            this.serverId = builder.serverId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return binlogPersistTime
         */
        public Integer getBinlogPersistTime() {
            return this.binlogPersistTime;
        }

        /**
         * @return binlogSize
         */
        public Integer getBinlogSize() {
            return this.binlogSize;
        }

        /**
         * @return checkSumSwitch
         */
        public String getCheckSumSwitch() {
            return this.checkSumSwitch;
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return columnarNewVersion
         */
        public String getColumnarNewVersion() {
            return this.columnarNewVersion;
        }

        /**
         * @return columnarVersion
         */
        public String getColumnarVersion() {
            return this.columnarVersion;
        }

        /**
         * @return instanceTopologyList
         */
        public java.util.List<InstanceTopologyList> getInstanceTopologyList() {
            return this.instanceTopologyList;
        }

        /**
         * @return serverId
         */
        public Integer getServerId() {
            return this.serverId;
        }

        public static final class Builder {
            private Integer binlogPersistTime; 
            private Integer binlogSize; 
            private String checkSumSwitch; 
            private String classCode; 
            private String columnarNewVersion; 
            private String columnarVersion; 
            private java.util.List<InstanceTopologyList> instanceTopologyList; 
            private Integer serverId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.binlogPersistTime = model.binlogPersistTime;
                this.binlogSize = model.binlogSize;
                this.checkSumSwitch = model.checkSumSwitch;
                this.classCode = model.classCode;
                this.columnarNewVersion = model.columnarNewVersion;
                this.columnarVersion = model.columnarVersion;
                this.instanceTopologyList = model.instanceTopologyList;
                this.serverId = model.serverId;
            } 

            /**
             * <p>The number of days that binlogs are retained.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder binlogPersistTime(Integer binlogPersistTime) {
                this.binlogPersistTime = binlogPersistTime;
                return this;
            }

            /**
             * <p>The binlog size.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>524288000</p>
             */
            public Builder binlogSize(Integer binlogSize) {
                this.binlogSize = binlogSize;
                return this;
            }

            /**
             * <p>The checksum switch.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder checkSumSwitch(String checkSumSwitch) {
                this.checkSumSwitch = checkSumSwitch;
                return this;
            }

            /**
             * <p>The instance specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.n8.medium.col</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The new version of the column store.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
             */
            public Builder columnarNewVersion(String columnarNewVersion) {
                this.columnarNewVersion = columnarNewVersion;
                return this;
            }

            /**
             * <p>The column store version.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
             */
            public Builder columnarVersion(String columnarVersion) {
                this.columnarVersion = columnarVersion;
                return this;
            }

            /**
             * <p>The instance list.</p>
             */
            public Builder instanceTopologyList(java.util.List<InstanceTopologyList> instanceTopologyList) {
                this.instanceTopologyList = instanceTopologyList;
                return this;
            }

            /**
             * <p>server id</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>53755321</p>
             */
            public Builder serverId(Integer serverId) {
                this.serverId = serverId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
