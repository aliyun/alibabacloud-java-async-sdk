// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetDownloadLinkRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupSetDownloadLinkRequest</p>
 */
public class DescribeBackupSetDownloadLinkRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DownloadTaskId")
    @Validation(required = true)
    private String downloadTaskId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeBackupSetDownloadLinkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.downloadTaskId = builder.downloadTaskId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetDownloadLinkRequest create() {
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
     * @return downloadTaskId
     */
    public String getDownloadTaskId() {
        return this.downloadTaskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupSetDownloadLinkRequest, Builder> {
        private String regionId; 
        private String downloadTaskId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupSetDownloadLinkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.downloadTaskId = request.downloadTaskId;
            this.instanceId = request.instanceId;
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
         * The ID of the download task corresponding to the target backup set.
         */
        public Builder downloadTaskId(String downloadTaskId) {
            this.putBodyParameter("DownloadTaskId", downloadTaskId);
            this.downloadTaskId = downloadTaskId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeBackupSetDownloadLinkRequest build() {
            return new DescribeBackupSetDownloadLinkRequest(this);
        } 

    } 

}
