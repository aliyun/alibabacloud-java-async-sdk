// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSiteTrafficSequenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteTrafficSequenceResponseBody</p>
 */
public class GetSiteTrafficSequenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficSequences")
    private java.util.List<TrafficSequences> trafficSequences;

    private GetSiteTrafficSequenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficSequences = builder.trafficSequences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteTrafficSequenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficSequences
     */
    public java.util.List<TrafficSequences> getTrafficSequences() {
        return this.trafficSequences;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TrafficSequences> trafficSequences; 

        private Builder() {
        } 

        private Builder(GetSiteTrafficSequenceResponseBody model) {
            this.requestId = model.requestId;
            this.trafficSequences = model.trafficSequences;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficSequences.
         */
        public Builder trafficSequences(java.util.List<TrafficSequences> trafficSequences) {
            this.trafficSequences = trafficSequences;
            return this;
        }

        public GetSiteTrafficSequenceResponseBody build() {
            return new GetSiteTrafficSequenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSiteTrafficSequenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSiteTrafficSequenceResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        private Configs(Builder builder) {
            this.configId = builder.configId;
            this.configType = builder.configType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        public static final class Builder {
            private Long configId; 
            private String configType; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.configId = model.configId;
                this.configType = model.configType;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSiteTrafficSequenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSiteTrafficSequenceResponseBody</p>
     */
    public static class FunctionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configs")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Configs> configs;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("HasConfig")
        private Boolean hasConfig;

        private FunctionList(Builder builder) {
            this.configs = builder.configs;
            this.functionName = builder.functionName;
            this.hasConfig = builder.hasConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionList create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.List<Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return hasConfig
         */
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        public static final class Builder {
            private java.util.List<Configs> configs; 
            private String functionName; 
            private Boolean hasConfig; 

            private Builder() {
            } 

            private Builder(FunctionList model) {
                this.configs = model.configs;
                this.functionName = model.functionName;
                this.hasConfig = model.hasConfig;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder configs(java.util.List<Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * HasConfig.
             */
            public Builder hasConfig(Boolean hasConfig) {
                this.hasConfig = hasConfig;
                return this;
            }

            public FunctionList build() {
                return new FunctionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSiteTrafficSequenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSiteTrafficSequenceResponseBody</p>
     */
    public static class TrafficSequences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionList")
        private java.util.List<FunctionList> functionList;

        @com.aliyun.core.annotation.NameInMap("Order")
        private String order;

        @com.aliyun.core.annotation.NameInMap("Router")
        private String router;

        @com.aliyun.core.annotation.NameInMap("SequenceCode")
        private String sequenceCode;

        @com.aliyun.core.annotation.NameInMap("SequenceName")
        private String sequenceName;

        private TrafficSequences(Builder builder) {
            this.functionList = builder.functionList;
            this.order = builder.order;
            this.router = builder.router;
            this.sequenceCode = builder.sequenceCode;
            this.sequenceName = builder.sequenceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficSequences create() {
            return builder().build();
        }

        /**
         * @return functionList
         */
        public java.util.List<FunctionList> getFunctionList() {
            return this.functionList;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return router
         */
        public String getRouter() {
            return this.router;
        }

        /**
         * @return sequenceCode
         */
        public String getSequenceCode() {
            return this.sequenceCode;
        }

        /**
         * @return sequenceName
         */
        public String getSequenceName() {
            return this.sequenceName;
        }

        public static final class Builder {
            private java.util.List<FunctionList> functionList; 
            private String order; 
            private String router; 
            private String sequenceCode; 
            private String sequenceName; 

            private Builder() {
            } 

            private Builder(TrafficSequences model) {
                this.functionList = model.functionList;
                this.order = model.order;
                this.router = model.router;
                this.sequenceCode = model.sequenceCode;
                this.sequenceName = model.sequenceName;
            } 

            /**
             * FunctionList.
             */
            public Builder functionList(java.util.List<FunctionList> functionList) {
                this.functionList = functionList;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * Router.
             */
            public Builder router(String router) {
                this.router = router;
                return this;
            }

            /**
             * SequenceCode.
             */
            public Builder sequenceCode(String sequenceCode) {
                this.sequenceCode = sequenceCode;
                return this;
            }

            /**
             * SequenceName.
             */
            public Builder sequenceName(String sequenceName) {
                this.sequenceName = sequenceName;
                return this;
            }

            public TrafficSequences build() {
                return new TrafficSequences(this);
            } 

        } 

    }
}
