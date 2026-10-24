// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link GetClientRuleStrategyStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientRuleStrategyStatisticsResponseBody</p>
 */
public class GetClientRuleStrategyStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientRuleStrategyStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientRuleStrategyStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClientRuleStrategyStatisticsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics of proactive defense policies.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A157FA-F957-3A5A-A6B8-5BBB8ADB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientRuleStrategyStatisticsResponseBody build() {
            return new GetClientRuleStrategyStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClientRuleStrategyStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientRuleStrategyStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomRuleCount")
        private Integer customRuleCount;

        @com.aliyun.core.annotation.NameInMap("SystemRuleCount")
        private Integer systemRuleCount;

        private Data(Builder builder) {
            this.customRuleCount = builder.customRuleCount;
            this.systemRuleCount = builder.systemRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customRuleCount
         */
        public Integer getCustomRuleCount() {
            return this.customRuleCount;
        }

        /**
         * @return systemRuleCount
         */
        public Integer getSystemRuleCount() {
            return this.systemRuleCount;
        }

        public static final class Builder {
            private Integer customRuleCount; 
            private Integer systemRuleCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customRuleCount = model.customRuleCount;
                this.systemRuleCount = model.systemRuleCount;
            } 

            /**
             * <p>The number of custom rule policies for proactive defense.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder customRuleCount(Integer customRuleCount) {
                this.customRuleCount = customRuleCount;
                return this;
            }

            /**
             * <p>The number of system rule policies for proactive defense.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder systemRuleCount(Integer systemRuleCount) {
                this.systemRuleCount = systemRuleCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
