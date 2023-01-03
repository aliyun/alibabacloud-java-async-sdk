// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubnetResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubnetResponseBody</p>
 */
public class GetSubnetResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetSubnetResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubnetResponseBody create() {
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

        public GetSubnetResponseBody build() {
            return new GetSubnetResponseBody(this);
        } 

    } 

    public static class VpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("Name")
        private String name;

        @NameInMap("VpdId")
        private String vpdId;

        private VpdBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.gmtCreate = builder.gmtCreate;
            this.name = builder.name;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdBaseInfo create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String cidr; 
            private String gmtCreate; 
            private String name; 
            private String vpdId; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public VpdBaseInfo build() {
                return new VpdBaseInfo(this);
            } 

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

        @NameInMap("Id")
        private Long id;

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

        @NameInMap("Status")
        private String status;

        @NameInMap("SubnetId")
        private String subnetId;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        private String vpdId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lbCount = builder.lbCount;
            this.message = builder.message;
            this.name = builder.name;
            this.ncCount = builder.ncCount;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.subnetId = builder.subnetId;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.vpdId = builder.vpdId;
            this.zoneId = builder.zoneId;
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpdBaseInfo
         */
        public VpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long lbCount; 
            private String message; 
            private String name; 
            private Long ncCount; 
            private String regionId; 
            private String status; 
            private String subnetId; 
            private String tenantId; 
            private String type; 
            private VpdBaseInfo vpdBaseInfo; 
            private String vpdId; 
            private String zoneId; 

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
             * ID
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubnetId.
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VpdBaseInfo.
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
