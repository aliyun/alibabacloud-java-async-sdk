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
 * {@link SuspendCallWithFileRequest} extends {@link RequestModel}
 *
 * <p>SuspendCallWithFileRequest</p>
 */
public class SuspendCallWithFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private SuspendCallWithFileRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendCallWithFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SuspendCallWithFileRequest, Builder> {
        private String filePath; 
        private String groupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SuspendCallWithFileRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>File path. Required.</p>
         * <blockquote>
         * <p>Get the value for this parameter by calling the GetJobDataUploadParams operation. Use the Folder value returned in the response as the FilePath value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>Task group ID. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>0197261b-30e6-467b-83d6-7f72af868b03</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Instance ID. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SuspendCallWithFileRequest build() {
            return new SuspendCallWithFileRequest(this);
        } 

    } 

}
