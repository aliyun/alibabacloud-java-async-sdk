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
 * {@link GenerateFileUploadURLRequest} extends {@link RequestModel}
 *
 * <p>GenerateFileUploadURLRequest</p>
 */
public class GenerateFileUploadURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSuffix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
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

        private Builder(GenerateFileUploadURLRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.fileName = request.fileName;
            this.fileSuffix = request.fileSuffix;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE_JOB_FILE</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bin</p>
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
