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
 * {@link ListConsumedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListConsumedServicesResponseBody</p>
 */
public class ListConsumedServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ConsumedServicesList")
    private ConsumedServicesList consumedServicesList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListConsumedServicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.consumedServicesList = builder.consumedServicesList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumedServicesResponseBody create() {
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
     * @return consumedServicesList
     */
    public ConsumedServicesList getConsumedServicesList() {
        return this.consumedServicesList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private ConsumedServicesList consumedServicesList; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConsumedServicesResponseBody model) {
            this.code = model.code;
            this.consumedServicesList = model.consumedServicesList;
            this.message = model.message;
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
         * <p>The information about consumed services.</p>
         */
        public Builder consumedServicesList(ConsumedServicesList consumedServicesList) {
            this.consumedServicesList = consumedServicesList;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a5281053-08e4-47a5-b2ab-5c0323de7b5a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConsumedServicesResponseBody build() {
            return new ListConsumedServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConsumedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumedServicesResponseBody</p>
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
     * {@link ListConsumedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumedServicesResponseBody</p>
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
     * {@link ListConsumedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumedServicesResponseBody</p>
     */
    public static class ListConsumedServices extends TeaModel {
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

        private ListConsumedServices(Builder builder) {
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

        public static ListConsumedServices create() {
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

            private Builder(ListConsumedServices model) {
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
             * <p>a5281053-08e4-47a5-b2ab-5c0323de7b5a</p>
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
             * <p>true</p>
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
             * <p>The name of the consumed service.</p>
             * 
             * <strong>example:</strong>
             * <p>service</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the consumed service.</p>
             * 
             * <strong>example:</strong>
             * <p>HSF</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the consumed service.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ListConsumedServices build() {
                return new ListConsumedServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConsumedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConsumedServicesResponseBody</p>
     */
    public static class ConsumedServicesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListConsumedServices")
        private java.util.List<ListConsumedServices> listConsumedServices;

        private ConsumedServicesList(Builder builder) {
            this.listConsumedServices = builder.listConsumedServices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumedServicesList create() {
            return builder().build();
        }

        /**
         * @return listConsumedServices
         */
        public java.util.List<ListConsumedServices> getListConsumedServices() {
            return this.listConsumedServices;
        }

        public static final class Builder {
            private java.util.List<ListConsumedServices> listConsumedServices; 

            private Builder() {
            } 

            private Builder(ConsumedServicesList model) {
                this.listConsumedServices = model.listConsumedServices;
            } 

            /**
             * ListConsumedServices.
             */
            public Builder listConsumedServices(java.util.List<ListConsumedServices> listConsumedServices) {
                this.listConsumedServices = listConsumedServices;
                return this;
            }

            public ConsumedServicesList build() {
                return new ConsumedServicesList(this);
            } 

        } 

    }
}
