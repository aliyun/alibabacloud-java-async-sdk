// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateAndBindAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAndBindAppRequest</p>
 */
public class CreateAndBindAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIconUrl")
    private String appIconUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginAppType")
    private String originAppType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UrlSuffix")
    private String urlSuffix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private CreateAndBindAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appIconUrl = builder.appIconUrl;
        this.appName = builder.appName;
        this.imageId = builder.imageId;
        this.originAppType = builder.originAppType;
        this.port = builder.port;
        this.urlSuffix = builder.urlSuffix;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndBindAppRequest create() {
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
     * @return appIconUrl
     */
    public String getAppIconUrl() {
        return this.appIconUrl;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return originAppType
     */
    public String getOriginAppType() {
        return this.originAppType;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return urlSuffix
     */
    public String getUrlSuffix() {
        return this.urlSuffix;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CreateAndBindAppRequest, Builder> {
        private String regionId; 
        private String appIconUrl; 
        private String appName; 
        private String imageId; 
        private String originAppType; 
        private String port; 
        private String urlSuffix; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndBindAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appIconUrl = request.appIconUrl;
            this.appName = request.appName;
            this.imageId = request.imageId;
            this.originAppType = request.originAppType;
            this.port = request.port;
            this.urlSuffix = request.urlSuffix;
            this.versionId = request.versionId;
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
         * <p>The URL of the application icon. Specify an accessible icon URL to display a custom icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/apps/business/icon.png">https://example.com/apps/business/icon.png</a></p>
         */
        public Builder appIconUrl(String appIconUrl) {
            this.putBodyParameter("AppIconUrl", appIconUrl);
            this.appIconUrl = appIconUrl;
            return this;
        }

        /**
         * <p>The name of the application to be created, which is used to identify the application in the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Business management platform</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ID of the image to which the application is bound. The image must be a custom image or community image that can be managed by the current account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The application type. If omitted, the default value is CLIENT_BASE. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_BASE</strong>: Client application.</li>
         * <li><strong>WEB_BASE</strong>: Browser application.</li>
         * <li><strong>CLOUD_NATIVE_BASE</strong>: Cloud-native application.</li>
         * <li><strong>PORT_SERVICE_BASE</strong>: Port service application.</li>
         * <li><strong>AGENT_SERVICE_BASE</strong>: Agent application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PORT_SERVICE_BASE</p>
         */
        public Builder originAppType(String originAppType) {
            this.putBodyParameter("OriginAppType", originAppType);
            this.originAppType = originAppType;
            return this;
        }

        /**
         * <p>The application service port. For applications that require port-based access, specify the actual port number that the application listens on.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(String port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The path suffix of the application access URL, which is used together with the application service port to describe the access entry point.</p>
         * 
         * <strong>example:</strong>
         * <p>/console</p>
         */
        public Builder urlSuffix(String urlSuffix) {
            this.putBodyParameter("UrlSuffix", urlSuffix);
            this.urlSuffix = urlSuffix;
            return this;
        }

        /**
         * <p>The ID of the image version to which the application is bound. If omitted, the current active version of the image specified by ImageId is used. If specified, the version must belong to the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CreateAndBindAppRequest build() {
            return new CreateAndBindAppRequest(this);
        } 

    } 

}
