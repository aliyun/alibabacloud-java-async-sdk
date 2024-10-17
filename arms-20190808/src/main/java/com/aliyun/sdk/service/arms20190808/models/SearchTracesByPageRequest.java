// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchTracesByPageRequest} extends {@link RequestModel}
 *
 * <p>SearchTracesByPageRequest</p>
 */
public class SearchTracesByPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExclusionFilters")
    private java.util.List < ExclusionFilters> exclusionFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsError")
    private Boolean isError;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDuration")
    private Long minDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationName")
    private String operationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIp")
    private String serviceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private SearchTracesByPageRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.exclusionFilters = builder.exclusionFilters;
        this.isError = builder.isError;
        this.minDuration = builder.minDuration;
        this.operationName = builder.operationName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.reverse = builder.reverse;
        this.serviceIp = builder.serviceIp;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return exclusionFilters
     */
    public java.util.List < ExclusionFilters> getExclusionFilters() {
        return this.exclusionFilters;
    }

    /**
     * @return isError
     */
    public Boolean getIsError() {
        return this.isError;
    }

    /**
     * @return minDuration
     */
    public Long getMinDuration() {
        return this.minDuration;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return serviceIp
     */
    public String getServiceIp() {
        return this.serviceIp;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<SearchTracesByPageRequest, Builder> {
        private Long endTime; 
        private java.util.List < ExclusionFilters> exclusionFilters; 
        private Boolean isError; 
        private Long minDuration; 
        private String operationName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pid; 
        private String regionId; 
        private Boolean reverse; 
        private String serviceIp; 
        private String serviceName; 
        private Long startTime; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(SearchTracesByPageRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.exclusionFilters = request.exclusionFilters;
            this.isError = request.isError;
            this.minDuration = request.minDuration;
            this.operationName = request.operationName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.reverse = request.reverse;
            this.serviceIp = request.serviceIp;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
            this.tags = request.tags;
        } 

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1595210400000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder exclusionFilters(java.util.List < ExclusionFilters> exclusionFilters) {
            this.putQueryParameter("ExclusionFilters", exclusionFilters);
            this.exclusionFilters = exclusionFilters;
            return this;
        }

        /**
         * <p>Specifies whether to include the traces of abnormal calls.</p>
         * <ul>
         * <li><code>true</code>: No</li>
         * <li><code>false</code> (default): Yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isError(Boolean isError) {
            this.putQueryParameter("IsError", isError);
            this.isError = isError;
            return this;
        }

        /**
         * <p>The minimum amount of time consumed by traces. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minDuration(Long minDuration) {
            this.putQueryParameter("MinDuration", minDuration);
            this.minDuration = minDuration;
            return this;
        }

        /**
         * <p>The name of the traced span.</p>
         * 
         * <strong>example:</strong>
         * <p>/demo/queryNotExistDB/11</p>
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@9781be0f44dXXXX</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to sort the query results in chronological order or reverse chronological order. Default value: <code>false</code>.</p>
         * <ul>
         * <li><code>true</code>: sorts the query results in reverse chronological order.</li>
         * <li><code>false</code>: sorts the query results in chronological order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The IP address of the host where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.XX.XX</p>
         */
        public Builder serviceIp(String serviceIp) {
            this.putQueryParameter("ServiceIp", serviceIp);
            this.serviceIp = serviceIp;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-k8s-demo-subcomponent</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1595174400000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public SearchTracesByPageRequest build() {
            return new SearchTracesByPageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchTracesByPageRequest} extends {@link TeaModel}
     *
     * <p>SearchTracesByPageRequest</p>
     */
    public static class ExclusionFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ExclusionFilters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExclusionFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key that is used to filter the query results.</p>
             * 
             * <strong>example:</strong>
             * <p>http.status_code</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the key that is used to filter the query results.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExclusionFilters build() {
                return new ExclusionFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchTracesByPageRequest} extends {@link TeaModel}
     *
     * <p>SearchTracesByPageRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag. The following system preset fields are provided:</p>
             * <ul>
             * <li>traceId: the ID of the trace.</li>
             * <li>serverApp: the name of the server application.</li>
             * <li>clientApp: the name of the client application.</li>
             * <li>service: the name of the interface.</li>
             * <li>rpc: the type of the call.</li>
             * <li>msOfSpan: the duration exceeds a specific value.</li>
             * <li>clientIp: the IP address of the client.</li>
             * <li>serverIp: the IP address of the server.</li>
             * <li>isError: specifies whether the call is abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http.status_code</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
