// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link QueryRtcAsrTasksResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRtcAsrTasksResponseBody</p>
 */
public class QueryRtcAsrTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Long retCode;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.Map<String, ?> tasks;

    private QueryRtcAsrTasksResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRtcAsrTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Long getRetCode() {
        return this.retCode;
    }

    /**
     * @return tasks
     */
    public java.util.Map<String, ?> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private Long retCode; 
        private java.util.Map<String, ?> tasks; 

        private Builder() {
        } 

        private Builder(QueryRtcAsrTasksResponseBody model) {
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
            this.tasks = model.tasks;
        } 

        /**
         * <p>The result of the request. If success is returned, the request was successful. If an error message is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D8ADAB55-1BB8-5C01-8434-C45D353BB1FD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The HTTP status code. HTTP status code 2000 indicates that the request was successful. Other HTTP status codes indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder retCode(Long retCode) {
            this.retCode = retCode;
            return this;
        }

        /**
         * <p>The results returned for the tasks.</p>
         */
        public Builder tasks(java.util.Map<String, ?> tasks) {
            this.tasks = tasks;
            return this;
        }

        public QueryRtcAsrTasksResponseBody build() {
            return new QueryRtcAsrTasksResponseBody(this);
        } 

    } 

}
