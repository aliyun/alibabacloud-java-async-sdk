// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lsn")
    private String lsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotTimestamp")
    private String snapshotTimestamp;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lsn = builder.lsn;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.snapshotTimestamp = builder.snapshotTimestamp;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return lsn
     */
    public String getLsn() {
        return this.lsn;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return snapshotTimestamp
     */
    public String getSnapshotTimestamp() {
        return this.snapshotTimestamp;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String clientToken; 
        private String lsn; 
        private String projectId; 
        private String regionId; 
        private String snapshotTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lsn = request.lsn;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.snapshotTimestamp = request.snapshotTimestamp;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Lsn.
         */
        public Builder lsn(String lsn) {
            this.putQueryParameter("Lsn", lsn);
            this.lsn = lsn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spb-xxxx</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SnapshotTimestamp.
         */
        public Builder snapshotTimestamp(String snapshotTimestamp) {
            this.putQueryParameter("SnapshotTimestamp", snapshotTimestamp);
            this.snapshotTimestamp = snapshotTimestamp;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

}
