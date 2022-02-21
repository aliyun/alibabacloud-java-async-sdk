// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaProductListResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaProductListResponseBody</p>
 */
public class GetMetaProductListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MetaData")
    private MetaData metaData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMetaProductListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.metaData = builder.metaData;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaProductListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metaData
     */
    public MetaData getMetaData() {
        return this.metaData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private MetaData metaData; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * MetaData.
         */
        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaProductListResponseBody build() {
            return new GetMetaProductListResponseBody(this);
        } 

    } 

    public static class SpecVO extends TeaModel {
        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskSize")
        private String diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("IoMax")
        private Long ioMax;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("TopicQuota")
        private String topicQuota;

        private SpecVO(Builder builder) {
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.ioMax = builder.ioMax;
            this.regionId = builder.regionId;
            this.specType = builder.specType;
            this.topicQuota = builder.topicQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecVO create() {
            return builder().build();
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return diskSize
         */
        public String getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return ioMax
         */
        public Long getIoMax() {
            return this.ioMax;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return topicQuota
         */
        public String getTopicQuota() {
            return this.topicQuota;
        }

        public static final class Builder {
            private String deployType; 
            private String diskSize; 
            private String diskType; 
            private Long ioMax; 
            private String regionId; 
            private String specType; 
            private String topicQuota; 

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(String diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * IoMax.
             */
            public Builder ioMax(Long ioMax) {
                this.ioMax = ioMax;
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
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * TopicQuota.
             */
            public Builder topicQuota(String topicQuota) {
                this.topicQuota = topicQuota;
                return this;
            }

            public SpecVO build() {
                return new SpecVO(this);
            } 

        } 

    }
    public static class ProductsNormal extends TeaModel {
        @NameInMap("SpecVO")
        private java.util.List < SpecVO> specVO;

        private ProductsNormal(Builder builder) {
            this.specVO = builder.specVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductsNormal create() {
            return builder().build();
        }

        /**
         * @return specVO
         */
        public java.util.List < SpecVO> getSpecVO() {
            return this.specVO;
        }

        public static final class Builder {
            private java.util.List < SpecVO> specVO; 

            /**
             * SpecVO.
             */
            public Builder specVO(java.util.List < SpecVO> specVO) {
                this.specVO = specVO;
                return this;
            }

            public ProductsNormal build() {
                return new ProductsNormal(this);
            } 

        } 

    }
    public static class ProductsProfessionalSpecVO extends TeaModel {
        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskSize")
        private String diskSize;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("IoMax")
        private Integer ioMax;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("TopicQuota")
        private String topicQuota;

        private ProductsProfessionalSpecVO(Builder builder) {
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.ioMax = builder.ioMax;
            this.regionId = builder.regionId;
            this.specType = builder.specType;
            this.topicQuota = builder.topicQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductsProfessionalSpecVO create() {
            return builder().build();
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return diskSize
         */
        public String getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return ioMax
         */
        public Integer getIoMax() {
            return this.ioMax;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return topicQuota
         */
        public String getTopicQuota() {
            return this.topicQuota;
        }

        public static final class Builder {
            private String deployType; 
            private String diskSize; 
            private String diskType; 
            private Integer ioMax; 
            private String regionId; 
            private String specType; 
            private String topicQuota; 

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(String diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * IoMax.
             */
            public Builder ioMax(Integer ioMax) {
                this.ioMax = ioMax;
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
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * TopicQuota.
             */
            public Builder topicQuota(String topicQuota) {
                this.topicQuota = topicQuota;
                return this;
            }

            public ProductsProfessionalSpecVO build() {
                return new ProductsProfessionalSpecVO(this);
            } 

        } 

    }
    public static class ProductsProfessional extends TeaModel {
        @NameInMap("SpecVO")
        private java.util.List < ProductsProfessionalSpecVO> specVO;

        private ProductsProfessional(Builder builder) {
            this.specVO = builder.specVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductsProfessional create() {
            return builder().build();
        }

        /**
         * @return specVO
         */
        public java.util.List < ProductsProfessionalSpecVO> getSpecVO() {
            return this.specVO;
        }

        public static final class Builder {
            private java.util.List < ProductsProfessionalSpecVO> specVO; 

            /**
             * SpecVO.
             */
            public Builder specVO(java.util.List < ProductsProfessionalSpecVO> specVO) {
                this.specVO = specVO;
                return this;
            }

            public ProductsProfessional build() {
                return new ProductsProfessional(this);
            } 

        } 

    }
    public static class MetaData extends TeaModel {
        @NameInMap("Names")
        private java.util.Map < String, ? > names;

        @NameInMap("ProductsNormal")
        private ProductsNormal productsNormal;

        @NameInMap("ProductsProfessional")
        private ProductsProfessional productsProfessional;

        private MetaData(Builder builder) {
            this.names = builder.names;
            this.productsNormal = builder.productsNormal;
            this.productsProfessional = builder.productsProfessional;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return names
         */
        public java.util.Map < String, ? > getNames() {
            return this.names;
        }

        /**
         * @return productsNormal
         */
        public ProductsNormal getProductsNormal() {
            return this.productsNormal;
        }

        /**
         * @return productsProfessional
         */
        public ProductsProfessional getProductsProfessional() {
            return this.productsProfessional;
        }

        public static final class Builder {
            private java.util.Map < String, ? > names; 
            private ProductsNormal productsNormal; 
            private ProductsProfessional productsProfessional; 

            /**
             * Names.
             */
            public Builder names(java.util.Map < String, ? > names) {
                this.names = names;
                return this;
            }

            /**
             * ProductsNormal.
             */
            public Builder productsNormal(ProductsNormal productsNormal) {
                this.productsNormal = productsNormal;
                return this;
            }

            /**
             * ProductsProfessional.
             */
            public Builder productsProfessional(ProductsProfessional productsProfessional) {
                this.productsProfessional = productsProfessional;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
}
