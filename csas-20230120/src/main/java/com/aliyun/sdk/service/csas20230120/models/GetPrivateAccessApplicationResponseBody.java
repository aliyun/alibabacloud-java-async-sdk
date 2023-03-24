// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrivateAccessApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrivateAccessApplicationResponseBody</p>
 */
public class GetPrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    private Application application;

    @NameInMap("RequestId")
    private String requestId;

    private GetPrivateAccessApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateAccessApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Application application; 
        private String requestId; 

        /**
         * Application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrivateAccessApplicationResponseBody build() {
            return new GetPrivateAccessApplicationResponseBody(this);
        } 

    } 

    public static class PortRanges extends TeaModel {
        @NameInMap("Begin")
        private Integer begin;

        @NameInMap("End")
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
    public static class Application extends TeaModel {
        @NameInMap("Addresses")
        private java.util.List < String > addresses;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("PolicyIds")
        private java.util.List < String > policyIds;

        @NameInMap("PortRanges")
        private java.util.List < PortRanges> portRanges;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Status")
        private String status;

        @NameInMap("TagIds")
        private java.util.List < String > tagIds;

        private Application(Builder builder) {
            this.addresses = builder.addresses;
            this.applicationId = builder.applicationId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.policyIds = builder.policyIds;
            this.portRanges = builder.portRanges;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.tagIds = builder.tagIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return addresses
         */
        public java.util.List < String > getAddresses() {
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
         * @return policyIds
         */
        public java.util.List < String > getPolicyIds() {
            return this.policyIds;
        }

        /**
         * @return portRanges
         */
        public java.util.List < PortRanges> getPortRanges() {
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

        /**
         * @return tagIds
         */
        public java.util.List < String > getTagIds() {
            return this.tagIds;
        }

        public static final class Builder {
            private java.util.List < String > addresses; 
            private String applicationId; 
            private String createTime; 
            private String description; 
            private String name; 
            private java.util.List < String > policyIds; 
            private java.util.List < PortRanges> portRanges; 
            private String protocol; 
            private String status; 
            private java.util.List < String > tagIds; 

            /**
             * Addresses.
             */
            public Builder addresses(java.util.List < String > addresses) {
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
             * PolicyIds.
             */
            public Builder policyIds(java.util.List < String > policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * PortRanges.
             */
            public Builder portRanges(java.util.List < PortRanges> portRanges) {
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

            /**
             * TagIds.
             */
            public Builder tagIds(java.util.List < String > tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
