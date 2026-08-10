// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppTraceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppTraceDetailResponseBody</p>
 */
public class GetAiAppTraceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Analysis")
    private String analysis;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    @com.aliyun.core.annotation.NameInMap("WarningTime")
    private String warningTime;

    private GetAiAppTraceDetailResponseBody(Builder builder) {
        this.analysis = builder.analysis;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.channel = builder.channel;
        this.labels = builder.labels;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
        this.warningTime = builder.warningTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppTraceDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysis
     */
    public String getAnalysis() {
        return this.analysis;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return warningTime
     */
    public String getWarningTime() {
        return this.warningTime;
    }

    public static final class Builder {
        private String analysis; 
        private String appId; 
        private String appName; 
        private String channel; 
        private java.util.List<Labels> labels; 
        private String requestId; 
        private String traceId; 
        private String warningTime; 

        private Builder() {
        } 

        private Builder(GetAiAppTraceDetailResponseBody model) {
            this.analysis = model.analysis;
            this.appId = model.appId;
            this.appName = model.appName;
            this.channel = model.channel;
            this.labels = model.labels;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
            this.warningTime = model.warningTime;
        } 

        /**
         * Analysis.
         */
        public Builder analysis(String analysis) {
            this.analysis = analysis;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
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
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        /**
         * WarningTime.
         */
        public Builder warningTime(String warningTime) {
            this.warningTime = warningTime;
            return this;
        }

        public GetAiAppTraceDetailResponseBody build() {
            return new GetAiAppTraceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiAppTraceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppTraceDetailResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelDesc")
        private String labelDesc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Labels(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
            this.labelDesc = builder.labelDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelDesc
         */
        public String getLabelDesc() {
            return this.labelDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long count; 
            private String label; 
            private String labelDesc; 
            private String type; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.count = model.count;
                this.label = model.label;
                this.labelDesc = model.labelDesc;
                this.type = model.type;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelDesc.
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
