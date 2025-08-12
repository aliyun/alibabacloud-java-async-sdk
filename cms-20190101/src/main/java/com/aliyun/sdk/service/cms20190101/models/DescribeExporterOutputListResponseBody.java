// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeExporterOutputListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExporterOutputListResponseBody</p>
 */
public class DescribeExporterOutputListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private Datapoints datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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

        private Builder() {
        } 

        private Builder(DescribeExporterOutputListResponseBody model) {
            this.code = model.code;
            this.datapoints = model.datapoints;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configuration sets for exporting monitoring data.</p>
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>sucess</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0E657631-CD6C-4C24-9637-98D000B9272C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeExporterOutputListResponseBody build() {
            return new DescribeExporterOutputListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExporterOutputListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExporterOutputListResponseBody</p>
     */
    public static class ConfigJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ak")
        private String ak;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
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

            private Builder() {
            } 

            private Builder(ConfigJson model) {
                this.ak = model.ak;
                this.endpoint = model.endpoint;
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAIpY33********</p>
             */
            public Builder ak(String ak) {
                this.ak = ak;
                return this;
            }

            /**
             * <p>The Log Service endpoint to which the monitoring data is exported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://cn-qingdao-share.log.aliyuncs.com">http://cn-qingdao-share.log.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>monitorlogstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The Log Service project to which the monitoring data is exported.</p>
             * 
             * <strong>example:</strong>
             * <p>exporter</p>
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
    /**
     * 
     * {@link DescribeExporterOutputListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExporterOutputListResponseBody</p>
     */
    public static class Datapoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigJson")
        private ConfigJson configJson;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DestName")
        private String destName;

        @com.aliyun.core.annotation.NameInMap("DestType")
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

            private Builder() {
            } 

            private Builder(Datapoint model) {
                this.configJson = model.configJson;
                this.createTime = model.createTime;
                this.destName = model.destName;
                this.destType = model.destType;
            } 

            /**
             * <p>The JSON object that contains the details about the destination to which the monitoring data is exported.</p>
             */
            public Builder configJson(ConfigJson configJson) {
                this.configJson = configJson;
                return this;
            }

            /**
             * <p>The time when the configuration set was created. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1584016495498</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the configuration set.</p>
             * 
             * <strong>example:</strong>
             * <p>exporterOut</p>
             */
            public Builder destName(String destName) {
                this.destName = destName;
                return this;
            }

            /**
             * <p>The service to which the monitoring data is exported.</p>
             * <blockquote>
             * <p>Only Log Service is supported. More services will be supported in the future.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SLS</p>
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
    /**
     * 
     * {@link DescribeExporterOutputListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExporterOutputListResponseBody</p>
     */
    public static class Datapoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datapoint")
        private java.util.List<Datapoint> datapoint;

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
        public java.util.List<Datapoint> getDatapoint() {
            return this.datapoint;
        }

        public static final class Builder {
            private java.util.List<Datapoint> datapoint; 

            private Builder() {
            } 

            private Builder(Datapoints model) {
                this.datapoint = model.datapoint;
            } 

            /**
             * Datapoint.
             */
            public Builder datapoint(java.util.List<Datapoint> datapoint) {
                this.datapoint = datapoint;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}
