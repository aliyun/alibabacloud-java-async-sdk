// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelationshipVO} extends {@link TeaModel}
 *
 * <p>RelationshipVO</p>
 */
public class RelationshipVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private RelationshipVO(Builder builder) {
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelationshipVO create() {
        return builder().build();
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String type; 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public RelationshipVO build() {
            return new RelationshipVO(this);
        } 

    } 

}
