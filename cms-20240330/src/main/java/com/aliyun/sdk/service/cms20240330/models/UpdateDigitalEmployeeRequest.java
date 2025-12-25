// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateDigitalEmployeeRequest} extends {@link RequestModel}
 *
 * <p>UpdateDigitalEmployeeRequest</p>
 */
public class UpdateDigitalEmployeeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultRule")
    private String defaultRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("knowledges")
    private Knowledges knowledges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    private UpdateDigitalEmployeeRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.knowledges = builder.knowledges;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDigitalEmployeeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return defaultRule
     */
    public String getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return knowledges
     */
    public Knowledges getKnowledges() {
        return this.knowledges;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder extends Request.Builder<UpdateDigitalEmployeeRequest, Builder> {
        private String name; 
        private String regionId; 
        private String defaultRule; 
        private String description; 
        private String displayName; 
        private Knowledges knowledges; 
        private String roleArn; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDigitalEmployeeRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
            this.defaultRule = request.defaultRule;
            this.description = request.description;
            this.displayName = request.displayName;
            this.knowledges = request.knowledges;
            this.roleArn = request.roleArn;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
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
         * defaultRule.
         */
        public Builder defaultRule(String defaultRule) {
            this.putBodyParameter("defaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * knowledges.
         */
        public Builder knowledges(Knowledges knowledges) {
            this.putBodyParameter("knowledges", knowledges);
            this.knowledges = knowledges;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("roleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        @Override
        public UpdateDigitalEmployeeRequest build() {
            return new UpdateDigitalEmployeeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class Bailian extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("indexId")
        private String indexId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Bailian(Builder builder) {
            this.attributes = builder.attributes;
            this.indexId = builder.indexId;
            this.region = builder.region;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bailian create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String attributes; 
            private String indexId; 
            private String region; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Bailian model) {
                this.attributes = model.attributes;
                this.indexId = model.indexId;
                this.region = model.region;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * indexId.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Bailian build() {
                return new Bailian(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class Knowledges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bailian")
        private java.util.List<Bailian> bailian;

        private Knowledges(Builder builder) {
            this.bailian = builder.bailian;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Knowledges create() {
            return builder().build();
        }

        /**
         * @return bailian
         */
        public java.util.List<Bailian> getBailian() {
            return this.bailian;
        }

        public static final class Builder {
            private java.util.List<Bailian> bailian; 

            private Builder() {
            } 

            private Builder(Knowledges model) {
                this.bailian = model.bailian;
            } 

            /**
             * bailian.
             */
            public Builder bailian(java.util.List<Bailian> bailian) {
                this.bailian = bailian;
                return this;
            }

            public Knowledges build() {
                return new Knowledges(this);
            } 

        } 

    }
}
