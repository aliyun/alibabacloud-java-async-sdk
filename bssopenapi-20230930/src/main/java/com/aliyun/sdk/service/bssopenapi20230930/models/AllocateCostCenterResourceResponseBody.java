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
 * {@link AllocateCostCenterResourceResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateCostCenterResourceResponseBody</p>
 */
public class AllocateCostCenterResourceResponseBody extends TeaModel {
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

    private AllocateCostCenterResourceResponseBody(Builder builder) {
        this.costCenterId = builder.costCenterId;
        this.isSuccess = builder.isSuccess;
        this.metadata = builder.metadata;
        this.ownerAccountId = builder.ownerAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateCostCenterResourceResponseBody create() {
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

        private Builder(AllocateCostCenterResourceResponseBody model) {
            this.costCenterId = model.costCenterId;
            this.isSuccess = model.isSuccess;
            this.metadata = model.metadata;
            this.ownerAccountId = model.ownerAccountId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cost center ID.</p>
         * 
         * <strong>example:</strong>
         * <p>640403</p>
         */
        public Builder costCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The metadata of the response struct.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The owner of the cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>1529600453335198</p>
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>UUID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateCostCenterResourceResponseBody build() {
            return new AllocateCostCenterResourceResponseBody(this);
        } 

    } 

}
