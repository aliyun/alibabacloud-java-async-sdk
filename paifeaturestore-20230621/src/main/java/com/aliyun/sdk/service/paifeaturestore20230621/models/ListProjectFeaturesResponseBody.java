// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListProjectFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectFeaturesResponseBody</p>
 */
public class ListProjectFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List<Features> features;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListProjectFeaturesResponseBody(Builder builder) {
        this.features = builder.features;
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectFeaturesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return features
     */
    public java.util.List<Features> getFeatures() {
        return this.features;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Features> features; 
        private Integer totalCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProjectFeaturesResponseBody model) {
            this.features = model.features;
            this.totalCount = model.totalCount;
            this.requestId = model.requestId;
        } 

        /**
         * Features.
         */
        public Builder features(java.util.List<Features> features) {
            this.features = features;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7D497816-607C-5B67-97B1-61354B6ACB2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectFeaturesResponseBody build() {
            return new ListProjectFeaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectFeaturesResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasNames")
        private String aliasNames;

        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("FeatureViewName")
        private String featureViewName;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("ModelFeatureCount")
        private Integer modelFeatureCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Features(Builder builder) {
            this.aliasNames = builder.aliasNames;
            this.featureViewId = builder.featureViewId;
            this.featureViewName = builder.featureViewName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.modelFeatureCount = builder.modelFeatureCount;
            this.name = builder.name;
            this.owner = builder.owner;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return aliasNames
         */
        public String getAliasNames() {
            return this.aliasNames;
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        /**
         * @return featureViewName
         */
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return modelFeatureCount
         */
        public Integer getModelFeatureCount() {
            return this.modelFeatureCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasNames; 
            private String featureViewId; 
            private String featureViewName; 
            private String gmtCreateTime; 
            private Integer modelFeatureCount; 
            private String name; 
            private String owner; 
            private String type; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.aliasNames = model.aliasNames;
                this.featureViewId = model.featureViewId;
                this.featureViewName = model.featureViewName;
                this.gmtCreateTime = model.gmtCreateTime;
                this.modelFeatureCount = model.modelFeatureCount;
                this.name = model.name;
                this.owner = model.owner;
                this.type = model.type;
            } 

            /**
             * AliasNames.
             */
            public Builder aliasNames(String aliasNames) {
                this.aliasNames = aliasNames;
                return this;
            }

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
                return this;
            }

            /**
             * FeatureViewName.
             */
            public Builder featureViewName(String featureViewName) {
                this.featureViewName = featureViewName;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * ModelFeatureCount.
             */
            public Builder modelFeatureCount(Integer modelFeatureCount) {
                this.modelFeatureCount = modelFeatureCount;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
