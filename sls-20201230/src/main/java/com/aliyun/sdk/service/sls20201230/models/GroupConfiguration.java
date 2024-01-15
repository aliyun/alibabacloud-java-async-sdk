// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GroupConfiguration} extends {@link TeaModel}
 *
 * <p>GroupConfiguration</p>
 */
public class GroupConfiguration extends TeaModel {
    @NameInMap("fileds")
    private java.util.List < String > fileds;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private GroupConfiguration(Builder builder) {
        this.fileds = builder.fileds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupConfiguration create() {
        return builder().build();
    }

    /**
     * @return fileds
     */
    public java.util.List < String > getFileds() {
        return this.fileds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < String > fileds; 
        private String type; 

        /**
         * fileds.
         */
        public Builder fileds(java.util.List < String > fileds) {
            this.fileds = fileds;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GroupConfiguration build() {
            return new GroupConfiguration(this);
        } 

    } 

}
