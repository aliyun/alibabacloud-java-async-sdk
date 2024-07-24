// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWarningConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListWarningConfigResponseBody</p>
 */
public class ListWarningConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWarningConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarningConfigResponseBody create() {
        return builder().build();
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public ListWarningConfigResponseBody build() {
            return new ListWarningConfigResponseBody(this);
        } 

    } 

    public static class Channel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Channel(Builder builder) {
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channel create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer type; 
            private String url; 

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List < Channel> channel;

        private Channels(Builder builder) {
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public java.util.List < Channel> getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private java.util.List < Channel> channel; 

            /**
             * Channel.
             */
            public Builder channel(java.util.List < Channel> channel) {
                this.channel = channel;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    public static class RidList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RidList")
        private java.util.List < String > ridList;

        private RidList(Builder builder) {
            this.ridList = builder.ridList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RidList create() {
            return builder().build();
        }

        /**
         * @return ridList
         */
        public java.util.List < String > getRidList() {
            return this.ridList;
        }

        public static final class Builder {
            private java.util.List < String > ridList; 

            /**
             * RidList.
             */
            public Builder ridList(java.util.List < String > ridList) {
                this.ridList = ridList;
                return this;
            }

            public RidList build() {
                return new RidList(this);
            } 

        } 

    }
    public static class WarningRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private WarningRule(Builder builder) {
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningRule create() {
            return builder().build();
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long rid; 
            private String ruleName; 

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public WarningRule build() {
                return new WarningRule(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WarningRule")
        private java.util.List < WarningRule> warningRule;

        private RuleList(Builder builder) {
            this.warningRule = builder.warningRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return warningRule
         */
        public java.util.List < WarningRule> getWarningRule() {
            return this.warningRule;
        }

        public static final class Builder {
            private java.util.List < WarningRule> warningRule; 

            /**
             * WarningRule.
             */
            public Builder warningRule(java.util.List < WarningRule> warningRule) {
                this.warningRule = warningRule;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class WarningConfigInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private Channels channels;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("RidList")
        private RidList ridList;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private RuleList ruleList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private WarningConfigInfo(Builder builder) {
            this.channels = builder.channels;
            this.configId = builder.configId;
            this.configName = builder.configName;
            this.createTime = builder.createTime;
            this.ridList = builder.ridList;
            this.ruleList = builder.ruleList;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningConfigInfo create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public Channels getChannels() {
            return this.channels;
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ridList
         */
        public RidList getRidList() {
            return this.ridList;
        }

        /**
         * @return ruleList
         */
        public RuleList getRuleList() {
            return this.ruleList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Channels channels; 
            private Long configId; 
            private String configName; 
            private String createTime; 
            private RidList ridList; 
            private RuleList ruleList; 
            private Integer status; 
            private String updateTime; 

            /**
             * Channels.
             */
            public Builder channels(Channels channels) {
                this.channels = channels;
                return this;
            }

            /**
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ConfigName.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * RidList.
             */
            public Builder ridList(RidList ridList) {
                this.ridList = ridList;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(RuleList ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public WarningConfigInfo build() {
                return new WarningConfigInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WarningConfigInfo")
        private java.util.List < WarningConfigInfo> warningConfigInfo;

        private Data(Builder builder) {
            this.warningConfigInfo = builder.warningConfigInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return warningConfigInfo
         */
        public java.util.List < WarningConfigInfo> getWarningConfigInfo() {
            return this.warningConfigInfo;
        }

        public static final class Builder {
            private java.util.List < WarningConfigInfo> warningConfigInfo; 

            /**
             * WarningConfigInfo.
             */
            public Builder warningConfigInfo(java.util.List < WarningConfigInfo> warningConfigInfo) {
                this.warningConfigInfo = warningConfigInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
