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
 * {@link AppInfoDTO} extends {@link TeaModel}
 *
 * <p>AppInfoDTO</p>
 */
public class AppInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private Integer appType;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("ItemId")
    private String itemId;

    @com.aliyun.core.annotation.NameInMap("ModificationTime")
    private String modificationTime;

    @com.aliyun.core.annotation.NameInMap("Platforms")
    private java.util.List<Platforms> platforms;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private AppInfoDTO(Builder builder) {
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.creationTime = builder.creationTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.itemId = builder.itemId;
        this.modificationTime = builder.modificationTime;
        this.platforms = builder.platforms;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppInfoDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return modificationTime
     */
    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * @return platforms
     */
    public java.util.List<Platforms> getPlatforms() {
        return this.platforms;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String appName; 
        private Integer appType; 
        private String creationTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private String itemId; 
        private String modificationTime; 
        private java.util.List<Platforms> platforms; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(AppInfoDTO model) {
            this.appName = model.appName;
            this.appType = model.appType;
            this.creationTime = model.creationTime;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.itemId = model.itemId;
            this.modificationTime = model.modificationTime;
            this.platforms = model.platforms;
            this.userId = model.userId;
        } 

        /**
         * <p>The application name.</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li>1: Common application.</li>
         * <li>2: Embedded SDK.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appType(Integer appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>The creation time.</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The creation time.</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The update time.</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The application ID.</p>
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>The update time.</p>
         */
        public Builder modificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        /**
         * <p>The list of platform information for the application.</p>
         */
        public Builder platforms(java.util.List<Platforms> platforms) {
            this.platforms = platforms;
            return this;
        }

        /**
         * <p>The user ID.</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public AppInfoDTO build() {
            return new AppInfoDTO(this);
        } 

    } 

    /**
     * 
     * {@link AppInfoDTO} extends {@link TeaModel}
     *
     * <p>AppInfoDTO</p>
     */
    public static class Platforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("LicenseItemIds")
        private java.util.List<String> licenseItemIds;

        @com.aliyun.core.annotation.NameInMap("PkgName")
        private String pkgName;

        @com.aliyun.core.annotation.NameInMap("PkgSignature")
        private String pkgSignature;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        private Long platformType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Platforms(Builder builder) {
            this.itemId = builder.itemId;
            this.licenseItemIds = builder.licenseItemIds;
            this.pkgName = builder.pkgName;
            this.pkgSignature = builder.pkgSignature;
            this.platformType = builder.platformType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return licenseItemIds
         */
        public java.util.List<String> getLicenseItemIds() {
            return this.licenseItemIds;
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

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String itemId; 
            private java.util.List<String> licenseItemIds; 
            private String pkgName; 
            private String pkgSignature; 
            private Long platformType; 
            private Long type; 

            private Builder() {
            } 

            private Builder(Platforms model) {
                this.itemId = model.itemId;
                this.licenseItemIds = model.licenseItemIds;
                this.pkgName = model.pkgName;
                this.pkgSignature = model.pkgSignature;
                this.platformType = model.platformType;
                this.type = model.type;
            } 

            /**
             * <p>The platform ID.</p>
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The list of licenses.</p>
             */
            public Builder licenseItemIds(java.util.List<String> licenseItemIds) {
                this.licenseItemIds = licenseItemIds;
                return this;
            }

            /**
             * <p>The package name.</p>
             */
            public Builder pkgName(String pkgName) {
                this.pkgName = pkgName;
                return this;
            }

            /**
             * <p>The package signature.</p>
             */
            public Builder pkgSignature(String pkgSignature) {
                this.pkgSignature = pkgSignature;
                return this;
            }

            /**
             * <p>The platform type.</p>
             */
            public Builder platformType(Long platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * <p>The platform type.</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
}
