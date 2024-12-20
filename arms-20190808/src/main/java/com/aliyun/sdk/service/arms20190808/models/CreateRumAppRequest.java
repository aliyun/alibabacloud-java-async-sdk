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
 * {@link CreateRumAppRequest} extends {@link RequestModel}
 *
 * <p>CreateRumAppRequest</p>
 */
public class CreateRumAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppGroup")
    private String appGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageName")
    private String packageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealRegionId")
    private String realRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateRumAppRequest(Builder builder) {
        super(builder);
        this.appGroup = builder.appGroup;
        this.appName = builder.appName;
        this.description = builder.description;
        this.nickName = builder.nickName;
        this.packageName = builder.packageName;
        this.realRegionId = builder.realRegionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.siteType = builder.siteType;
        this.source = builder.source;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRumAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroup
     */
    public String getAppGroup() {
        return this.appGroup;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * @return realRegionId
     */
    public String getRealRegionId() {
        return this.realRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return siteType
     */
    public String getSiteType() {
        return this.siteType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRumAppRequest, Builder> {
        private String appGroup; 
        private String appName; 
        private String description; 
        private String nickName; 
        private String packageName; 
        private String realRegionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String siteType; 
        private String source; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRumAppRequest request) {
            super(request);
            this.appGroup = request.appGroup;
            this.appName = request.appName;
            this.description = request.description;
            this.nickName = request.nickName;
            this.packageName = request.packageName;
            this.realRegionId = request.realRegionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.siteType = request.siteType;
            this.source = request.source;
            this.tag = request.tag;
        } 

        /**
         * <p>The name of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder appGroup(String appGroup) {
            this.putQueryParameter("AppGroup", appGroup);
            this.appGroup = appGroup;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Monitoring description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The nickname of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The name of the Android application package. This parameter is required if you create an Android application.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xxxx.xxxxxx</p>
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("PackageName", packageName);
            this.packageName = packageName;
            return this;
        }

        /**
         * RealRegionId.
         */
        public Builder realRegionId(String realRegionId) {
            this.putQueryParameter("RealRegionId", realRegionId);
            this.realRegionId = realRegionId;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The application type. Valid values: web, miniapp, ios, and android.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder siteType(String siteType) {
            this.putQueryParameter("SiteType", siteType);
            this.siteType = siteType;
            return this;
        }

        /**
         * <p>The source. This is a reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>arms</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The list of tags. You can specify a maximum of 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRumAppRequest build() {
            return new CreateRumAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRumAppRequest} extends {@link TeaModel}
     *
     * <p>CreateRumAppRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
