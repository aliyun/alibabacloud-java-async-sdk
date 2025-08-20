// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpAttrMapConfigItem} extends {@link TeaModel}
 *
 * <p>IdpAttrMapConfigItem</p>
 */
public class IdpAttrMapConfigItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private IdpAttrMapConfigItem(Builder builder) {
        this.source = builder.source;
        this.target = builder.target;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpAttrMapConfigItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private String source; 
        private String target; 
        private String targetType; 

        private Builder() {
        } 

        private Builder(IdpAttrMapConfigItem model) {
            this.source = model.source;
            this.target = model.target;
            this.targetType = model.targetType;
        } 

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public IdpAttrMapConfigItem build() {
            return new IdpAttrMapConfigItem(this);
        } 

    } 

}
