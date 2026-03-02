// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link StackInfoExtInfo} extends {@link TeaModel}
 *
 * <p>StackInfoExtInfo</p>
 */
public class StackInfoExtInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("info")
    private String info;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private StackInfoExtInfo(Builder builder) {
        this.info = builder.info;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StackInfoExtInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String info; 
        private String type; 

        private Builder() {
        } 

        private Builder(StackInfoExtInfo model) {
            this.info = model.info;
            this.type = model.type;
        } 

        /**
         * info.
         */
        public Builder info(String info) {
            this.info = info;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public StackInfoExtInfo build() {
            return new StackInfoExtInfo(this);
        } 

    } 

}
