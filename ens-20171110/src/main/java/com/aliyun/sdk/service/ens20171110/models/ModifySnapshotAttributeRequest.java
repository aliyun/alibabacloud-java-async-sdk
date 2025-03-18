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
 * {@link ModifySnapshotAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifySnapshotAttributeRequest</p>
 */
public class ModifySnapshotAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    private ModifySnapshotAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.snapshotId = builder.snapshotId;
        this.snapshotName = builder.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySnapshotAttributeRequest create() {
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public static final class Builder extends Request.Builder<ModifySnapshotAttributeRequest, Builder> {
        private String description; 
        private String snapshotId; 
        private String snapshotName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySnapshotAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.snapshotId = request.snapshotId;
            this.snapshotName = request.snapshotName;
        } 

        /**
         * <p>The description of the snapshot. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The ID of the snapshot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp199lyny9bb47pa****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The name of the snapshot. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * <p>The name cannot start with <strong>auto</strong> because snapshots whose names start with auto are recognized as automatic snapshots.</p>
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
        public ModifySnapshotAttributeRequest build() {
            return new ModifySnapshotAttributeRequest(this);
        } 

    } 

}
