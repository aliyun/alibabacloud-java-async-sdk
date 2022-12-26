// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetSummaryResponseBody</p>
 */
public class GetCloudAssetSummaryResponseBody extends TeaModel {
    @NameInMap("GroupedFields")
    private GroupedFields groupedFields;

    @NameInMap("RequestId")
    private String requestId;

    private GetCloudAssetSummaryResponseBody(Builder builder) {
        this.groupedFields = builder.groupedFields;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedFields
     */
    public GroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupedFields groupedFields; 
        private String requestId; 

        /**
         * GroupedFields.
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudAssetSummaryResponseBody build() {
            return new GetCloudAssetSummaryResponseBody(this);
        } 

    } 

    public static class CloudAssetSummaryMetas extends TeaModel {
        @NameInMap("AssetSubType")
        private Integer assetSubType;

        @NameInMap("AssetType")
        private Integer assetType;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("InstanceRiskCount")
        private Integer instanceRiskCount;

        private CloudAssetSummaryMetas(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.instanceCount = builder.instanceCount;
            this.instanceRiskCount = builder.instanceRiskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetSummaryMetas create() {
            return builder().build();
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceRiskCount
         */
        public Integer getInstanceRiskCount() {
            return this.instanceRiskCount;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private Integer instanceCount; 
            private Integer instanceRiskCount; 

            /**
             * AssetSubType.
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * AssetType.
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * InstanceRiskCount.
             */
            public Builder instanceRiskCount(Integer instanceRiskCount) {
                this.instanceRiskCount = instanceRiskCount;
                return this;
            }

            public CloudAssetSummaryMetas build() {
                return new CloudAssetSummaryMetas(this);
            } 

        } 

    }
    public static class GroupedFields extends TeaModel {
        @NameInMap("CloudAssetSummaryMetas")
        private java.util.List < CloudAssetSummaryMetas> cloudAssetSummaryMetas;

        @NameInMap("InstanceCountTotal")
        private Integer instanceCountTotal;

        @NameInMap("InstanceRiskCountTotal")
        private Integer instanceRiskCountTotal;

        private GroupedFields(Builder builder) {
            this.cloudAssetSummaryMetas = builder.cloudAssetSummaryMetas;
            this.instanceCountTotal = builder.instanceCountTotal;
            this.instanceRiskCountTotal = builder.instanceRiskCountTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedFields create() {
            return builder().build();
        }

        /**
         * @return cloudAssetSummaryMetas
         */
        public java.util.List < CloudAssetSummaryMetas> getCloudAssetSummaryMetas() {
            return this.cloudAssetSummaryMetas;
        }

        /**
         * @return instanceCountTotal
         */
        public Integer getInstanceCountTotal() {
            return this.instanceCountTotal;
        }

        /**
         * @return instanceRiskCountTotal
         */
        public Integer getInstanceRiskCountTotal() {
            return this.instanceRiskCountTotal;
        }

        public static final class Builder {
            private java.util.List < CloudAssetSummaryMetas> cloudAssetSummaryMetas; 
            private Integer instanceCountTotal; 
            private Integer instanceRiskCountTotal; 

            /**
             * CloudAssetSummaryMetas.
             */
            public Builder cloudAssetSummaryMetas(java.util.List < CloudAssetSummaryMetas> cloudAssetSummaryMetas) {
                this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
                return this;
            }

            /**
             * InstanceCountTotal.
             */
            public Builder instanceCountTotal(Integer instanceCountTotal) {
                this.instanceCountTotal = instanceCountTotal;
                return this;
            }

            /**
             * InstanceRiskCountTotal.
             */
            public Builder instanceRiskCountTotal(Integer instanceRiskCountTotal) {
                this.instanceRiskCountTotal = instanceRiskCountTotal;
                return this;
            }

            public GroupedFields build() {
                return new GroupedFields(this);
            } 

        } 

    }
}
