// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeNASAvailableResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNASAvailableResourceInfoResponseBody</p>
 */
public class DescribeNASAvailableResourceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NasAvailableResourceInfo")
    private java.util.List<NasAvailableResourceInfo> nasAvailableResourceInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNASAvailableResourceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nasAvailableResourceInfo = builder.nasAvailableResourceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNASAvailableResourceInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nasAvailableResourceInfo
     */
    public java.util.List<NasAvailableResourceInfo> getNasAvailableResourceInfo() {
        return this.nasAvailableResourceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<NasAvailableResourceInfo> nasAvailableResourceInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNASAvailableResourceInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.nasAvailableResourceInfo = model.nasAvailableResourceInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>you are not authorized to this workspace, or workspace not exists.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information of available NAS resources.</p>
         */
        public Builder nasAvailableResourceInfo(java.util.List<NasAvailableResourceInfo> nasAvailableResourceInfo) {
            this.nasAvailableResourceInfo = nasAvailableResourceInfo;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNASAvailableResourceInfoResponseBody build() {
            return new DescribeNASAvailableResourceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNASAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNASAvailableResourceInfoResponseBody</p>
     */
    public static class NasAvailableResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ability")
        private java.util.List<String> ability;

        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("EnsRegionName")
        private String ensRegionName;

        @com.aliyun.core.annotation.NameInMap("NasAvailableAmount")
        private Integer nasAvailableAmount;

        @com.aliyun.core.annotation.NameInMap("NasAvailableStorgeType")
        private String nasAvailableStorgeType;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private NasAvailableResourceInfo(Builder builder) {
            this.ability = builder.ability;
            this.area = builder.area;
            this.enName = builder.enName;
            this.ensRegionId = builder.ensRegionId;
            this.ensRegionName = builder.ensRegionName;
            this.nasAvailableAmount = builder.nasAvailableAmount;
            this.nasAvailableStorgeType = builder.nasAvailableStorgeType;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NasAvailableResourceInfo create() {
            return builder().build();
        }

        /**
         * @return ability
         */
        public java.util.List<String> getAbility() {
            return this.ability;
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return ensRegionName
         */
        public String getEnsRegionName() {
            return this.ensRegionName;
        }

        /**
         * @return nasAvailableAmount
         */
        public Integer getNasAvailableAmount() {
            return this.nasAvailableAmount;
        }

        /**
         * @return nasAvailableStorgeType
         */
        public String getNasAvailableStorgeType() {
            return this.nasAvailableStorgeType;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private java.util.List<String> ability; 
            private String area; 
            private String enName; 
            private String ensRegionId; 
            private String ensRegionName; 
            private Integer nasAvailableAmount; 
            private String nasAvailableStorgeType; 
            private String province; 

            private Builder() {
            } 

            private Builder(NasAvailableResourceInfo model) {
                this.ability = model.ability;
                this.area = model.area;
                this.enName = model.enName;
                this.ensRegionId = model.ensRegionId;
                this.ensRegionName = model.ensRegionName;
                this.nasAvailableAmount = model.nasAvailableAmount;
                this.nasAvailableStorgeType = model.nasAvailableStorgeType;
                this.province = model.province;
            } 

            /**
             * <p>The product supported by the edge node.</p>
             */
            public Builder ability(java.util.List<String> ability) {
                this.ability = ability;
                return this;
            }

            /**
             * <p>The region to which the ENS node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>SouthWestChina</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The English name.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chenzhou-telecom_unicom_cmcc</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chenzhou-telecom_unicom_cmcc</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The name of the ENS node.</p>
             */
            public Builder ensRegionName(String ensRegionName) {
                this.ensRegionName = ensRegionName;
                return this;
            }

            /**
             * <p>the number of available NAS resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nasAvailableAmount(Integer nasAvailableAmount) {
                this.nasAvailableAmount = nasAvailableAmount;
                return this;
            }

            /**
             * <p>The types of available NAS resources.</p>
             * 
             * <strong>example:</strong>
             * <p>capacity</p>
             */
            public Builder nasAvailableStorgeType(String nasAvailableStorgeType) {
                this.nasAvailableStorgeType = nasAvailableStorgeType;
                return this;
            }

            /**
             * <p>The province to which the ENS node belongs.</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public NasAvailableResourceInfo build() {
                return new NasAvailableResourceInfo(this);
            } 

        } 

    }
}
