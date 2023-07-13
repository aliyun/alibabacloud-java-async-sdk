// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExporterOutputListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExporterOutputListResponseBody</p>
 */
public class DescribeExporterOutputListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Datapoints")
    private Datapoints datapoints;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeExporterOutputListResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExporterOutputListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public Datapoints getDatapoints() {
        return this.datapoints;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Datapoints datapoints; 
        private String message; 
        private Integer pageNumber; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The configuration sets for exporting monitoring data.
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeExporterOutputListResponseBody build() {
            return new DescribeExporterOutputListResponseBody(this);
        } 

    } 

    public static class ConfigJson extends TeaModel {
        @NameInMap("ak")
        private String ak;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("logstore")
        private String logstore;

        @NameInMap("project")
        private String project;

        private ConfigJson(Builder builder) {
            this.ak = builder.ak;
            this.endpoint = builder.endpoint;
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigJson create() {
            return builder().build();
        }

        /**
         * @return ak
         */
        public String getAk() {
            return this.ak;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String ak; 
            private String endpoint; 
            private String logstore; 
            private String project; 

            /**
             * The AccessKey ID.
             */
            public Builder ak(String ak) {
                this.ak = ak;
                return this;
            }

            /**
             * The Log Service endpoint to which the monitoring data is exported.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The Logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * The Log Service project to which the monitoring data is exported.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public ConfigJson build() {
                return new ConfigJson(this);
            } 

        } 

    }
    public static class Datapoint extends TeaModel {
        @NameInMap("ConfigJson")
        private ConfigJson configJson;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DestName")
        private String destName;

        @NameInMap("DestType")
        private String destType;

        private Datapoint(Builder builder) {
            this.configJson = builder.configJson;
            this.createTime = builder.createTime;
            this.destName = builder.destName;
            this.destType = builder.destType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoint create() {
            return builder().build();
        }

        /**
         * @return configJson
         */
        public ConfigJson getConfigJson() {
            return this.configJson;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return destName
         */
        public String getDestName() {
            return this.destName;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        public static final class Builder {
            private ConfigJson configJson; 
            private Long createTime; 
            private String destName; 
            private String destType; 

            /**
             * The JSON object that contains the details about the destination to which the monitoring data is exported.
             */
            public Builder configJson(ConfigJson configJson) {
                this.configJson = configJson;
                return this;
            }

            /**
             * The time when the configuration set was created. The value is a UNIX timestamp.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the configuration set.
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * The service to which the monitoring data is exported.
             * <p>
             * 
             * > Only Log Service is supported. More services will be supported in the future.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            public Datapoint build() {
                return new Datapoint(this);
            } 

        } 

    }
    public static class Datapoints extends TeaModel {
        @NameInMap("Datapoint")
        private java.util.List < Datapoint> datapoint;

        private Datapoints(Builder builder) {
            this.datapoint = builder.datapoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoints create() {
            return builder().build();
        }

        /**
         * @return datapoint
         */
        public java.util.List < Datapoint> getDatapoint() {
            return this.datapoint;
        }

        public static final class Builder {
            private java.util.List < Datapoint> datapoint; 

            /**
             * Datapoint.
             */
            public Builder datapoint(java.util.List < Datapoint> datapoint) {
                this.datapoint = datapoint;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}
