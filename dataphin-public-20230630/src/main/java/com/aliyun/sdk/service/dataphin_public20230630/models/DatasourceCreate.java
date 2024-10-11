// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DatasourceCreate} extends {@link TeaModel}
 *
 * <p>DatasourceCreate</p>
 */
public class DatasourceCreate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckActivity")
    private Boolean checkActivity;

    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.Map < String, String > configs;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DatasourceCreate(Builder builder) {
        this.checkActivity = builder.checkActivity;
        this.configs = builder.configs;
        this.description = builder.description;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasourceCreate create() {
        return builder().build();
    }

    /**
     * @return checkActivity
     */
    public Boolean getCheckActivity() {
        return this.checkActivity;
    }

    /**
     * @return configs
     */
    public java.util.Map < String, String > getConfigs() {
        return this.configs;
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
        private java.util.Map < String, String > configs; 
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
         * Configs.
         */
        public Builder configs(java.util.Map < String, String > configs) {
            this.configs = configs;
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

        public DatasourceCreate build() {
            return new DatasourceCreate(this);
        } 

    } 

}
