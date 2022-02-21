// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContainerAppsResponseBody</p>
 */
public class ListContainerAppsResponseBody extends TeaModel {
    @NameInMap("ContainerApps")
    private ContainerApps containerApps;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListContainerAppsResponseBody(Builder builder) {
        this.containerApps = builder.containerApps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerApps
     */
    public ContainerApps getContainerApps() {
        return this.containerApps;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private ContainerApps containerApps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ContainerApps.
         */
        public Builder containerApps(ContainerApps containerApps) {
            this.containerApps = containerApps;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListContainerAppsResponseBody build() {
            return new ListContainerAppsResponseBody(this);
        } 

    } 

    public static class ContainerAppsContainerApps extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageTag")
        private String imageTag;

        @NameInMap("Name")
        private String name;

        @NameInMap("Repository")
        private String repository;

        @NameInMap("Type")
        private String type;

        private ContainerAppsContainerApps(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.imageTag = builder.imageTag;
            this.name = builder.name;
            this.repository = builder.repository;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerAppsContainerApps create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageTag
         */
        public String getImageTag() {
            return this.imageTag;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String id; 
            private String imageTag; 
            private String name; 
            private String repository; 
            private String type; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageTag.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
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
             * Repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ContainerAppsContainerApps build() {
                return new ContainerAppsContainerApps(this);
            } 

        } 

    }
    public static class ContainerApps extends TeaModel {
        @NameInMap("ContainerApps")
        private java.util.List < ContainerAppsContainerApps> containerApps;

        private ContainerApps(Builder builder) {
            this.containerApps = builder.containerApps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerApps create() {
            return builder().build();
        }

        /**
         * @return containerApps
         */
        public java.util.List < ContainerAppsContainerApps> getContainerApps() {
            return this.containerApps;
        }

        public static final class Builder {
            private java.util.List < ContainerAppsContainerApps> containerApps; 

            /**
             * ContainerApps.
             */
            public Builder containerApps(java.util.List < ContainerAppsContainerApps> containerApps) {
                this.containerApps = containerApps;
                return this;
            }

            public ContainerApps build() {
                return new ContainerApps(this);
            } 

        } 

    }
}
