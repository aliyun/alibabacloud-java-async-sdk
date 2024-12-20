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
 * {@link DeleteRumUploadFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteRumUploadFileRequest</p>
 */
public class DeleteRumUploadFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchItems")
    private String batchItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private DeleteRumUploadFileRequest(Builder builder) {
        super(builder);
        this.batchItems = builder.batchItems;
        this.fileName = builder.fileName;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.uuid = builder.uuid;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRumUploadFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchItems
     */
    public String getBatchItems() {
        return this.batchItems;
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

    public static final class Builder extends Request.Builder<DeleteRumUploadFileRequest, Builder> {
        private String batchItems; 
        private String fileName; 
        private String pid; 
        private String regionId; 
        private String uuid; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRumUploadFileRequest request) {
            super(request);
            this.batchItems = request.batchItems;
            this.fileName = request.fileName;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.uuid = request.uuid;
            this.versionId = request.versionId;
        } 

        /**
         * <p>Information of files to be deleted in JSON array format. If a single file needs to be deleted, this field should be left empty. If multiple files need to be deleted, just fill in this field.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;fileName&quot; : &quot;test.js.map&quot;,
         *     &quot;version&quot; : &quot;1.0.0&quot;
         *   },
         *   {
         *     &quot;fileName&quot; : &quot;test.dSYM&quot;,
         *     &quot;version&quot; : &quot;1.20.1&quot;,
         *     &quot;uuid&quot; : &quot;xxxx-xxxx-xxxx-xxxx&quot;
         *   }]</p>
         */
        public Builder batchItems(String batchItems) {
            this.putQueryParameter("BatchItems", batchItems);
            this.batchItems = batchItems;
            return this;
        }

        /**
         * <p>The file name, with the extension.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
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
         * <p>The file ID.</p>
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
        public DeleteRumUploadFileRequest build() {
            return new DeleteRumUploadFileRequest(this);
        } 

    } 

}
