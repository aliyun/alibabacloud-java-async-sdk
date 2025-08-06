// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link EditAppInfoRequest} extends {@link RequestModel}
 *
 * <p>EditAppInfoRequest</p>
 */
public class EditAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    private String appItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platforms")
    private java.util.List<Platforms> platforms;

    private EditAppInfoRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.platforms = builder.platforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditAppInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appItemId
     */
    public String getAppItemId() {
        return this.appItemId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return platforms
     */
    public java.util.List<Platforms> getPlatforms() {
        return this.platforms;
    }

    public static final class Builder extends Request.Builder<EditAppInfoRequest, Builder> {
        private String appItemId; 
        private String appName; 
        private Integer appType; 
        private java.util.List<Platforms> platforms; 

        private Builder() {
            super();
        } 

        private Builder(EditAppInfoRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.appName = request.appName;
            this.appType = request.appType;
            this.platforms = request.platforms;
        } 

        /**
         * AppItemId.
         */
        public Builder appItemId(String appItemId) {
            this.putQueryParameter("AppItemId", appItemId);
            this.appItemId = appItemId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Integer appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * Platforms.
         */
        public Builder platforms(java.util.List<Platforms> platforms) {
            String platformsShrink = shrink(platforms, "Platforms", "json");
            this.putQueryParameter("Platforms", platformsShrink);
            this.platforms = platforms;
            return this;
        }

        @Override
        public EditAppInfoRequest build() {
            return new EditAppInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link EditAppInfoRequest} extends {@link TeaModel}
     *
     * <p>EditAppInfoRequest</p>
     */
    public static class Platforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PkgName")
        private String pkgName;

        @com.aliyun.core.annotation.NameInMap("PkgSignature")
        private String pkgSignature;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        private Long platformType;

        private Platforms(Builder builder) {
            this.pkgName = builder.pkgName;
            this.pkgSignature = builder.pkgSignature;
            this.platformType = builder.platformType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return pkgName
         */
        public String getPkgName() {
            return this.pkgName;
        }

        /**
         * @return pkgSignature
         */
        public String getPkgSignature() {
            return this.pkgSignature;
        }

        /**
         * @return platformType
         */
        public Long getPlatformType() {
            return this.platformType;
        }

        public static final class Builder {
            private String pkgName; 
            private String pkgSignature; 
            private Long platformType; 

            private Builder() {
            } 

            private Builder(Platforms model) {
                this.pkgName = model.pkgName;
                this.pkgSignature = model.pkgSignature;
                this.platformType = model.platformType;
            } 

            /**
             * PkgName.
             */
            public Builder pkgName(String pkgName) {
                this.pkgName = pkgName;
                return this;
            }

            /**
             * PkgSignature.
             */
            public Builder pkgSignature(String pkgSignature) {
                this.pkgSignature = pkgSignature;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(Long platformType) {
                this.platformType = platformType;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
}
