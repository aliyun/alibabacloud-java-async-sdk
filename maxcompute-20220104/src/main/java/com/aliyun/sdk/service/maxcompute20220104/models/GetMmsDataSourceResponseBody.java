// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetMmsDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsDataSourceResponseBody</p>
 */
public class GetMmsDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsDataSourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsDataSourceResponseBody create() {
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

        private Builder(GetMmsDataSourceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMmsDataSourceResponseBody build() {
            return new GetMmsDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsDataSourceResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enums")
        private java.util.List<String> enums;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("placeHolder")
        private String placeHolder;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("subType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Config(Builder builder) {
            this.desc = builder.desc;
            this.enums = builder.enums;
            this.group = builder.group;
            this.key = builder.key;
            this.name = builder.name;
            this.placeHolder = builder.placeHolder;
            this.required = builder.required;
            this.subType = builder.subType;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enums
         */
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return placeHolder
         */
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<String> enums; 
            private String group; 
            private String key; 
            private String name; 
            private String placeHolder; 
            private Boolean required; 
            private String subType; 
            private String type; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.desc = model.desc;
                this.enums = model.enums;
                this.group = model.group;
                this.key = model.key;
                this.name = model.name;
                this.placeHolder = model.placeHolder;
                this.required = model.required;
                this.subType = model.subType;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * enums.
             */
            public Builder enums(java.util.List<String> enums) {
                this.enums = enums;
                return this;
            }

            /**
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * placeHolder.
             */
            public Builder placeHolder(String placeHolder) {
                this.placeHolder = placeHolder;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * subType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMmsDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsDataSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentIsOnline")
        private Boolean agentIsOnline;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.List<Config> config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbNum")
        private Integer dbNum;

        @com.aliyun.core.annotation.NameInMap("errMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastUpdateTime")
        private String lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networklink")
        private String networklink;

        @com.aliyun.core.annotation.NameInMap("partitionNum")
        private Integer partitionNum;

        @com.aliyun.core.annotation.NameInMap("partitionsDoingNum")
        private Integer partitionsDoingNum;

        @com.aliyun.core.annotation.NameInMap("partitionsDoneNum")
        private Integer partitionsDoneNum;

        @com.aliyun.core.annotation.NameInMap("partitionsFailedNum")
        private Integer partitionsFailedNum;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("scanId")
        private Long scanId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tableNum")
        private Integer tableNum;

        @com.aliyun.core.annotation.NameInMap("tablesDoingNum")
        private Integer tablesDoingNum;

        @com.aliyun.core.annotation.NameInMap("tablesDoneNum")
        private Integer tablesDoneNum;

        @com.aliyun.core.annotation.NameInMap("tablesFailedNum")
        private Integer tablesFailedNum;

        @com.aliyun.core.annotation.NameInMap("tablesPartDoneNum")
        private Integer tablesPartDoneNum;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Data(Builder builder) {
            this.agentIsOnline = builder.agentIsOnline;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dbNum = builder.dbNum;
            this.errMsg = builder.errMsg;
            this.id = builder.id;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.name = builder.name;
            this.networklink = builder.networklink;
            this.partitionNum = builder.partitionNum;
            this.partitionsDoingNum = builder.partitionsDoingNum;
            this.partitionsDoneNum = builder.partitionsDoneNum;
            this.partitionsFailedNum = builder.partitionsFailedNum;
            this.region = builder.region;
            this.scanId = builder.scanId;
            this.status = builder.status;
            this.tableNum = builder.tableNum;
            this.tablesDoingNum = builder.tablesDoingNum;
            this.tablesDoneNum = builder.tablesDoneNum;
            this.tablesFailedNum = builder.tablesFailedNum;
            this.tablesPartDoneNum = builder.tablesPartDoneNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentIsOnline
         */
        public Boolean getAgentIsOnline() {
            return this.agentIsOnline;
        }

        /**
         * @return config
         */
        public java.util.List<Config> getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbNum
         */
        public Integer getDbNum() {
            return this.dbNum;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastUpdateTime
         */
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networklink
         */
        public String getNetworklink() {
            return this.networklink;
        }

        /**
         * @return partitionNum
         */
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        /**
         * @return partitionsDoingNum
         */
        public Integer getPartitionsDoingNum() {
            return this.partitionsDoingNum;
        }

        /**
         * @return partitionsDoneNum
         */
        public Integer getPartitionsDoneNum() {
            return this.partitionsDoneNum;
        }

        /**
         * @return partitionsFailedNum
         */
        public Integer getPartitionsFailedNum() {
            return this.partitionsFailedNum;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return scanId
         */
        public Long getScanId() {
            return this.scanId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableNum
         */
        public Integer getTableNum() {
            return this.tableNum;
        }

        /**
         * @return tablesDoingNum
         */
        public Integer getTablesDoingNum() {
            return this.tablesDoingNum;
        }

        /**
         * @return tablesDoneNum
         */
        public Integer getTablesDoneNum() {
            return this.tablesDoneNum;
        }

        /**
         * @return tablesFailedNum
         */
        public Integer getTablesFailedNum() {
            return this.tablesFailedNum;
        }

        /**
         * @return tablesPartDoneNum
         */
        public Integer getTablesPartDoneNum() {
            return this.tablesPartDoneNum;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean agentIsOnline; 
            private java.util.List<Config> config; 
            private String createTime; 
            private Integer dbNum; 
            private String errMsg; 
            private Long id; 
            private String lastUpdateTime; 
            private String name; 
            private String networklink; 
            private Integer partitionNum; 
            private Integer partitionsDoingNum; 
            private Integer partitionsDoneNum; 
            private Integer partitionsFailedNum; 
            private String region; 
            private Long scanId; 
            private String status; 
            private Integer tableNum; 
            private Integer tablesDoingNum; 
            private Integer tablesDoneNum; 
            private Integer tablesFailedNum; 
            private Integer tablesPartDoneNum; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentIsOnline = model.agentIsOnline;
                this.config = model.config;
                this.createTime = model.createTime;
                this.dbNum = model.dbNum;
                this.errMsg = model.errMsg;
                this.id = model.id;
                this.lastUpdateTime = model.lastUpdateTime;
                this.name = model.name;
                this.networklink = model.networklink;
                this.partitionNum = model.partitionNum;
                this.partitionsDoingNum = model.partitionsDoingNum;
                this.partitionsDoneNum = model.partitionsDoneNum;
                this.partitionsFailedNum = model.partitionsFailedNum;
                this.region = model.region;
                this.scanId = model.scanId;
                this.status = model.status;
                this.tableNum = model.tableNum;
                this.tablesDoingNum = model.tablesDoingNum;
                this.tablesDoneNum = model.tablesDoneNum;
                this.tablesFailedNum = model.tablesFailedNum;
                this.tablesPartDoneNum = model.tablesPartDoneNum;
                this.type = model.type;
            } 

            /**
             * agentIsOnline.
             */
            public Builder agentIsOnline(Boolean agentIsOnline) {
                this.agentIsOnline = agentIsOnline;
                return this;
            }

            /**
             * config.
             */
            public Builder config(java.util.List<Config> config) {
                this.config = config;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dbNum.
             */
            public Builder dbNum(Integer dbNum) {
                this.dbNum = dbNum;
                return this;
            }

            /**
             * errMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastUpdateTime.
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networklink.
             */
            public Builder networklink(String networklink) {
                this.networklink = networklink;
                return this;
            }

            /**
             * partitionNum.
             */
            public Builder partitionNum(Integer partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * partitionsDoingNum.
             */
            public Builder partitionsDoingNum(Integer partitionsDoingNum) {
                this.partitionsDoingNum = partitionsDoingNum;
                return this;
            }

            /**
             * partitionsDoneNum.
             */
            public Builder partitionsDoneNum(Integer partitionsDoneNum) {
                this.partitionsDoneNum = partitionsDoneNum;
                return this;
            }

            /**
             * partitionsFailedNum.
             */
            public Builder partitionsFailedNum(Integer partitionsFailedNum) {
                this.partitionsFailedNum = partitionsFailedNum;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * scanId.
             */
            public Builder scanId(Long scanId) {
                this.scanId = scanId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tableNum.
             */
            public Builder tableNum(Integer tableNum) {
                this.tableNum = tableNum;
                return this;
            }

            /**
             * tablesDoingNum.
             */
            public Builder tablesDoingNum(Integer tablesDoingNum) {
                this.tablesDoingNum = tablesDoingNum;
                return this;
            }

            /**
             * tablesDoneNum.
             */
            public Builder tablesDoneNum(Integer tablesDoneNum) {
                this.tablesDoneNum = tablesDoneNum;
                return this;
            }

            /**
             * tablesFailedNum.
             */
            public Builder tablesFailedNum(Integer tablesFailedNum) {
                this.tablesFailedNum = tablesFailedNum;
                return this;
            }

            /**
             * tablesPartDoneNum.
             */
            public Builder tablesPartDoneNum(Integer tablesPartDoneNum) {
                this.tablesPartDoneNum = tablesPartDoneNum;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
