// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAssetGroupToInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetGroupToInstanceResponseBody</p>
 */
public class DescribeAssetGroupToInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeAssetGroupToInstanceResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetGroupToInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The response parameters.</p>
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C73C59B9-9F5C-57FF-A394-13EC8FC3B2FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeAssetGroupToInstanceResponseBody build() {
            return new DescribeAssetGroupToInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetGroupToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetGroupToInstanceResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.memberUid = builder.memberUid;
            this.name = builder.name;
            this.region = builder.region;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instanceId; 
            private String memberUid; 
            private String name; 
            private String region; 
            private String type; 

            /**
             * <p>The ID of the Anti-DDoS Origin instance of a paid edition.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-7212zaa5v***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The UID of the member to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>170858869679****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_v2_public_cn-lbj382l****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The type of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>waf</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
