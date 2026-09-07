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
 * {@link ListApplicationsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForPrivateAccessPolicyResponseBody</p>
 */
public class ListApplicationsForPrivateAccessPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Polices")
    private java.util.List<Polices> polices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationsForPrivateAccessPolicyResponseBody(Builder builder) {
        this.polices = builder.polices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForPrivateAccessPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polices
     */
    public java.util.List<Polices> getPolices() {
        return this.polices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Polices> polices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationsForPrivateAccessPolicyResponseBody model) {
            this.polices = model.polices;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of private access policies.</p>
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBody build() {
            return new ListApplicationsForPrivateAccessPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForPrivateAccessPolicyResponseBody</p>
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
             * <p>The start port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The end port.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
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
     * {@link ListApplicationsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForPrivateAccessPolicyResponseBody</p>
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
             * <p>A collection of private access application addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The ID of the private access application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-7a9243dd02f4****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The time when the private access application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-27 18:10:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the private access application.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条被内网访问策略引用的内网访问应用</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the private access application.</p>
             * 
             * <strong>example:</strong>
             * <p>application_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>A collection of port ranges for the private access application.</p>
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * <p>The protocol of the private access application. Valid values:</p>
             * <ul>
             * <li><p><strong>All</strong>: All protocols.</p>
             * </li>
             * <li><p><strong>TCP</strong></p>
             * </li>
             * <li><p><strong>UDP</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The status of the private access application. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: The application is enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: The application is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
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
     * {@link ListApplicationsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForPrivateAccessPolicyResponseBody</p>
     */
    public static class Polices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        private Polices(Builder builder) {
            this.applications = builder.applications;
            this.policyId = builder.policyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polices create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        public static final class Builder {
            private java.util.List<Applications> applications; 
            private String policyId; 

            private Builder() {
            } 

            private Builder(Polices model) {
                this.applications = model.applications;
                this.policyId = model.policyId;
            } 

            /**
             * <p>A collection of private access applications.</p>
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-policy-1b0d0e8b4bcf****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            public Polices build() {
                return new Polices(this);
            } 

        } 

    }
}
