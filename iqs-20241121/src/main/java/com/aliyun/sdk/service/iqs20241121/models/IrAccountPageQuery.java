// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link IrAccountPageQuery} extends {@link TeaModel}
 *
 * <p>IrAccountPageQuery</p>
 */
public class IrAccountPageQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private IrAccountPageQuery(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IrAccountPageQuery create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String name; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public IrAccountPageQuery build() {
            return new IrAccountPageQuery(this);
        } 

    } 

}
