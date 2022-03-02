// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ReplicationPrefixSet} extends {@link TeaModel}
 *
 * <p>ReplicationPrefixSet</p>
 */
public class ReplicationPrefixSet extends TeaModel {
    @NameInMap("Prefix")
    private java.util.List < String > prefixs;

    private ReplicationPrefixSet(Builder builder) {
        this.prefixs = builder.prefixs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationPrefixSet create() {
        return builder().build();
    }

    /**
     * @return prefixs
     */
    public java.util.List < String > getPrefixs() {
        return this.prefixs;
    }

    public static final class Builder {
        private java.util.List < String > prefixs; 

        /**
         * Prefixs used to specify the object to replicate
         */
        public Builder prefixs(java.util.List < String > prefixs) {
            this.prefixs = prefixs;
            return this;
        }

        public ReplicationPrefixSet build() {
            return new ReplicationPrefixSet(this);
        } 

    } 

}
