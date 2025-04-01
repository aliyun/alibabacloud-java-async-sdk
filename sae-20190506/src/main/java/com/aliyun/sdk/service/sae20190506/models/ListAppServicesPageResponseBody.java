// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAppServicesPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppServicesPageResponseBody</p>
 */
public class ListAppServicesPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListAppServicesPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppServicesPageResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ListAppServicesPageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The request was successful.</li>
         * <li><strong>3xx</strong>: The request was redirected.</li>
         * <li><strong>4xx</strong>: The request failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of services.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the request was successful, <strong>ErrorCode</strong> is not returned.</li>
         * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> section of this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2583E089-99C2-562E-8B7E-73512136****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the microservice list was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The list was obtained.</li>
         * <li><strong>false</strong>: The list failed to be obtained.</li>
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
         * <p>The ID of the trace. The ID is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0c816394483660457498e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListAppServicesPageResponseBody build() {
            return new ListAppServicesPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppServicesPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppServicesPageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdasAppId")
        private String edasAppId;

        @com.aliyun.core.annotation.NameInMap("EdasAppName")
        private String edasAppName;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Long instanceNum;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.edasAppId = builder.edasAppId;
            this.edasAppName = builder.edasAppName;
            this.group = builder.group;
            this.instanceNum = builder.instanceNum;
            this.serviceName = builder.serviceName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return edasAppId
         */
        public String getEdasAppId() {
            return this.edasAppId;
        }

        /**
         * @return edasAppName
         */
        public String getEdasAppName() {
            return this.edasAppName;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return instanceNum
         */
        public Long getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String edasAppId; 
            private String edasAppName; 
            private String group; 
            private Long instanceNum; 
            private String serviceName; 
            private String version; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.edasAppId = model.edasAppId;
                this.edasAppName = model.edasAppName;
                this.group = model.group;
                this.instanceNum = model.instanceNum;
                this.serviceName = model.serviceName;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>hc4fs1****@98314c8790b****</p>
             */
            public Builder edasAppId(String edasAppId) {
                this.edasAppId = edasAppId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-micro-service-******</p>
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * <p>The group to which the service belongs. You can create a custom group.</p>
             * 
             * <strong>example:</strong>
             * <p>springCloud</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceNum(Long instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>edas.service.provider</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The version of a service. You can create a custom version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppServicesPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppServicesPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private String currentPage;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private String totalSize;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
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
        public String getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public String getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String currentPage; 
            private String pageNumber; 
            private String pageSize; 
            private java.util.List<Result> result; 
            private String totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The page number of the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(String currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned on each page. Valid values: 0 to 9999.</p>
             * 
             * <strong>example:</strong>
             * <p>9999</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The result returned.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalSize(String totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
