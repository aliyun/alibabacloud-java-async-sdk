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
 * {@link GetLindormV2InstanceEngineListResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormV2InstanceEngineListResponseBody</p>
 */
public class GetLindormV2InstanceEngineListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("EngineList")
    private java.util.List<EngineList> engineList;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLindormV2InstanceEngineListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.engineList = builder.engineList;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormV2InstanceEngineListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetLindormV2InstanceEngineListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.engineList = model.engineList;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * EngineList.
         */
        public Builder engineList(java.util.List<EngineList> engineList) {
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

        public GetLindormV2InstanceEngineListResponseBody build() {
            return new GetLindormV2InstanceEngineListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormV2InstanceEngineListResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceEngineListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(NetInfoList model) {
                this.accessType = model.accessType;
                this.connectionString = model.connectionString;
                this.netType = model.netType;
                this.port = model.port;
            } 

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
    /**
     * 
     * {@link GetLindormV2InstanceEngineListResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceEngineListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(EngineList model) {
                this.engineType = model.engineType;
                this.netInfoList = model.netInfoList;
            } 

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
