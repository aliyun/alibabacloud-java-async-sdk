// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedServicesResponseBody</p>
 */
public class ListPublishedServicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PublishedServicesList")
    private PublishedServicesList publishedServicesList;

    @NameInMap("RequestId")
    private String requestId;

    private ListPublishedServicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.publishedServicesList = builder.publishedServicesList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return publishedServicesList
     */
    public PublishedServicesList getPublishedServicesList() {
        return this.publishedServicesList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private PublishedServicesList publishedServicesList; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The published services.
         */
        public Builder publishedServicesList(PublishedServicesList publishedServicesList) {
            this.publishedServicesList = publishedServicesList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPublishedServicesResponseBody build() {
            return new ListPublishedServicesResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("group")
        private java.util.List < String > group;

        private Groups(Builder builder) {
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public java.util.List < String > getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List < String > group; 

            /**
             * group.
             */
            public Builder group(java.util.List < String > group) {
                this.group = group;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class Ips extends TeaModel {
        @NameInMap("ip")
        private java.util.List < String > ip;

        private Ips(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > ip; 

            /**
             * ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
    public static class ListPublishedServices extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("DockerApplication")
        private Boolean dockerApplication;

        @NameInMap("Group2Ip")
        private String group2Ip;

        @NameInMap("Groups")
        private Groups groups;

        @NameInMap("Ips")
        private Ips ips;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private String version;

        private ListPublishedServices(Builder builder) {
            this.appId = builder.appId;
            this.dockerApplication = builder.dockerApplication;
            this.group2Ip = builder.group2Ip;
            this.groups = builder.groups;
            this.ips = builder.ips;
            this.name = builder.name;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPublishedServices create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return dockerApplication
         */
        public Boolean getDockerApplication() {
            return this.dockerApplication;
        }

        /**
         * @return group2Ip
         */
        public String getGroup2Ip() {
            return this.group2Ip;
        }

        /**
         * @return groups
         */
        public Groups getGroups() {
            return this.groups;
        }

        /**
         * @return ips
         */
        public Ips getIps() {
            return this.ips;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private Boolean dockerApplication; 
            private String group2Ip; 
            private Groups groups; 
            private Ips ips; 
            private String name; 
            private String type; 
            private String version; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Indicates whether the application runs in a Docker container. Valid values:
             * <p>
             * 
             * *   true: The application runs in a Docker container.
             * *   false: The application does not run in a Docker container.
             */
            public Builder dockerApplication(Boolean dockerApplication) {
                this.dockerApplication = dockerApplication;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder group2Ip(String group2Ip) {
                this.group2Ip = group2Ip;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(Groups groups) {
                this.groups = groups;
                return this;
            }

            /**
             * Ips.
             */
            public Builder ips(Ips ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The name of the published service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the published service.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version of the published services.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ListPublishedServices build() {
                return new ListPublishedServices(this);
            } 

        } 

    }
    public static class PublishedServicesList extends TeaModel {
        @NameInMap("ListPublishedServices")
        private java.util.List < ListPublishedServices> listPublishedServices;

        private PublishedServicesList(Builder builder) {
            this.listPublishedServices = builder.listPublishedServices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedServicesList create() {
            return builder().build();
        }

        /**
         * @return listPublishedServices
         */
        public java.util.List < ListPublishedServices> getListPublishedServices() {
            return this.listPublishedServices;
        }

        public static final class Builder {
            private java.util.List < ListPublishedServices> listPublishedServices; 

            /**
             * ListPublishedServices.
             */
            public Builder listPublishedServices(java.util.List < ListPublishedServices> listPublishedServices) {
                this.listPublishedServices = listPublishedServices;
                return this;
            }

            public PublishedServicesList build() {
                return new PublishedServicesList(this);
            } 

        } 

    }
}
