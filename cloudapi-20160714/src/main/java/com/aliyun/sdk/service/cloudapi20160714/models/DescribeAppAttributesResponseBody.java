// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppAttributesResponseBody</p>
 */
public class DescribeAppAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apps")
    private Apps apps;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAppAttributesResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return apps
     */
    public Apps getApps() {
        return this.apps;
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
        private Apps apps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The returned app information. It is an array that consists of AppAttribute data.</p>
         */
        public Builder apps(Apps apps) {
            this.apps = apps;
            return this;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8883AC74-259D-4C0B-99FC-0B7F9A588B2F</p>
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

        public DescribeAppAttributesResponseBody build() {
            return new DescribeAppAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAttributesResponseBody</p>
     */
    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>appid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link DescribeAppAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAttributesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
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
    /**
     * 
     * {@link DescribeAppAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAttributesResponseBody</p>
     */
    public static class AppAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private AppAttribute(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.extend = builder.extend;
            this.modifiedTime = builder.modifiedTime;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppAttribute create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
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
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String createdTime; 
            private String description; 
            private String extend; 
            private String modifiedTime; 
            private Tags tags; 

            /**
             * <p>The ID of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>20112314518278</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateApptest</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The creation time (UTC) of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-31T04:10:19Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The description of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>App test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>扩展信息</p>
             * 
             * <strong>example:</strong>
             * <p>110461946884</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The modification time (UTC) of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-31T04:10:19Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public AppAttribute build() {
                return new AppAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppAttributesResponseBody</p>
     */
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppAttribute")
        private java.util.List < AppAttribute> appAttribute;

        private Apps(Builder builder) {
            this.appAttribute = builder.appAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return appAttribute
         */
        public java.util.List < AppAttribute> getAppAttribute() {
            return this.appAttribute;
        }

        public static final class Builder {
            private java.util.List < AppAttribute> appAttribute; 

            /**
             * AppAttribute.
             */
            public Builder appAttribute(java.util.List < AppAttribute> appAttribute) {
                this.appAttribute = appAttribute;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
}
