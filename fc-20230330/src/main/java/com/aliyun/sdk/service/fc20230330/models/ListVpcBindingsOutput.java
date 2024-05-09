// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcBindingsOutput} extends {@link TeaModel}
 *
 * <p>ListVpcBindingsOutput</p>
 */
public class ListVpcBindingsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("vpcIds")
    private java.util.List < String > vpcIds;

    private ListVpcBindingsOutput(Builder builder) {
        this.vpcIds = builder.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcBindingsOutput create() {
        return builder().build();
    }

    /**
     * @return vpcIds
     */
    public java.util.List < String > getVpcIds() {
        return this.vpcIds;
    }

    public static final class Builder {
        private java.util.List < String > vpcIds; 

        /**
         * vpcIds.
         */
        public Builder vpcIds(java.util.List < String > vpcIds) {
            this.vpcIds = vpcIds;
            return this;
        }

        public ListVpcBindingsOutput build() {
            return new ListVpcBindingsOutput(this);
        } 

    } 

}
