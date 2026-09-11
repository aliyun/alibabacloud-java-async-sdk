// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDtsServiceLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsServiceLogResponseBody</p>
 */
public class DescribeDtsServiceLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceLogContexts")
    private java.util.List<ServiceLogContexts> serviceLogContexts;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeDtsServiceLogResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.serviceLogContexts = builder.serviceLogContexts;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsServiceLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceLogContexts
     */
    public java.util.List<ServiceLogContexts> getServiceLogContexts() {
        return this.serviceLogContexts;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private java.util.List<ServiceLogContexts> serviceLogContexts; 
        private Boolean success; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDtsServiceLogResponseBody model) {
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.serviceLogContexts = model.serviceLogContexts;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The dynamic error code. This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message used to replace the <strong>%s</strong> variable in the <strong>ErrMessage</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of log entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F87DF250-952C-47FE-8A02-69414FAA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task logs details of the node.</p>
         */
        public Builder serviceLogContexts(java.util.List<ServiceLogContexts> serviceLogContexts) {
            this.serviceLogContexts = serviceLogContexts;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of log entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDtsServiceLogResponseBody build() {
            return new DescribeDtsServiceLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDtsServiceLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsServiceLogResponseBody</p>
     */
    public static class ServiceLogContexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ServiceLogContexts(Builder builder) {
            this.context = builder.context;
            this.state = builder.state;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceLogContexts create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String context; 
            private String state; 
            private String time; 

            private Builder() {
            } 

            private Builder(ServiceLogContexts model) {
                this.context = model.context;
                this.state = model.state;
                this.time = model.time;
            } 

            /**
             * <p>The specific log information.</p>
             * 
             * <strong>example:</strong>
             * <p>Statistics: generator = 369173; collector = 470109; replicator = 2470; ping = 2/2/2; execute = 29/29/29; rt = 29/29/29; state = IDLE; queries = -1; exceptions = {connects = 0, replicates = 0}; infos = {}</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The status of the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the log was collected, in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-13T09:13:39.443+00:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ServiceLogContexts build() {
                return new ServiceLogContexts(this);
            } 

        } 

    }
}
