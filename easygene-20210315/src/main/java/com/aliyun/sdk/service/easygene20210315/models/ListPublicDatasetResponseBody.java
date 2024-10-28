// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPublicDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicDatasetResponseBody</p>
 */
public class ListPublicDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datasets")
    private java.util.List < Datasets> datasets;

    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicDatasetResponseBody(Builder builder) {
        this.datasets = builder.datasets;
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicDatasetResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasets
     */
    public java.util.List < Datasets> getDatasets() {
        return this.datasets;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Datasets> datasets; 
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Datasets.
         */
        public Builder datasets(java.util.List < Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicDatasetResponseBody build() {
            return new ListPublicDatasetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublicDatasetResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicDatasetResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("About")
        private String about;

        @com.aliyun.core.annotation.NameInMap("AccessRequirements")
        private String accessRequirements;

        @com.aliyun.core.annotation.NameInMap("Copyright")
        private String copyright;

        @com.aliyun.core.annotation.NameInMap("DatasetDescription")
        private String datasetDescription;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Locations")
        private java.util.List < String > locations;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("UpdateFrequency")
        private String updateFrequency;

        private Datasets(Builder builder) {
            this.about = builder.about;
            this.accessRequirements = builder.accessRequirements;
            this.copyright = builder.copyright;
            this.datasetDescription = builder.datasetDescription;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.lastModified = builder.lastModified;
            this.locations = builder.locations;
            this.tags = builder.tags;
            this.updateFrequency = builder.updateFrequency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return about
         */
        public String getAbout() {
            return this.about;
        }

        /**
         * @return accessRequirements
         */
        public String getAccessRequirements() {
            return this.accessRequirements;
        }

        /**
         * @return copyright
         */
        public String getCopyright() {
            return this.copyright;
        }

        /**
         * @return datasetDescription
         */
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return locations
         */
        public java.util.List < String > getLocations() {
            return this.locations;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return updateFrequency
         */
        public String getUpdateFrequency() {
            return this.updateFrequency;
        }

        public static final class Builder {
            private String about; 
            private String accessRequirements; 
            private String copyright; 
            private String datasetDescription; 
            private String datasetId; 
            private String datasetName; 
            private String lastModified; 
            private java.util.List < String > locations; 
            private java.util.List < String > tags; 
            private String updateFrequency; 

            /**
             * About.
             */
            public Builder about(String about) {
                this.about = about;
                return this;
            }

            /**
             * AccessRequirements.
             */
            public Builder accessRequirements(String accessRequirements) {
                this.accessRequirements = accessRequirements;
                return this;
            }

            /**
             * Copyright.
             */
            public Builder copyright(String copyright) {
                this.copyright = copyright;
                return this;
            }

            /**
             * DatasetDescription.
             */
            public Builder datasetDescription(String datasetDescription) {
                this.datasetDescription = datasetDescription;
                return this;
            }

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * Locations.
             */
            public Builder locations(java.util.List < String > locations) {
                this.locations = locations;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdateFrequency.
             */
            public Builder updateFrequency(String updateFrequency) {
                this.updateFrequency = updateFrequency;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
}
