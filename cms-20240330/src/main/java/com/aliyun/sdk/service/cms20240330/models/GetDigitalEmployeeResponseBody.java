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
 * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDigitalEmployeeResponseBody</p>
 */
public class GetDigitalEmployeeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("defaultRule")
    private String defaultRule;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("knowledges")
    private Knowledges knowledges;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetDigitalEmployeeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.knowledges = builder.knowledges;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String defaultRule; 
        private String description; 
        private String displayName; 
        private Knowledges knowledges; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String roleArn; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetDigitalEmployeeResponseBody model) {
            this.createTime = model.createTime;
            this.defaultRule = model.defaultRule;
            this.description = model.description;
            this.displayName = model.displayName;
            this.knowledges = model.knowledges;
            this.name = model.name;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.roleArn = model.roleArn;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * defaultRule.
         */
        public Builder defaultRule(String defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * knowledges.
         */
        public Builder knowledges(Knowledges knowledges) {
            this.knowledges = knowledges;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-18T02:25:06Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetDigitalEmployeeResponseBody build() {
            return new GetDigitalEmployeeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
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
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
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
