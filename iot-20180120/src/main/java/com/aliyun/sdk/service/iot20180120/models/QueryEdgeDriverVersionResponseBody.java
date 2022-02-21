// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeDriverVersionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeDriverVersionResponseBody</p>
 */
public class QueryEdgeDriverVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeDriverVersionResponseBody build() {
            return new QueryEdgeDriverVersionResponseBody(this);
        } 

    } 

    public static class DriverVersionList extends TeaModel {
        @NameInMap("Argument")
        private String argument;

        @NameInMap("ConfigCheckRule")
        private String configCheckRule;

        @NameInMap("ContainerConfig")
        private String containerConfig;

        @NameInMap("Description")
        private String description;

        @NameInMap("DriverConfig")
        private String driverConfig;

        @NameInMap("DriverId")
        private String driverId;

        @NameInMap("DriverVersion")
        private String driverVersion;

        @NameInMap("EdgeVersion")
        private String edgeVersion;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("SourceConfig")
        private String sourceConfig;

        @NameInMap("VersionState")
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

            /**
             * Argument.
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * ConfigCheckRule.
             */
            public Builder configCheckRule(String configCheckRule) {
                this.configCheckRule = configCheckRule;
                return this;
            }

            /**
             * ContainerConfig.
             */
            public Builder containerConfig(String containerConfig) {
                this.containerConfig = containerConfig;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DriverConfig.
             */
            public Builder driverConfig(String driverConfig) {
                this.driverConfig = driverConfig;
                return this;
            }

            /**
             * DriverId.
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            /**
             * DriverVersion.
             */
            public Builder driverVersion(String driverVersion) {
                this.driverVersion = driverVersion;
                return this;
            }

            /**
             * EdgeVersion.
             */
            public Builder edgeVersion(String edgeVersion) {
                this.edgeVersion = edgeVersion;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
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
             * VersionState.
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
    public static class Data extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("DriverVersionList")
        private java.util.List < DriverVersionList> driverVersionList;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
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
        public java.util.List < DriverVersionList> getDriverVersionList() {
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
            private java.util.List < DriverVersionList> driverVersionList; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * DriverVersionList.
             */
            public Builder driverVersionList(java.util.List < DriverVersionList> driverVersionList) {
                this.driverVersionList = driverVersionList;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
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
