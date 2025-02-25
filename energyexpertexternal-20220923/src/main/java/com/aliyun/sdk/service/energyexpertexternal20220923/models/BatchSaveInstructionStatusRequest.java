// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link BatchSaveInstructionStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchSaveInstructionStatusRequest</p>
 */
public class BatchSaveInstructionStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("factoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String factoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pKey")
    private String pKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statusList")
    private String statusList;

    private BatchSaveInstructionStatusRequest(Builder builder) {
        super(builder);
        this.factoryId = builder.factoryId;
        this.pKey = builder.pKey;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSaveInstructionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return factoryId
     */
    public String getFactoryId() {
        return this.factoryId;
    }

    /**
     * @return pKey
     */
    public String getPKey() {
        return this.pKey;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<BatchSaveInstructionStatusRequest, Builder> {
        private String factoryId; 
        private String pKey; 
        private String statusList; 

        private Builder() {
            super();
        } 

        private Builder(BatchSaveInstructionStatusRequest request) {
            super(request);
            this.factoryId = request.factoryId;
            this.pKey = request.pKey;
            this.statusList = request.statusList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder factoryId(String factoryId) {
            this.putBodyParameter("factoryId", factoryId);
            this.factoryId = factoryId;
            return this;
        }

        /**
         * pKey.
         */
        public Builder pKey(String pKey) {
            this.putBodyParameter("pKey", pKey);
            this.pKey = pKey;
            return this;
        }

        /**
         * statusList.
         */
        public Builder statusList(String statusList) {
            this.putBodyParameter("statusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public BatchSaveInstructionStatusRequest build() {
            return new BatchSaveInstructionStatusRequest(this);
        } 

    } 

}
