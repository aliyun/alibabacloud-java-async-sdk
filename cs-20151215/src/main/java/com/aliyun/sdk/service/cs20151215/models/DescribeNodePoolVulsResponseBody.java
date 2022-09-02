// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodePoolVulsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodePoolVulsResponseBody</p>
 */
public class DescribeNodePoolVulsResponseBody extends TeaModel {
    @NameInMap("vul_records")
    private java.util.List < VulRecords> vulRecords;

    @NameInMap("vuls_fix_service_purchased")
    private Boolean vulsFixServicePurchased;

    private DescribeNodePoolVulsResponseBody(Builder builder) {
        this.vulRecords = builder.vulRecords;
        this.vulsFixServicePurchased = builder.vulsFixServicePurchased;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodePoolVulsResponseBody create() {
        return builder().build();
    }

    /**
     * @return vulRecords
     */
    public java.util.List < VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    /**
     * @return vulsFixServicePurchased
     */
    public Boolean getVulsFixServicePurchased() {
        return this.vulsFixServicePurchased;
    }

    public static final class Builder {
        private java.util.List < VulRecords> vulRecords; 
        private Boolean vulsFixServicePurchased; 

        /**
         * vul_records.
         */
        public Builder vulRecords(java.util.List < VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        /**
         * 是否已购买云安全CVE修复服务
         */
        public Builder vulsFixServicePurchased(Boolean vulsFixServicePurchased) {
            this.vulsFixServicePurchased = vulsFixServicePurchased;
            return this;
        }

        public DescribeNodePoolVulsResponseBody build() {
            return new DescribeNodePoolVulsResponseBody(this);
        } 

    } 

    public static class VulList extends TeaModel {
        @NameInMap("alias_name")
        private String aliasName;

        @NameInMap("cve_list")
        private java.util.List < String > cveList;

        @NameInMap("name")
        private String name;

        @NameInMap("necessity")
        private String necessity;

        private VulList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.cveList = builder.cveList;
            this.name = builder.name;
            this.necessity = builder.necessity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return cveList
         */
        public java.util.List < String > getCveList() {
            return this.cveList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        public static final class Builder {
            private String aliasName; 
            private java.util.List < String > cveList; 
            private String name; 
            private String necessity; 

            /**
             * alias_name.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * cve_list.
             */
            public Builder cveList(java.util.List < String > cveList) {
                this.cveList = cveList;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * necessity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            public VulList build() {
                return new VulList(this);
            } 

        } 

    }
    public static class VulRecords extends TeaModel {
        @NameInMap("instance_id")
        private String instanceId;

        @NameInMap("vul_list")
        private java.util.List < VulList> vulList;

        private VulRecords(Builder builder) {
            this.instanceId = builder.instanceId;
            this.vulList = builder.vulList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulRecords create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return vulList
         */
        public java.util.List < VulList> getVulList() {
            return this.vulList;
        }

        public static final class Builder {
            private String instanceId; 
            private java.util.List < VulList> vulList; 

            /**
             * instance_id.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * vul_list.
             */
            public Builder vulList(java.util.List < VulList> vulList) {
                this.vulList = vulList;
                return this;
            }

            public VulRecords build() {
                return new VulRecords(this);
            } 

        } 

    }
}
