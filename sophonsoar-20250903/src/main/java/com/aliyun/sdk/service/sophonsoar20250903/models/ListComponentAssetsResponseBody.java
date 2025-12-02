// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link ListComponentAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentAssetsResponseBody</p>
 */
public class ListComponentAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentAssets")
    private java.util.List<ComponentAssets> componentAssets;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListComponentAssetsResponseBody(Builder builder) {
        this.componentAssets = builder.componentAssets;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentAssetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentAssets
     */
    public java.util.List<ComponentAssets> getComponentAssets() {
        return this.componentAssets;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ComponentAssets> componentAssets; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListComponentAssetsResponseBody model) {
            this.componentAssets = model.componentAssets;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>List of assets.</p>
         */
        public Builder componentAssets(java.util.List<ComponentAssets> componentAssets) {
            this.componentAssets = componentAssets;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Range: 0~100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJxdW90YUFjdGlvbkNvZGUiOiJmX2hoODNybiJ9</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Page number for paginated queries, with a default value of 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of items to return per page. Range: 1~100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier generated by Alibaba Cloud for this request, which can be used for troubleshooting and issue localization.</p>
         * 
         * <strong>example:</strong>
         * <p>0727DAC8-<strong><strong>-51EC-</strong></strong>-14999C62B502</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of queried items.</p>
         * 
         * <strong>example:</strong>
         * <p>824</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListComponentAssetsResponseBody build() {
            return new ListComponentAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComponentAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListComponentAssetsResponseBody</p>
     */
    public static class ComponentAssetValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        private ComponentAssetValues(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentAssetValues create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 

            private Builder() {
            } 

            private Builder(ComponentAssetValues model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
            } 

            /**
             * <p>Field name.</p>
             * 
             * <strong>example:</strong>
             * <p>lh_source</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Field value.</p>
             * 
             * <strong>example:</strong>
             * <p>device</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public ComponentAssetValues build() {
                return new ComponentAssetValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComponentAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListComponentAssetsResponseBody</p>
     */
    public static class ComponentAssets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentAssetName")
        private String componentAssetName;

        @com.aliyun.core.annotation.NameInMap("ComponentAssetUuid")
        private String componentAssetUuid;

        @com.aliyun.core.annotation.NameInMap("ComponentAssetValues")
        private java.util.List<ComponentAssetValues> componentAssetValues;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ComponentAssets(Builder builder) {
            this.componentAssetName = builder.componentAssetName;
            this.componentAssetUuid = builder.componentAssetUuid;
            this.componentAssetValues = builder.componentAssetValues;
            this.componentName = builder.componentName;
            this.createTime = builder.createTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentAssets create() {
            return builder().build();
        }

        /**
         * @return componentAssetName
         */
        public String getComponentAssetName() {
            return this.componentAssetName;
        }

        /**
         * @return componentAssetUuid
         */
        public String getComponentAssetUuid() {
            return this.componentAssetUuid;
        }

        /**
         * @return componentAssetValues
         */
        public java.util.List<ComponentAssetValues> getComponentAssetValues() {
            return this.componentAssetValues;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String componentAssetName; 
            private String componentAssetUuid; 
            private java.util.List<ComponentAssetValues> componentAssetValues; 
            private String componentName; 
            private Long createTime; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ComponentAssets model) {
                this.componentAssetName = model.componentAssetName;
                this.componentAssetUuid = model.componentAssetUuid;
                this.componentAssetValues = model.componentAssetValues;
                this.componentName = model.componentName;
                this.createTime = model.createTime;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Asset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder componentAssetName(String componentAssetName) {
                this.componentAssetName = componentAssetName;
                return this;
            }

            /**
             * <p>Asset UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
             */
            public Builder componentAssetUuid(String componentAssetUuid) {
                this.componentAssetUuid = componentAssetUuid;
                return this;
            }

            /**
             * <p>Configuration information of the asset.</p>
             */
            public Builder componentAssetValues(java.util.List<ComponentAssetValues> componentAssetValues) {
                this.componentAssetValues = componentAssetValues;
                return this;
            }

            /**
             * <p>The name of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>SLS</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1744078554000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1744078554000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ComponentAssets build() {
                return new ComponentAssets(this);
            } 

        } 

    }
}
