// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedCheckWarningResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedCheckWarningResponseBody</p>
 */
public class DescribeExposedCheckWarningResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WarningList")
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * WarningList.
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
        @NameInMap("RiskId")
        private Long riskId;

        @NameInMap("RiskName")
        private String riskName;

        @NameInMap("SubTypeAlias")
        private String subTypeAlias;

        @NameInMap("TypeAlias")
        private String typeAlias;

        @NameInMap("Uuid")
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
             * RiskId.
             */
            public Builder riskId(Long riskId) {
                this.riskId = riskId;
                return this;
            }

            /**
             * RiskName.
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * SubTypeAlias.
             */
            public Builder subTypeAlias(String subTypeAlias) {
                this.subTypeAlias = subTypeAlias;
                return this;
            }

            /**
             * TypeAlias.
             */
            public Builder typeAlias(String typeAlias) {
                this.typeAlias = typeAlias;
                return this;
            }

            /**
             * Uuid.
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
