// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterSampleMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJMeterSampleMetricsResponseBody</p>
 */
public class GetJMeterSampleMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SampleMetricList")
    private java.util.List < String > sampleMetricList;

    @NameInMap("SamplerMap")
    private java.util.Map < String, ? > samplerMap;

    @NameInMap("Success")
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
    public java.util.List < String > getSampleMetricList() {
        return this.sampleMetricList;
    }

    /**
     * @return samplerMap
     */
    public java.util.Map < String, ? > getSamplerMap() {
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
        private java.util.List < String > sampleMetricList; 
        private java.util.Map < String, ? > samplerMap; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 采样器聚合数据列表
         */
        public Builder sampleMetricList(java.util.List < String > sampleMetricList) {
            this.sampleMetricList = sampleMetricList;
            return this;
        }

        /**
         * 采样器列表，可根据该列表传递需要查询的采样器
         */
        public Builder samplerMap(java.util.Map < String, ? > samplerMap) {
            this.samplerMap = samplerMap;
            return this;
        }

        /**
         * Success.
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
