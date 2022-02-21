// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseResponseBody</p>
 */
public class DescribeDiagnoseResponseBody extends TeaModel {
    @NameInMap("DiagnoseInstances")
    private DiagnoseInstances diagnoseInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnoseResponseBody(Builder builder) {
        this.diagnoseInstances = builder.diagnoseInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnoseInstances
     */
    public DiagnoseInstances getDiagnoseInstances() {
        return this.diagnoseInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DiagnoseInstances diagnoseInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DiagnoseInstances.
         */
        public Builder diagnoseInstances(DiagnoseInstances diagnoseInstances) {
            this.diagnoseInstances = diagnoseInstances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnoseResponseBody build() {
            return new DescribeDiagnoseResponseBody(this);
        } 

    } 

    public static class DiagnoseInstance extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DiagnoseAction")
        private String diagnoseAction;

        @NameInMap("DiagnoseId")
        private String diagnoseId;

        @NameInMap("DiagnoseRequestId")
        private String diagnoseRequestId;

        @NameInMap("DiskCategory")
        private String diskCategory;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @NameInMap("IzNo")
        private String izNo;

        @NameInMap("Mark")
        private String mark;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("Product")
        private String product;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Solutions")
        private String solutions;

        @NameInMap("Star")
        private Integer star;

        @NameInMap("Status")
        private String status;

        private DiagnoseInstance(Builder builder) {
            this.amount = builder.amount;
            this.creationTime = builder.creationTime;
            this.diagnoseAction = builder.diagnoseAction;
            this.diagnoseId = builder.diagnoseId;
            this.diagnoseRequestId = builder.diagnoseRequestId;
            this.diskCategory = builder.diskCategory;
            this.errorCode = builder.errorCode;
            this.expireTime = builder.expireTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceTypeName = builder.instanceTypeName;
            this.izNo = builder.izNo;
            this.mark = builder.mark;
            this.modificationTime = builder.modificationTime;
            this.networkType = builder.networkType;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.solutions = builder.solutions;
            this.star = builder.star;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseInstance create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diagnoseAction
         */
        public String getDiagnoseAction() {
            return this.diagnoseAction;
        }

        /**
         * @return diagnoseId
         */
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        /**
         * @return diagnoseRequestId
         */
        public String getDiagnoseRequestId() {
            return this.diagnoseRequestId;
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceTypeName
         */
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return mark
         */
        public String getMark() {
            return this.mark;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return solutions
         */
        public String getSolutions() {
            return this.solutions;
        }

        /**
         * @return star
         */
        public Integer getStar() {
            return this.star;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer amount; 
            private String creationTime; 
            private String diagnoseAction; 
            private String diagnoseId; 
            private String diagnoseRequestId; 
            private String diskCategory; 
            private String errorCode; 
            private String expireTime; 
            private String instanceChargeType; 
            private String instanceTypeName; 
            private String izNo; 
            private String mark; 
            private String modificationTime; 
            private String networkType; 
            private Integer period; 
            private String periodUnit; 
            private String product; 
            private String regionId; 
            private String solutions; 
            private Integer star; 
            private String status; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DiagnoseAction.
             */
            public Builder diagnoseAction(String diagnoseAction) {
                this.diagnoseAction = diagnoseAction;
                return this;
            }

            /**
             * DiagnoseId.
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * DiagnoseRequestId.
             */
            public Builder diagnoseRequestId(String diagnoseRequestId) {
                this.diagnoseRequestId = diagnoseRequestId;
                return this;
            }

            /**
             * DiskCategory.
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceTypeName.
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
                return this;
            }

            /**
             * IzNo.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * Mark.
             */
            public Builder mark(String mark) {
                this.mark = mark;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Solutions.
             */
            public Builder solutions(String solutions) {
                this.solutions = solutions;
                return this;
            }

            /**
             * Star.
             */
            public Builder star(Integer star) {
                this.star = star;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DiagnoseInstance build() {
                return new DiagnoseInstance(this);
            } 

        } 

    }
    public static class DiagnoseInstances extends TeaModel {
        @NameInMap("DiagnoseInstance")
        private java.util.List < DiagnoseInstance> diagnoseInstance;

        private DiagnoseInstances(Builder builder) {
            this.diagnoseInstance = builder.diagnoseInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseInstances create() {
            return builder().build();
        }

        /**
         * @return diagnoseInstance
         */
        public java.util.List < DiagnoseInstance> getDiagnoseInstance() {
            return this.diagnoseInstance;
        }

        public static final class Builder {
            private java.util.List < DiagnoseInstance> diagnoseInstance; 

            /**
             * DiagnoseInstance.
             */
            public Builder diagnoseInstance(java.util.List < DiagnoseInstance> diagnoseInstance) {
                this.diagnoseInstance = diagnoseInstance;
                return this;
            }

            public DiagnoseInstances build() {
                return new DiagnoseInstances(this);
            } 

        } 

    }
}
