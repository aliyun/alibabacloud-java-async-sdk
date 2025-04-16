// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceWithConfigResponseBody</p>
 */
public class ListDataSourceWithConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataSourceWithConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceWithConfigResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataSourceWithConfigResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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

        public ListDataSourceWithConfigResponseBody build() {
            return new ListDataSourceWithConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceWithConfigResponseBody</p>
     */
    public static class ConfigItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConfigItemList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigItemList create() {
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

            private Builder() {
            } 

            private Builder(ConfigItemList model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public ConfigItemList build() {
                return new ConfigItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceWithConfigResponseBody</p>
     */
    public static class DevDataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigItemList")
        private java.util.List<ConfigItemList> configItemList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DevDataSourceInfo(Builder builder) {
            this.configItemList = builder.configItemList;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.env = builder.env;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.scope = builder.scope;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevDataSourceInfo create() {
            return builder().build();
        }

        /**
         * @return configItemList
         */
        public java.util.List<ConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<ConfigItemList> configItemList; 
            private Long createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private String env; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private String scope; 
            private String type; 

            private Builder() {
            } 

            private Builder(DevDataSourceInfo model) {
                this.configItemList = model.configItemList;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.env = model.env;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.scope = model.scope;
                this.type = model.type;
            } 

            /**
             * ConfigItemList.
             */
            public Builder configItemList(java.util.List<ConfigItemList> configItemList) {
                this.configItemList = configItemList;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DevDataSourceInfo build() {
                return new DevDataSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceWithConfigResponseBody</p>
     */
    public static class ProdDataSourceInfoConfigItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ProdDataSourceInfoConfigItemList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProdDataSourceInfoConfigItemList create() {
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

            private Builder() {
            } 

            private Builder(ProdDataSourceInfoConfigItemList model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public ProdDataSourceInfoConfigItemList build() {
                return new ProdDataSourceInfoConfigItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceWithConfigResponseBody</p>
     */
    public static class ProdDataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigItemList")
        private java.util.List<ProdDataSourceInfoConfigItemList> configItemList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProdDataSourceInfo(Builder builder) {
            this.configItemList = builder.configItemList;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.env = builder.env;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.scope = builder.scope;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProdDataSourceInfo create() {
            return builder().build();
        }

        /**
         * @return configItemList
         */
        public java.util.List<ProdDataSourceInfoConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<ProdDataSourceInfoConfigItemList> configItemList; 
            private Long createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private String env; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private String scope; 
            private String type; 

            private Builder() {
            } 

            private Builder(ProdDataSourceInfo model) {
                this.configItemList = model.configItemList;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.env = model.env;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.scope = model.scope;
                this.type = model.type;
            } 

            /**
             * ConfigItemList.
             */
            public Builder configItemList(java.util.List<ProdDataSourceInfoConfigItemList> configItemList) {
                this.configItemList = configItemList;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProdDataSourceInfo build() {
                return new ProdDataSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceWithConfigResponseBody</p>
     */
    public static class DataSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevDataSourceInfo")
        private DevDataSourceInfo devDataSourceInfo;

        @com.aliyun.core.annotation.NameInMap("ProdDataSourceInfo")
        private ProdDataSourceInfo prodDataSourceInfo;

        private DataSourceList(Builder builder) {
            this.devDataSourceInfo = builder.devDataSourceInfo;
            this.prodDataSourceInfo = builder.prodDataSourceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceList create() {
            return builder().build();
        }

        /**
         * @return devDataSourceInfo
         */
        public DevDataSourceInfo getDevDataSourceInfo() {
            return this.devDataSourceInfo;
        }

        /**
         * @return prodDataSourceInfo
         */
        public ProdDataSourceInfo getProdDataSourceInfo() {
            return this.prodDataSourceInfo;
        }

        public static final class Builder {
            private DevDataSourceInfo devDataSourceInfo; 
            private ProdDataSourceInfo prodDataSourceInfo; 

            private Builder() {
            } 

            private Builder(DataSourceList model) {
                this.devDataSourceInfo = model.devDataSourceInfo;
                this.prodDataSourceInfo = model.prodDataSourceInfo;
            } 

            /**
             * <p>开发环境数据源信息</p>
             */
            public Builder devDataSourceInfo(DevDataSourceInfo devDataSourceInfo) {
                this.devDataSourceInfo = devDataSourceInfo;
                return this;
            }

            /**
             * <p>生产环境数据源</p>
             */
            public Builder prodDataSourceInfo(ProdDataSourceInfo prodDataSourceInfo) {
                this.prodDataSourceInfo = prodDataSourceInfo;
                return this;
            }

            public DataSourceList build() {
                return new DataSourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataSourceWithConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceWithConfigResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceList")
        private java.util.List<DataSourceList> dataSourceList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.dataSourceList = builder.dataSourceList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return dataSourceList
         */
        public java.util.List<DataSourceList> getDataSourceList() {
            return this.dataSourceList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DataSourceList> dataSourceList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.dataSourceList = model.dataSourceList;
                this.totalCount = model.totalCount;
            } 

            /**
             * DataSourceList.
             */
            public Builder dataSourceList(java.util.List<DataSourceList> dataSourceList) {
                this.dataSourceList = dataSourceList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
