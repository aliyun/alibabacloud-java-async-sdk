// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLindormInstanceEngineListResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceEngineListResponseBody</p>
 */
public class GetLindormInstanceEngineListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EngineList")
    private java.util.List < EngineList> engineList;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLindormInstanceEngineListResponseBody(Builder builder) {
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
     * @return engineList
     */
    public java.util.List < EngineList> getEngineList() {
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
        private java.util.List < EngineList> engineList; 
        private String instanceId; 
        private String requestId; 

        /**
         * EngineList.
         */
        public Builder engineList(java.util.List < EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLindormInstanceEngineListResponseBody build() {
            return new GetLindormInstanceEngineListResponseBody(this);
        } 

    } 

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
             * AccessType.
             */
            public Builder accessType(Integer accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
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
    public static class EngineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("NetInfoList")
        private java.util.List < NetInfoList> netInfoList;

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
        public java.util.List < NetInfoList> getNetInfoList() {
            return this.netInfoList;
        }

        public static final class Builder {
            private String engineType; 
            private java.util.List < NetInfoList> netInfoList; 

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * NetInfoList.
             */
            public Builder netInfoList(java.util.List < NetInfoList> netInfoList) {
                this.netInfoList = netInfoList;
                return this;
            }

            public EngineList build() {
                return new EngineList(this);
            } 

        } 

    }
}
