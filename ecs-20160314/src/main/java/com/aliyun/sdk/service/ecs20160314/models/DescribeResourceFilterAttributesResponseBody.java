// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceFilterAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceFilterAttributesResponseBody</p>
 */
public class DescribeResourceFilterAttributesResponseBody extends TeaModel {
    @NameInMap("FilterAttributes")
    private FilterAttributes filterAttributes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeResourceFilterAttributesResponseBody(Builder builder) {
        this.filterAttributes = builder.filterAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceFilterAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return filterAttributes
     */
    public FilterAttributes getFilterAttributes() {
        return this.filterAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FilterAttributes filterAttributes; 
        private String requestId; 

        /**
         * FilterAttributes.
         */
        public Builder filterAttributes(FilterAttributes filterAttributes) {
            this.filterAttributes = filterAttributes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceFilterAttributesResponseBody build() {
            return new DescribeResourceFilterAttributesResponseBody(this);
        } 

    } 

    public static class SupportOperations extends TeaModel {
        @NameInMap("SupportOperation")
        private java.util.List < String > supportOperation;

        private SupportOperations(Builder builder) {
            this.supportOperation = builder.supportOperation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportOperations create() {
            return builder().build();
        }

        /**
         * @return supportOperation
         */
        public java.util.List < String > getSupportOperation() {
            return this.supportOperation;
        }

        public static final class Builder {
            private java.util.List < String > supportOperation; 

            /**
             * SupportOperation.
             */
            public Builder supportOperation(java.util.List < String > supportOperation) {
                this.supportOperation = supportOperation;
                return this;
            }

            public SupportOperations build() {
                return new SupportOperations(this);
            } 

        } 

    }
    public static class Values extends TeaModel {
        @NameInMap("Value")
        private java.util.List < String > value;

        private Values(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List < String > value; 

            /**
             * Value.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class FilterAttribute extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("SupportOperations")
        private SupportOperations supportOperations;

        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
        private Values values;

        private FilterAttribute(Builder builder) {
            this.name = builder.name;
            this.supportOperations = builder.supportOperations;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterAttribute create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return supportOperations
         */
        public SupportOperations getSupportOperations() {
            return this.supportOperations;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public Values getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private SupportOperations supportOperations; 
            private String type; 
            private Values values; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SupportOperations.
             */
            public Builder supportOperations(SupportOperations supportOperations) {
                this.supportOperations = supportOperations;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(Values values) {
                this.values = values;
                return this;
            }

            public FilterAttribute build() {
                return new FilterAttribute(this);
            } 

        } 

    }
    public static class FilterAttributes extends TeaModel {
        @NameInMap("FilterAttribute")
        private java.util.List < FilterAttribute> filterAttribute;

        private FilterAttributes(Builder builder) {
            this.filterAttribute = builder.filterAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterAttributes create() {
            return builder().build();
        }

        /**
         * @return filterAttribute
         */
        public java.util.List < FilterAttribute> getFilterAttribute() {
            return this.filterAttribute;
        }

        public static final class Builder {
            private java.util.List < FilterAttribute> filterAttribute; 

            /**
             * FilterAttribute.
             */
            public Builder filterAttribute(java.util.List < FilterAttribute> filterAttribute) {
                this.filterAttribute = filterAttribute;
                return this;
            }

            public FilterAttributes build() {
                return new FilterAttributes(this);
            } 

        } 

    }
}
