// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedCheckWarningResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedCheckWarningResponseBody</p>
 */
public class DescribeExposedCheckWarningResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WarningList")
    private java.util.List < WarningList> warningList;

    private DescribeExposedCheckWarningResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.warningList = builder.warningList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedCheckWarningResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return warningList
     */
    public java.util.List < WarningList> getWarningList() {
        return this.warningList;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private java.util.List < WarningList> warningList; 

        /**
         * The total number of entries returned.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the baseline risk items of the exposed server.
         */
        public Builder warningList(java.util.List < WarningList> warningList) {
            this.warningList = warningList;
            return this;
        }

        public DescribeExposedCheckWarningResponseBody build() {
            return new DescribeExposedCheckWarningResponseBody(this);
        } 

    } 

    public static class WarningList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskId")
        private Long riskId;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("SubTypeAlias")
        private String subTypeAlias;

        @com.aliyun.core.annotation.NameInMap("TypeAlias")
        private String typeAlias;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private WarningList(Builder builder) {
            this.riskId = builder.riskId;
            this.riskName = builder.riskName;
            this.subTypeAlias = builder.subTypeAlias;
            this.typeAlias = builder.typeAlias;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningList create() {
            return builder().build();
        }

        /**
         * @return riskId
         */
        public Long getRiskId() {
            return this.riskId;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return subTypeAlias
         */
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        /**
         * @return typeAlias
         */
        public String getTypeAlias() {
            return this.typeAlias;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long riskId; 
            private String riskName; 
            private String subTypeAlias; 
            private String typeAlias; 
            private String uuid; 

            /**
             * The ID of the baseline.
             * <p>
             * 
             * >  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of baselines.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * The display name of the baseline sub type.
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * The display name of the baseline type.
             */
            public Builder typeAlias(String typeAlias) {
                this.typeAlias = typeAlias;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public WarningList build() {
                return new WarningList(this);
            } 

        } 

    }
}
