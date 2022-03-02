// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ReplicationRules} extends {@link TeaModel}
 *
 * <p>ReplicationRules</p>
 */
public class ReplicationRules extends TeaModel {
    @NameInMap("ID")
    private java.util.List < String > ids;

    private ReplicationRules(Builder builder) {
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationRules create() {
        return builder().build();
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
    }

    public static final class Builder {
        private java.util.List < String > ids; 

        /**
         * the container of id
         */
        public Builder ids(java.util.List < String > ids) {
            this.ids = ids;
            return this;
        }

        public ReplicationRules build() {
            return new ReplicationRules(this);
        } 

    } 

}
