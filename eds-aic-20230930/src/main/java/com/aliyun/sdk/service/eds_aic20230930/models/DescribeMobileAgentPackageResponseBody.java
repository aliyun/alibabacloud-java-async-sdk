// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeMobileAgentPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMobileAgentPackageResponseBody</p>
 */
public class DescribeMobileAgentPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PackageList")
    private java.util.List<PackageList> packageList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeMobileAgentPackageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.packageList = builder.packageList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMobileAgentPackageResponseBody create() {
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
     * @return packageList
     */
    public java.util.List<PackageList> getPackageList() {
        return this.packageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<PackageList> packageList; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeMobileAgentPackageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.packageList = model.packageList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of package information.</p>
         */
        public Builder packageList(java.util.List<PackageList> packageList) {
            this.packageList = packageList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMobileAgentPackageResponseBody build() {
            return new DescribeMobileAgentPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMobileAgentPackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackageResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMobileAgentPackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMobileAgentPackageResponseBody</p>
     */
    public static class PackageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredAt")
        private String expiredAt;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("PackageCredit")
        private String packageCredit;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("PackageSpec")
        private String packageSpec;

        @com.aliyun.core.annotation.NameInMap("PackageSpecName")
        private String packageSpecName;

        @com.aliyun.core.annotation.NameInMap("PackageStatus")
        private String packageStatus;

        @com.aliyun.core.annotation.NameInMap("PeriodEndTime")
        private String periodEndTime;

        @com.aliyun.core.annotation.NameInMap("PeriodStartTime")
        private String periodStartTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UsedCredit")
        private String usedCredit;

        private PackageList(Builder builder) {
            this.expiredAt = builder.expiredAt;
            this.instanceIds = builder.instanceIds;
            this.packageCredit = builder.packageCredit;
            this.packageId = builder.packageId;
            this.packageSpec = builder.packageSpec;
            this.packageSpecName = builder.packageSpecName;
            this.packageStatus = builder.packageStatus;
            this.periodEndTime = builder.periodEndTime;
            this.periodStartTime = builder.periodStartTime;
            this.tags = builder.tags;
            this.usedCredit = builder.usedCredit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageList create() {
            return builder().build();
        }

        /**
         * @return expiredAt
         */
        public String getExpiredAt() {
            return this.expiredAt;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return packageCredit
         */
        public String getPackageCredit() {
            return this.packageCredit;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return packageSpec
         */
        public String getPackageSpec() {
            return this.packageSpec;
        }

        /**
         * @return packageSpecName
         */
        public String getPackageSpecName() {
            return this.packageSpecName;
        }

        /**
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
        }

        /**
         * @return periodEndTime
         */
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        /**
         * @return periodStartTime
         */
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return usedCredit
         */
        public String getUsedCredit() {
            return this.usedCredit;
        }

        public static final class Builder {
            private String expiredAt; 
            private java.util.List<String> instanceIds; 
            private String packageCredit; 
            private String packageId; 
            private String packageSpec; 
            private String packageSpecName; 
            private String packageStatus; 
            private String periodEndTime; 
            private String periodStartTime; 
            private java.util.List<Tags> tags; 
            private String usedCredit; 

            private Builder() {
            } 

            private Builder(PackageList model) {
                this.expiredAt = model.expiredAt;
                this.instanceIds = model.instanceIds;
                this.packageCredit = model.packageCredit;
                this.packageId = model.packageId;
                this.packageSpec = model.packageSpec;
                this.packageSpecName = model.packageSpecName;
                this.packageStatus = model.packageStatus;
                this.periodEndTime = model.periodEndTime;
                this.periodStartTime = model.periodStartTime;
                this.tags = model.tags;
                this.usedCredit = model.usedCredit;
            } 

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-30 00:00:00</p>
             */
            public Builder expiredAt(String expiredAt) {
                this.expiredAt = expiredAt;
                return this;
            }

            /**
             * <p>The list of node instance IDs.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The credit quota of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder packageCredit(String packageCredit) {
                this.packageCredit = packageCredit;
                return this;
            }

            /**
             * <p>The package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cmag-bp19i1yxu60r7twy****</p>
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * <p>The package specification.</p>
             * 
             * <strong>example:</strong>
             * <p>advanced</p>
             */
            public Builder packageSpec(String packageSpec) {
                this.packageSpec = packageSpec;
                return this;
            }

            /**
             * PackageSpecName.
             */
            public Builder packageSpecName(String packageSpecName) {
                this.packageSpecName = packageSpecName;
                return this;
            }

            /**
             * <p>The package status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * PeriodEndTime.
             */
            public Builder periodEndTime(String periodEndTime) {
                this.periodEndTime = periodEndTime;
                return this;
            }

            /**
             * PeriodStartTime.
             */
            public Builder periodStartTime(String periodStartTime) {
                this.periodStartTime = periodStartTime;
                return this;
            }

            /**
             * <p>The labels.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of credits that have been used.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder usedCredit(String usedCredit) {
                this.usedCredit = usedCredit;
                return this;
            }

            public PackageList build() {
                return new PackageList(this);
            } 

        } 

    }
}
