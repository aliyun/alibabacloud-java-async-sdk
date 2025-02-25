// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotRequest</p>
 */
public class CreateSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    @com.aliyun.core.annotation.Validation(maximum = 65536)
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.retentionDays = builder.retentionDays;
        this.snapshotName = builder.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String description; 
        private String fileSystemId; 
        private Integer retentionDays; 
        private String snapshotName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.retentionDays = request.retentionDays;
            this.snapshotName = request.snapshotName;
        } 

        /**
         * <p>The description of the snapshot.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 256 characters in length.</li>
         * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>This parameter is empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceDepet</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the advanced Extreme NAS file system. The value must start with <code>extreme-</code>, for example, <code>extreme-01dd****</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-01dd****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The retention period of the snapshot.</p>
         * <p>Unit: days.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>-1 (default). Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</li>
         * <li>1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>The snapshot name.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * <li>The name cannot start with auto because snapshots whose names start with auto are recognized as auto snapshots.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

}
