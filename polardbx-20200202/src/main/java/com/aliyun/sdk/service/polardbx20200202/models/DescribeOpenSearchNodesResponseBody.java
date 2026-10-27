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
 * {@link DescribeOpenSearchNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenSearchNodesResponseBody</p>
 */
public class DescribeOpenSearchNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenSearchNodesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenSearchNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOpenSearchNodesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AE4F6C34-065F-45AA-B5DC-4B8D816F6305</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenSearchNodesResponseBody build() {
            return new DescribeOpenSearchNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenSearchNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchNodesResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The authentication action.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The identity used for authentication in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The owner ID of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The type of the authentication principal.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The encoded diagnostic message.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The type of the permission denial.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchNodesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private Integer cpuCores;

        @com.aliyun.core.annotation.NameInMap("CpuPercent")
        private String cpuPercent;

        @com.aliyun.core.annotation.NameInMap("DiskSizeGB")
        private Integer diskSizeGB;

        @com.aliyun.core.annotation.NameInMap("DiskUsedPercent")
        private String diskUsedPercent;

        @com.aliyun.core.annotation.NameInMap("Health")
        private String health;

        @com.aliyun.core.annotation.NameInMap("HeapPercent")
        private String heapPercent;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("LoadOneM")
        private String loadOneM;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.cpuCores = builder.cpuCores;
            this.cpuPercent = builder.cpuPercent;
            this.diskSizeGB = builder.diskSizeGB;
            this.diskUsedPercent = builder.diskUsedPercent;
            this.health = builder.health;
            this.heapPercent = builder.heapPercent;
            this.host = builder.host;
            this.hostName = builder.hostName;
            this.loadOneM = builder.loadOneM;
            this.memoryGB = builder.memoryGB;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return cpuPercent
         */
        public String getCpuPercent() {
            return this.cpuPercent;
        }

        /**
         * @return diskSizeGB
         */
        public Integer getDiskSizeGB() {
            return this.diskSizeGB;
        }

        /**
         * @return diskUsedPercent
         */
        public String getDiskUsedPercent() {
            return this.diskUsedPercent;
        }

        /**
         * @return health
         */
        public String getHealth() {
            return this.health;
        }

        /**
         * @return heapPercent
         */
        public String getHeapPercent() {
            return this.heapPercent;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return loadOneM
         */
        public String getLoadOneM() {
            return this.loadOneM;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer cpuCores; 
            private String cpuPercent; 
            private Integer diskSizeGB; 
            private String diskUsedPercent; 
            private String health; 
            private String heapPercent; 
            private String host; 
            private String hostName; 
            private String loadOneM; 
            private Integer memoryGB; 
            private String nodeType; 
            private Integer port; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cpuCores = model.cpuCores;
                this.cpuPercent = model.cpuPercent;
                this.diskSizeGB = model.diskSizeGB;
                this.diskUsedPercent = model.diskUsedPercent;
                this.health = model.health;
                this.heapPercent = model.heapPercent;
                this.host = model.host;
                this.hostName = model.hostName;
                this.loadOneM = model.loadOneM;
                this.memoryGB = model.memoryGB;
                this.nodeType = model.nodeType;
                this.port = model.port;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of CPU cores of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The CPU usage (%).</p>
             * 
             * <strong>example:</strong>
             * <p>35.6</p>
             */
            public Builder cpuPercent(String cpuPercent) {
                this.cpuPercent = cpuPercent;
                return this;
            }

            /**
             * <p>The total disk capacity of the node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder diskSizeGB(Integer diskSizeGB) {
                this.diskSizeGB = diskSizeGB;
                return this;
            }

            /**
             * <p>The disk space usage of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>42.5</p>
             */
            public Builder diskUsedPercent(String diskUsedPercent) {
                this.diskUsedPercent = diskUsedPercent;
                return this;
            }

            /**
             * <p>The total number of unresolved baseline check items.</p>
             * 
             * <strong>example:</strong>
             * <p>GREEN</p>
             */
            public Builder health(String health) {
                this.health = health;
                return this;
            }

            /**
             * <p>The JVM heap memory usage of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>38.2</p>
             */
            public Builder heapPercent(String heapPercent) {
                this.heapPercent = heapPercent;
                return this;
            }

            /**
             * <p>The IP address and port of the session host that initiated the session.</p>
             * 
             * <strong>example:</strong>
             * <p>100.115.107.0/24</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The name of the host on which the node instance runs. You can log on to the host and run the <code>hostname</code> command to view the hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>hb2h-ali-oceanbase-public-online-013</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The average system load of the node over the last 1 minute.</p>
             * 
             * <strong>example:</strong>
             * <p>1.25</p>
             */
            public Builder loadOneM(String loadOneM) {
                this.loadOneM = loadOneM;
                return this;
            }

            /**
             * <p>The amount of memory used.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            /**
             * <p>The node type to query. Valid values:</p>
             * <ul>
             * <li>all: queries both dn and gms nodes.</li>
             * <li>gms: queries only gms nodes.</li>
             * <li>dn: queries only dn nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dn</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchNodesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        private Data(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
            } 

            /**
             * <p>The query result object.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
