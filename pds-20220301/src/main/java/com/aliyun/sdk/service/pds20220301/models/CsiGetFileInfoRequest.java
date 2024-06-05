// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CsiGetFileInfoRequest} extends {@link RequestModel}
 *
 * <p>CsiGetFileInfoRequest</p>
 */
public class CsiGetFileInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url_expire_sec")
    @com.aliyun.core.annotation.Validation(maximum = 14400, minimum = 10)
    private Integer urlExpireSec;

    private CsiGetFileInfoRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.urlExpireSec = builder.urlExpireSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CsiGetFileInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return urlExpireSec
     */
    public Integer getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public static final class Builder extends Request.Builder<CsiGetFileInfoRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private Integer urlExpireSec; 

        private Builder() {
            super();
        } 

        private Builder(CsiGetFileInfoRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.urlExpireSec = request.urlExpireSec;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * file_id.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * url_expire_sec.
         */
        public Builder urlExpireSec(Integer urlExpireSec) {
            this.putBodyParameter("url_expire_sec", urlExpireSec);
            this.urlExpireSec = urlExpireSec;
            return this;
        }

        @Override
        public CsiGetFileInfoRequest build() {
            return new CsiGetFileInfoRequest(this);
        } 

    } 

}
