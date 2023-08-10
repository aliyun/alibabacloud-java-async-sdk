// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ABTestGroup} extends {@link TeaModel}
 *
 * <p>ABTestGroup</p>
 */
public class ABTestGroup extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("status")
    private Integer status;

    private ABTestGroup(Builder builder) {
        this.name = builder.name;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ABTestGroup create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String name; 
        private Integer status; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public ABTestGroup build() {
            return new ABTestGroup(this);
        } 

    } 

}
