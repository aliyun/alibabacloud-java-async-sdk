// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PackageSoundCodeLabelBatchAudioRequest} extends {@link RequestModel}
 *
 * <p>PackageSoundCodeLabelBatchAudioRequest</p>
 */
public class PackageSoundCodeLabelBatchAudioRequest extends Request {
    @Body
    @NameInMap("BatchCode")
    @Validation(required = true)
    private String batchCode;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private PackageSoundCodeLabelBatchAudioRequest(Builder builder) {
        super(builder);
        this.batchCode = builder.batchCode;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PackageSoundCodeLabelBatchAudioRequest create() {
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

    public static final class Builder extends Request.Builder<PackageSoundCodeLabelBatchAudioRequest, Builder> {
        private String batchCode; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(PackageSoundCodeLabelBatchAudioRequest request) {
            super(request);
            this.batchCode = request.batchCode;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * BatchCode.
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
        public PackageSoundCodeLabelBatchAudioRequest build() {
            return new PackageSoundCodeLabelBatchAudioRequest(this);
        } 

    } 

}
