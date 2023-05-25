// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginsResponseBody</p>
 */
public class DescribePluginsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Plugins")
    private Plugins plugins;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePluginsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.plugins = builder.plugins;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginsResponseBody create() {
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Plugins.
         */
        public Builder plugins(Plugins plugins) {
            this.plugins = plugins;
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

        public DescribePluginsResponseBody build() {
            return new DescribePluginsResponseBody(this);
        } 

    } 

    public static class TagInfo extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("TagInfo")
        private java.util.List < TagInfo> tagInfo;

        private Tags(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List < TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List < TagInfo> tagInfo; 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class PluginAttribute extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PluginData")
        private String pluginData;

        @NameInMap("PluginId")
        private String pluginId;

        @NameInMap("PluginName")
        private String pluginName;

        @NameInMap("PluginType")
        private String pluginType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Tags")
        private Tags tags;

        private PluginAttribute(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.modifiedTime = builder.modifiedTime;
            this.pluginData = builder.pluginData;
            this.pluginId = builder.pluginId;
            this.pluginName = builder.pluginName;
            this.pluginType = builder.pluginType;
            this.regionId = builder.regionId;
            this.tags = builder.tags;
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

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private Tags tags; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PluginData.
             */
            public Builder pluginData(String pluginData) {
                this.pluginData = pluginData;
                return this;
            }

            /**
             * PluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * PluginName.
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * PluginType.
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public PluginAttribute build() {
                return new PluginAttribute(this);
            } 

        } 

    }
    public static class Plugins extends TeaModel {
        @NameInMap("PluginAttribute")
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
