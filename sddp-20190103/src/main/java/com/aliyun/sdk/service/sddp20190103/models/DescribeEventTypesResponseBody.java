// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventTypesResponseBody</p>
 */
public class DescribeEventTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventTypeList")
    private java.util.List < EventTypeList> eventTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of the types of anomalous events.</p>
         * <blockquote>
         * <p>If you leave the ParentTypeId parameter empty, anomalous event types are returned. If you set the ParentTypeId parameter, anomalous event subtypes under the specified anomalous event type are returned.</p>
         * </blockquote>
         */
        public Builder eventTypeList(java.util.List < EventTypeList> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEventTypesResponseBody build() {
            return new DescribeEventTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventTypesResponseBody</p>
     */
    public static class SubTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdaptedProduct")
        private String adaptedProduct;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConfigCode")
        private String configCode;

        @com.aliyun.core.annotation.NameInMap("ConfigContentType")
        private Integer configContentType;

        @com.aliyun.core.annotation.NameInMap("ConfigDescription")
        private String configDescription;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventHitCount")
        private Integer eventHitCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The service to which the anomalous event detection rule applies. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder adaptedProduct(String adaptedProduct) {
                this.adaptedProduct = adaptedProduct;
                return this;
            }

            /**
             * <p>The code of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>020008</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The code of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>0100**</p>
             */
            public Builder configCode(String configCode) {
                this.configCode = configCode;
                return this;
            }

            /**
             * <p>The content format of anomalous event detection rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: numeric values such as thresholds</li>
             * <li><strong>1</strong>: text such as IP addresses</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configContentType(Integer configContentType) {
                this.configContentType = configContentType;
                return this;
            }

            /**
             * <p>The description of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>The period of time for which the permission is not used exceeds the threshold. The specified threshold is ${value} calendar days.</p>
             */
            public Builder configDescription(String configDescription) {
                this.configDescription = configDescription;
                return this;
            }

            /**
             * <p>The value of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * <p>The description of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Inappropriate configuration-No protection for the MaxCompute sensitive project, ****</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of times that the anomalous event hits the anomalous event detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder eventHitCount(Integer eventHitCount) {
                this.eventHitCount = eventHitCount;
                return this;
            }

            /**
             * <p>The ID of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the anomalous event subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Inappropriate configuration-No protection for the MaxCompute sensitive project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether detection is enabled for the anomalous event subtype. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeEventTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventTypesResponseBody</p>
     */
    public static class EventTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SubTypeList")
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
             * <p>The code of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>01</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomalous permission usage,****</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the anomalous event type.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomalous permission usage</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>An array that consists of anomalous event subtypes.</p>
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
