// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
    private String aliyunResourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
    private java.util.List < AliyunResourceTags> aliyunResourceTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevEnvironmentEnabled")
    private Boolean devEnvironmentEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevRoleDisabled")
    private Boolean devRoleDisabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaiTaskEnabled")
    private Boolean paiTaskEnabled;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
        this.aliyunResourceTags = builder.aliyunResourceTags;
        this.description = builder.description;
        this.devEnvironmentEnabled = builder.devEnvironmentEnabled;
        this.devRoleDisabled = builder.devRoleDisabled;
        this.displayName = builder.displayName;
        this.name = builder.name;
        this.paiTaskEnabled = builder.paiTaskEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
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
     * @return aliyunResourceGroupId
     */
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    /**
     * @return aliyunResourceTags
     */
    public java.util.List < AliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return devEnvironmentEnabled
     */
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    /**
     * @return devRoleDisabled
     */
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paiTaskEnabled
     */
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String regionId; 
        private String aliyunResourceGroupId; 
        private java.util.List < AliyunResourceTags> aliyunResourceTags; 
        private String description; 
        private Boolean devEnvironmentEnabled; 
        private Boolean devRoleDisabled; 
        private String displayName; 
        private String name; 
        private Boolean paiTaskEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliyunResourceGroupId = request.aliyunResourceGroupId;
            this.aliyunResourceTags = request.aliyunResourceTags;
            this.description = request.description;
            this.devEnvironmentEnabled = request.devEnvironmentEnabled;
            this.devRoleDisabled = request.devRoleDisabled;
            this.displayName = request.displayName;
            this.name = request.name;
            this.paiTaskEnabled = request.paiTaskEnabled;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AliyunResourceGroupId.
         */
        public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
            this.putBodyParameter("AliyunResourceGroupId", aliyunResourceGroupId);
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }

        /**
         * AliyunResourceTags.
         */
        public Builder aliyunResourceTags(java.util.List < AliyunResourceTags> aliyunResourceTags) {
            String aliyunResourceTagsShrink = shrink(aliyunResourceTags, "AliyunResourceTags", "json");
            this.putBodyParameter("AliyunResourceTags", aliyunResourceTagsShrink);
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DevEnvironmentEnabled.
         */
        public Builder devEnvironmentEnabled(Boolean devEnvironmentEnabled) {
            this.putBodyParameter("DevEnvironmentEnabled", devEnvironmentEnabled);
            this.devEnvironmentEnabled = devEnvironmentEnabled;
            return this;
        }

        /**
         * DevRoleDisabled.
         */
        public Builder devRoleDisabled(Boolean devRoleDisabled) {
            this.putBodyParameter("DevRoleDisabled", devRoleDisabled);
            this.devRoleDisabled = devRoleDisabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sora_finance</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PaiTaskEnabled.
         */
        public Builder paiTaskEnabled(Boolean paiTaskEnabled) {
            this.putBodyParameter("PaiTaskEnabled", paiTaskEnabled);
            this.paiTaskEnabled = paiTaskEnabled;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class AliyunResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AliyunResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunResourceTags create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AliyunResourceTags build() {
                return new AliyunResourceTags(this);
            } 

        } 

    }
}
