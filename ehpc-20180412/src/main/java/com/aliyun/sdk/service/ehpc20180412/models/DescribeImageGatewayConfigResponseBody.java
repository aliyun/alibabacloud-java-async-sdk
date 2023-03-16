// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageGatewayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageGatewayConfigResponseBody</p>
 */
public class DescribeImageGatewayConfigResponseBody extends TeaModel {
    @NameInMap("Imagegw")
    private Imagegw imagegw;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageGatewayConfigResponseBody(Builder builder) {
        this.imagegw = builder.imagegw;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageGatewayConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return imagegw
     */
    public Imagegw getImagegw() {
        return this.imagegw;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Imagegw imagegw; 
        private String requestId; 

        /**
         * The information about the image gateway configuration file.
         */
        public Builder imagegw(Imagegw imagegw) {
            this.imagegw = imagegw;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageGatewayConfigResponseBody build() {
            return new DescribeImageGatewayConfigResponseBody(this);
        } 

    } 

    public static class LocationInfo extends TeaModel {
        @NameInMap("Authentication")
        private String authentication;

        @NameInMap("Location")
        private String location;

        @NameInMap("RemoteType")
        private String remoteType;

        @NameInMap("URL")
        private String URL;

        private LocationInfo(Builder builder) {
            this.authentication = builder.authentication;
            this.location = builder.location;
            this.remoteType = builder.remoteType;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationInfo create() {
            return builder().build();
        }

        /**
         * @return authentication
         */
        public String getAuthentication() {
            return this.authentication;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return remoteType
         */
        public String getRemoteType() {
            return this.remoteType;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String authentication; 
            private String location; 
            private String remoteType; 
            private String URL; 

            /**
             * The authentication method of the image repository. Valid values:
             * <p>
             * 
             * *   http
             * *   https
             */
            public Builder authentication(String authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * The source address of the image repository.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The type of the image repository.
             */
            public Builder remoteType(String remoteType) {
                this.remoteType = remoteType;
                return this;
            }

            /**
             * The URL of the image repository.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public LocationInfo build() {
                return new LocationInfo(this);
            } 

        } 

    }
    public static class Locations extends TeaModel {
        @NameInMap("LocationInfo")
        private java.util.List < LocationInfo> locationInfo;

        private Locations(Builder builder) {
            this.locationInfo = builder.locationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Locations create() {
            return builder().build();
        }

        /**
         * @return locationInfo
         */
        public java.util.List < LocationInfo> getLocationInfo() {
            return this.locationInfo;
        }

        public static final class Builder {
            private java.util.List < LocationInfo> locationInfo; 

            /**
             * LocationInfo.
             */
            public Builder locationInfo(java.util.List < LocationInfo> locationInfo) {
                this.locationInfo = locationInfo;
                return this;
            }

            public Locations build() {
                return new Locations(this);
            } 

        } 

    }
    public static class Imagegw extends TeaModel {
        @NameInMap("DefaultImageLocation")
        private String defaultImageLocation;

        @NameInMap("ImageExpirationTimeout")
        private String imageExpirationTimeout;

        @NameInMap("Locations")
        private Locations locations;

        @NameInMap("MongoDBURI")
        private String mongoDBURI;

        @NameInMap("PullUpdateTimeout")
        private Long pullUpdateTimeout;

        @NameInMap("UpdateDateTime")
        private String updateDateTime;

        private Imagegw(Builder builder) {
            this.defaultImageLocation = builder.defaultImageLocation;
            this.imageExpirationTimeout = builder.imageExpirationTimeout;
            this.locations = builder.locations;
            this.mongoDBURI = builder.mongoDBURI;
            this.pullUpdateTimeout = builder.pullUpdateTimeout;
            this.updateDateTime = builder.updateDateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Imagegw create() {
            return builder().build();
        }

        /**
         * @return defaultImageLocation
         */
        public String getDefaultImageLocation() {
            return this.defaultImageLocation;
        }

        /**
         * @return imageExpirationTimeout
         */
        public String getImageExpirationTimeout() {
            return this.imageExpirationTimeout;
        }

        /**
         * @return locations
         */
        public Locations getLocations() {
            return this.locations;
        }

        /**
         * @return mongoDBURI
         */
        public String getMongoDBURI() {
            return this.mongoDBURI;
        }

        /**
         * @return pullUpdateTimeout
         */
        public Long getPullUpdateTimeout() {
            return this.pullUpdateTimeout;
        }

        /**
         * @return updateDateTime
         */
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

        public static final class Builder {
            private String defaultImageLocation; 
            private String imageExpirationTimeout; 
            private Locations locations; 
            private String mongoDBURI; 
            private Long pullUpdateTimeout; 
            private String updateDateTime; 

            /**
             * The default address of the image repository.
             */
            public Builder defaultImageLocation(String defaultImageLocation) {
                this.defaultImageLocation = defaultImageLocation;
                return this;
            }

            /**
             * The time when the image expires.
             */
            public Builder imageExpirationTimeout(String imageExpirationTimeout) {
                this.imageExpirationTimeout = imageExpirationTimeout;
                return this;
            }

            /**
             * An array of the image repository addresses.
             */
            public Builder locations(Locations locations) {
                this.locations = locations;
                return this;
            }

            /**
             * The information about the image gateway database.
             */
            public Builder mongoDBURI(String mongoDBURI) {
                this.mongoDBURI = mongoDBURI;
                return this;
            }

            /**
             * The timeout period for pulling images.
             */
            public Builder pullUpdateTimeout(Long pullUpdateTimeout) {
                this.pullUpdateTimeout = pullUpdateTimeout;
                return this;
            }

            /**
             * The time when the file was updated.
             */
            public Builder updateDateTime(String updateDateTime) {
                this.updateDateTime = updateDateTime;
                return this;
            }

            public Imagegw build() {
                return new Imagegw(this);
            } 

        } 

    }
}
