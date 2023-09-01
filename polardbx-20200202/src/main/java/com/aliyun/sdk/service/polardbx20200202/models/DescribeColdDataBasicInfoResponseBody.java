// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColdDataBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColdDataBasicInfoResponseBody</p>
 */
public class DescribeColdDataBasicInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeColdDataBasicInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColdDataBasicInfoResponseBody create() {
        return builder().build();
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeColdDataBasicInfoResponseBody build() {
            return new DescribeColdDataBasicInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BackupSetCount")
        private Integer backupSetCount;

        @NameInMap("BackupSetSpaceSize")
        private Double backupSetSpaceSize;

        @NameInMap("CloudProduct")
        private String cloudProduct;

        @NameInMap("CurrentSpaceSize")
        private Double currentSpaceSize;

        @NameInMap("DataRedundancyType")
        private String dataRedundancyType;

        @NameInMap("EnableStatus")
        private Boolean enableStatus;

        @NameInMap("ReadAccessNum")
        private Long readAccessNum;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VolumeName")
        private String volumeName;

        @NameInMap("WriteAccessNum")
        private Double writeAccessNum;

        private Data(Builder builder) {
            this.backupSetCount = builder.backupSetCount;
            this.backupSetSpaceSize = builder.backupSetSpaceSize;
            this.cloudProduct = builder.cloudProduct;
            this.currentSpaceSize = builder.currentSpaceSize;
            this.dataRedundancyType = builder.dataRedundancyType;
            this.enableStatus = builder.enableStatus;
            this.readAccessNum = builder.readAccessNum;
            this.regionId = builder.regionId;
            this.volumeName = builder.volumeName;
            this.writeAccessNum = builder.writeAccessNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupSetCount
         */
        public Integer getBackupSetCount() {
            return this.backupSetCount;
        }

        /**
         * @return backupSetSpaceSize
         */
        public Double getBackupSetSpaceSize() {
            return this.backupSetSpaceSize;
        }

        /**
         * @return cloudProduct
         */
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        /**
         * @return currentSpaceSize
         */
        public Double getCurrentSpaceSize() {
            return this.currentSpaceSize;
        }

        /**
         * @return dataRedundancyType
         */
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        /**
         * @return enableStatus
         */
        public Boolean getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return readAccessNum
         */
        public Long getReadAccessNum() {
            return this.readAccessNum;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return volumeName
         */
        public String getVolumeName() {
            return this.volumeName;
        }

        /**
         * @return writeAccessNum
         */
        public Double getWriteAccessNum() {
            return this.writeAccessNum;
        }

        public static final class Builder {
            private Integer backupSetCount; 
            private Double backupSetSpaceSize; 
            private String cloudProduct; 
            private Double currentSpaceSize; 
            private String dataRedundancyType; 
            private Boolean enableStatus; 
            private Long readAccessNum; 
            private String regionId; 
            private String volumeName; 
            private Double writeAccessNum; 

            /**
             * BackupSetCount.
             */
            public Builder backupSetCount(Integer backupSetCount) {
                this.backupSetCount = backupSetCount;
                return this;
            }

            /**
             * BackupSetSpaceSize.
             */
            public Builder backupSetSpaceSize(Double backupSetSpaceSize) {
                this.backupSetSpaceSize = backupSetSpaceSize;
                return this;
            }

            /**
             * CloudProduct.
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * CurrentSpaceSize.
             */
            public Builder currentSpaceSize(Double currentSpaceSize) {
                this.currentSpaceSize = currentSpaceSize;
                return this;
            }

            /**
             * DataRedundancyType.
             */
            public Builder dataRedundancyType(String dataRedundancyType) {
                this.dataRedundancyType = dataRedundancyType;
                return this;
            }

            /**
             * EnableStatus.
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * ReadAccessNum.
             */
            public Builder readAccessNum(Long readAccessNum) {
                this.readAccessNum = readAccessNum;
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
             * VolumeName.
             */
            public Builder volumeName(String volumeName) {
                this.volumeName = volumeName;
                return this;
            }

            /**
             * WriteAccessNum.
             */
            public Builder writeAccessNum(Double writeAccessNum) {
                this.writeAccessNum = writeAccessNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
