// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetGlobalAppRequest} extends {@link RequestModel}
 *
 * <p>GetGlobalAppRequest</p>
 */
public class GetGlobalAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.List < String > attributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    private GetGlobalAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.appVersion = builder.appVersion;
        this.attributes = builder.attributes;
        this.location = builder.location;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalAppRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return attributes
     */
    public java.util.List < String > getAttributes() {
        return this.attributes;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public static final class Builder extends Request.Builder<GetGlobalAppRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String appVersion; 
        private java.util.List < String > attributes; 
        private String location; 
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(GetGlobalAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.appVersion = request.appVersion;
            this.attributes = request.attributes;
            this.location = request.location;
            this.namespaceName = request.namespaceName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>joint-calling</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * Attributes.
         */
        public Builder attributes(java.util.List < String > attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putQueryParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sentieon</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public GetGlobalAppRequest build() {
            return new GetGlobalAppRequest(this);
        } 

    } 

}
