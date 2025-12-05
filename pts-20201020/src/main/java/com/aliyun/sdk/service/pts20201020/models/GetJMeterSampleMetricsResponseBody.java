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
 * {@link GetJMeterSampleMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterSampleMetricsResponseBody</p>
 */
public class GetJMeterSampleMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleMetricList")
    private java.util.List<String> sampleMetricList;

    @com.aliyun.core.annotation.NameInMap("SamplerMap")
    private java.util.Map<String, ?> samplerMap;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetJMeterSampleMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sampleMetricList = builder.sampleMetricList;
        this.samplerMap = builder.samplerMap;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterSampleMetricsResponseBody create() {
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
     * @return sampleMetricList
     */
    public java.util.List<String> getSampleMetricList() {
        return this.sampleMetricList;
    }

    /**
     * @return samplerMap
     */
    public java.util.Map<String, ?> getSamplerMap() {
        return this.samplerMap;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<String> sampleMetricList; 
        private java.util.Map<String, ?> samplerMap; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetJMeterSampleMetricsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sampleMetricList = model.sampleMetricList;
            this.samplerMap = model.samplerMap;
            this.success = model.success;
        } 

        /**
         * <p>The system status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The metrics of the samplers.</p>
         */
        public Builder sampleMetricList(java.util.List<String> sampleMetricList) {
            this.sampleMetricList = sampleMetricList;
            return this;
        }

        /**
         * <p>The sampler list. You can find the sampler to be queried based on this list.</p>
         * 
         * <strong>example:</strong>
         * <p>{0:&quot;Http Request&quot;}</p>
         */
        public Builder samplerMap(java.util.Map<String, ?> samplerMap) {
            this.samplerMap = samplerMap;
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

        public GetJMeterSampleMetricsResponseBody build() {
            return new GetJMeterSampleMetricsResponseBody(this);
        } 

    } 

}
