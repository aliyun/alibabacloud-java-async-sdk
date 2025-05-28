// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateCostCenterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCostCenterResponseBody</p>
 */
public class CreateCostCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostCenterDtoList")
    private java.util.List<CostCenterDtoList> costCenterDtoList;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCostCenterResponseBody(Builder builder) {
        this.costCenterDtoList = builder.costCenterDtoList;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostCenterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterDtoList
     */
    public java.util.List<CostCenterDtoList> getCostCenterDtoList() {
        return this.costCenterDtoList;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CostCenterDtoList> costCenterDtoList; 
        private Object metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCostCenterResponseBody model) {
            this.costCenterDtoList = model.costCenterDtoList;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * CostCenterDtoList.
         */
        public Builder costCenterDtoList(java.util.List<CostCenterDtoList> costCenterDtoList) {
            this.costCenterDtoList = costCenterDtoList;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCostCenterResponseBody build() {
            return new CreateCostCenterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCostCenterResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCostCenterResponseBody</p>
     */
    public static class CostCenterDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        private Long parentCostCenterId;

        private CostCenterDtoList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.ownerAccountId = builder.ownerAccountId;
            this.parentCostCenterId = builder.parentCostCenterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterDtoList create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public static final class Builder {
            private Long costCenterId; 
            private String costCenterName; 
            private Long ownerAccountId; 
            private Long parentCostCenterId; 

            private Builder() {
            } 

            private Builder(CostCenterDtoList model) {
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.ownerAccountId = model.ownerAccountId;
                this.parentCostCenterId = model.parentCostCenterId;
            } 

            /**
             * CostCenterId.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * CostCenterName.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * OwnerAccountId.
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * ParentCostCenterId.
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            public CostCenterDtoList build() {
                return new CostCenterDtoList(this);
            } 

        } 

    }
}
