// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeDriverVersionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeDriverVersionResponseBody</p>
 */
public class QueryEdgeDriverVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEdgeDriverVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeDriverVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEdgeDriverVersionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABA0CD1F-4270-42FE-84AD-D612240196F7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeDriverVersionResponseBody build() {
            return new QueryEdgeDriverVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeDriverVersionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeDriverVersionResponseBody</p>
     */
    public static class DriverVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Argument")
        private String argument;

        @com.aliyun.core.annotation.NameInMap("ConfigCheckRule")
        private String configCheckRule;

        @com.aliyun.core.annotation.NameInMap("ContainerConfig")
        private String containerConfig;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DriverConfig")
        private String driverConfig;

        @com.aliyun.core.annotation.NameInMap("DriverId")
        private String driverId;

        @com.aliyun.core.annotation.NameInMap("DriverVersion")
        private String driverVersion;

        @com.aliyun.core.annotation.NameInMap("EdgeVersion")
        private String edgeVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("SourceConfig")
        private String sourceConfig;

        @com.aliyun.core.annotation.NameInMap("VersionState")
        private String versionState;

        private DriverVersionList(Builder builder) {
            this.argument = builder.argument;
            this.configCheckRule = builder.configCheckRule;
            this.containerConfig = builder.containerConfig;
            this.description = builder.description;
            this.driverConfig = builder.driverConfig;
            this.driverId = builder.driverId;
            this.driverVersion = builder.driverVersion;
            this.edgeVersion = builder.edgeVersion;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.sourceConfig = builder.sourceConfig;
            this.versionState = builder.versionState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriverVersionList create() {
            return builder().build();
        }

        /**
         * @return argument
         */
        public String getArgument() {
            return this.argument;
        }

        /**
         * @return configCheckRule
         */
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        /**
         * @return containerConfig
         */
        public String getContainerConfig() {
            return this.containerConfig;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return driverConfig
         */
        public String getDriverConfig() {
            return this.driverConfig;
        }

        /**
         * @return driverId
         */
        public String getDriverId() {
            return this.driverId;
        }

        /**
         * @return driverVersion
         */
        public String getDriverVersion() {
            return this.driverVersion;
        }

        /**
         * @return edgeVersion
         */
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return sourceConfig
         */
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        /**
         * @return versionState
         */
        public String getVersionState() {
            return this.versionState;
        }

        public static final class Builder {
            private String argument; 
            private String configCheckRule; 
            private String containerConfig; 
            private String description; 
            private String driverConfig; 
            private String driverId; 
            private String driverVersion; 
            private String edgeVersion; 
            private Long gmtCreateTimestamp; 
            private Long gmtModifiedTimestamp; 
            private String sourceConfig; 
            private String versionState; 

            private Builder() {
            } 

            private Builder(DriverVersionList model) {
                this.argument = model.argument;
                this.configCheckRule = model.configCheckRule;
                this.containerConfig = model.containerConfig;
                this.description = model.description;
                this.driverConfig = model.driverConfig;
                this.driverId = model.driverId;
                this.driverVersion = model.driverVersion;
                this.edgeVersion = model.edgeVersion;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.sourceConfig = model.sourceConfig;
                this.versionState = model.versionState;
            } 

            /**
             * <p>The Java Virtual Machine (JVM) startup parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>-XX:+PrintGCDetails</p>
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * <p>The rule for verifying configurations. The value is a JSON string in the following format:</p>
             * <p><code>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}</code></p>
             * <p>The JSON string contains the following parameters:</p>
             * <ul>
             * <li>driverConfig: the rule for verifying the configuration of the driver when the driver is to be deployed in an edge instance.</li>
             * <li>deviceConfig: the rule for verifying the configurations of devices that use the driver when the driver is to be deployed in an edge instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}}</p>
             */
            public Builder configCheckRule(String configCheckRule) {
                this.configCheckRule = configCheckRule;
                return this;
            }

            /**
             * <p>The configuration of the container where the driver runs. The value is a JSON string. For more information about parameters in the JSON string, see the following parameter description of ContainerConfig.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;devMappings&quot;:[],&quot;hostNetworkMode&quot;:0,&quot;portMappings&quot;:[],&quot;privileged&quot;:1,&quot;volumeMappings&quot;:[]}</p>
             */
            public Builder containerConfig(String containerConfig) {
                this.containerConfig = containerConfig;
                return this;
            }

            /**
             * <p>The description of the driver.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configuration of the driver. The value is a JSON string in the following format:</p>
             * <p><code>{&quot;format&quot;:&quot;JSON&quot;,&quot;content&quot;:&quot;{}&quot;}</code></p>
             * <p>The JSON string contains the following parameters:</p>
             * <ul>
             * <li>format: the format of the driver configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</li>
             * <li>content: the content of the driver configuration. If the format parameter is set to KV or JSON, the value of this parameter is the configuration content. If the format parameter is set to FILE, the value of this parameter is the URL of the configuration file stored in Object Storage Service (OSS).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;content&quot;:&quot;{\&quot;defaultConfig\&quot;:\&quot;this is default driver config demo\&quot;}&quot;,&quot;format&quot;:&quot;JSON&quot;}]</p>
             */
            public Builder driverConfig(String driverConfig) {
                this.driverConfig = driverConfig;
                return this;
            }

            /**
             * <p>The ID of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>fec565038d7544978d9aed5c1a******</p>
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            /**
             * <p>The version number of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.0</p>
             */
            public Builder driverVersion(String driverVersion) {
                this.driverVersion = driverVersion;
                return this;
            }

            /**
             * <p>The earliest version of Link IoT Edge that is supported by the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder edgeVersion(String edgeVersion) {
                this.edgeVersion = edgeVersion;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the driver was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The last UNIX timestamp when the driver was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * SourceConfig.
             */
            public Builder sourceConfig(String sourceConfig) {
                this.sourceConfig = sourceConfig;
                return this;
            }

            /**
             * <p>The status of the driver version. Valid values:</p>
             * <ul>
             * <li>0: The driver version was not published.</li>
             * <li>1: The driver version was published.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder versionState(String versionState) {
                this.versionState = versionState;
                return this;
            }

            public DriverVersionList build() {
                return new DriverVersionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeDriverVersionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeDriverVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("DriverVersionList")
        private java.util.List<DriverVersionList> driverVersionList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.driverVersionList = builder.driverVersionList;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return driverVersionList
         */
        public java.util.List<DriverVersionList> getDriverVersionList() {
            return this.driverVersionList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<DriverVersionList> driverVersionList; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.driverVersionList = model.driverVersionList;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The information about each version of the driver.</p>
             */
            public Builder driverVersionList(java.util.List<DriverVersionList> driverVersionList) {
                this.driverVersionList = driverVersionList;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The number of driver versions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
