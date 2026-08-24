// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ConfigSetCreateRequest} extends {@link RequestModel}
 *
 * <p>ConfigSetCreateRequest</p>
 */
public class ConfigSetCreateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPoolId")
    private String ipPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPublicChannelBackoff")
    private Boolean isPublicChannelBackoff;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidationOption")
    private ValidationOption validationOption;

    private ConfigSetCreateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.ipPoolId = builder.ipPoolId;
        this.isPublicChannelBackoff = builder.isPublicChannelBackoff;
        this.name = builder.name;
        this.validationOption = builder.validationOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetCreateRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipPoolId
     */
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    /**
     * @return isPublicChannelBackoff
     */
    public Boolean getIsPublicChannelBackoff() {
        return this.isPublicChannelBackoff;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return validationOption
     */
    public ValidationOption getValidationOption() {
        return this.validationOption;
    }

    public static final class Builder extends Request.Builder<ConfigSetCreateRequest, Builder> {
        private String regionId; 
        private String description; 
        private String ipPoolId; 
        private Boolean isPublicChannelBackoff; 
        private String name; 
        private ValidationOption validationOption; 

        private Builder() {
            super();
        } 

        private Builder(ConfigSetCreateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.ipPoolId = request.ipPoolId;
            this.isPublicChannelBackoff = request.isPublicChannelBackoff;
            this.name = request.name;
            this.validationOption = request.validationOption;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IpPoolId.
         */
        public Builder ipPoolId(String ipPoolId) {
            this.putQueryParameter("IpPoolId", ipPoolId);
            this.ipPoolId = ipPoolId;
            return this;
        }

        /**
         * IsPublicChannelBackoff.
         */
        public Builder isPublicChannelBackoff(Boolean isPublicChannelBackoff) {
            this.putQueryParameter("IsPublicChannelBackoff", isPublicChannelBackoff);
            this.isPublicChannelBackoff = isPublicChannelBackoff;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ValidationOption.
         */
        public Builder validationOption(ValidationOption validationOption) {
            String validationOptionShrink = shrink(validationOption, "ValidationOption", "json");
            this.putQueryParameter("ValidationOption", validationOptionShrink);
            this.validationOption = validationOption;
            return this;
        }

        @Override
        public ConfigSetCreateRequest build() {
            return new ConfigSetCreateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigSetCreateRequest} extends {@link TeaModel}
     *
     * <p>ConfigSetCreateRequest</p>
     */
    public static class ValidationOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ForbiddenStatusList")
        private java.util.List<String> forbiddenStatusList;

        @com.aliyun.core.annotation.NameInMap("ForbiddenSubStatusList")
        private java.util.List<String> forbiddenSubStatusList;

        private ValidationOption(Builder builder) {
            this.enabled = builder.enabled;
            this.forbiddenStatusList = builder.forbiddenStatusList;
            this.forbiddenSubStatusList = builder.forbiddenSubStatusList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidationOption create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return forbiddenStatusList
         */
        public java.util.List<String> getForbiddenStatusList() {
            return this.forbiddenStatusList;
        }

        /**
         * @return forbiddenSubStatusList
         */
        public java.util.List<String> getForbiddenSubStatusList() {
            return this.forbiddenSubStatusList;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> forbiddenStatusList; 
            private java.util.List<String> forbiddenSubStatusList; 

            private Builder() {
            } 

            private Builder(ValidationOption model) {
                this.enabled = model.enabled;
                this.forbiddenStatusList = model.forbiddenStatusList;
                this.forbiddenSubStatusList = model.forbiddenSubStatusList;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ForbiddenStatusList.
             */
            public Builder forbiddenStatusList(java.util.List<String> forbiddenStatusList) {
                this.forbiddenStatusList = forbiddenStatusList;
                return this;
            }

            /**
             * ForbiddenSubStatusList.
             */
            public Builder forbiddenSubStatusList(java.util.List<String> forbiddenSubStatusList) {
                this.forbiddenSubStatusList = forbiddenSubStatusList;
                return this;
            }

            public ValidationOption build() {
                return new ValidationOption(this);
            } 

        } 

    }
}
