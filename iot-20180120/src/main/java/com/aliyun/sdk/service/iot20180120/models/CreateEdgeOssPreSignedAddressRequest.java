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
 * {@link CreateEdgeOssPreSignedAddressRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeOssPreSignedAddressRequest</p>
 */
public class CreateEdgeOssPreSignedAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateEdgeOssPreSignedAddressRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.resourceId = builder.resourceId;
        this.resourceVersion = builder.resourceVersion;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeOssPreSignedAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateEdgeOssPreSignedAddressRequest, Builder> {
        private String fileName; 
        private String instanceId; 
        private String iotInstanceId; 
        private String resourceId; 
        private String resourceVersion; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeOssPreSignedAddressRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.resourceId = request.resourceId;
            this.resourceVersion = request.resourceVersion;
            this.type = request.type;
        } 

        /**
         * <p>The name of the object whose URL is to be obtained. The format is <code>&lt;File name&gt;.&lt;File name extension&gt;</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testfile.zip</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance that uses the driver and obtain the instance ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
         * <blockquote>
         * <p> When the <strong>Type</strong> parameter is set to <strong>INSTANCE_DRIVER_VERSION_CONFIG</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the resource for which the object URL is to be obtained. Only driver resources are supported. Set this parameter to the ID of the corresponding driver.</p>
         * <p>To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver for which the object URL you want to obtain and obtain the driver ID. You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>df9b9f441*********4c90d0c21d14</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The version number of the resource. Only driver resources are supported. Set this parameter to the version number of the corresponding driver.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder resourceVersion(String resourceVersion) {
            this.putQueryParameter("ResourceVersion", resourceVersion);
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * <p>The content type of the object. Valid values:</p>
         * <ul>
         * <li>DRIVER_VERSION_CONTENT: the code of a specific driver version.</li>
         * <li>DRIVER_VERSION_DEFAULT_CONFIG: the default configuration of a specific driver version.</li>
         * <li>INSTANCE_DRIVER_VERSION_CONFIG: the configuration of a specific driver version that is used in an edge instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DRIVER_VERSION_CONTENT</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateEdgeOssPreSignedAddressRequest build() {
            return new CreateEdgeOssPreSignedAddressRequest(this);
        } 

    } 

}
