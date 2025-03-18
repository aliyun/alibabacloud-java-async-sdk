// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePluginsByApiResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.plugins = model.plugins;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The plug-in information. The information is an array that consists of PluginAttribute data.</p>
         */
        public Builder plugins(Plugins plugins) {
            this.plugins = plugins;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>46373DC4-19F1-4DC8-8C31-1107289BB5E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePluginsByApiResponseBody build() {
            return new DescribePluginsByApiResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePluginsByApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginsByApiResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PluginAttribute model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.modifiedTime = model.modifiedTime;
                this.pluginData = model.pluginData;
                this.pluginId = model.pluginId;
                this.pluginName = model.pluginName;
                this.pluginType = model.pluginType;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The time when the plug-in was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-11T09:29:58Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The plug-in description.</p>
             * 
             * <strong>example:</strong>
             * <p>Traffic throttling</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the plug-in was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-11T09:29:58Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The definition statement of the plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;unit&quot;:&quot;MINUTE&quot;,&quot;apiDefault&quot;:20}</p>
             */
            public Builder pluginData(String pluginData) {
                this.pluginData = pluginData;
                return this;
            }

            /**
             * <p>The plug-in ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9a3f1a5279434f2ba74ccd91c295af9f</p>
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * <p>The plug-in name.</p>
             * 
             * <strong>example:</strong>
             * <p>firstPlugin</p>
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * <p>The plug-in type.</p>
             * 
             * <strong>example:</strong>
             * <p>trafficControl</p>
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * <p>The region where the plug-in resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
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
    /**
     * 
     * {@link DescribePluginsByApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginsByApiResponseBody</p>
     */
    public static class Plugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PluginAttribute")
        private java.util.List<PluginAttribute> pluginAttribute;

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
        public java.util.List<PluginAttribute> getPluginAttribute() {
            return this.pluginAttribute;
        }

        public static final class Builder {
            private java.util.List<PluginAttribute> pluginAttribute; 

            private Builder() {
            } 

            private Builder(Plugins model) {
                this.pluginAttribute = model.pluginAttribute;
            } 

            /**
             * PluginAttribute.
             */
            public Builder pluginAttribute(java.util.List<PluginAttribute> pluginAttribute) {
                this.pluginAttribute = pluginAttribute;
                return this;
            }

            public Plugins build() {
                return new Plugins(this);
            } 

        } 

    }
}
