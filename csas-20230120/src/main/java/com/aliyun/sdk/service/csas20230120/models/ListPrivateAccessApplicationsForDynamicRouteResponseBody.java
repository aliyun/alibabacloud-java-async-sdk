// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListPrivateAccessApplicationsForDynamicRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessApplicationsForDynamicRouteResponseBody</p>
 */
public class ListPrivateAccessApplicationsForDynamicRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicRoutes")
    private java.util.List<DynamicRoutes> dynamicRoutes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrivateAccessApplicationsForDynamicRouteResponseBody(Builder builder) {
        this.dynamicRoutes = builder.dynamicRoutes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessApplicationsForDynamicRouteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicRoutes
     */
    public java.util.List<DynamicRoutes> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DynamicRoutes> dynamicRoutes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrivateAccessApplicationsForDynamicRouteResponseBody model) {
            this.dynamicRoutes = model.dynamicRoutes;
            this.requestId = model.requestId;
        } 

        /**
         * DynamicRoutes.
         */
        public Builder dynamicRoutes(java.util.List<DynamicRoutes> dynamicRoutes) {
            this.dynamicRoutes = dynamicRoutes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBody build() {
            return new ListPrivateAccessApplicationsForDynamicRouteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateAccessApplicationsForDynamicRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationsForDynamicRouteResponseBody</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        private PortRanges(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        public static final class Builder {
            private Integer begin; 
            private Integer end; 

            private Builder() {
            } 

            private Builder(PortRanges model) {
                this.begin = model.begin;
                this.end = model.end;
            } 

            /**
             * Begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivateAccessApplicationsForDynamicRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationsForDynamicRouteResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List<PortRanges> portRanges;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Applications(Builder builder) {
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.portRanges = builder.portRanges;
            this.protocol = builder.protocol;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return portRanges
         */
        public java.util.List<PortRanges> getPortRanges() {
            return this.portRanges;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> addresses; 
            private String applicationId; 
            private String createTime; 
            private String description; 
            private String name; 
            private java.util.List<PortRanges> portRanges; 
            private String protocol; 
            private String status; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.addresses = model.addresses;
                this.applicationId = model.applicationId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.portRanges = model.portRanges;
                this.protocol = model.protocol;
                this.status = model.status;
            } 

            /**
             * Addresses.
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PortRanges.
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivateAccessApplicationsForDynamicRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessApplicationsForDynamicRouteResponseBody</p>
     */
    public static class DynamicRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("DynamicRouteId")
        private String dynamicRouteId;

        private DynamicRoutes(Builder builder) {
            this.applications = builder.applications;
            this.dynamicRouteId = builder.dynamicRouteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicRoutes create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return dynamicRouteId
         */
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

        public static final class Builder {
            private java.util.List<Applications> applications; 
            private String dynamicRouteId; 

            private Builder() {
            } 

            private Builder(DynamicRoutes model) {
                this.applications = model.applications;
                this.dynamicRouteId = model.dynamicRouteId;
            } 

            /**
             * Applications.
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * DynamicRouteId.
             */
            public Builder dynamicRouteId(String dynamicRouteId) {
                this.dynamicRouteId = dynamicRouteId;
                return this;
            }

            public DynamicRoutes build() {
                return new DynamicRoutes(this);
            } 

        } 

    }
}
