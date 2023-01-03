// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpdResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpdResponseBody</p>
 */
public class GetVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetVpdResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVpdResponseBody build() {
            return new GetVpdResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("LbCount")
        private Long lbCount;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("NcCount")
        private Long ncCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Route")
        private Integer route;

        @NameInMap("ServiceCidr")
        private String serviceCidr;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubnetCount")
        private Long subnetCount;

        @NameInMap("VccCount")
        private Long vccCount;

        @NameInMap("VpdId")
        private String vpdId;

        private Content(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lbCount = builder.lbCount;
            this.message = builder.message;
            this.name = builder.name;
            this.ncCount = builder.ncCount;
            this.regionId = builder.regionId;
            this.route = builder.route;
            this.serviceCidr = builder.serviceCidr;
            this.status = builder.status;
            this.subnetCount = builder.subnetCount;
            this.vccCount = builder.vccCount;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lbCount
         */
        public Long getLbCount() {
            return this.lbCount;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ncCount
         */
        public Long getNcCount() {
            return this.ncCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return route
         */
        public Integer getRoute() {
            return this.route;
        }

        /**
         * @return serviceCidr
         */
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetCount
         */
        public Long getSubnetCount() {
            return this.subnetCount;
        }

        /**
         * @return vccCount
         */
        public Long getVccCount() {
            return this.vccCount;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long lbCount; 
            private String message; 
            private String name; 
            private Long ncCount; 
            private String regionId; 
            private Integer route; 
            private String serviceCidr; 
            private String status; 
            private Long subnetCount; 
            private Long vccCount; 
            private String vpdId; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * LbCount.
             */
            public Builder lbCount(Long lbCount) {
                this.lbCount = lbCount;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NcCount.
             */
            public Builder ncCount(Long ncCount) {
                this.ncCount = ncCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Route.
             */
            public Builder route(Integer route) {
                this.route = route;
                return this;
            }

            /**
             * ServiceCidr.
             */
            public Builder serviceCidr(String serviceCidr) {
                this.serviceCidr = serviceCidr;
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
             * SubnetCount.
             */
            public Builder subnetCount(Long subnetCount) {
                this.subnetCount = subnetCount;
                return this;
            }

            /**
             * VccCount.
             */
            public Builder vccCount(Long vccCount) {
                this.vccCount = vccCount;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
