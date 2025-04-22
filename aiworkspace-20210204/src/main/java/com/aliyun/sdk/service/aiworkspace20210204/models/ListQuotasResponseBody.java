// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotasResponseBody</p>
 */
public class ListQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List<Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListQuotasResponseBody(Builder builder) {
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotas
     */
    public java.util.List<Quotas> getQuotas() {
        return this.quotas;
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

    public static final class Builder {
        private java.util.List<Quotas> quotas; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotasResponseBody model) {
            this.quotas = model.quotas;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned quotas.</p>
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of quotas that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotasResponseBody build() {
            return new ListQuotasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class Specs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Specs(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Specs model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>cu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The specification type. The parameter can be left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The specification value.</p>
             * 
             * <strong>example:</strong>
             * <p>11500</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Specs build() {
                return new Specs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("Specs")
        private java.util.List<Specs> specs;

        private Quotas(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.mode = builder.mode;
            this.name = builder.name;
            this.productCode = builder.productCode;
            this.quotaType = builder.quotaType;
            this.specs = builder.specs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
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

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return specs
         */
        public java.util.List<Specs> getSpecs() {
            return this.specs;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 
            private String mode; 
            private String name; 
            private String productCode; 
            private String quotaType; 
            private java.util.List<Specs> specs; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.displayName = model.displayName;
                this.id = model.id;
                this.mode = model.mode;
                this.name = model.name;
                this.productCode = model.productCode;
                this.quotaType = model.quotaType;
                this.specs = model.specs;
            } 

            /**
             * <p>The alias of the quota.</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1828233</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>isolate: subscription</li>
             * <li>share: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>isolate</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>quota-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The product code. Valid values:</p>
             * <ul>
             * <li>PAI_isolate: CPU subscription resource groups of PAI</li>
             * <li>PAI_share: GPU pay-as-you-go resource groups of PAI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute_share</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota type. Valid value:</p>
             * <p>PAI: indicates GPU resource groups of MaxCompute.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The quota specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cu&quot;:&quot;11500&quot;,&quot;minCu&quot;:&quot;2300&quot;,&quot;parentId&quot;:&quot;0&quot;}</p>
             */
            public Builder specs(java.util.List<Specs> specs) {
                this.specs = specs;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
