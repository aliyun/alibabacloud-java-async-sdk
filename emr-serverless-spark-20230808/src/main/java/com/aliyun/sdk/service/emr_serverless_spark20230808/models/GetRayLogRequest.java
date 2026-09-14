// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetRayLogRequest} extends {@link RequestModel}
 *
 * <p>GetRayLogRequest</p>
 */
public class GetRayLogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    private GetRayLogRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.instanceId = builder.instanceId;
        this.bucketName = builder.bucketName;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<GetRayLogRequest, Builder> {
        private String workspaceId; 
        private String instanceId; 
        private String bucketName; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(GetRayLogRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.instanceId = request.instanceId;
            this.bucketName = request.bucketName;
            this.path = request.path;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-790b443d72394bfc</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the Ray job.</p>
         * 
         * <strong>example:</strong>
         * <p>rj-xxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>mybucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("bucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The log file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/w-xxxxxxx/ray/logs/rj-xxxxxxxxxx_default/xxxx/rj-xxxx_driver.log</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        @Override
        public GetRayLogRequest build() {
            return new GetRayLogRequest(this);
        } 

    } 

}
