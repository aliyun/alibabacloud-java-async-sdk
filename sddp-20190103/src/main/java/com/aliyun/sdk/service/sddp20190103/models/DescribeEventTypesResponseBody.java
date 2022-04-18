// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventTypesResponseBody</p>
 */
public class DescribeEventTypesResponseBody extends TeaModel {
    @NameInMap("EventTypeList")
    private java.util.List < EventTypeList> eventTypeList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEventTypesResponseBody(Builder builder) {
        this.eventTypeList = builder.eventTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventTypeList
     */
    public java.util.List < EventTypeList> getEventTypeList() {
        return this.eventTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EventTypeList> eventTypeList; 
        private String requestId; 

        /**
         * EventTypeList.
         */
        public Builder eventTypeList(java.util.List < EventTypeList> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEventTypesResponseBody build() {
            return new DescribeEventTypesResponseBody(this);
        } 

    } 

    public static class SubTypeList extends TeaModel {
        @NameInMap("AdaptedProduct")
        private String adaptedProduct;

        @NameInMap("Code")
        private String code;

        @NameInMap("ConfigCode")
        private String configCode;

        @NameInMap("ConfigContentType")
        private Integer configContentType;

        @NameInMap("ConfigDescription")
        private String configDescription;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("EventHitCount")
        private Integer eventHitCount;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private Integer status;

        private SubTypeList(Builder builder) {
            this.adaptedProduct = builder.adaptedProduct;
            this.code = builder.code;
            this.configCode = builder.configCode;
            this.configContentType = builder.configContentType;
            this.configDescription = builder.configDescription;
            this.configValue = builder.configValue;
            this.description = builder.description;
            this.eventHitCount = builder.eventHitCount;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubTypeList create() {
            return builder().build();
        }

        /**
         * @return adaptedProduct
         */
        public String getAdaptedProduct() {
            return this.adaptedProduct;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return configCode
         */
        public String getConfigCode() {
            return this.configCode;
        }

        /**
         * @return configContentType
         */
        public Integer getConfigContentType() {
            return this.configContentType;
        }

        /**
         * @return configDescription
         */
        public String getConfigDescription() {
            return this.configDescription;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventHitCount
         */
        public Integer getEventHitCount() {
            return this.eventHitCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String adaptedProduct; 
            private String code; 
            private String configCode; 
            private Integer configContentType; 
            private String configDescription; 
            private String configValue; 
            private String description; 
            private Integer eventHitCount; 
            private Long id; 
            private String name; 
            private Integer status; 

            /**
             * AdaptedProduct.
             */
            public Builder adaptedProduct(String adaptedProduct) {
                this.adaptedProduct = adaptedProduct;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ConfigCode.
             */
            public Builder configCode(String configCode) {
                this.configCode = configCode;
                return this;
            }

            /**
             * ConfigContentType.
             */
            public Builder configContentType(Integer configContentType) {
                this.configContentType = configContentType;
                return this;
            }

            /**
             * ConfigDescription.
             */
            public Builder configDescription(String configDescription) {
                this.configDescription = configDescription;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
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
             * EventHitCount.
             */
            public Builder eventHitCount(Integer eventHitCount) {
                this.eventHitCount = eventHitCount;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public SubTypeList build() {
                return new SubTypeList(this);
            } 

        } 

    }
    public static class EventTypeList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("SubTypeList")
        private java.util.List < SubTypeList> subTypeList;

        private EventTypeList(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.subTypeList = builder.subTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTypeList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subTypeList
         */
        public java.util.List < SubTypeList> getSubTypeList() {
            return this.subTypeList;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private Long id; 
            private String name; 
            private java.util.List < SubTypeList> subTypeList; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SubTypeList.
             */
            public Builder subTypeList(java.util.List < SubTypeList> subTypeList) {
                this.subTypeList = subTypeList;
                return this;
            }

            public EventTypeList build() {
                return new EventTypeList(this);
            } 

        } 

    }
}
