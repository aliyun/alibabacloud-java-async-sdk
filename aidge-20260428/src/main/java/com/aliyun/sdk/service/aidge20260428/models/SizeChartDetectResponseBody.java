// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link SizeChartDetectResponseBody} extends {@link TeaModel}
 *
 * <p>SizeChartDetectResponseBody</p>
 */
public class SizeChartDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SizeChartDetectResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SizeChartDetectResponseBody create() {
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
    public Data getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SizeChartDetectResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The size chart detection result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SizeChartDetectResponseBody build() {
            return new SizeChartDetectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SizeChartDetectResponseBody} extends {@link TeaModel}
     *
     * <p>SizeChartDetectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsSizeChart")
        private Boolean isSizeChart;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.isSizeChart = builder.isSizeChart;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isSizeChart
         */
        public Boolean getIsSizeChart() {
            return this.isSizeChart;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Boolean isSizeChart; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.isSizeChart = model.isSizeChart;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>Indicates whether the image is a size chart.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSizeChart(Boolean isSizeChart) {
                this.isSizeChart = isSizeChart;
                return this;
            }

            /**
             * <p>The usage information. The key is the usage name and the value is the count.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessedImageCount&quot;:1}</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
