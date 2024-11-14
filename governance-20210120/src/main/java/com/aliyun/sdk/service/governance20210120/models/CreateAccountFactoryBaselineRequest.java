// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAccountFactoryBaselineRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountFactoryBaselineRequest</p>
 */
public class CreateAccountFactoryBaselineRequest extends Request {
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

    private CreateAccountFactoryBaselineRequest(Builder builder) {
        super(builder);
        this.baselineItems = builder.baselineItems;
        this.baselineName = builder.baselineName;
        this.description = builder.description;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountFactoryBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateAccountFactoryBaselineRequest, Builder> {
        private java.util.List < BaselineItems> baselineItems; 
        private String baselineName; 
        private String description; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountFactoryBaselineRequest request) {
            super(request);
            this.baselineItems = request.baselineItems;
            this.baselineName = request.baselineName;
            this.description = request.description;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The baseline items.</p>
         * <p>You can call the <a href="~~ListAccountFactoryBaselineItems~~">ListAccountFactoryBaselineItems</a> operation to query a list of baseline items supported by the account factory in Cloud Governance Center.</p>
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder baselineName(String baselineName) {
            this.putQueryParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
            return this;
        }

        /**
         * <p>The description of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Default Baseline.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public CreateAccountFactoryBaselineRequest build() {
            return new CreateAccountFactoryBaselineRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccountFactoryBaselineRequest} extends {@link TeaModel}
     *
     * <p>CreateAccountFactoryBaselineRequest</p>
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
             * <p>The configurations of the baseline item. The value of this parameter is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EnabledServices&quot;:[&quot;CEN_TR&quot;,&quot;CDT&quot;,&quot;CMS&quot;,&quot;KMS&quot;]}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
