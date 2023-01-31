// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendCallWithFileRequest} extends {@link RequestModel}
 *
 * <p>SuspendCallWithFileRequest</p>
 */
public class SuspendCallWithFileRequest extends Request {
    @Query
    @NameInMap("FilePath")
    private String filePath;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("InstanceId")
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
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * InstanceId.
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
