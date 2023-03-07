// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerAppResponseBody</p>
 */
public class DescribeContainerAppResponseBody extends TeaModel {
    @NameInMap("ContainerAppInfo")
    private ContainerAppInfo containerAppInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContainerAppResponseBody(Builder builder) {
        this.containerAppInfo = builder.containerAppInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerAppInfo
     */
    public ContainerAppInfo getContainerAppInfo() {
        return this.containerAppInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContainerAppInfo containerAppInfo; 
        private String requestId; 

        /**
         * The information of the containerized application.
         */
        public Builder containerAppInfo(ContainerAppInfo containerAppInfo) {
            this.containerAppInfo = containerAppInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerAppResponseBody build() {
            return new DescribeContainerAppResponseBody(this);
        } 

    } 

    public static class ContainerAppInfo extends TeaModel {
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

        private ContainerAppInfo(Builder builder) {
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

        public static ContainerAppInfo create() {
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
             * The time when the containerized application was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the containerized application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the containerized application.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The tags of the image.
             */
            public Builder imageTag(String imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            /**
             * The name of the containerized application.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * The type of the container. Set the value to singularity.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ContainerAppInfo build() {
                return new ContainerAppInfo(this);
            } 

        } 

    }
}
