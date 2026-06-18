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
 * {@link RestoreSnapshotRequest} extends {@link RequestModel}
 *
 * <p>RestoreSnapshotRequest</p>
 */
public class RestoreSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinalizeRestore")
    private Boolean finalizeRestore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoredBranchName")
    private String restoredBranchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoredLsn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoredLsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetBranchId")
    private String targetBranchId;

    private RestoreSnapshotRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.finalizeRestore = builder.finalizeRestore;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.restoredBranchName = builder.restoredBranchName;
        this.restoredLsn = builder.restoredLsn;
        this.targetBranchId = builder.targetBranchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreSnapshotRequest create() {
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
     * @return finalizeRestore
     */
    public Boolean getFinalizeRestore() {
        return this.finalizeRestore;
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
     * @return restoredBranchName
     */
    public String getRestoredBranchName() {
        return this.restoredBranchName;
    }

    /**
     * @return restoredLsn
     */
    public String getRestoredLsn() {
        return this.restoredLsn;
    }

    /**
     * @return targetBranchId
     */
    public String getTargetBranchId() {
        return this.targetBranchId;
    }

    public static final class Builder extends Request.Builder<RestoreSnapshotRequest, Builder> {
        private String clientToken; 
        private Boolean finalizeRestore; 
        private String projectId; 
        private String regionId; 
        private String restoredBranchName; 
        private String restoredLsn; 
        private String targetBranchId; 

        private Builder() {
            super();
        } 

        private Builder(RestoreSnapshotRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.finalizeRestore = request.finalizeRestore;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.restoredBranchName = request.restoredBranchName;
            this.restoredLsn = request.restoredLsn;
            this.targetBranchId = request.targetBranchId;
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
         * FinalizeRestore.
         */
        public Builder finalizeRestore(Boolean finalizeRestore) {
            this.putQueryParameter("FinalizeRestore", finalizeRestore);
            this.finalizeRestore = finalizeRestore;
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
         * RestoredBranchName.
         */
        public Builder restoredBranchName(String restoredBranchName) {
            this.putQueryParameter("RestoredBranchName", restoredBranchName);
            this.restoredBranchName = restoredBranchName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0/3522648</p>
         */
        public Builder restoredLsn(String restoredLsn) {
            this.putQueryParameter("RestoredLsn", restoredLsn);
            this.restoredLsn = restoredLsn;
            return this;
        }

        /**
         * TargetBranchId.
         */
        public Builder targetBranchId(String targetBranchId) {
            this.putQueryParameter("TargetBranchId", targetBranchId);
            this.targetBranchId = targetBranchId;
            return this;
        }

        @Override
        public RestoreSnapshotRequest build() {
            return new RestoreSnapshotRequest(this);
        } 

    } 

}
