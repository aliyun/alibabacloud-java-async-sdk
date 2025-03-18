// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeNodePoolVulsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodePoolVulsResponseBody</p>
 */
public class DescribeNodePoolVulsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("vul_records")
    private java.util.List<VulRecords> vulRecords;

    @com.aliyun.core.annotation.NameInMap("vuls_fix_service_purchased")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vulRecords
     */
    public java.util.List<VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    /**
     * @return vulsFixServicePurchased
     */
    public Boolean getVulsFixServicePurchased() {
        return this.vulsFixServicePurchased;
    }

    public static final class Builder {
        private java.util.List<VulRecords> vulRecords; 
        private Boolean vulsFixServicePurchased; 

        private Builder() {
        } 

        private Builder(DescribeNodePoolVulsResponseBody model) {
            this.vulRecords = model.vulRecords;
            this.vulsFixServicePurchased = model.vulsFixServicePurchased;
        } 

        /**
         * <p>The node pool vulnerabilities.</p>
         */
        public Builder vulRecords(java.util.List<VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        /**
         * <p>Whether the Cloud Security CVE Remediation Service has been purchased</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder vulsFixServicePurchased(Boolean vulsFixServicePurchased) {
            this.vulsFixServicePurchased = vulsFixServicePurchased;
            return this;
        }

        public DescribeNodePoolVulsResponseBody build() {
            return new DescribeNodePoolVulsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodePoolVulsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodePoolVulsResponseBody</p>
     */
    public static class VulList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias_name")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("cve_list")
        private java.util.List<String> cveList;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("need_reboot")
        private Boolean needReboot;

        private VulList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.cveList = builder.cveList;
            this.name = builder.name;
            this.necessity = builder.necessity;
            this.needReboot = builder.needReboot;
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
        public java.util.List<String> getCveList() {
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

        /**
         * @return needReboot
         */
        public Boolean getNeedReboot() {
            return this.needReboot;
        }

        public static final class Builder {
            private String aliasName; 
            private java.util.List<String> cveList; 
            private String name; 
            private String necessity; 
            private Boolean needReboot; 

            private Builder() {
            } 

            private Builder(VulList model) {
                this.aliasName = model.aliasName;
                this.cveList = model.cveList;
                this.name = model.name;
                this.necessity = model.necessity;
                this.needReboot = model.needReboot;
            } 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2019:3197-Important: sudo security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>A list of CVE names corresponding to the vulnerabilities.</p>
             */
            public Builder cveList(java.util.List<String> cveList) {
                this.cveList = cveList;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20193197</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The severity level of the vulnerability.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>nntf: You can ignore the vulnerability.</li>
             * <li>later: You can fix the vulnerability later.</li>
             * <li>asap: You need to fix the vulnerability at the earliest opportunity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>asap</p>
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * <p>Indicates whether a restart is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needReboot(Boolean needReboot) {
                this.needReboot = needReboot;
                return this;
            }

            public VulList build() {
                return new VulList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNodePoolVulsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodePoolVulsResponseBody</p>
     */
    public static class VulRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instance_id")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("node_name")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("vul_list")
        private java.util.List<VulList> vulList;

        private VulRecords(Builder builder) {
            this.instanceId = builder.instanceId;
            this.nodeName = builder.nodeName;
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
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return vulList
         */
        public java.util.List<VulList> getVulList() {
            return this.vulList;
        }

        public static final class Builder {
            private String instanceId; 
            private String nodeName; 
            private java.util.List<VulList> vulList; 

            private Builder() {
            } 

            private Builder(VulRecords model) {
                this.instanceId = model.instanceId;
                this.nodeName = model.nodeName;
                this.vulList = model.vulList;
            } 

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-t4n2qolb0wtzt0pz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The node name. This name is the identifier of the node in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou.192.168.x.x</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>A list of vulnerabilities.</p>
             */
            public Builder vulList(java.util.List<VulList> vulList) {
                this.vulList = vulList;
                return this;
            }

            public VulRecords build() {
                return new VulRecords(this);
            } 

        } 

    }
}
