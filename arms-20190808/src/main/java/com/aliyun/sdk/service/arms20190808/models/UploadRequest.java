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
 * {@link UploadRequest} extends {@link RequestModel}
 *
 * <p>UploadRequest</p>
 */
public class UploadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("File")
    private String file;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private UploadRequest(Builder builder) {
        super(builder);
        this.edition = builder.edition;
        this.file = builder.file;
        this.fileName = builder.fileName;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return file
     */
    public String getFile() {
        return this.file;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UploadRequest, Builder> {
        private String edition; 
        private String file; 
        private String fileName; 
        private String pid; 
        private String regionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UploadRequest request) {
            super(request);
            this.edition = request.edition;
            this.file = request.file;
            this.fileName = request.fileName;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.version = request.version;
        } 

        /**
         * <p>The version of the SourceMap file.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The string of the SourceMap file.</p>
         * 
         * <strong>example:</strong>
         * <p>test file content</p>
         */
        public Builder file(String file) {
            this.putBodyParameter("File", file);
            this.file = file;
            return this;
        }

        /**
         * <p>The name of the SourceMap file.</p>
         * <p>This parameter is required.</p>
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
         * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d****, you must replace %40 with @ to obtain eb4zdose6v@9781be0f44d****.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@8cc3f6354******</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The ID of the region to which the SourceMap file is uploaded.</p>
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
         * <p>We recommend that you do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public UploadRequest build() {
            return new UploadRequest(this);
        } 

    } 

}
