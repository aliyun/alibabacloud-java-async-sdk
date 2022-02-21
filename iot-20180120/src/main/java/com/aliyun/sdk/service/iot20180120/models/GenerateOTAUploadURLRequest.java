// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOTAUploadURLRequest} extends {@link RequestModel}
 *
 * <p>GenerateOTAUploadURLRequest</p>
 */
public class GenerateOTAUploadURLRequest extends Request {
    @Query
    @NameInMap("FileSuffix")
    private String fileSuffix;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GenerateOTAUploadURLRequest(Builder builder) {
        super(builder);
        this.fileSuffix = builder.fileSuffix;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOTAUploadURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSuffix
     */
    public String getFileSuffix() {
        return this.fileSuffix;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<GenerateOTAUploadURLRequest, Builder> {
        private String fileSuffix; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOTAUploadURLRequest response) {
            super(response);
            this.fileSuffix = response.fileSuffix;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * FileSuffix.
         */
        public Builder fileSuffix(String fileSuffix) {
            this.putQueryParameter("FileSuffix", fileSuffix);
            this.fileSuffix = fileSuffix;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public GenerateOTAUploadURLRequest build() {
            return new GenerateOTAUploadURLRequest(this);
        } 

    } 

}
