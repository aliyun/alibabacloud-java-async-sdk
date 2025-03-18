// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.diskId = builder.diskId;
        this.ensRegionId = builder.ensRegionId;
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
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String description; 
        private String diskId; 
        private String ensRegionId; 
        private String snapshotName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.description = request.description;
            this.diskId = request.diskId;
            this.ensRegionId = request.ensRegionId;
            this.snapshotName = request.snapshotName;
        } 

        /**
         * <p>The description of the snapshot. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the cloud disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1s5fnvk4gn2tws0****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The ID of the ENS node. You can query the node ID by calling the <a href="~~DescribeEnsRegions~~">DescribeEnsRegions</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-3</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
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
