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
 * {@link OpenServiceGroupForServiceCmd} extends {@link TeaModel}
 *
 * <p>OpenServiceGroupForServiceCmd</p>
 */
public class OpenServiceGroupForServiceCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("laneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long laneId;

    @com.aliyun.core.annotation.NameInMap("serviceIds")
    private java.util.List<Long> serviceIds;

    private OpenServiceGroupForServiceCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.laneId = builder.laneId;
        this.serviceIds = builder.serviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceGroupForServiceCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return serviceIds
     */
    public java.util.List<Long> getServiceIds() {
        return this.serviceIds;
    }

    public static final class Builder {
        private Long companyId; 
        private Long laneId; 
        private java.util.List<Long> serviceIds; 

        private Builder() {
        } 

        private Builder(OpenServiceGroupForServiceCmd model) {
            this.companyId = model.companyId;
            this.laneId = model.laneId;
            this.serviceIds = model.serviceIds;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder laneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }

        /**
         * serviceIds.
         */
        public Builder serviceIds(java.util.List<Long> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }

        public OpenServiceGroupForServiceCmd build() {
            return new OpenServiceGroupForServiceCmd(this);
        } 

    } 

}
