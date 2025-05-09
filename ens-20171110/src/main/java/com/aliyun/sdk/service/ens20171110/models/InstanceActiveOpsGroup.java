// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link InstanceActiveOpsGroup} extends {@link TeaModel}
 *
 * <p>InstanceActiveOpsGroup</p>
 */
public class InstanceActiveOpsGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    private InstanceActiveOpsGroup(Builder builder) {
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceActiveOpsGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder {
        private java.util.List<String> instanceIds; 

        private Builder() {
        } 

        private Builder(InstanceActiveOpsGroup model) {
            this.instanceIds = model.instanceIds;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        public InstanceActiveOpsGroup build() {
            return new InstanceActiveOpsGroup(this);
        } 

    } 

}
