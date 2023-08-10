// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchStrategy} extends {@link TeaModel}
 *
 * <p>SearchStrategy</p>
 */
public class SearchStrategy extends TeaModel {
    @NameInMap("description")
    private String description;

    @NameInMap("isDefault")
    private Boolean isDefault;

    @NameInMap("mergeConfig")
    private MergeConfig mergeConfig;

    @NameInMap("name")
    private String name;

    @NameInMap("searchConfigs")
    private java.util.List < SearchConfigs> searchConfigs;

    private SearchStrategy(Builder builder) {
        this.description = builder.description;
        this.isDefault = builder.isDefault;
        this.mergeConfig = builder.mergeConfig;
        this.name = builder.name;
        this.searchConfigs = builder.searchConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchStrategy create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return mergeConfig
     */
    public MergeConfig getMergeConfig() {
        return this.mergeConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return searchConfigs
     */
    public java.util.List < SearchConfigs> getSearchConfigs() {
        return this.searchConfigs;
    }

    public static final class Builder {
        private String description; 
        private Boolean isDefault; 
        private MergeConfig mergeConfig; 
        private String name; 
        private java.util.List < SearchConfigs> searchConfigs; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * isDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * mergeConfig.
         */
        public Builder mergeConfig(MergeConfig mergeConfig) {
            this.mergeConfig = mergeConfig;
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
         * searchConfigs.
         */
        public Builder searchConfigs(java.util.List < SearchConfigs> searchConfigs) {
            this.searchConfigs = searchConfigs;
            return this;
        }

        public SearchStrategy build() {
            return new SearchStrategy(this);
        } 

    } 

    public static class MergeConfig extends TeaModel {
        @NameInMap("docCount")
        private Integer docCount;

        @NameInMap("rankName")
        private String rankName;

        private MergeConfig(Builder builder) {
            this.docCount = builder.docCount;
            this.rankName = builder.rankName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeConfig create() {
            return builder().build();
        }

        /**
         * @return docCount
         */
        public Integer getDocCount() {
            return this.docCount;
        }

        /**
         * @return rankName
         */
        public String getRankName() {
            return this.rankName;
        }

        public static final class Builder {
            private Integer docCount; 
            private String rankName; 

            /**
             * docCount.
             */
            public Builder docCount(Integer docCount) {
                this.docCount = docCount;
                return this;
            }

            /**
             * rankName.
             */
            public Builder rankName(String rankName) {
                this.rankName = rankName;
                return this;
            }

            public MergeConfig build() {
                return new MergeConfig(this);
            } 

        } 

    }
    public static class SearchConfigs extends TeaModel {
        @NameInMap("firstRankName")
        private String firstRankName;

        @NameInMap("mergeProportion")
        private Integer mergeProportion;

        @NameInMap("queryType")
        private String queryType;

        @NameInMap("secondRankName")
        private String secondRankName;

        private SearchConfigs(Builder builder) {
            this.firstRankName = builder.firstRankName;
            this.mergeProportion = builder.mergeProportion;
            this.queryType = builder.queryType;
            this.secondRankName = builder.secondRankName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchConfigs create() {
            return builder().build();
        }

        /**
         * @return firstRankName
         */
        public String getFirstRankName() {
            return this.firstRankName;
        }

        /**
         * @return mergeProportion
         */
        public Integer getMergeProportion() {
            return this.mergeProportion;
        }

        /**
         * @return queryType
         */
        public String getQueryType() {
            return this.queryType;
        }

        /**
         * @return secondRankName
         */
        public String getSecondRankName() {
            return this.secondRankName;
        }

        public static final class Builder {
            private String firstRankName; 
            private Integer mergeProportion; 
            private String queryType; 
            private String secondRankName; 

            /**
             * firstRankName.
             */
            public Builder firstRankName(String firstRankName) {
                this.firstRankName = firstRankName;
                return this;
            }

            /**
             * mergeProportion.
             */
            public Builder mergeProportion(Integer mergeProportion) {
                this.mergeProportion = mergeProportion;
                return this;
            }

            /**
             * queryType.
             */
            public Builder queryType(String queryType) {
                this.queryType = queryType;
                return this;
            }

            /**
             * secondRankName.
             */
            public Builder secondRankName(String secondRankName) {
                this.secondRankName = secondRankName;
                return this;
            }

            public SearchConfigs build() {
                return new SearchConfigs(this);
            } 

        } 

    }
}
