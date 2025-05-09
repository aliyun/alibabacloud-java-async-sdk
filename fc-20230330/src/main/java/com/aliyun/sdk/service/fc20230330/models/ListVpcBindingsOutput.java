// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListVpcBindingsOutput} extends {@link TeaModel}
 *
 * <p>ListVpcBindingsOutput</p>
 */
public class ListVpcBindingsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("vpcIds")
    private java.util.List<String> vpcIds;

    private ListVpcBindingsOutput(Builder builder) {
        this.vpcIds = builder.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcBindingsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vpcIds
     */
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public static final class Builder {
        private java.util.List<String> vpcIds; 

        private Builder() {
        } 

        private Builder(ListVpcBindingsOutput model) {
            this.vpcIds = model.vpcIds;
        } 

        /**
         * vpcIds.
         */
        public Builder vpcIds(java.util.List<String> vpcIds) {
            this.vpcIds = vpcIds;
            return this;
        }

        public ListVpcBindingsOutput build() {
            return new ListVpcBindingsOutput(this);
        } 

    } 

}
