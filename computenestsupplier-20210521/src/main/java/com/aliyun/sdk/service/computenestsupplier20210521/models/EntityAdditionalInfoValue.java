// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntityAdditionalInfoValue} extends {@link TeaModel}
 *
 * <p>EntityAdditionalInfoValue</p>
 */
public class EntityAdditionalInfoValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Promql")
    private String promql;

    private EntityAdditionalInfoValue(Builder builder) {
        this.type = builder.type;
        this.promql = builder.promql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityAdditionalInfoValue create() {
        return builder().build();
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return promql
     */
    public String getPromql() {
        return this.promql;
    }

    public static final class Builder {
        private String type; 
        private String promql; 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Promql.
         */
        public Builder promql(String promql) {
            this.promql = promql;
            return this;
        }

        public EntityAdditionalInfoValue build() {
            return new EntityAdditionalInfoValue(this);
        } 

    } 

}
