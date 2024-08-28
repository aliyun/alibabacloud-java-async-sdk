// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceVersionsResponseBody</p>
 */
public class ListServiceVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List < Versions> versions;

    private ListServiceVersionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceVersionsResponseBody create() {
        return builder().build();
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return versions
     */
    public java.util.List < Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List < Versions> versions; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The historical versions of the service.
         */
        public Builder versions(java.util.List < Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ListServiceVersionsResponseBody build() {
            return new ListServiceVersionsResponseBody(this);
        } 

    } 

    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildTime")
        private String buildTime;

        @com.aliyun.core.annotation.NameInMap("ImageAvailable")
        private String imageAvailable;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private Integer imageId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ServiceConfig")
        private String serviceConfig;

        @com.aliyun.core.annotation.NameInMap("ServiceRunnable")
        private String serviceRunnable;

        private Versions(Builder builder) {
            this.buildTime = builder.buildTime;
            this.imageAvailable = builder.imageAvailable;
            this.imageId = builder.imageId;
            this.message = builder.message;
            this.serviceConfig = builder.serviceConfig;
            this.serviceRunnable = builder.serviceRunnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return buildTime
         */
        public String getBuildTime() {
            return this.buildTime;
        }

        /**
         * @return imageAvailable
         */
        public String getImageAvailable() {
            return this.imageAvailable;
        }

        /**
         * @return imageId
         */
        public Integer getImageId() {
            return this.imageId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return serviceConfig
         */
        public String getServiceConfig() {
            return this.serviceConfig;
        }

        /**
         * @return serviceRunnable
         */
        public String getServiceRunnable() {
            return this.serviceRunnable;
        }

        public static final class Builder {
            private String buildTime; 
            private String imageAvailable; 
            private Integer imageId; 
            private String message; 
            private String serviceConfig; 
            private String serviceRunnable; 

            /**
             * The time when the service version was created. The time is displayed in UTC.
             */
            public Builder buildTime(String buildTime) {
                this.buildTime = buildTime;
                return this;
            }

            /**
             * Indicates whether the image is available. Valid values:
             * <p>
             * 
             * *   true: The image is available.
             * *   false: The image is unavailable.
             * *   unknown: The availability of the image is unknown.
             */
            public Builder imageAvailable(String imageAvailable) {
                this.imageAvailable = imageAvailable;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(Integer imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The returned message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The service deployment configurations. This parameter is returned only if the service is deployed by using a custom image.
             */
            public Builder serviceConfig(String serviceConfig) {
                this.serviceConfig = serviceConfig;
                return this;
            }

            /**
             * Indicates whether Elastic Algorithm service (EAS) is activated. Valid values:
             * <p>
             * 
             * *   true: EAS is activated.
             * *   false: EAS is not activated.
             * *   unknown: The activation of EAS is unknown.
             */
            public Builder serviceRunnable(String serviceRunnable) {
                this.serviceRunnable = serviceRunnable;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
