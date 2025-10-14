// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeRdsVswitchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsVswitchesResponseBody</p>
 */
public class DescribeRdsVswitchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRdsVswitchesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsVswitchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRdsVswitchesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRdsVswitchesResponseBody build() {
            return new DescribeRdsVswitchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRdsVswitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVswitchesResponseBody</p>
     */
    public static class VswitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailabeIpCount")
        private String availabeIpCount;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("IzNo")
        private String izNo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private VswitchList(Builder builder) {
            this.availabeIpCount = builder.availabeIpCount;
            this.cidrBlock = builder.cidrBlock;
            this.description = builder.description;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.isDefault = builder.isDefault;
            this.izNo = builder.izNo;
            this.name = builder.name;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchList create() {
            return builder().build();
        }

        /**
         * @return availabeIpCount
         */
        public String getAvailabeIpCount() {
            return this.availabeIpCount;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String availabeIpCount; 
            private String cidrBlock; 
            private String description; 
            private Long id; 
            private String instanceId; 
            private String isDefault; 
            private String izNo; 
            private String name; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(VswitchList model) {
                this.availabeIpCount = model.availabeIpCount;
                this.cidrBlock = model.cidrBlock;
                this.description = model.description;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.isDefault = model.isDefault;
                this.izNo = model.izNo;
                this.name = model.name;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * AvailabeIpCount.
             */
            public Builder availabeIpCount(String availabeIpCount) {
                this.availabeIpCount = availabeIpCount;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * IzNo.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
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
             * <p>vpc id。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6lis7xmm****t9wrxb5</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public VswitchList build() {
                return new VswitchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsVswitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVswitchesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VswitchList")
        private java.util.List<VswitchList> vswitchList;

        private Data(Builder builder) {
            this.vswitchList = builder.vswitchList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return vswitchList
         */
        public java.util.List<VswitchList> getVswitchList() {
            return this.vswitchList;
        }

        public static final class Builder {
            private java.util.List<VswitchList> vswitchList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.vswitchList = model.vswitchList;
            } 

            /**
             * VswitchList.
             */
            public Builder vswitchList(java.util.List<VswitchList> vswitchList) {
                this.vswitchList = vswitchList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
