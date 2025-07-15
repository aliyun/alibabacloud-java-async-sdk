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
 * {@link DescribeUpBpsPeakOfLineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpBpsPeakOfLineResponseBody</p>
 */
public class DescribeUpBpsPeakOfLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DescribeUpBpsPeakOfLines")
    private DescribeUpBpsPeakOfLines describeUpBpsPeakOfLines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUpBpsPeakOfLineResponseBody(Builder builder) {
        this.describeUpBpsPeakOfLines = builder.describeUpBpsPeakOfLines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpBpsPeakOfLineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return describeUpBpsPeakOfLines
     */
    public DescribeUpBpsPeakOfLines getDescribeUpBpsPeakOfLines() {
        return this.describeUpBpsPeakOfLines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeUpBpsPeakOfLines describeUpBpsPeakOfLines; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUpBpsPeakOfLineResponseBody model) {
            this.describeUpBpsPeakOfLines = model.describeUpBpsPeakOfLines;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about peak inbound bandwidth of the leased line on each day.</p>
         */
        public Builder describeUpBpsPeakOfLines(DescribeUpBpsPeakOfLines describeUpBpsPeakOfLines) {
            this.describeUpBpsPeakOfLines = describeUpBpsPeakOfLines;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpBpsPeakOfLineResponseBody build() {
            return new DescribeUpBpsPeakOfLineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpBpsPeakOfLineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpBpsPeakOfLineResponseBody</p>
     */
    public static class DescribeUpBpsPeakOfLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private Float bandWidth;

        @com.aliyun.core.annotation.NameInMap("PeakTime")
        private String peakTime;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("StatName")
        private String statName;

        private DescribeUpBpsPeakOfLine(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.peakTime = builder.peakTime;
            this.queryTime = builder.queryTime;
            this.statName = builder.statName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpBpsPeakOfLine create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Float getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return peakTime
         */
        public String getPeakTime() {
            return this.peakTime;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return statName
         */
        public String getStatName() {
            return this.statName;
        }

        public static final class Builder {
            private Float bandWidth; 
            private String peakTime; 
            private String queryTime; 
            private String statName; 

            private Builder() {
            } 

            private Builder(DescribeUpBpsPeakOfLine model) {
                this.bandWidth = model.bandWidth;
                this.peakTime = model.peakTime;
                this.queryTime = model.queryTime;
                this.statName = model.statName;
            } 

            /**
             * <p>The daily peak inbound bandwidth of the leased line.</p>
             * 
             * <strong>example:</strong>
             * <p>777.2727083333333</p>
             */
            public Builder bandWidth(Float bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The time when the daily peak bandwidth of the leased line is reached.</p>
             * 
             * <strong>example:</strong>
             * <p>1522180000000</p>
             */
            public Builder peakTime(String peakTime) {
                this.peakTime = peakTime;
                return this;
            }

            /**
             * <p>The time queried on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>1522080000000</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The category of the statistical data. If the DomainSwitch parameter is set to on, the value of this parameter is the domain name. If the DomainSwitch parameter is set to off or not specified, the value of this parameter is the user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>push-live.aliyuncs.com</p>
             */
            public Builder statName(String statName) {
                this.statName = statName;
                return this;
            }

            public DescribeUpBpsPeakOfLine build() {
                return new DescribeUpBpsPeakOfLine(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUpBpsPeakOfLineResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpBpsPeakOfLineResponseBody</p>
     */
    public static class DescribeUpBpsPeakOfLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DescribeUpBpsPeakOfLine")
        private java.util.List<DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine;

        private DescribeUpBpsPeakOfLines(Builder builder) {
            this.describeUpBpsPeakOfLine = builder.describeUpBpsPeakOfLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUpBpsPeakOfLines create() {
            return builder().build();
        }

        /**
         * @return describeUpBpsPeakOfLine
         */
        public java.util.List<DescribeUpBpsPeakOfLine> getDescribeUpBpsPeakOfLine() {
            return this.describeUpBpsPeakOfLine;
        }

        public static final class Builder {
            private java.util.List<DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine; 

            private Builder() {
            } 

            private Builder(DescribeUpBpsPeakOfLines model) {
                this.describeUpBpsPeakOfLine = model.describeUpBpsPeakOfLine;
            } 

            /**
             * DescribeUpBpsPeakOfLine.
             */
            public Builder describeUpBpsPeakOfLine(java.util.List<DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine) {
                this.describeUpBpsPeakOfLine = describeUpBpsPeakOfLine;
                return this;
            }

            public DescribeUpBpsPeakOfLines build() {
                return new DescribeUpBpsPeakOfLines(this);
            } 

        } 

    }
}
