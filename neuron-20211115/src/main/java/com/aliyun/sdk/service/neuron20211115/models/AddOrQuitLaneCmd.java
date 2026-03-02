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
 * {@link AddOrQuitLaneCmd} extends {@link TeaModel}
 *
 * <p>AddOrQuitLaneCmd</p>
 */
public class AddOrQuitLaneCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("laneIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String laneIds;

    @com.aliyun.core.annotation.NameInMap("operateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    private AddOrQuitLaneCmd(Builder builder) {
        this.laneIds = builder.laneIds;
        this.operateType = builder.operateType;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrQuitLaneCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laneIds
     */
    public String getLaneIds() {
        return this.laneIds;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder {
        private String laneIds; 
        private String operateType; 
        private Long serviceGroupId; 

        private Builder() {
        } 

        private Builder(AddOrQuitLaneCmd model) {
            this.laneIds = model.laneIds;
            this.operateType = model.operateType;
            this.serviceGroupId = model.serviceGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder laneIds(String laneIds) {
            this.laneIds = laneIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder operateType(String operateType) {
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        public AddOrQuitLaneCmd build() {
            return new AddOrQuitLaneCmd(this);
        } 

    } 

}
