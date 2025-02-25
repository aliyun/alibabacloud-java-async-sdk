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
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CreateCommand.
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class ConfigItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class DataSourceCreate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckActivity")
        private Boolean checkActivity;

        @com.aliyun.core.annotation.NameInMap("ConfigItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ConfigItemList> configItemList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSourceCreate(Builder builder) {
            this.checkActivity = builder.checkActivity;
            this.configItemList = builder.configItemList;
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceCreate create() {
            return builder().build();
        }

        /**
         * @return checkActivity
         */
        public Boolean getCheckActivity() {
            return this.checkActivity;
        }

        /**
         * @return configItemList
         */
        public java.util.List<ConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean checkActivity; 
            private java.util.List<ConfigItemList> configItemList; 
            private String description; 
            private String name; 
            private String type; 

            /**
             * CheckActivity.
             */
            public Builder checkActivity(Boolean checkActivity) {
                this.checkActivity = checkActivity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder configItemList(java.util.List<ConfigItemList> configItemList) {
                this.configItemList = configItemList;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSourceCreate build() {
                return new DataSourceCreate(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class DevDataSourceCreate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceCreate")
        private DataSourceCreate dataSourceCreate;

        @com.aliyun.core.annotation.NameInMap("ProdDataSourceId")
        private Long prodDataSourceId;

        private DevDataSourceCreate(Builder builder) {
            this.dataSourceCreate = builder.dataSourceCreate;
            this.prodDataSourceId = builder.prodDataSourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevDataSourceCreate create() {
            return builder().build();
        }

        /**
         * @return dataSourceCreate
         */
        public DataSourceCreate getDataSourceCreate() {
            return this.dataSourceCreate;
        }

        /**
         * @return prodDataSourceId
         */
        public Long getProdDataSourceId() {
            return this.prodDataSourceId;
        }

        public static final class Builder {
            private DataSourceCreate dataSourceCreate; 
            private Long prodDataSourceId; 

            /**
             * <p>数据源创建结构体</p>
             */
            public Builder dataSourceCreate(DataSourceCreate dataSourceCreate) {
                this.dataSourceCreate = dataSourceCreate;
                return this;
            }

            /**
             * ProdDataSourceId.
             */
            public Builder prodDataSourceId(Long prodDataSourceId) {
                this.prodDataSourceId = prodDataSourceId;
                return this;
            }

            public DevDataSourceCreate build() {
                return new DevDataSourceCreate(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class ProdDataSourceCreateConfigItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private ProdDataSourceCreateConfigItemList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProdDataSourceCreateConfigItemList create() {
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ProdDataSourceCreateConfigItemList build() {
                return new ProdDataSourceCreateConfigItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class ProdDataSourceCreate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckActivity")
        private Boolean checkActivity;

        @com.aliyun.core.annotation.NameInMap("ConfigItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ProdDataSourceCreateConfigItemList> configItemList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProdDataSourceCreate(Builder builder) {
            this.checkActivity = builder.checkActivity;
            this.configItemList = builder.configItemList;
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProdDataSourceCreate create() {
            return builder().build();
        }

        /**
         * @return checkActivity
         */
        public Boolean getCheckActivity() {
            return this.checkActivity;
        }

        /**
         * @return configItemList
         */
        public java.util.List<ProdDataSourceCreateConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean checkActivity; 
            private java.util.List<ProdDataSourceCreateConfigItemList> configItemList; 
            private String description; 
            private String name; 
            private String type; 

            /**
             * CheckActivity.
             */
            public Builder checkActivity(Boolean checkActivity) {
                this.checkActivity = checkActivity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder configItemList(java.util.List<ProdDataSourceCreateConfigItemList> configItemList) {
                this.configItemList = configItemList;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProdDataSourceCreate build() {
                return new ProdDataSourceCreate(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSourceRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevDataSourceCreate")
        private DevDataSourceCreate devDataSourceCreate;

        @com.aliyun.core.annotation.NameInMap("ProdDataSourceCreate")
        private ProdDataSourceCreate prodDataSourceCreate;

        private CreateCommand(Builder builder) {
            this.devDataSourceCreate = builder.devDataSourceCreate;
            this.prodDataSourceCreate = builder.prodDataSourceCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return devDataSourceCreate
         */
        public DevDataSourceCreate getDevDataSourceCreate() {
            return this.devDataSourceCreate;
        }

        /**
         * @return prodDataSourceCreate
         */
        public ProdDataSourceCreate getProdDataSourceCreate() {
            return this.prodDataSourceCreate;
        }

        public static final class Builder {
            private DevDataSourceCreate devDataSourceCreate; 
            private ProdDataSourceCreate prodDataSourceCreate; 

            /**
             * DevDataSourceCreate.
             */
            public Builder devDataSourceCreate(DevDataSourceCreate devDataSourceCreate) {
                this.devDataSourceCreate = devDataSourceCreate;
                return this;
            }

            /**
             * <p>数据源创建结构体</p>
             */
            public Builder prodDataSourceCreate(ProdDataSourceCreate prodDataSourceCreate) {
                this.prodDataSourceCreate = prodDataSourceCreate;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
