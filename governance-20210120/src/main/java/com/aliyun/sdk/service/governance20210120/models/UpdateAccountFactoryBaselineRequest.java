// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
    private java.util.List<BaselineItems> baselineItems;

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
    public java.util.List<BaselineItems> getBaselineItems() {
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
        private java.util.List<BaselineItems> baselineItems; 
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
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afb-bp1pq3emlkt27vsj****</p>
         */
        public Builder baselineId(String baselineId) {
            this.putQueryParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The baseline items.</p>
         * <p>You can call the <a href="~~ListAccountFactoryBaselineItems~~">ListAccountFactoryBaselineItems</a> operation to query a list of baseline items supported by the account factory in Cloud Governance Center.</p>
         */
        public Builder baselineItems(java.util.List<BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * <p>The name of the baseline.</p>
         */
        public Builder baselineName(String baselineName) {
            this.putQueryParameter("BaselineName", baselineName);
            this.baselineName = baselineName;
            return this;
        }

        /**
         * <p>The description of the baseline.</p>
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

            private Builder() {
            } 

            private Builder(BaselineItems model) {
                this.config = model.config;
                this.name = model.name;
                this.version = model.version;
            } 

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
