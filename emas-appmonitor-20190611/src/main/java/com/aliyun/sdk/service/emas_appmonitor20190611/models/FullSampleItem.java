// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link FullSampleItem} extends {@link TeaModel}
 *
 * <p>FullSampleItem</p>
 */
public class FullSampleItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    private FullSampleItem(Builder builder) {
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FullSampleItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    public static final class Builder {
        private String id; 
        private String modifyTime; 
        private String operator; 

        private Builder() {
        } 

        private Builder(FullSampleItem model) {
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.operator = model.operator;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        public FullSampleItem build() {
            return new FullSampleItem(this);
        } 

    } 

}
