// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateSoftwarelibVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateSoftwarelibVersionRequest</p>
 */
public class CreateSoftwarelibVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Md5")
    private String md5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublisherType")
    private String publisherType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String softwareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareName")
    private String softwareName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwarePkgName")
    private String softwarePkgName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwarePkgSize")
    private Long softwarePkgSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareUrl")
    private String softwareUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareVersion")
    private String softwareVersion;

    private CreateSoftwarelibVersionRequest(Builder builder) {
        super(builder);
        this.md5 = builder.md5;
        this.os = builder.os;
        this.publisherType = builder.publisherType;
        this.softwareId = builder.softwareId;
        this.softwareName = builder.softwareName;
        this.softwarePkgName = builder.softwarePkgName;
        this.softwarePkgSize = builder.softwarePkgSize;
        this.softwareUrl = builder.softwareUrl;
        this.softwareVersion = builder.softwareVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoftwarelibVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return publisherType
     */
    public String getPublisherType() {
        return this.publisherType;
    }

    /**
     * @return softwareId
     */
    public String getSoftwareId() {
        return this.softwareId;
    }

    /**
     * @return softwareName
     */
    public String getSoftwareName() {
        return this.softwareName;
    }

    /**
     * @return softwarePkgName
     */
    public String getSoftwarePkgName() {
        return this.softwarePkgName;
    }

    /**
     * @return softwarePkgSize
     */
    public Long getSoftwarePkgSize() {
        return this.softwarePkgSize;
    }

    /**
     * @return softwareUrl
     */
    public String getSoftwareUrl() {
        return this.softwareUrl;
    }

    /**
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public static final class Builder extends Request.Builder<CreateSoftwarelibVersionRequest, Builder> {
        private String md5; 
        private String os; 
        private String publisherType; 
        private String softwareId; 
        private String softwareName; 
        private String softwarePkgName; 
        private Long softwarePkgSize; 
        private String softwareUrl; 
        private String softwareVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoftwarelibVersionRequest request) {
            super(request);
            this.md5 = request.md5;
            this.os = request.os;
            this.publisherType = request.publisherType;
            this.softwareId = request.softwareId;
            this.softwareName = request.softwareName;
            this.softwarePkgName = request.softwarePkgName;
            this.softwarePkgSize = request.softwarePkgSize;
            this.softwareUrl = request.softwareUrl;
            this.softwareVersion = request.softwareVersion;
        } 

        /**
         * Md5.
         */
        public Builder md5(String md5) {
            this.putBodyParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * PublisherType.
         */
        public Builder publisherType(String publisherType) {
            this.putBodyParameter("PublisherType", publisherType);
            this.publisherType = publisherType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-software-2c51808a3cc8****</p>
         */
        public Builder softwareId(String softwareId) {
            this.putBodyParameter("SoftwareId", softwareId);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * SoftwareName.
         */
        public Builder softwareName(String softwareName) {
            this.putBodyParameter("SoftwareName", softwareName);
            this.softwareName = softwareName;
            return this;
        }

        /**
         * SoftwarePkgName.
         */
        public Builder softwarePkgName(String softwarePkgName) {
            this.putBodyParameter("SoftwarePkgName", softwarePkgName);
            this.softwarePkgName = softwarePkgName;
            return this;
        }

        /**
         * SoftwarePkgSize.
         */
        public Builder softwarePkgSize(Long softwarePkgSize) {
            this.putBodyParameter("SoftwarePkgSize", softwarePkgSize);
            this.softwarePkgSize = softwarePkgSize;
            return this;
        }

        /**
         * SoftwareUrl.
         */
        public Builder softwareUrl(String softwareUrl) {
            this.putBodyParameter("SoftwareUrl", softwareUrl);
            this.softwareUrl = softwareUrl;
            return this;
        }

        /**
         * SoftwareVersion.
         */
        public Builder softwareVersion(String softwareVersion) {
            this.putBodyParameter("SoftwareVersion", softwareVersion);
            this.softwareVersion = softwareVersion;
            return this;
        }

        @Override
        public CreateSoftwarelibVersionRequest build() {
            return new CreateSoftwarelibVersionRequest(this);
        } 

    } 

}
