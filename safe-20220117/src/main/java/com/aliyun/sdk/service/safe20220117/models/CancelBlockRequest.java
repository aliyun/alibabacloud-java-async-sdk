// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link CancelBlockRequest} extends {@link RequestModel}
 *
 * <p>CancelBlockRequest</p>
 */
public class CancelBlockRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockId")
    private Long blockId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CancelBLockDesc")
    private String cancelBLockDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateEmpId")
    private String createEmpId;

    private CancelBlockRequest(Builder builder) {
        super(builder);
        this.blockId = builder.blockId;
        this.cancelBLockDesc = builder.cancelBLockDesc;
        this.createEmpId = builder.createEmpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelBlockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockId
     */
    public Long getBlockId() {
        return this.blockId;
    }

    /**
     * @return cancelBLockDesc
     */
    public String getCancelBLockDesc() {
        return this.cancelBLockDesc;
    }

    /**
     * @return createEmpId
     */
    public String getCreateEmpId() {
        return this.createEmpId;
    }

    public static final class Builder extends Request.Builder<CancelBlockRequest, Builder> {
        private Long blockId; 
        private String cancelBLockDesc; 
        private String createEmpId; 

        private Builder() {
            super();
        } 

        private Builder(CancelBlockRequest request) {
            super(request);
            this.blockId = request.blockId;
            this.cancelBLockDesc = request.cancelBLockDesc;
            this.createEmpId = request.createEmpId;
        } 

        /**
         * BlockId.
         */
        public Builder blockId(Long blockId) {
            this.putBodyParameter("BlockId", blockId);
            this.blockId = blockId;
            return this;
        }

        /**
         * CancelBLockDesc.
         */
        public Builder cancelBLockDesc(String cancelBLockDesc) {
            this.putBodyParameter("CancelBLockDesc", cancelBLockDesc);
            this.cancelBLockDesc = cancelBLockDesc;
            return this;
        }

        /**
         * CreateEmpId.
         */
        public Builder createEmpId(String createEmpId) {
            this.putBodyParameter("CreateEmpId", createEmpId);
            this.createEmpId = createEmpId;
            return this;
        }

        @Override
        public CancelBlockRequest build() {
            return new CancelBlockRequest(this);
        } 

    } 

}
