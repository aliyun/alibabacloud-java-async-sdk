// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetIndexMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexMonitorResponseBody</p>
 */
public class GetIndexMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetIndexMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexMonitorResponseBody create() {
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
    public Object getData() {
        return this.data;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Object data; 
        private String message; 
        private String requestId; 
        private Integer status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIndexMonitorResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The core data object of the response.</p>
         * <p><strong>pipelineCommercialType</strong> (String): The edition of the knowledge base.</p>
         * <ul>
         * <li><p>standard: Standard Edition</p>
         * </li>
         * <li><p>enterprise: Ultimate Edition</p>
         * </li>
         * </ul>
         * <p><strong>storageMonitorData</strong> (Object): The storage monitoring data of the knowledge base.</p>
         * <ul>
         * <li><p>indexStorageLimit (Number): The index storage limit of the knowledge base, in GB.</p>
         * </li>
         * <li><p>indexStorageUsage (Number): The current index storage usage of the knowledge base, in GB.</p>
         * </li>
         * </ul>
         * <p><strong>pipelineCommercialCu</strong> (Integer): The number of RCU for the Ultimate Edition knowledge base. For example: 2.</p>
         * <p><strong>qpsMonitorData</strong> (Object): The aggregated retrieval monitoring data for the knowledge base over the entire query period.</p>
         * <ul>
         * <li><p>peakQps (Integer): The peak QPS over the entire time period.</p>
         * </li>
         * <li><p>totalRequests (Integer): The total number of requests over the entire time period.</p>
         * </li>
         * <li><p>avgQpsOfActiveSeconds (Number): The average QPS during active seconds over the entire time period. Active seconds are seconds in which calls were made.</p>
         * </li>
         * <li><p>monitorData (Array): An array of detailed monitoring data broken down by time window. Each object in the array represents the performance statistics for a single time window.</p>
         * <details>
         * 
         * <summary>
         * 
         * <p>Sub-properties</p>
         * </summary>
         * 
         * <ul>
         * <li><p>successData (Object): The statistics for successful requests within this window.</p>
         * </li>
         * <li><p>limitData (Object): The statistics for rate-limited requests within this window.</p>
         * </li>
         * <li><p>failData (Object): The statistics for failed calls within this window.</p>
         * </li>
         * <li><p>peakQpsInWindowRange (Integer): The total peak QPS within this window (successful + rate-limited + failed).</p>
         * </li>
         * <li><p>totalRequests (Integer): The total number of requests within this window (successful + rate-limited + failed).</p>
         * </li>
         * <li><p>windowRange (Integer): The start time of the time window (UNIX timestamp in seconds).</p>
         * </li>
         * <li><p>windowRangeEnd (Integer): The end time of the time window (UNIX timestamp in seconds).</p>
         * </li>
         * <li><p>avgQpsOfActiveSeconds (Number): The average QPS during active seconds within this window.</p>
         * </li>
         * </ul>
         * <p><strong>The successData, limitData, and failData objects have the same internal structure, as described below:</strong></p>
         * <ul>
         * <li><p>peakQpsInWindowRange (Integer): The peak QPS for the corresponding status.</p>
         * </li>
         * <li><p>totalRequests (Integer): The total number of requests for the corresponding status.</p>
         * </li>
         * <li><p>avgQpsOfActiveSeconds (Number): The average QPS during active seconds for the corresponding status.</p>
         * </li>
         * </ul>
         * </details></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;code&quot;: &quot;Success&quot;,
         *     &quot;status_code&quot;: 200,
         *     &quot;data&quot;: {
         * &quot;pipelineCommercialType&quot;: &quot;standard&quot;,       &quot;storageMonitorData&quot;: Object{...},
         *         &quot;qpsMonitorData&quot;: Object{...}
         *     },
         *     &quot;success&quot;: true,
         *     &quot;message&quot;: &quot;success&quot;,
         *     &quot;request_id&quot;: &quot;65d34b79-b97e-478e-a0a3-xxx&quot;,
         *     &quot;status&quot;: &quot;SUCCESS&quot;
         * }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>778C0B3B-xxxx-5FC1-A947-36EDD13606AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(Integer status) {
            this.status = status;
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

        public GetIndexMonitorResponseBody build() {
            return new GetIndexMonitorResponseBody(this);
        } 

    } 

}
