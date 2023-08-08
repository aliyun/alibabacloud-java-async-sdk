// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterVulsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterVulsResponseBody</p>
 */
public class DescribeClusterVulsResponseBody extends TeaModel {
    @NameInMap("vul_records")
    private java.util.List < VulRecords> vulRecords;

    private DescribeClusterVulsResponseBody(Builder builder) {
        this.vulRecords = builder.vulRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterVulsResponseBody create() {
        return builder().build();
    }

    /**
     * @return vulRecords
     */
    public java.util.List < VulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static final class Builder {
        private java.util.List < VulRecords> vulRecords; 

        /**
         * vul_records.
         */
        public Builder vulRecords(java.util.List < VulRecords> vulRecords) {
            this.vulRecords = vulRecords;
            return this;
        }

        public DescribeClusterVulsResponseBody build() {
            return new DescribeClusterVulsResponseBody(this);
        } 

    } 

    public static class VulRecords extends TeaModel {
        @NameInMap("cve_list")
        private java.util.List < String > cveList;

        @NameInMap("necessity")
        private String necessity;

        @NameInMap("node_count")
        private Integer nodeCount;

        @NameInMap("nodepool_id")
        private String nodepoolId;

        @NameInMap("nodepool_name")
        private String nodepoolName;

        @NameInMap("vul_alias_name")
        private String vulAliasName;

        @NameInMap("vul_name")
        private String vulName;

        @NameInMap("vul_type")
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
        public java.util.List < String > getCveList() {
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
            private java.util.List < String > cveList; 
            private String necessity; 
            private Integer nodeCount; 
            private String nodepoolId; 
            private String nodepoolName; 
            private String vulAliasName; 
            private String vulName; 
            private String vulType; 

            /**
             * cve_list.
             */
            public Builder cveList(java.util.List < String > cveList) {
                this.cveList = cveList;
                return this;
            }

            /**
             * necessity.
             */
            public Builder necessity(String necessity) {
                this.necessity = necessity;
                return this;
            }

            /**
             * node_count.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * nodepool_id.
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            /**
             * nodepool_name.
             */
            public Builder nodepoolName(String nodepoolName) {
                this.nodepoolName = nodepoolName;
                return this;
            }

            /**
             * vul_alias_name.
             */
            public Builder vulAliasName(String vulAliasName) {
                this.vulAliasName = vulAliasName;
                return this;
            }

            /**
             * vul_name.
             */
            public Builder vulName(String vulName) {
                this.vulName = vulName;
                return this;
            }

            /**
             * vul_type.
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
