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
         * PackageList.
         */
        public Builder packageList(java.util.List<PackageList> packageList) {
            this.packageList = packageList;
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
         * TotalCount.
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

        @com.aliyun.core.annotation.NameInMap("PackageStatus")
        private String packageStatus;

        @com.aliyun.core.annotation.NameInMap("UsedCredit")
        private String usedCredit;

        private PackageList(Builder builder) {
            this.expiredAt = builder.expiredAt;
            this.instanceIds = builder.instanceIds;
            this.packageCredit = builder.packageCredit;
            this.packageId = builder.packageId;
            this.packageSpec = builder.packageSpec;
            this.packageStatus = builder.packageStatus;
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
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
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
            private String packageStatus; 
            private String usedCredit; 

            private Builder() {
            } 

            private Builder(PackageList model) {
                this.expiredAt = model.expiredAt;
                this.instanceIds = model.instanceIds;
                this.packageCredit = model.packageCredit;
                this.packageId = model.packageId;
                this.packageSpec = model.packageSpec;
                this.packageStatus = model.packageStatus;
                this.usedCredit = model.usedCredit;
            } 

            /**
             * ExpiredAt.
             */
            public Builder expiredAt(String expiredAt) {
                this.expiredAt = expiredAt;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * PackageCredit.
             */
            public Builder packageCredit(String packageCredit) {
                this.packageCredit = packageCredit;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * PackageSpec.
             */
            public Builder packageSpec(String packageSpec) {
                this.packageSpec = packageSpec;
                return this;
            }

            /**
             * PackageStatus.
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * UsedCredit.
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
