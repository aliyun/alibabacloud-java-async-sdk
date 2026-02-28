// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link RetrySoundCodeLabelBatchRequest} extends {@link RequestModel}
 *
 * <p>RetrySoundCodeLabelBatchRequest</p>
 */
public class RetrySoundCodeLabelBatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private RetrySoundCodeLabelBatchRequest(Builder builder) {
        super(builder);
        this.batchCode = builder.batchCode;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrySoundCodeLabelBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchCode
     */
    public String getBatchCode() {
        return this.batchCode;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<RetrySoundCodeLabelBatchRequest, Builder> {
        private String batchCode; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RetrySoundCodeLabelBatchRequest request) {
            super(request);
            this.batchCode = request.batchCode;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        public Builder batchCode(String batchCode) {
            this.putBodyParameter("BatchCode", batchCode);
            this.batchCode = batchCode;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public RetrySoundCodeLabelBatchRequest build() {
            return new RetrySoundCodeLabelBatchRequest(this);
        } 

    } 

}
