// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceOrg} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceOrg</p>
 */
public class GrafanaWorkspaceOrg extends TeaModel {
    @NameInMap("id")
    private Long id;

    @NameInMap("name")
    private String name;

    private GrafanaWorkspaceOrg(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceOrg create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private Long id; 
        private String name; 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public GrafanaWorkspaceOrg build() {
            return new GrafanaWorkspaceOrg(this);
        } 

    } 

}
