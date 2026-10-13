// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetJobDataUploadParamsRequest} extends {@link RequestModel}
 *
 * <p>GetJobDataUploadParamsRequest</p>
 */
public class GetJobDataUploadParamsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusiType")
    private String busiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    private String uniqueId;

    private GetJobDataUploadParamsRequest(Builder builder) {
        super(builder);
        this.busiType = builder.busiType;
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.path = builder.path;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDataUploadParamsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return busiType
     */
    public String getBusiType() {
        return this.busiType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<GetJobDataUploadParamsRequest, Builder> {
        private String busiType; 
        private String fileName; 
        private String instanceId; 
        private String path; 
        private String uniqueId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobDataUploadParamsRequest request) {
            super(request);
            this.busiType = request.busiType;
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
            this.path = request.path;
            this.uniqueId = request.uniqueId;
        } 

        /**
         * <p>Business type</p>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT_RECORDING</p>
         */
        public Builder busiType(String busiType) {
            this.putQueryParameter("BusiType", busiType);
            this.busiType = busiType;
            return this;
        }

        /**
         * <p>File name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SHUKE_ZA_ol_2_开场白.wav</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4eee9bf8-1319-468f-ac82-83c50ae389f8</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Relative path for file storage</p>
         * 
         * <strong>example:</strong>
         * <p>//airwaybill/1237185904146124802</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>Unique business ID (prevents duplicate file names; the system automatically adds one if left blank)</p>
         * 
         * <strong>example:</strong>
         * <p>sas_siema_1477832102462645_siem_f07e90c2c147cf8cf1549ccb974e1956</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        @Override
        public GetJobDataUploadParamsRequest build() {
            return new GetJobDataUploadParamsRequest(this);
        } 

    } 

}
