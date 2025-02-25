// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateRumFileStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateRumFileStatusRequest</p>
 */
public class UpdateRumFileStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private UpdateRumFileStatusRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.status = builder.status;
        this.uuid = builder.uuid;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRumFileStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<UpdateRumFileStatusRequest, Builder> {
        private String fileName; 
        private String pid; 
        private String regionId; 
        private String size; 
        private String status; 
        private String uuid; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRumFileStatusRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.size = request.size;
            this.status = request.status;
            this.uuid = request.uuid;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.js.map</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>atc8xxxx
         * cf@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
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

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The status of the file. Valid values: SUCCESS and INIT.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The unique ID of the file. If you do not set this parameter, the system automatically sets a UUID for you.</p>
         * 
         * <strong>example:</strong>
         * <p>MS4wLjAtbWFpbi4wZjM0NzRlOSxxxxxx</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>The version number of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public UpdateRumFileStatusRequest build() {
            return new UpdateRumFileStatusRequest(this);
        } 

    } 

}
