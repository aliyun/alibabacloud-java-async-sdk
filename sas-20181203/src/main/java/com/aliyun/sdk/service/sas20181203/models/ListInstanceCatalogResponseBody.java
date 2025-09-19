// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListInstanceCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceCatalogResponseBody</p>
 */
public class ListInstanceCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<Vendors> vendors;

    private ListInstanceCatalogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceCatalogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendors
     */
    public java.util.List<Vendors> getVendors() {
        return this.vendors;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Vendors> vendors; 

        private Builder() {
        } 

        private Builder(ListInstanceCatalogResponseBody model) {
            this.requestId = model.requestId;
            this.vendors = model.vendors;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0D42A83F-CE33-5F54-A5AE-05DA39F59E1B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The asset types by service provider.</p>
         */
        public Builder vendors(java.util.List<Vendors> vendors) {
            this.vendors = vendors;
            return this;
        }

        public ListInstanceCatalogResponseBody build() {
            return new ListInstanceCatalogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceCatalogResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceCatalogResponseBody</p>
     */
    public static class InstanceSubTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private InstanceSubTypes(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSubTypes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(InstanceSubTypes model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the asset subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>SECURITY_GROUP</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the asset subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public InstanceSubTypes build() {
                return new InstanceSubTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceCatalogResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceCatalogResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceSubTypes")
        private java.util.List<InstanceSubTypes> instanceSubTypes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private InstanceTypes(Builder builder) {
            this.instanceSubTypes = builder.instanceSubTypes;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceSubTypes
         */
        public java.util.List<InstanceSubTypes> getInstanceSubTypes() {
            return this.instanceSubTypes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<InstanceSubTypes> instanceSubTypes; 
            private String name; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.instanceSubTypes = model.instanceSubTypes;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The asset subtypes.</p>
             */
            public Builder instanceSubTypes(java.util.List<InstanceSubTypes> instanceSubTypes) {
                this.instanceSubTypes = instanceSubTypes;
                return this;
            }

            /**
             * <p>The name of the asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the asset type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
             * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
             * <li><strong>3</strong>: ApsaraDB RDS</li>
             * <li><strong>4</strong>: ApsaraDB for MongoDB (MongoDB)</li>
             * <li><strong>5</strong>: Tair (Redis OSS-compatible)</li>
             * <li><strong>6</strong>: Container Registry</li>
             * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
             * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
             * <li><strong>11</strong>: ActionTrail</li>
             * <li><strong>12</strong>: Alibaba Cloud CDN (CDN)</li>
             * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
             * <li><strong>14</strong>: Alibaba Cloud DevOps</li>
             * <li><strong>15</strong>: Resource Access Management (RAM)</li>
             * <li><strong>16</strong>: Anti-DDoS</li>
             * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
             * <li><strong>18</strong>: Object Storage Service (OSS)</li>
             * <li><strong>19</strong>: PolarDB</li>
             * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
             * <li><strong>21</strong>: Microservices Engine (MSE)</li>
             * <li><strong>22</strong>: Apsara File Storage NAS (NAS)</li>
             * <li><strong>23</strong>: Data Security Center (DSC)</li>
             * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
             * <li><strong>25</strong>: Identity as a Service (IDaaS) - Enterprise Identity Access Management (EIAM)</li>
             * <li><strong>26</strong>: PolarDB for Xscale (PolarDB-X)</li>
             * <li><strong>27</strong>: Elasticsearch</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceCatalogResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceCatalogResponseBody</p>
     */
    public static class Vendors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<InstanceTypes> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private Vendors(Builder builder) {
            this.instanceTypes = builder.instanceTypes;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vendors create() {
            return builder().build();
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<InstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<InstanceTypes> instanceTypes; 
            private String name; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(Vendors model) {
                this.instanceTypes = model.instanceTypes;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The asset types.</p>
             */
            public Builder instanceTypes(java.util.List<InstanceTypes> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The name of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the service provider type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
             * <li><strong>1</strong>: an asset outside Alibaba Cloud</li>
             * <li><strong>2</strong>: an asset in a data center</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset from a third-party cloud service provider</li>
             * <li><strong>8</strong>: a lightweight cloud asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public Vendors build() {
                return new Vendors(this);
            } 

        } 

    }
}
