// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link UploadAppSiteValidationFileRequest} extends {@link RequestModel}
 *
 * <p>UploadAppSiteValidationFileRequest</p>
 */
public class UploadAppSiteValidationFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("File")
    private String file;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileContent")
    private String fileContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteHost")
    private String siteHost;

    private UploadAppSiteValidationFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.domain = builder.domain;
        this.file = builder.file;
        this.fileContent = builder.fileContent;
        this.fileType = builder.fileType;
        this.siteHost = builder.siteHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAppSiteValidationFileRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return file
     */
    public String getFile() {
        return this.file;
    }

    /**
     * @return fileContent
     */
    public String getFileContent() {
        return this.fileContent;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return siteHost
     */
    public String getSiteHost() {
        return this.siteHost;
    }

    public static final class Builder extends Request.Builder<UploadAppSiteValidationFileRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String domain; 
        private String file; 
        private String fileContent; 
        private String fileType; 
        private String siteHost; 

        private Builder() {
            super();
        } 

        private Builder(UploadAppSiteValidationFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.domain = request.domain;
            this.file = request.file;
            this.fileContent = request.fileContent;
            this.fileType = request.fileType;
            this.siteHost = request.siteHost;
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
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>yjdw.bpu.edu.cn-waf</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;URI\&quot;: \&quot;oss://imm-test-co-cn-chengdu/zqh/input/Image/indexImage/nn1.jpg\&quot;, \&quot;LatLong\&quot;:\&quot;+39.998800,+116.480900\&quot;}</p>
         */
        public Builder file(String file) {
            this.putQueryParameter("File", file);
            this.file = file;
            return this;
        }

        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder fileContent(String fileContent) {
            this.putQueryParameter("FileContent", fileContent);
            this.fileContent = fileContent;
            return this;
        }

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_MAPPING</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The site host.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder siteHost(String siteHost) {
            this.putQueryParameter("SiteHost", siteHost);
            this.siteHost = siteHost;
            return this;
        }

        @Override
        public UploadAppSiteValidationFileRequest build() {
            return new UploadAppSiteValidationFileRequest(this);
        } 

    } 

}
