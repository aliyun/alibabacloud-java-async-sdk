// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetJMeterLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterLogsResponseBody</p>
 */
public class GetJMeterLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentCount")
    private Integer agentCount;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<java.util.Map<String, ?>> logs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetJMeterLogsResponseBody(Builder builder) {
        this.agentCount = builder.agentCount;
        this.code = builder.code;
        this.logs = builder.logs;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentCount
     */
    public Integer getAgentCount() {
        return this.agentCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logs
     */
    public java.util.List<java.util.Map<String, ?>> getLogs() {
        return this.logs;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer agentCount; 
        private String code; 
        private java.util.List<java.util.Map<String, ?>> logs; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetJMeterLogsResponseBody model) {
            this.agentCount = model.agentCount;
            this.code = model.code;
            this.logs = model.logs;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of engines. The AgentCount value must be greater than the PageNumber value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder agentCount(Integer agentCount) {
            this.agentCount = agentCount;
            return this;
        }

        /**
         * <p>The system status code. If the request was successful, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;timeTS&quot;:1637114804326, &quot;instanceId&quot;:0, &quot;level&quot;:&quot;INFO&quot;, &quot;logger&quot;:&quot;org.apache.jmeter.util.JMeterUtils&quot;, &quot;sceneId&quot;:251546, 	&quot;planId&quot;:1501546, &quot;thread&quot;:&quot;main&quot;, &quot;time&quot;:&quot;2021-11-17T10:06Z&quot;, &quot;taskId&quot;:15015460000, &quot;logText&quot;:&quot;Setting Locale to en_EN\n&quot; }</p>
         */
        public Builder logs(java.util.List<java.util.Map<String, ?>> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, this parameter is left empty.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetJMeterLogsResponseBody build() {
            return new GetJMeterLogsResponseBody(this);
        } 

    } 

}
