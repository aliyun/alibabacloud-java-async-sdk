// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpdsResponseBody</p>
 */
public class ListVpdsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListVpdsResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpdsResponseBody create() {
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

        public ListVpdsResponseBody build() {
            return new ListVpdsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Dependence")
        private java.util.Map < String, ? > dependence;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("NcCount")
        private Integer ncCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Route")
        private Integer route;

        @NameInMap("ServiceCidr")
        private String serviceCidr;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubnetCount")
        private Integer subnetCount;

        @NameInMap("VpdId")
        private String vpdId;

        private Data(Builder builder) {
            this.cidr = builder.cidr;
            this.dependence = builder.dependence;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.message = builder.message;
            this.name = builder.name;
            this.ncCount = builder.ncCount;
            this.regionId = builder.regionId;
            this.route = builder.route;
            this.serviceCidr = builder.serviceCidr;
            this.status = builder.status;
            this.subnetCount = builder.subnetCount;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return dependence
         */
        public java.util.Map < String, ? > getDependence() {
            return this.dependence;
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
        public Integer getNcCount() {
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
        public Integer getSubnetCount() {
            return this.subnetCount;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String cidr; 
            private java.util.Map < String, ? > dependence; 
            private String gmtCreate; 
            private String gmtModified; 
            private String message; 
            private String name; 
            private Integer ncCount; 
            private String regionId; 
            private Integer route; 
            private String serviceCidr; 
            private String status; 
            private Integer subnetCount; 
            private String vpdId; 

            /**
             * cidr地址
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * 依赖项
             */
            public Builder dependence(java.util.Map < String, ? > dependence) {
                this.dependence = dependence;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 提示信息
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * vpd名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nc数量
             */
            public Builder ncCount(Integer ncCount) {
                this.ncCount = ncCount;
                return this;
            }

            /**
             * 地域Id
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 路由表数量
             */
            public Builder route(Integer route) {
                this.route = route;
                return this;
            }

            /**
             * 服务网段
             */
            public Builder serviceCidr(String serviceCidr) {
                this.serviceCidr = serviceCidr;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subnet数量
             */
            public Builder subnetCount(Integer subnetCount) {
                this.subnetCount = subnetCount;
                return this;
            }

            /**
             * vpd id
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("Total")
        private Long total;

        private Content(Builder builder) {
            this.data = builder.data;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private Long total; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
