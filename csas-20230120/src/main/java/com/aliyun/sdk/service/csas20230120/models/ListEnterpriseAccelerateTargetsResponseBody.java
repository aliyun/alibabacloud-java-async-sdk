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
 * {@link ListEnterpriseAccelerateTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseAccelerateTargetsResponseBody</p>
 */
public class ListEnterpriseAccelerateTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EapId")
    private String eapId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List<String> targets;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListEnterpriseAccelerateTargetsResponseBody(Builder builder) {
        this.eapId = builder.eapId;
        this.requestId = builder.requestId;
        this.targets = builder.targets;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseAccelerateTargetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eapId
     */
    public String getEapId() {
        return this.eapId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targets
     */
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String eapId; 
        private String requestId; 
        private java.util.List<String> targets; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListEnterpriseAccelerateTargetsResponseBody model) {
            this.eapId = model.eapId;
            this.requestId = model.requestId;
            this.targets = model.targets;
            this.total = model.total;
        } 

        /**
         * EapId.
         */
        public Builder eapId(String eapId) {
            this.eapId = eapId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Targets.
         */
        public Builder targets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEnterpriseAccelerateTargetsResponseBody build() {
            return new ListEnterpriseAccelerateTargetsResponseBody(this);
        } 

    } 

}
