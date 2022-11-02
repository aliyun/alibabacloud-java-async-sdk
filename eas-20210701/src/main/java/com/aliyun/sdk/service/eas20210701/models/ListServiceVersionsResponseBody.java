// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceVersionsResponseBody</p>
 */
public class ListServiceVersionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Versions")
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Versions.
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
        @NameInMap("BuildTime")
        private String buildTime;

        @NameInMap("ImageAvailable")
        private String imageAvailable;

        @NameInMap("ImageId")
        private Integer imageId;

        @NameInMap("Message")
        private String message;

        @NameInMap("ServiceRunnable")
        private String serviceRunnable;

        private Versions(Builder builder) {
            this.buildTime = builder.buildTime;
            this.imageAvailable = builder.imageAvailable;
            this.imageId = builder.imageId;
            this.message = builder.message;
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
            private String serviceRunnable; 

            /**
             * BuildTime.
             */
            public Builder buildTime(String buildTime) {
                this.buildTime = buildTime;
                return this;
            }

            /**
             * ImageAvailable.
             */
            public Builder imageAvailable(String imageAvailable) {
                this.imageAvailable = imageAvailable;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(Integer imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ServiceRunnable.
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
