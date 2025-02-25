// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnvironmentResponseBody</p>
 */
public class GetEnvironmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID, used for tracing the API call chain.</p>
         * 
         * <strong>example:</strong>
         * <p>3F8EE674-BB08-5E92-BE6F-E4756A748B0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEnvironmentResponseBody build() {
            return new GetEnvironmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEnvironmentResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnvironmentResponseBody</p>
     */
    public static class StatisticsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceStatistics")
        private java.util.List<ResourceStatistic> resourceStatistics;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private StatisticsInfo(Builder builder) {
            this.resourceStatistics = builder.resourceStatistics;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticsInfo create() {
            return builder().build();
        }

        /**
         * @return resourceStatistics
         */
        public java.util.List<ResourceStatistic> getResourceStatistics() {
            return this.resourceStatistics;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ResourceStatistic> resourceStatistics; 
            private Integer totalCount; 

            /**
             * <p>The array of related resource information.</p>
             */
            public Builder resourceStatistics(java.util.List<ResourceStatistic> resourceStatistics) {
                this.resourceStatistics = resourceStatistics;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public StatisticsInfo build() {
                return new StatisticsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnvironmentResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnvironmentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("statisticsInfo")
        private StatisticsInfo statisticsInfo;

        @com.aliyun.core.annotation.NameInMap("subDomainInfos")
        private java.util.List<SubDomainInfo> subDomainInfos;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.createTimestamp = builder.createTimestamp;
            this._default = builder._default;
            this.description = builder.description;
            this.environmentId = builder.environmentId;
            this.gatewayInfo = builder.gatewayInfo;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.statisticsInfo = builder.statisticsInfo;
            this.subDomainInfos = builder.subDomainInfos;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return statisticsInfo
         */
        public StatisticsInfo getStatisticsInfo() {
            return this.statisticsInfo;
        }

        /**
         * @return subDomainInfos
         */
        public java.util.List<SubDomainInfo> getSubDomainInfos() {
            return this.subDomainInfos;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String alias; 
            private Long createTimestamp; 
            private Boolean _default; 
            private String description; 
            private String environmentId; 
            private GatewayInfo gatewayInfo; 
            private String name; 
            private String resourceGroupId; 
            private StatisticsInfo statisticsInfo; 
            private java.util.List<SubDomainInfo> subDomainInfos; 
            private Long updateTimestamp; 

            /**
             * <p>Environment alias.</p>
             * 
             * <strong>example:</strong>
             * <p>测试环境</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Whether it is the default environment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>Environment description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是xxx的xx项目测试环境</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cq7l5s5lhtgi6qasrdc0</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Gateway information</p>
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * <p>Environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzzzntl5njbpi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Related resource information.</p>
             */
            public Builder statisticsInfo(StatisticsInfo statisticsInfo) {
                this.statisticsInfo = statisticsInfo;
                return this;
            }

            /**
             * <p>List of subdomains.</p>
             */
            public Builder subDomainInfos(java.util.List<SubDomainInfo> subDomainInfos) {
                this.subDomainInfos = subDomainInfos;
                return this;
            }

            /**
             * <p>Update timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
