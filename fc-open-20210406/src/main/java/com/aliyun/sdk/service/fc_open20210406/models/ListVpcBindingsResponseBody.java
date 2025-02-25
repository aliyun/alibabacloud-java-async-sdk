// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcBindingsResponseBody</p>
 */
public class ListVpcBindingsResponseBody extends TeaModel {
    @NameInMap("vpcIds")
    private java.util.List < String > vpcIds;

    private ListVpcBindingsResponseBody(Builder builder) {
        this.vpcIds = builder.vpcIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcBindingsResponseBody create() {
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
         * The IDs of bound VPCs.
         */
        public Builder vpcIds(java.util.List < String > vpcIds) {
            this.vpcIds = vpcIds;
            return this;
        }

        public ListVpcBindingsResponseBody build() {
            return new ListVpcBindingsResponseBody(this);
        } 

    } 

}
