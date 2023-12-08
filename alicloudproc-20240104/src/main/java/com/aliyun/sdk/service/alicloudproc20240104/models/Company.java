// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Company} extends {@link TeaModel}
 *
 * <p>Company</p>
 */
public class Company extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("uscc")
    private String uscc;

    private Company(Builder builder) {
        this.name = builder.name;
        this.uscc = builder.uscc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Company create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return uscc
     */
    public String getUscc() {
        return this.uscc;
    }

    public static final class Builder {
        private String name; 
        private String uscc; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * uscc.
         */
        public Builder uscc(String uscc) {
            this.uscc = uscc;
            return this;
        }

        public Company build() {
            return new Company(this);
        } 

    } 

}
