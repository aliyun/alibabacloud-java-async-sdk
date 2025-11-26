// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryNacosGrayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNacosGrayConfigResponseBody</p>
 */
public class QueryNacosGrayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryNacosGrayConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNacosGrayConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryNacosGrayConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNacosGrayConfigResponseBody build() {
            return new QueryNacosGrayConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryNacosGrayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNacosGrayConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("GrayRule")
        private String grayRule;

        @com.aliyun.core.annotation.NameInMap("GrayRuleName")
        private String grayRuleName;

        @com.aliyun.core.annotation.NameInMap("GrayRulePriority")
        private String grayRulePriority;

        @com.aliyun.core.annotation.NameInMap("GrayType")
        private String grayType;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        private Data(Builder builder) {
            this.appName = builder.appName;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.grayRule = builder.grayRule;
            this.grayRuleName = builder.grayRuleName;
            this.grayRulePriority = builder.grayRulePriority;
            this.grayType = builder.grayType;
            this.group = builder.group;
            this.lastModified = builder.lastModified;
            this.md5 = builder.md5;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return grayRule
         */
        public String getGrayRule() {
            return this.grayRule;
        }

        /**
         * @return grayRuleName
         */
        public String getGrayRuleName() {
            return this.grayRuleName;
        }

        /**
         * @return grayRulePriority
         */
        public String getGrayRulePriority() {
            return this.grayRulePriority;
        }

        /**
         * @return grayType
         */
        public String getGrayType() {
            return this.grayType;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        public static final class Builder {
            private String appName; 
            private String content; 
            private String dataId; 
            private String grayRule; 
            private String grayRuleName; 
            private String grayRulePriority; 
            private String grayType; 
            private String group; 
            private String lastModified; 
            private String md5; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appName = model.appName;
                this.content = model.content;
                this.dataId = model.dataId;
                this.grayRule = model.grayRule;
                this.grayRuleName = model.grayRuleName;
                this.grayRulePriority = model.grayRulePriority;
                this.grayType = model.grayType;
                this.group = model.group;
                this.lastModified = model.lastModified;
                this.md5 = model.md5;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * GrayRule.
             */
            public Builder grayRule(String grayRule) {
                this.grayRule = grayRule;
                return this;
            }

            /**
             * GrayRuleName.
             */
            public Builder grayRuleName(String grayRuleName) {
                this.grayRuleName = grayRuleName;
                return this;
            }

            /**
             * GrayRulePriority.
             */
            public Builder grayRulePriority(String grayRulePriority) {
                this.grayRulePriority = grayRulePriority;
                return this;
            }

            /**
             * GrayType.
             */
            public Builder grayType(String grayType) {
                this.grayType = grayType;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
