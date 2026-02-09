// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326.models;

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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListProductsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListProductsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class ConsultationMore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private ConsultationMore(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsultationMore create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(ConsultationMore model) {
                this.description = model.description;
                this.name = model.name;
                this.productCode = model.productCode;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public ConsultationMore build() {
                return new ConsultationMore(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class HotConsultation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private HotConsultation(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotConsultation create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(HotConsultation model) {
                this.description = model.description;
                this.name = model.name;
                this.productCode = model.productCode;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public HotConsultation build() {
                return new HotConsultation(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class HotTech extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private HotTech(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotTech create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(HotTech model) {
                this.description = model.description;
                this.name = model.name;
                this.productCode = model.productCode;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public HotTech build() {
                return new HotTech(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class ProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private ProductList(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(ProductList model) {
                this.description = model.description;
                this.name = model.name;
                this.productCode = model.productCode;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public ProductList build() {
                return new ProductList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class TechMore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ProductList")
        private java.util.List<ProductList> productList;

        private TechMore(Builder builder) {
            this.groupName = builder.groupName;
            this.productList = builder.productList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TechMore create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return productList
         */
        public java.util.List<ProductList> getProductList() {
            return this.productList;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List<ProductList> productList; 

            private Builder() {
            } 

            private Builder(TechMore model) {
                this.groupName = model.groupName;
                this.productList = model.productList;
            } 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ProductList.
             */
            public Builder productList(java.util.List<ProductList> productList) {
                this.productList = productList;
                return this;
            }

            public TechMore build() {
                return new TechMore(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsultationMore")
        private java.util.List<ConsultationMore> consultationMore;

        @com.aliyun.core.annotation.NameInMap("HotConsultation")
        private java.util.List<HotConsultation> hotConsultation;

        @com.aliyun.core.annotation.NameInMap("HotTech")
        private java.util.List<HotTech> hotTech;

        @com.aliyun.core.annotation.NameInMap("TechMore")
        private java.util.List<TechMore> techMore;

        private Data(Builder builder) {
            this.consultationMore = builder.consultationMore;
            this.hotConsultation = builder.hotConsultation;
            this.hotTech = builder.hotTech;
            this.techMore = builder.techMore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consultationMore
         */
        public java.util.List<ConsultationMore> getConsultationMore() {
            return this.consultationMore;
        }

        /**
         * @return hotConsultation
         */
        public java.util.List<HotConsultation> getHotConsultation() {
            return this.hotConsultation;
        }

        /**
         * @return hotTech
         */
        public java.util.List<HotTech> getHotTech() {
            return this.hotTech;
        }

        /**
         * @return techMore
         */
        public java.util.List<TechMore> getTechMore() {
            return this.techMore;
        }

        public static final class Builder {
            private java.util.List<ConsultationMore> consultationMore; 
            private java.util.List<HotConsultation> hotConsultation; 
            private java.util.List<HotTech> hotTech; 
            private java.util.List<TechMore> techMore; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consultationMore = model.consultationMore;
                this.hotConsultation = model.hotConsultation;
                this.hotTech = model.hotTech;
                this.techMore = model.techMore;
            } 

            /**
             * ConsultationMore.
             */
            public Builder consultationMore(java.util.List<ConsultationMore> consultationMore) {
                this.consultationMore = consultationMore;
                return this;
            }

            /**
             * HotConsultation.
             */
            public Builder hotConsultation(java.util.List<HotConsultation> hotConsultation) {
                this.hotConsultation = hotConsultation;
                return this;
            }

            /**
             * HotTech.
             */
            public Builder hotTech(java.util.List<HotTech> hotTech) {
                this.hotTech = hotTech;
                return this;
            }

            /**
             * TechMore.
             */
            public Builder techMore(java.util.List<TechMore> techMore) {
                this.techMore = techMore;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
