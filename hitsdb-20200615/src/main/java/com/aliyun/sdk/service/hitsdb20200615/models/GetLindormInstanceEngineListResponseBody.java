// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormInstanceEngineListResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceEngineListResponseBody</p>
 */
public class GetLindormInstanceEngineListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("EngineList")
    private java.util.List<EngineList> engineList;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLindormInstanceEngineListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.engineList = builder.engineList;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormInstanceEngineListResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return engineList
     */
    public java.util.List<EngineList> getEngineList() {
        return this.engineList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<EngineList> engineList; 
        private String instanceId; 
        private String requestId; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The list of engines that can run on the specified instance.</p>
         */
        public Builder engineList(java.util.List<EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1nq34mv3smk****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B496BA0E-520C-59FC-BA04-196D8F3B07EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLindormInstanceEngineListResponseBody build() {
            return new GetLindormInstanceEngineListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormInstanceEngineListResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormInstanceEngineListResponseBody</p>
     */
    public static class NetInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private Integer accessType;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private NetInfoList(Builder builder) {
            this.accessType = builder.accessType;
            this.connectionString = builder.connectionString;
            this.netType = builder.netType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoList create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public Integer getAccessType() {
            return this.accessType;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private Integer accessType; 
            private String connectionString; 
            private String netType; 
            private Integer port; 

            /**
             * <p>The method by which the connection information can be used to access LindormTable. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The default value. This value can be ignored.</li>
             * <li><strong>1</strong>: The connection information can be used to access LindormTable by using ApsaraDB for HBase API for Java.</li>
             * <li><strong>2</strong>: The connection information can be used to access LindormTable by using ApsaraDB for HBase API for a non-Java language.</li>
             * <li><strong>3</strong>: The connection information can be used to access LindormTable by using the LindormTable endpoint for CQL.</li>
             * <li><strong>4</strong>: The connection information can be used to access LindormTable by using the LindormTable endpoint for SQL.</li>
             * <li><strong>5</strong>: The connection information can be used to access Lindorm by using the LindormTable endpoint for Amazon S3.</li>
             * <li><strong>6</strong>: The connection information can be used to access Lindorm by using the LindormTable endpoint for MySQL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accessType(Integer accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to the engine.</p>
             * 
             * <strong>example:</strong>
             * <p>ld-bp1nq34mv3smk****-proxy-lindorm.lindorm.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The network type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Internet</li>
             * <li><strong>2</strong>: virtual private cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The port number used to connect to the engine.</p>
             * 
             * <strong>example:</strong>
             * <p>30020</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public NetInfoList build() {
                return new NetInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormInstanceEngineListResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormInstanceEngineListResponseBody</p>
     */
    public static class EngineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("NetInfoList")
        private java.util.List<NetInfoList> netInfoList;

        private EngineList(Builder builder) {
            this.engineType = builder.engineType;
            this.netInfoList = builder.netInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineList create() {
            return builder().build();
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return netInfoList
         */
        public java.util.List<NetInfoList> getNetInfoList() {
            return this.netInfoList;
        }

        public static final class Builder {
            private String engineType; 
            private java.util.List<NetInfoList> netInfoList; 

            /**
             * <p>The type of engine that can run on the instance. Valid values:</p>
             * <ul>
             * <li><strong>lindorm</strong>: LindormTable.</li>
             * <li><strong>tsdb</strong>: LindormTSDB.</li>
             * <li><strong>solr</strong>: LindormSearch.</li>
             * <li><strong>store</strong>: LindormDFS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lindorm</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The list of connection information about the engine.</p>
             */
            public Builder netInfoList(java.util.List<NetInfoList> netInfoList) {
                this.netInfoList = netInfoList;
                return this;
            }

            public EngineList build() {
                return new EngineList(this);
            } 

        } 

    }
}
