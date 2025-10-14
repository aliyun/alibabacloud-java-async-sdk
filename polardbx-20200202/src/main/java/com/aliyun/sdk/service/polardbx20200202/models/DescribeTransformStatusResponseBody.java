// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeTransformStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransformStatusResponseBody</p>
 */
public class DescribeTransformStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTransformStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransformStatusResponseBody create() {
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

        private Builder(DescribeTransformStatusResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTransformStatusResponseBody build() {
            return new DescribeTransformStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransformStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransformStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanCancel")
        private Boolean canCancel;

        @com.aliyun.core.annotation.NameInMap("CanFinish")
        private Boolean canFinish;

        @com.aliyun.core.annotation.NameInMap("CanSwitch")
        private Boolean canSwitch;

        @com.aliyun.core.annotation.NameInMap("CanUndoSwitch")
        private Boolean canUndoSwitch;

        @com.aliyun.core.annotation.NameInMap("EnterpriseInsName")
        private String enterpriseInsName;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("ReportSummary")
        private java.util.Map<String, ?> reportSummary;

        @com.aliyun.core.annotation.NameInMap("ReportTime")
        private Long reportTime;

        @com.aliyun.core.annotation.NameInMap("StandardInsName")
        private String standardInsName;

        private Data(Builder builder) {
            this.canCancel = builder.canCancel;
            this.canFinish = builder.canFinish;
            this.canSwitch = builder.canSwitch;
            this.canUndoSwitch = builder.canUndoSwitch;
            this.enterpriseInsName = builder.enterpriseInsName;
            this.phase = builder.phase;
            this.reportSummary = builder.reportSummary;
            this.reportTime = builder.reportTime;
            this.standardInsName = builder.standardInsName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canCancel
         */
        public Boolean getCanCancel() {
            return this.canCancel;
        }

        /**
         * @return canFinish
         */
        public Boolean getCanFinish() {
            return this.canFinish;
        }

        /**
         * @return canSwitch
         */
        public Boolean getCanSwitch() {
            return this.canSwitch;
        }

        /**
         * @return canUndoSwitch
         */
        public Boolean getCanUndoSwitch() {
            return this.canUndoSwitch;
        }

        /**
         * @return enterpriseInsName
         */
        public String getEnterpriseInsName() {
            return this.enterpriseInsName;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return reportSummary
         */
        public java.util.Map<String, ?> getReportSummary() {
            return this.reportSummary;
        }

        /**
         * @return reportTime
         */
        public Long getReportTime() {
            return this.reportTime;
        }

        /**
         * @return standardInsName
         */
        public String getStandardInsName() {
            return this.standardInsName;
        }

        public static final class Builder {
            private Boolean canCancel; 
            private Boolean canFinish; 
            private Boolean canSwitch; 
            private Boolean canUndoSwitch; 
            private String enterpriseInsName; 
            private String phase; 
            private java.util.Map<String, ?> reportSummary; 
            private Long reportTime; 
            private String standardInsName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canCancel = model.canCancel;
                this.canFinish = model.canFinish;
                this.canSwitch = model.canSwitch;
                this.canUndoSwitch = model.canUndoSwitch;
                this.enterpriseInsName = model.enterpriseInsName;
                this.phase = model.phase;
                this.reportSummary = model.reportSummary;
                this.reportTime = model.reportTime;
                this.standardInsName = model.standardInsName;
            } 

            /**
             * CanCancel.
             */
            public Builder canCancel(Boolean canCancel) {
                this.canCancel = canCancel;
                return this;
            }

            /**
             * CanFinish.
             */
            public Builder canFinish(Boolean canFinish) {
                this.canFinish = canFinish;
                return this;
            }

            /**
             * CanSwitch.
             */
            public Builder canSwitch(Boolean canSwitch) {
                this.canSwitch = canSwitch;
                return this;
            }

            /**
             * CanUndoSwitch.
             */
            public Builder canUndoSwitch(Boolean canUndoSwitch) {
                this.canUndoSwitch = canUndoSwitch;
                return this;
            }

            /**
             * EnterpriseInsName.
             */
            public Builder enterpriseInsName(String enterpriseInsName) {
                this.enterpriseInsName = enterpriseInsName;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * ReportSummary.
             */
            public Builder reportSummary(java.util.Map<String, ?> reportSummary) {
                this.reportSummary = reportSummary;
                return this;
            }

            /**
             * ReportTime.
             */
            public Builder reportTime(Long reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * StandardInsName.
             */
            public Builder standardInsName(String standardInsName) {
                this.standardInsName = standardInsName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
