// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAccountFactoryBaselineRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountFactoryBaselineRequest</p>
 */
public class UpdateAccountFactoryBaselineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineItems")
    private java.util.List < BaselineItems> baselineItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineName")
    private String baselineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateAccountFactoryBaselineRequest(Builder builder) {
        super(builder);
        this.baselineId = builder.baselineId;
        this.baselineItems = builder.baselineItems;
        this.baselineName = builder.baselineName;
        this.description = builder.description;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccountFactoryBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return baselineItems
     */
    public java.util.List < BaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    /**
     * @return baselineName
     */
    public String getBaselineName() {
        return this.baselineName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAccountFactoryBaselineRequest, Builder> {
        private String baselineId; 
        private java.util.List < BaselineItems> baselineItems; 
        private String baselineName; 
        private String description; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountFactoryBaselineRequest request) {
            super(request);
            this.baselineId = request.baselineId;
            this.baselineItems = request.baselineItems;
            this.baselineName = request.baselineName;
            this.description = request.description;
            this.regionId = request.regionId;
        } 

        /**
         * BaselineId.
         */
        public Builder baselineId(String baselineId) {
            this.putQueryParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * BaselineItems.
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * BaselineName.
         */
        public Builder baselineName(String baselineName) {
            this.putQueryParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
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
         * <p>RegionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAccountFactoryBaselineRequest build() {
            return new UpdateAccountFactoryBaselineRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAccountFactoryBaselineRequest} extends {@link TeaModel}
     *
     * <p>UpdateAccountFactoryBaselineRequest</p>
     */
    public static class BaselineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BaselineItems(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItems create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String name; 
            private String version; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BaselineItems build() {
                return new BaselineItems(this);
            } 

        } 

    }
}
