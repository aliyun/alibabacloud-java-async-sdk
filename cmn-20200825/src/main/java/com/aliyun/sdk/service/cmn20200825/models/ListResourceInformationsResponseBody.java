// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceInformationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceInformationsResponseBody</p>
 */
public class ListResourceInformationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceInformation")
    private java.util.List < ResourceInformation> resourceInformation;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListResourceInformationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceInformation = builder.resourceInformation;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceInformationsResponseBody create() {
        return builder().build();
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
     * @return resourceInformation
     */
    public java.util.List < ResourceInformation> getResourceInformation() {
        return this.resourceInformation;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private java.util.List < ResourceInformation> resourceInformation; 
        private Integer totalCount; 

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
         * ResourceInformation.
         */
        public Builder resourceInformation(java.util.List < ResourceInformation> resourceInformation) {
            this.resourceInformation = resourceInformation;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceInformationsResponseBody build() {
            return new ListResourceInformationsResponseBody(this);
        } 

    } 

    public static class Information extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("KeyAction")
        private String keyAction;

        @NameInMap("KeyAttribute")
        private String keyAttribute;

        @NameInMap("KeyDescription")
        private String keyDescription;

        private Information(Builder builder) {
            this.key = builder.key;
            this.keyAction = builder.keyAction;
            this.keyAttribute = builder.keyAttribute;
            this.keyDescription = builder.keyDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Information create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyAction
         */
        public String getKeyAction() {
            return this.keyAction;
        }

        /**
         * @return keyAttribute
         */
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        /**
         * @return keyDescription
         */
        public String getKeyDescription() {
            return this.keyDescription;
        }

        public static final class Builder {
            private String key; 
            private String keyAction; 
            private String keyAttribute; 
            private String keyDescription; 

            /**
             * 键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 键动作
             */
            public Builder keyAction(String keyAction) {
                this.keyAction = keyAction;
                return this;
            }

            /**
             * 键属性
             */
            public Builder keyAttribute(String keyAttribute) {
                this.keyAttribute = keyAttribute;
                return this;
            }

            /**
             * 键描述
             */
            public Builder keyDescription(String keyDescription) {
                this.keyDescription = keyDescription;
                return this;
            }

            public Information build() {
                return new Information(this);
            } 

        } 

    }
    public static class ResourceInformation extends TeaModel {
        @NameInMap("Information")
        private java.util.List < Information> information;

        @NameInMap("ResourceAttribute")
        private String resourceAttribute;

        @NameInMap("ResourceInformationId")
        private String resourceInformationId;

        @NameInMap("ResourceType")
        private String resourceType;

        private ResourceInformation(Builder builder) {
            this.information = builder.information;
            this.resourceAttribute = builder.resourceAttribute;
            this.resourceInformationId = builder.resourceInformationId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInformation create() {
            return builder().build();
        }

        /**
         * @return information
         */
        public java.util.List < Information> getInformation() {
            return this.information;
        }

        /**
         * @return resourceAttribute
         */
        public String getResourceAttribute() {
            return this.resourceAttribute;
        }

        /**
         * @return resourceInformationId
         */
        public String getResourceInformationId() {
            return this.resourceInformationId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < Information> information; 
            private String resourceAttribute; 
            private String resourceInformationId; 
            private String resourceType; 

            /**
             * 信息
             */
            public Builder information(java.util.List < Information> information) {
                this.information = information;
                return this;
            }

            /**
             * 资源属性
             */
            public Builder resourceAttribute(String resourceAttribute) {
                this.resourceAttribute = resourceAttribute;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder resourceInformationId(String resourceInformationId) {
                this.resourceInformationId = resourceInformationId;
                return this;
            }

            /**
             * 资源类型
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceInformation build() {
                return new ResourceInformation(this);
            } 

        } 

    }
}
