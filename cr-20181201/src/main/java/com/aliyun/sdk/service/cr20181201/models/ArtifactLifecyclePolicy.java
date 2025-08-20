// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ArtifactLifecyclePolicy} extends {@link TeaModel}
 *
 * <p>ArtifactLifecyclePolicy</p>
 */
public class ArtifactLifecyclePolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Condition")
    private Condition condition;

    @com.aliyun.core.annotation.NameInMap("Filter")
    private Filter filter;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ArtifactLifecyclePolicy(Builder builder) {
        this.condition = builder.condition;
        this.filter = builder.filter;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactLifecyclePolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public Condition getCondition() {
        return this.condition;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Condition condition; 
        private Filter filter; 
        private String type; 

        private Builder() {
        } 

        private Builder(ArtifactLifecyclePolicy model) {
            this.condition = model.condition;
            this.filter = model.filter;
            this.type = model.type;
        } 

        /**
         * Condition.
         */
        public Builder condition(Condition condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(Filter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ArtifactLifecyclePolicy build() {
            return new ArtifactLifecyclePolicy(this);
        } 

    } 

    /**
     * 
     * {@link ArtifactLifecyclePolicy} extends {@link TeaModel}
     *
     * <p>ArtifactLifecyclePolicy</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastPullOlderThanDays")
        private Integer lastPullOlderThanDays;

        @com.aliyun.core.annotation.NameInMap("LastPushOlderThanDays")
        private Integer lastPushOlderThanDays;

        @com.aliyun.core.annotation.NameInMap("LatestTagCount")
        private Integer latestTagCount;

        private Condition(Builder builder) {
            this.lastPullOlderThanDays = builder.lastPullOlderThanDays;
            this.lastPushOlderThanDays = builder.lastPushOlderThanDays;
            this.latestTagCount = builder.latestTagCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return lastPullOlderThanDays
         */
        public Integer getLastPullOlderThanDays() {
            return this.lastPullOlderThanDays;
        }

        /**
         * @return lastPushOlderThanDays
         */
        public Integer getLastPushOlderThanDays() {
            return this.lastPushOlderThanDays;
        }

        /**
         * @return latestTagCount
         */
        public Integer getLatestTagCount() {
            return this.latestTagCount;
        }

        public static final class Builder {
            private Integer lastPullOlderThanDays; 
            private Integer lastPushOlderThanDays; 
            private Integer latestTagCount; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.lastPullOlderThanDays = model.lastPullOlderThanDays;
                this.lastPushOlderThanDays = model.lastPushOlderThanDays;
                this.latestTagCount = model.latestTagCount;
            } 

            /**
             * LastPullOlderThanDays.
             */
            public Builder lastPullOlderThanDays(Integer lastPullOlderThanDays) {
                this.lastPullOlderThanDays = lastPullOlderThanDays;
                return this;
            }

            /**
             * LastPushOlderThanDays.
             */
            public Builder lastPushOlderThanDays(Integer lastPushOlderThanDays) {
                this.lastPushOlderThanDays = lastPushOlderThanDays;
                return this;
            }

            /**
             * LatestTagCount.
             */
            public Builder latestTagCount(Integer latestTagCount) {
                this.latestTagCount = latestTagCount;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    /**
     * 
     * {@link ArtifactLifecyclePolicy} extends {@link TeaModel}
     *
     * <p>ArtifactLifecyclePolicy</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagWildcard")
        private String tagWildcard;

        private Filter(Builder builder) {
            this.tagWildcard = builder.tagWildcard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return tagWildcard
         */
        public String getTagWildcard() {
            return this.tagWildcard;
        }

        public static final class Builder {
            private String tagWildcard; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.tagWildcard = model.tagWildcard;
            } 

            /**
             * TagWildcard.
             */
            public Builder tagWildcard(String tagWildcard) {
                this.tagWildcard = tagWildcard;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
