// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link ListVpcConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcConfigsResponseBody</p>
 */
public class ListVpcConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcConfigList")
    private java.util.List<VpcConfigList> vpcConfigList;

    private ListVpcConfigsResponseBody(Builder builder) {
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcConfigList = builder.vpcConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcConfigList
     */
    public java.util.List<VpcConfigList> getVpcConfigList() {
        return this.vpcConfigList;
    }

    public static final class Builder {
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<VpcConfigList> vpcConfigList; 

        private Builder() {
        } 

        private Builder(ListVpcConfigsResponseBody model) {
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpcConfigList = model.vpcConfigList;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpcConfigList.
         */
        public Builder vpcConfigList(java.util.List<VpcConfigList> vpcConfigList) {
            this.vpcConfigList = vpcConfigList;
            return this;
        }

        public ListVpcConfigsResponseBody build() {
            return new ListVpcConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcConfigsResponseBody</p>
     */
    public static class VpcConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigDescription")
        private String configDescription;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SortPriority")
        private Long sortPriority;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCidr")
        private String vpcCidr;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VpcConfigList(Builder builder) {
            this.configDescription = builder.configDescription;
            this.configId = builder.configId;
            this.configName = builder.configName;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.sortPriority = builder.sortPriority;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCidr = builder.vpcCidr;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfigList create() {
            return builder().build();
        }

        /**
         * @return configDescription
         */
        public String getConfigDescription() {
            return this.configDescription;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return sortPriority
         */
        public Long getSortPriority() {
            return this.sortPriority;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcCidr
         */
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String configDescription; 
            private String configId; 
            private String configName; 
            private String regionId; 
            private String securityGroupId; 
            private Long sortPriority; 
            private String vSwitchId; 
            private String vpcCidr; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcConfigList model) {
                this.configDescription = model.configDescription;
                this.configId = model.configId;
                this.configName = model.configName;
                this.regionId = model.regionId;
                this.securityGroupId = model.securityGroupId;
                this.sortPriority = model.sortPriority;
                this.vSwitchId = model.vSwitchId;
                this.vpcCidr = model.vpcCidr;
                this.vpcId = model.vpcId;
            } 

            /**
             * ConfigDescription.
             */
            public Builder configDescription(String configDescription) {
                this.configDescription = configDescription;
                return this;
            }

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ConfigName.
             */
            public Builder configName(String configName) {
                this.configName = configName;
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
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SortPriority.
             */
            public Builder sortPriority(Long sortPriority) {
                this.sortPriority = sortPriority;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcCidr.
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcConfigList build() {
                return new VpcConfigList(this);
            } 

        } 

    }
}
