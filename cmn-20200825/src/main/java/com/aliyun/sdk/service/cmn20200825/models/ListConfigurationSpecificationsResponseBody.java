// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigurationSpecificationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigurationSpecificationsResponseBody</p>
 */
public class ListConfigurationSpecificationsResponseBody extends TeaModel {
    @NameInMap("ConfigurationSpecification")
    private java.util.List < ConfigurationSpecification> configurationSpecification;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListConfigurationSpecificationsResponseBody(Builder builder) {
        this.configurationSpecification = builder.configurationSpecification;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigurationSpecificationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configurationSpecification
     */
    public java.util.List < ConfigurationSpecification> getConfigurationSpecification() {
        return this.configurationSpecification;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ConfigurationSpecification> configurationSpecification; 
        private Long maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConfigurationSpecification.
         */
        public Builder configurationSpecification(java.util.List < ConfigurationSpecification> configurationSpecification) {
            this.configurationSpecification = configurationSpecification;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConfigurationSpecificationsResponseBody build() {
            return new ListConfigurationSpecificationsResponseBody(this);
        } 

    } 

    public static class ConfigurationSpecification extends TeaModel {
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("ConfigurationSpecificationId")
        private String configurationSpecificationId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Model")
        private String model;

        @NameInMap("RelatedVariate")
        private java.util.List < String > relatedVariate;

        @NameInMap("Role")
        private String role;

        @NameInMap("SpecificationContent")
        private String specificationContent;

        @NameInMap("SpecificationName")
        private String specificationName;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Vendor")
        private String vendor;

        private ConfigurationSpecification(Builder builder) {
            this.architecture = builder.architecture;
            this.configurationSpecificationId = builder.configurationSpecificationId;
            this.createTime = builder.createTime;
            this.model = builder.model;
            this.relatedVariate = builder.relatedVariate;
            this.role = builder.role;
            this.specificationContent = builder.specificationContent;
            this.specificationName = builder.specificationName;
            this.updateTime = builder.updateTime;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationSpecification create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return configurationSpecificationId
         */
        public String getConfigurationSpecificationId() {
            return this.configurationSpecificationId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return relatedVariate
         */
        public java.util.List < String > getRelatedVariate() {
            return this.relatedVariate;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return specificationContent
         */
        public String getSpecificationContent() {
            return this.specificationContent;
        }

        /**
         * @return specificationName
         */
        public String getSpecificationName() {
            return this.specificationName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String architecture; 
            private String configurationSpecificationId; 
            private String createTime; 
            private String model; 
            private java.util.List < String > relatedVariate; 
            private String role; 
            private String specificationContent; 
            private String specificationName; 
            private String updateTime; 
            private String vendor; 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * ConfigurationSpecificationId.
             */
            public Builder configurationSpecificationId(String configurationSpecificationId) {
                this.configurationSpecificationId = configurationSpecificationId;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * RelatedVariate.
             */
            public Builder relatedVariate(java.util.List < String > relatedVariate) {
                this.relatedVariate = relatedVariate;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SpecificationContent.
             */
            public Builder specificationContent(String specificationContent) {
                this.specificationContent = specificationContent;
                return this;
            }

            /**
             * SpecificationName.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public ConfigurationSpecification build() {
                return new ConfigurationSpecification(this);
            } 

        } 

    }
}
