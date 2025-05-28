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
 * {@link ModifyCostCenterResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCostCenterResponseBody</p>
 */
public class ModifyCostCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostCenterOperateDto")
    private java.util.List<CostCenterOperateDto> costCenterOperateDto;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCostCenterResponseBody(Builder builder) {
        this.costCenterOperateDto = builder.costCenterOperateDto;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCostCenterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterOperateDto
     */
    public java.util.List<CostCenterOperateDto> getCostCenterOperateDto() {
        return this.costCenterOperateDto;
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
        private java.util.List<CostCenterOperateDto> costCenterOperateDto; 
        private Object metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyCostCenterResponseBody model) {
            this.costCenterOperateDto = model.costCenterOperateDto;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * CostCenterOperateDto.
         */
        public Builder costCenterOperateDto(java.util.List<CostCenterOperateDto> costCenterOperateDto) {
            this.costCenterOperateDto = costCenterOperateDto;
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

        public ModifyCostCenterResponseBody build() {
            return new ModifyCostCenterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCostCenterResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyCostCenterResponseBody</p>
     */
    public static class CostCenterOperateDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private Boolean isSuccess;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        private CostCenterOperateDto(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.isSuccess = builder.isSuccess;
            this.ownerAccountId = builder.ownerAccountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterOperateDto create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return isSuccess
         */
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public static final class Builder {
            private Long costCenterId; 
            private Boolean isSuccess; 
            private Long ownerAccountId; 

            private Builder() {
            } 

            private Builder(CostCenterOperateDto model) {
                this.costCenterId = model.costCenterId;
                this.isSuccess = model.isSuccess;
                this.ownerAccountId = model.ownerAccountId;
            } 

            /**
             * CostCenterId.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * IsSuccess.
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * OwnerAccountId.
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            public CostCenterOperateDto build() {
                return new CostCenterOperateDto(this);
            } 

        } 

    }
}
