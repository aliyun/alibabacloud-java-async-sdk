// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RoleInput} extends {@link TeaModel}
 *
 * <p>RoleInput</p>
 */
public class RoleInput extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Name")
    private String name;

    private RoleInput(Builder builder) {
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoleInput create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String description; 
        private String displayName; 
        private String name; 

        /**
         * 角色描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public RoleInput build() {
            return new RoleInput(this);
        } 

    } 

}
