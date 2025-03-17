// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListApiDatasourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiDatasourceResponseBody</p>
 */
public class ListApiDatasourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListApiDatasourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiDatasourceResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListApiDatasourceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The query results are returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListApiDatasourceResponseBody build() {
            return new ListApiDatasourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiDatasourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Float dataSize;

        @com.aliyun.core.annotation.NameInMap("DateUpdateTime")
        private String dateUpdateTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("StatusType")
        private Integer statusType;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.body = builder.body;
            this.dataSize = builder.dataSize;
            this.dateUpdateTime = builder.dateUpdateTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.jobId = builder.jobId;
            this.parameters = builder.parameters;
            this.showName = builder.showName;
            this.statusType = builder.statusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return dataSize
         */
        public Float getDataSize() {
            return this.dataSize;
        }

        /**
         * @return dateUpdateTime
         */
        public String getDateUpdateTime() {
            return this.dateUpdateTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return statusType
         */
        public Integer getStatusType() {
            return this.statusType;
        }

        public static final class Builder {
            private String apiId; 
            private String body; 
            private Float dataSize; 
            private String dateUpdateTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private String jobId; 
            private String parameters; 
            private String showName; 
            private Integer statusType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiId = model.apiId;
                this.body = model.body;
                this.dataSize = model.dataSize;
                this.dateUpdateTime = model.dateUpdateTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.jobId = model.jobId;
                this.parameters = model.parameters;
                this.showName = model.showName;
                this.statusType = model.statusType;
            } 

            /**
             * <p>The ID of the API data source.</p>
             * 
             * <strong>example:</strong>
             * <p>0f2c3c6409be4dc0810f2a5785e816a8</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The parameter configuration of the query statement in JSON format. You can customize the parameter configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The data volume of the API data source.</p>
             * <ul>
             * <li>Unit: Kbit/s</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.39746094</p>
             */
            public Builder dataSize(Float dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * <p>The last synchronization time of the API data source.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-25 16:19:43</p>
             */
            public Builder dateUpdateTime(String dateUpdateTime) {
                this.dateUpdateTime = dateUpdateTime;
                return this;
            }

            /**
             * <p>The time when the quota plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-25 16:19:43</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the optimization job was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-25 16:19:43</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>REST_API_SYNC_0f2c3c6409be4dc0810f2a5785e816a8</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The parameter configurations in the JSONArray format.</p>
             * <ul>
             * <li>name: parameter name</li>
             * <li>value: the parameter value</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;token&quot;,&quot;value&quot;:&quot;xxxxxxxxxxxx&quot;},{&quot;name&quot;:&quot;pageSize&quot;,&quot;value&quot;:100}]</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The name of the API data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test data source</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The status of the API data source synchronization task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: the to be run.</li>
             * <li>1: The is running.</li>
             * <li>2: The is successfully.</li>
             * <li>3: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder statusType(Integer statusType) {
                this.statusType = statusType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApiDatasourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiDatasourceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalNum; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalNum = model.totalNum;
            } 

            /**
             * <p>The list of API data sources that were queried.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of rows per page set when the interface is requested.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
