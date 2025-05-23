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
 * {@link DescribeClusterVulsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterVulsResponseBody</p>
 */
public class DescribeClusterVulsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("vul_records")
    private java.util.List<VulRecords> vulRecords;

    private DescribeClusterVulsResponseBody(Builder builder) {
        this.vulRecords = builder.vulRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterVulsResponseBody create() {
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

    public static final class Builder {
        private java.util.List<VulRecords> vulRecords; 

        private Builder() {
        } 

        private Builder(DescribeClusterVulsResponseBody model) {
            this.vulRecords = model.vulRecords;
        } 

        /**
         * <p>The list of vulnerabilities.</p>
         */
        public Builder vulRecords(java.util.List<VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeClusterVulsResponseBody build() {
            return new DescribeClusterVulsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterVulsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterVulsResponseBody</p>
     */
    public static class VulRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cve_list")
        private java.util.List<String> cveList;

        @com.aliyun.core.annotation.NameInMap("necessity")
        private String necessity;

        @com.aliyun.core.annotation.NameInMap("node_count")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("nodepool_id")
        private String nodepoolId;

        @com.aliyun.core.annotation.NameInMap("nodepool_name")
        private String nodepoolName;

        @com.aliyun.core.annotation.NameInMap("vul_alias_name")
        private String vulAliasName;

        @com.aliyun.core.annotation.NameInMap("vul_name")
        private String vulName;

        @com.aliyun.core.annotation.NameInMap("vul_type")
        private String vulType;

        private VulRecords(Builder builder) {
            this.cveList = builder.cveList;
            this.necessity = builder.necessity;
            this.nodeCount = builder.nodeCount;
            this.nodepoolId = builder.nodepoolId;
            this.nodepoolName = builder.nodepoolName;
            this.vulAliasName = builder.vulAliasName;
            this.vulName = builder.vulName;
            this.vulType = builder.vulType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulRecords create() {
            return builder().build();
        }

        /**
         * @return cveList
         */
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

        /**
         * @return necessity
         */
        public String getNecessity() {
            return this.necessity;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return nodepoolId
         */
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        /**
         * @return nodepoolName
         */
        public String getNodepoolName() {
            return this.nodepoolName;
        }

        /**
         * @return vulAliasName
         */
        public String getVulAliasName() {
            return this.vulAliasName;
        }

        /**
         * @return vulName
         */
        public String getVulName() {
            return this.vulName;
        }

        /**
         * @return vulType
         */
        public String getVulType() {
            return this.vulType;
        }

        public static final class Builder {
            private java.util.List<String> cveList; 
            private String necessity; 
            private Integer nodeCount; 
            private String nodepoolId; 
            private String nodepoolName; 
            private String vulAliasName; 
            private String vulName; 
            private String vulType; 

            private Builder() {
            } 

            private Builder(VulRecords model) {
                this.cveList = model.cveList;
                this.necessity = model.necessity;
                this.nodeCount = model.nodeCount;
                this.nodepoolId = model.nodepoolId;
                this.nodepoolName = model.nodepoolName;
                this.vulAliasName = model.vulAliasName;
                this.vulName = model.vulName;
                this.vulType = model.vulType;
            } 

            /**
             * <p>The CVE list.</p>
             */
            public Builder cveList(java.util.List<String> cveList) {
                this.cveList = cveList;
                return this;
            }

            /**
             * <p>The severity level of the vulnerability.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>nntf: low</li>
             * <li>later: medium     </li>
             * <li>asap: high</li>
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
             * <p>The number of nodes that have the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np0156da1082b54fa987e32618dd45f5d3</p>
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * <p>The name of the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodepoolName(String nodepoolName) {
                this.nodepoolName = nodepoolName;
                return this;
            }

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2022-xxxx:rsync Security vulnerabilities</p>
             */
            public Builder vulAliasName(String vulAliasName) {
                this.vulAliasName = vulAliasName;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:xxxxxxx</p>
             */
            public Builder vulName(String vulName) {
                this.vulName = vulName;
                return this;
            }

            /**
             * <p>The type of vulnerability.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>app: application vulnerabilities</li>
             * <li>sca: application vulnerabilities (software component analysis)</li>
             * <li>cve: Linux vulnerabilities</li>
             * <li>cms: Web-CMS vulnerabilities</li>
             * <li>sys: Windows vulnerabilities</li>
             * <li>emg:  emergency vulnerabilities</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder vulType(String vulType) {
                this.vulType = vulType;
                return this;
            }

            public VulRecords build() {
                return new VulRecords(this);
            } 

        } 

    }
}
