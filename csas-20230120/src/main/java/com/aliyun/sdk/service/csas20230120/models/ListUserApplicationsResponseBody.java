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
 * {@link ListUserApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserApplicationsResponseBody</p>
 */
public class ListUserApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListUserApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListUserApplicationsResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The list of applications that the user is authorized to access.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of applications that the user is authorized to access.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListUserApplicationsResponseBody build() {
            return new ListUserApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserApplicationsResponseBody</p>
     */
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private String begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

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
        public String getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        public static final class Builder {
            private String begin; 
            private String end; 

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
            public Builder begin(String begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The end port.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder end(String end) {
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
     * {@link ListUserApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AddressGroups")
        private java.util.List<AddressGroup> addressGroups;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<String> addresses;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ConfigMode")
        private String configMode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PortRanges")
        private java.util.List<PortRanges> portRanges;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Applications(Builder builder) {
            this.action = builder.action;
            this.addressGroups = builder.addressGroups;
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.configMode = builder.configMode;
            this.name = builder.name;
            this.portRanges = builder.portRanges;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return addressGroups
         */
        public java.util.List<AddressGroup> getAddressGroups() {
            return this.addressGroups;
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
         * @return configMode
         */
        public String getConfigMode() {
            return this.configMode;
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

        public static final class Builder {
            private String action; 
            private java.util.List<AddressGroup> addressGroups; 
            private java.util.List<String> addresses; 
            private String applicationId; 
            private String configMode; 
            private String name; 
            private java.util.List<PortRanges> portRanges; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.action = model.action;
                this.addressGroups = model.addressGroups;
                this.addresses = model.addresses;
                this.applicationId = model.applicationId;
                this.configMode = model.configMode;
                this.name = model.name;
                this.portRanges = model.portRanges;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The action for private application access:</p>
             * <ul>
             * <li><p><strong>Block</strong>: blocks access.</p>
             * </li>
             * <li><p><strong>Allow</strong>: allows access.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Block</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The application address group. This parameter is returned when ConfigMode is set to Precise. This parameter is empty when ConfigMode is an empty string.</p>
             */
            public Builder addressGroups(java.util.List<AddressGroup> addressGroups) {
                this.addressGroups = addressGroups;
                return this;
            }

            /**
             * <p>The list of private access application addresses.</p>
             */
            public Builder addresses(java.util.List<String> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-b927baf3e592****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The configuration mode. Valid values:</p>
             * <ul>
             * <li><p>Empty string: default mode.</p>
             * </li>
             * <li><p>Precise: precise mode.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Precise</p>
             */
            public Builder configMode(String configMode) {
                this.configMode = configMode;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_application_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port ranges of the private access application. Multiple port ranges cannot be repeated or overlap.</p>
             */
            public Builder portRanges(java.util.List<PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * <p>The protocol of the private access application. Valid values:</p>
             * <ul>
             * <li><p><strong>All</strong>: all protocols.</p>
             * </li>
             * <li><p><strong>TCP</strong>: TCP.</p>
             * </li>
             * <li><p><strong>UDP</strong>: UDP.</p>
             * </li>
             * <li><p><strong>HTTP</strong>: HTTP.</p>
             * </li>
             * <li><p><strong>HTTPS</strong>: HTTPS.</p>
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

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
