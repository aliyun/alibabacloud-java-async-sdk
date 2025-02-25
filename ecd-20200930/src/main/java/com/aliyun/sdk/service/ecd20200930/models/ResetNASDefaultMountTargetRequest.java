// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ResetNASDefaultMountTargetRequest} extends {@link RequestModel}
 *
 * <p>ResetNASDefaultMountTargetRequest</p>
 */
public class ResetNASDefaultMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ResetNASDefaultMountTargetRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetNASDefaultMountTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetNASDefaultMountTargetRequest, Builder> {
        private String fileSystemId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetNASDefaultMountTargetRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the NAS file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3a6ef4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResetNASDefaultMountTargetRequest build() {
            return new ResetNASDefaultMountTargetRequest(this);
        } 

    } 

}
