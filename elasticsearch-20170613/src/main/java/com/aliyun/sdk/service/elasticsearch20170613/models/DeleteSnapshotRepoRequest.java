// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotRepoRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotRepoRequest</p>
 */
public class DeleteSnapshotRepoRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("repoPath")
    @Validation(required = true)
    private String repoPath;

    private DeleteSnapshotRepoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.repoPath = builder.repoPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotRepoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return repoPath
     */
    public String getRepoPath() {
        return this.repoPath;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotRepoRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String repoPath; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotRepoRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.repoPath = response.repoPath;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * repoPath.
         */
        public Builder repoPath(String repoPath) {
            this.putQueryParameter("repoPath", repoPath);
            this.repoPath = repoPath;
            return this;
        }

        @Override
        public DeleteSnapshotRepoRequest build() {
            return new DeleteSnapshotRepoRequest(this);
        } 

    } 

}
