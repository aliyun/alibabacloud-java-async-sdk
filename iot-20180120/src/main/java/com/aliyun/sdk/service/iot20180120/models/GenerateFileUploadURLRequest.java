// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateFileUploadURLRequest} extends {@link RequestModel}
 *
 * <p>GenerateFileUploadURLRequest</p>
 */
public class GenerateFileUploadURLRequest extends Request {
    @Query
    @NameInMap("BizCode")
    @Validation(required = true)
    private String bizCode;

    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("FileSuffix")
    @Validation(required = true)
    private String fileSuffix;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GenerateFileUploadURLRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.fileName = builder.fileName;
        this.fileSuffix = builder.fileSuffix;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateFileUploadURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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

    public static final class Builder extends Request.Builder<GenerateFileUploadURLRequest, Builder> {
        private String bizCode; 
        private String fileName; 
        private String fileSuffix; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateFileUploadURLRequest response) {
            super(response);
            this.bizCode = response.bizCode;
            this.fileName = response.fileName;
            this.fileSuffix = response.fileSuffix;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
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
        public GenerateFileUploadURLRequest build() {
            return new GenerateFileUploadURLRequest(this);
        } 

    } 

}
