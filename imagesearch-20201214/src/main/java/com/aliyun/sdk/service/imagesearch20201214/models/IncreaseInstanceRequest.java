// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link IncreaseInstanceRequest} extends {@link RequestModel}
 *
 * <p>IncreaseInstanceRequest</p>
 */
public class IncreaseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackAddress")
    private String callbackAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    private IncreaseInstanceRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.callbackAddress = builder.callbackAddress;
        this.instanceName = builder.instanceName;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return callbackAddress
     */
    public String getCallbackAddress() {
        return this.callbackAddress;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<IncreaseInstanceRequest, Builder> {
        private String bucketName; 
        private String callbackAddress; 
        private String instanceName; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(IncreaseInstanceRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.callbackAddress = request.callbackAddress;
            this.instanceName = request.instanceName;
            this.path = request.path;
        } 

        /**
         * <p>The name of the Object Storage Service (OSS) bucket.</p>
         * <blockquote>
         * <p> The bucket must be in the same region as the Image Search instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketName</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The callback address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxx">http://xxxxx</a></p>
         */
        public Builder callbackAddress(String callbackAddress) {
            this.putQueryParameter("CallbackAddress", callbackAddress);
            this.callbackAddress = callbackAddress;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imagesearchName</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The absolute path to the increment.meta file in the bucket. The path must start with a forward slash (/) and cannot end with a forward slash (/).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/xxx/xxx</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public IncreaseInstanceRequest build() {
            return new IncreaseInstanceRequest(this);
        } 

    } 

}
