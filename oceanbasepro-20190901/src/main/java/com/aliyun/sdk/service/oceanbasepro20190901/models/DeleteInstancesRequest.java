// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DeleteInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstancesRequest</p>
 */
public class DeleteInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BackupRetainMode")
    private String backupRetainMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    private DeleteInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupRetainMode = builder.backupRetainMode;
        this.dryRun = builder.dryRun;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupRetainMode
     */
    public String getBackupRetainMode() {
        return this.backupRetainMode;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DeleteInstancesRequest, Builder> {
        private String regionId; 
        private String backupRetainMode; 
        private Boolean dryRun; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupRetainMode = request.backupRetainMode;
            this.dryRun = request.dryRun;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The backup retention strategy for cluster deletion. Valid values:  </p>
         * <ul>
         * <li>receive_all: retains all backup sets.   </li>
         * <li>delete_all: deletes all backup sets.   </li>
         * <li>receive_last: retains the last backup set.</li>
         * </ul>
         * <blockquote>
         * <p><br>Default value: delete_all.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>delete_all</p>
         */
        public Builder backupRetainMode(String backupRetainMode) {
            this.putBodyParameter("BackupRetainMode", backupRetainMode);
            this.backupRetainMode = backupRetainMode;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: Only a dry-run request is sent and the instance is not deleted. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</li>
         * <li>false: The actual request is sent and no dry run is performed. The instance is deleted if the requirements are met. By default, false is returned for the parameter DryRunResult if you set DryRun to false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the cluster to be deleted.<br>The value is a string in the JSON format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[”ob ob3f6yhv9uxxxx“]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DeleteInstancesRequest build() {
            return new DeleteInstancesRequest(this);
        } 

    } 

}
