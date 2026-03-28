// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link UpdateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>UpdateSnapshotRequest</p>
 */
public class UpdateSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateSnapshotRequest(Builder builder) {
        super(builder);
        this.snapshotId = builder.snapshotId;
        this.description = builder.description;
        this.snapshotName = builder.snapshotName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateSnapshotRequest, Builder> {
        private String snapshotId; 
        private String description; 
        private String snapshotName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSnapshotRequest request) {
            super(request);
            this.snapshotId = request.snapshotId;
            this.description = request.description;
            this.snapshotName = request.snapshotName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>snap-asfg******123</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putPathParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The snapshot description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The snapshot name. The format requirements are as follows:</p>
         * <ul>
         * <li>It can contain only letters, digits, and underscores (_).</li>
         * <li>It must start with a letter.</li>
         * <li>It must be 1 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>snapshot02</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.putBodyParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * <p>The workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateSnapshotRequest build() {
            return new UpdateSnapshotRequest(this);
        } 

    } 

}
