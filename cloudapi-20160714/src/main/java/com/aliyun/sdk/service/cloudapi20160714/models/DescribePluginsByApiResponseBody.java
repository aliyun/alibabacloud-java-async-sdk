// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginsByApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginsByApiResponseBody</p>
 */
public class DescribePluginsByApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Plugins")
    private Plugins plugins;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePluginsByApiResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.plugins = builder.plugins;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginsByApiResponseBody create() {
        return builder().build();
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
     * @return plugins
     */
    public Plugins getPlugins() {
        return this.plugins;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private Plugins plugins; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The plug-in information. The information is an array that consists of PluginAttribute data.
         */
        public Builder plugins(Plugins plugins) {
            this.plugins = plugins;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePluginsByApiResponseBody build() {
            return new DescribePluginsByApiResponseBody(this);
        } 

    } 

    public static class PluginAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PluginData")
        private String pluginData;

        @com.aliyun.core.annotation.NameInMap("PluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("PluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("PluginType")
        private String pluginType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private PluginAttribute(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
            this.pluginData = builder.pluginData;
            this.pluginId = builder.pluginId;
            this.pluginName = builder.pluginName;
            this.pluginType = builder.pluginType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginAttribute create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return pluginData
         */
        public String getPluginData() {
            return this.pluginData;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return pluginType
         */
        public String getPluginType() {
            return this.pluginType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String modifiedTime; 
            private String pluginData; 
            private String pluginId; 
            private String pluginName; 
            private String pluginType; 
            private String regionId; 

            /**
             * The time when the plug-in was created. The time is displayed in UTC.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The plug-in description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the plug-in was last modified. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The definition statement of the plug-in.
             */
            public Builder pluginData(String pluginData) {
                this.pluginData = pluginData;
                return this;
            }

            /**
             * The plug-in ID.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * The plug-in name.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * The plug-in type.
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * The region where the plug-in resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public PluginAttribute build() {
                return new PluginAttribute(this);
            } 

        } 

    }
    public static class Plugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PluginAttribute")
        private java.util.List < PluginAttribute> pluginAttribute;

        private Plugins(Builder builder) {
            this.pluginAttribute = builder.pluginAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plugins create() {
            return builder().build();
        }

        /**
         * @return pluginAttribute
         */
        public java.util.List < PluginAttribute> getPluginAttribute() {
            return this.pluginAttribute;
        }

        public static final class Builder {
            private java.util.List < PluginAttribute> pluginAttribute; 

            /**
             * PluginAttribute.
             */
            public Builder pluginAttribute(java.util.List < PluginAttribute> pluginAttribute) {
                this.pluginAttribute = pluginAttribute;
                return this;
            }

            public Plugins build() {
                return new Plugins(this);
            } 

        } 

    }
}
