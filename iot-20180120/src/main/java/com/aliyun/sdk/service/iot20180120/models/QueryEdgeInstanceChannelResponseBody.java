// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeInstanceChannelResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceChannelResponseBody</p>
 */
public class QueryEdgeInstanceChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEdgeInstanceChannelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeInstanceChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryEdgeInstanceChannelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeInstanceChannelResponseBody build() {
            return new QueryEdgeInstanceChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeInstanceChannelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceChannelResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Config(Builder builder) {
            this.configId = builder.configId;
            this.content = builder.content;
            this.format = builder.format;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String configId; 
            private String content; 
            private String format; 
            private String key; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.configId = model.configId;
                this.content = model.content;
                this.format = model.format;
                this.key = model.key;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
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
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceChannelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceChannelResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.List<Config> config;

        private ConfigList(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.List<Config> getConfig() {
            return this.config;
        }

        public static final class Builder {
            private java.util.List<Config> config; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.config = model.config;
            } 

            /**
             * Config.
             */
            public Builder config(java.util.List<Config> config) {
                this.config = config;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceChannelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceChannelResponseBody</p>
     */
    public static class Channel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("ConfigList")
        private ConfigList configList;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        private Channel(Builder builder) {
            this.channelId = builder.channelId;
            this.channelName = builder.channelName;
            this.configList = builder.configList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channel create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return configList
         */
        public ConfigList getConfigList() {
            return this.configList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public static final class Builder {
            private String channelId; 
            private String channelName; 
            private ConfigList configList; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModified; 
            private Long gmtModifiedTimestamp; 

            private Builder() {
            } 

            private Builder(Channel model) {
                this.channelId = model.channelId;
                this.channelName = model.channelName;
                this.configList = model.configList;
                this.gmtCreate = model.gmtCreate;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
            } 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * ConfigList.
             */
            public Builder configList(ConfigList configList) {
                this.configList = configList;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceChannelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceChannelResponseBody</p>
     */
    public static class ChannelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List<Channel> channel;

        private ChannelList(Builder builder) {
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelList create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public java.util.List<Channel> getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private java.util.List<Channel> channel; 

            private Builder() {
            } 

            private Builder(ChannelList model) {
                this.channel = model.channel;
            } 

            /**
             * Channel.
             */
            public Builder channel(java.util.List<Channel> channel) {
                this.channel = channel;
                return this;
            }

            public ChannelList build() {
                return new ChannelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceChannelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceChannelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelList")
        private ChannelList channelList;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.channelList = builder.channelList;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelList
         */
        public ChannelList getChannelList() {
            return this.channelList;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private ChannelList channelList; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.channelList = model.channelList;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * ChannelList.
             */
            public Builder channelList(ChannelList channelList) {
                this.channelList = channelList;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
