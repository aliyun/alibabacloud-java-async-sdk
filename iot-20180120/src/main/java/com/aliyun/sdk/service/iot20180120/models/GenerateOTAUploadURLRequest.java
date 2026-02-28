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
 * {@link GenerateOTAUploadURLRequest} extends {@link RequestModel}
 *
 * <p>GenerateOTAUploadURLRequest</p>
 */
public class GenerateOTAUploadURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSuffix")
    private String fileSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
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

        private Builder(GenerateOTAUploadURLRequest request) {
            super(request);
            this.fileSuffix = request.fileSuffix;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The file name extension of the update package file. Valid values: bin, dav, apk, tar, gz, tar.gz, zip, and gzip.</p>
         * <p>Default value: bin.</p>
         * 
         * <strong>example:</strong>
         * <p>apk</p>
         */
        public Builder fileSuffix(String fileSuffix) {
            this.putQueryParameter("FileSuffix", fileSuffix);
            this.fileSuffix = fileSuffix;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
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
