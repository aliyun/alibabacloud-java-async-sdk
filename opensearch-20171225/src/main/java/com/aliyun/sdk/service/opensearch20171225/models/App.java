// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link App} extends {@link TeaModel}
 *
 * <p>App</p>
 */
public class App extends TeaModel {
    @NameInMap("autoSwitch")
    private Boolean autoSwitch;

    @NameInMap("cluster")
    private Cluster cluster;

    @NameInMap("dataSources")
    private java.util.List < DataSource > dataSources;

    @NameInMap("description")
    private String description;

    @NameInMap("domain")
    private Domain domain;

    @NameInMap("fetchFields")
    private java.util.List < String > fetchFields;

    @NameInMap("firstRanks")
    private java.util.List < FirstRank > firstRanks;

    @NameInMap("networkType")
    private String networkType;

    @NameInMap("queryProcessors")
    private java.util.List < QueryProcessor > queryProcessors;

    @NameInMap("quota")
    private Quota quota;

    @NameInMap("realtimeShared")
    private Boolean realtimeShared;

    @NameInMap("schema")
    private Schema schema;

    @NameInMap("schemas")
    private java.util.List < Schema > schemas;

    @NameInMap("secondRanks")
    private java.util.List < SecondRank > secondRanks;

    @NameInMap("summaries")
    private java.util.List < Summary > summaries;

    @NameInMap("type")
    private String type;

    private App(Builder builder) {
        this.autoSwitch = builder.autoSwitch;
        this.cluster = builder.cluster;
        this.dataSources = builder.dataSources;
        this.description = builder.description;
        this.domain = builder.domain;
        this.fetchFields = builder.fetchFields;
        this.firstRanks = builder.firstRanks;
        this.networkType = builder.networkType;
        this.queryProcessors = builder.queryProcessors;
        this.quota = builder.quota;
        this.realtimeShared = builder.realtimeShared;
        this.schema = builder.schema;
        this.schemas = builder.schemas;
        this.secondRanks = builder.secondRanks;
        this.summaries = builder.summaries;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static App create() {
        return builder().build();
    }

    /**
     * @return autoSwitch
     */
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSource > getDataSources() {
        return this.dataSources;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return fetchFields
     */
    public java.util.List < String > getFetchFields() {
        return this.fetchFields;
    }

    /**
     * @return firstRanks
     */
    public java.util.List < FirstRank > getFirstRanks() {
        return this.firstRanks;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return queryProcessors
     */
    public java.util.List < QueryProcessor > getQueryProcessors() {
        return this.queryProcessors;
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return realtimeShared
     */
    public Boolean getRealtimeShared() {
        return this.realtimeShared;
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @return schemas
     */
    public java.util.List < Schema > getSchemas() {
        return this.schemas;
    }

    /**
     * @return secondRanks
     */
    public java.util.List < SecondRank > getSecondRanks() {
        return this.secondRanks;
    }

    /**
     * @return summaries
     */
    public java.util.List < Summary > getSummaries() {
        return this.summaries;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean autoSwitch; 
        private Cluster cluster; 
        private java.util.List < DataSource > dataSources; 
        private String description; 
        private Domain domain; 
        private java.util.List < String > fetchFields; 
        private java.util.List < FirstRank > firstRanks; 
        private String networkType; 
        private java.util.List < QueryProcessor > queryProcessors; 
        private Quota quota; 
        private Boolean realtimeShared; 
        private Schema schema; 
        private java.util.List < Schema > schemas; 
        private java.util.List < SecondRank > secondRanks; 
        private java.util.List < Summary > summaries; 
        private String type; 

        /**
         * autoSwitch.
         */
        public Builder autoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }

        /**
         * cluster.
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * dataSources.
         */
        public Builder dataSources(java.util.List < DataSource > dataSources) {
            this.dataSources = dataSources;
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
         * domain.
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * fetchFields.
         */
        public Builder fetchFields(java.util.List < String > fetchFields) {
            this.fetchFields = fetchFields;
            return this;
        }

        /**
         * firstRanks.
         */
        public Builder firstRanks(java.util.List < FirstRank > firstRanks) {
            this.firstRanks = firstRanks;
            return this;
        }

        /**
         * networkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * queryProcessors.
         */
        public Builder queryProcessors(java.util.List < QueryProcessor > queryProcessors) {
            this.queryProcessors = queryProcessors;
            return this;
        }

        /**
         * quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * realtimeShared.
         */
        public Builder realtimeShared(Boolean realtimeShared) {
            this.realtimeShared = realtimeShared;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * schemas.
         */
        public Builder schemas(java.util.List < Schema > schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * secondRanks.
         */
        public Builder secondRanks(java.util.List < SecondRank > secondRanks) {
            this.secondRanks = secondRanks;
            return this;
        }

        /**
         * summaries.
         */
        public Builder summaries(java.util.List < Summary > summaries) {
            this.summaries = summaries;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public App build() {
            return new App(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @NameInMap("maxQueryClauseLength")
        private Integer maxQueryClauseLength;

        @NameInMap("maxTimeoutMS")
        private Integer maxTimeoutMS;

        private Cluster(Builder builder) {
            this.maxQueryClauseLength = builder.maxQueryClauseLength;
            this.maxTimeoutMS = builder.maxTimeoutMS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return maxQueryClauseLength
         */
        public Integer getMaxQueryClauseLength() {
            return this.maxQueryClauseLength;
        }

        /**
         * @return maxTimeoutMS
         */
        public Integer getMaxTimeoutMS() {
            return this.maxTimeoutMS;
        }

        public static final class Builder {
            private Integer maxQueryClauseLength; 
            private Integer maxTimeoutMS; 

            /**
             * maxQueryClauseLength.
             */
            public Builder maxQueryClauseLength(Integer maxQueryClauseLength) {
                this.maxQueryClauseLength = maxQueryClauseLength;
                return this;
            }

            /**
             * maxTimeoutMS.
             */
            public Builder maxTimeoutMS(Integer maxTimeoutMS) {
                this.maxTimeoutMS = maxTimeoutMS;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
