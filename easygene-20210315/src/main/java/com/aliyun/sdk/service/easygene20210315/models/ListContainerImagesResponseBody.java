// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListContainerImagesResponseBody</p>
 */
public class ListContainerImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerImages")
    private java.util.List < ContainerImages> containerImages;

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

    private ListContainerImagesResponseBody(Builder builder) {
        this.containerImages = builder.containerImages;
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerImages
     */
    public java.util.List < ContainerImages> getContainerImages() {
        return this.containerImages;
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
        private java.util.List < ContainerImages> containerImages; 
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ContainerImages.
         */
        public Builder containerImages(java.util.List < ContainerImages> containerImages) {
            this.containerImages = containerImages;
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

        public ListContainerImagesResponseBody build() {
            return new ListContainerImagesResponseBody(this);
        } 

    } 

    public static class ContainerImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerImageDescription")
        private String containerImageDescription;

        @com.aliyun.core.annotation.NameInMap("ContainerImageName")
        private String containerImageName;

        @com.aliyun.core.annotation.NameInMap("ContainerImageNamespace")
        private String containerImageNamespace;

        @com.aliyun.core.annotation.NameInMap("ContainerImageVersions")
        private java.util.List < String > containerImageVersions;

        @com.aliyun.core.annotation.NameInMap("ContainerRegistry")
        private String containerRegistry;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        private ContainerImages(Builder builder) {
            this.containerImageDescription = builder.containerImageDescription;
            this.containerImageName = builder.containerImageName;
            this.containerImageNamespace = builder.containerImageNamespace;
            this.containerImageVersions = builder.containerImageVersions;
            this.containerRegistry = builder.containerRegistry;
            this.lastModified = builder.lastModified;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerImages create() {
            return builder().build();
        }

        /**
         * @return containerImageDescription
         */
        public String getContainerImageDescription() {
            return this.containerImageDescription;
        }

        /**
         * @return containerImageName
         */
        public String getContainerImageName() {
            return this.containerImageName;
        }

        /**
         * @return containerImageNamespace
         */
        public String getContainerImageNamespace() {
            return this.containerImageNamespace;
        }

        /**
         * @return containerImageVersions
         */
        public java.util.List < String > getContainerImageVersions() {
            return this.containerImageVersions;
        }

        /**
         * @return containerRegistry
         */
        public String getContainerRegistry() {
            return this.containerRegistry;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String containerImageDescription; 
            private String containerImageName; 
            private String containerImageNamespace; 
            private java.util.List < String > containerImageVersions; 
            private String containerRegistry; 
            private String lastModified; 
            private String location; 

            /**
             * ContainerImageDescription.
             */
            public Builder containerImageDescription(String containerImageDescription) {
                this.containerImageDescription = containerImageDescription;
                return this;
            }

            /**
             * ContainerImageName.
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * ContainerImageNamespace.
             */
            public Builder containerImageNamespace(String containerImageNamespace) {
                this.containerImageNamespace = containerImageNamespace;
                return this;
            }

            /**
             * ContainerImageVersions.
             */
            public Builder containerImageVersions(java.util.List < String > containerImageVersions) {
                this.containerImageVersions = containerImageVersions;
                return this;
            }

            /**
             * ContainerRegistry.
             */
            public Builder containerRegistry(String containerRegistry) {
                this.containerRegistry = containerRegistry;
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
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public ContainerImages build() {
                return new ContainerImages(this);
            } 

        } 

    }
}
