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
 * {@link DeleteCostCenterResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCostCenterResponseBody</p>
 */
public class DeleteCostCenterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostCenterId")
    private Long costCenterId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    private Long ownerAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCostCenterResponseBody(Builder builder) {
        this.costCenterId = builder.costCenterId;
        this.isSuccess = builder.isSuccess;
        this.metadata = builder.metadata;
        this.ownerAccountId = builder.ownerAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCostCenterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long costCenterId; 
        private Boolean isSuccess; 
        private Object metadata; 
        private Long ownerAccountId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteCostCenterResponseBody model) {
            this.costCenterId = model.costCenterId;
            this.isSuccess = model.isSuccess;
            this.metadata = model.metadata;
            this.ownerAccountId = model.ownerAccountId;
            this.requestId = model.requestId;
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
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCostCenterResponseBody build() {
            return new DeleteCostCenterResponseBody(this);
        } 

    } 

}
