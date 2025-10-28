// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedServicesResponseBody</p>
 */
public class ListPublishedServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PublishedServicesList")
    private PublishedServicesList publishedServicesList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListPublishedServicesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.publishedServicesList = model.publishedServicesList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The published services.</p>
         */
        public Builder publishedServicesList(PublishedServicesList publishedServicesList) {
            this.publishedServicesList = publishedServicesList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1D6FC-4307-4583-BA6F-215F3857E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPublishedServicesResponseBody build() {
            return new ListPublishedServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedServicesResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("group")
        private java.util.List<String> group;

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
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List<String> group; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.group = model.group;
            } 

            /**
             * group.
             */
            public Builder group(java.util.List<String> group) {
                this.group = group;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedServicesResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ip")
        private java.util.List<String> ip;

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
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> ip; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.ip = model.ip;
            } 

            /**
             * ip.
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedServicesResponseBody</p>
     */
    public static class ListPublishedServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("DockerApplication")
        private Boolean dockerApplication;

        @com.aliyun.core.annotation.NameInMap("Group2Ip")
        private String group2Ip;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private Groups groups;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private Ips ips;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(ListPublishedServices model) {
                this.appId = model.appId;
                this.dockerApplication = model.dockerApplication;
                this.group2Ip = model.group2Ip;
                this.groups = model.groups;
                this.ips = model.ips;
                this.name = model.name;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ECD1D6FC-4307-4583-BA6F-215F3857E****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Indicates whether the application runs in a Docker container. Valid values:</p>
             * <ul>
             * <li>true: The application runs in a Docker container.</li>
             * <li>false: The application does not run in a Docker container.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dockerApplication(Boolean dockerApplication) {
                this.dockerApplication = dockerApplication;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
             * <p>The name of the published service.</p>
             * 
             * <strong>example:</strong>
             * <p>providers:com.****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the published service.</p>
             * 
             * <strong>example:</strong>
             * <p>RESTful</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the published services.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
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
    /**
     * 
     * {@link ListPublishedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedServicesResponseBody</p>
     */
    public static class PublishedServicesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListPublishedServices")
        private java.util.List<ListPublishedServices> listPublishedServices;

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
        public java.util.List<ListPublishedServices> getListPublishedServices() {
            return this.listPublishedServices;
        }

        public static final class Builder {
            private java.util.List<ListPublishedServices> listPublishedServices; 

            private Builder() {
            } 

            private Builder(PublishedServicesList model) {
                this.listPublishedServices = model.listPublishedServices;
            } 

            /**
             * ListPublishedServices.
             */
            public Builder listPublishedServices(java.util.List<ListPublishedServices> listPublishedServices) {
                this.listPublishedServices = listPublishedServices;
                return this;
            }

            public PublishedServicesList build() {
                return new PublishedServicesList(this);
            } 

        } 

    }
}
