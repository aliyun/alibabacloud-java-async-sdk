// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
    private java.util.List<Versions> versions;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<Versions> versions; 

        private Builder() {
        } 

        private Builder(ListServiceVersionsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.versions = model.versions;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E089D584-B6F4-50C4-9902-DA2295B7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>166</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The historical versions of the service.</p>
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ListServiceVersionsResponseBody build() {
            return new ListServiceVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceVersionsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Versions model) {
                this.buildTime = model.buildTime;
                this.imageAvailable = model.imageAvailable;
                this.imageId = model.imageId;
                this.message = model.message;
                this.serviceConfig = model.serviceConfig;
                this.serviceRunnable = model.serviceRunnable;
            } 

            /**
             * <p>The time when the service version was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-29T22:02:14Z</p>
             */
            public Builder buildTime(String buildTime) {
                this.buildTime = buildTime;
                return this;
            }

            /**
             * <p>Indicates whether the image is available. Valid values:</p>
             * <ul>
             * <li>true: The image is available.</li>
             * <li>false: The image is unavailable.</li>
             * <li>unknown: The availability of the image is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder imageAvailable(String imageAvailable) {
                this.imageAvailable = imageAvailable;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder imageId(Integer imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>Service is Running</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The service deployment configurations. This parameter is returned only if the service is deployed by using a custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;metadata&quot;: {
             *         &quot;cpu&quot;: 1,
             *         &quot;instance&quot;: 1,
             *         &quot;memory&quot;: 1024
             *     },
             *     &quot;name&quot;: &quot;echo&quot;
             * }</p>
             */
            public Builder serviceConfig(String serviceConfig) {
                this.serviceConfig = serviceConfig;
                return this;
            }

            /**
             * <p>Indicates whether Elastic Algorithm service (EAS) is activated. Valid values:</p>
             * <ul>
             * <li>true: EAS is activated.</li>
             * <li>false: EAS is not activated.</li>
             * <li>unknown: The activation of EAS is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
