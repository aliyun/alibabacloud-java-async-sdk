// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link PickGlobalOutboundNumbersRequest} extends {@link RequestModel}
 *
 * <p>PickGlobalOutboundNumbersRequest</p>
 */
public class PickGlobalOutboundNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalleeNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calleeNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsVirtual")
    private Boolean isVirtual;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> skillGroupId;

    private PickGlobalOutboundNumbersRequest(Builder builder) {
        super(builder);
        this.calleeNumber = builder.calleeNumber;
        this.count = builder.count;
        this.instanceId = builder.instanceId;
        this.isVirtual = builder.isVirtual;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickGlobalOutboundNumbersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calleeNumber
     */
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isVirtual
     */
    public Boolean getIsVirtual() {
        return this.isVirtual;
    }

    /**
     * @return skillGroupId
     */
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<PickGlobalOutboundNumbersRequest, Builder> {
        private String calleeNumber; 
        private Integer count; 
        private String instanceId; 
        private Boolean isVirtual; 
        private java.util.List<String> skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(PickGlobalOutboundNumbersRequest request) {
            super(request);
            this.calleeNumber = request.calleeNumber;
            this.count = request.count;
            this.instanceId = request.instanceId;
            this.isVirtual = request.isVirtual;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder calleeNumber(String calleeNumber) {
            this.putQueryParameter("CalleeNumber", calleeNumber);
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsVirtual.
         */
        public Builder isVirtual(Boolean isVirtual) {
            this.putQueryParameter("IsVirtual", isVirtual);
            this.isVirtual = isVirtual;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skillGroupId(java.util.List<String> skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public PickGlobalOutboundNumbersRequest build() {
            return new PickGlobalOutboundNumbersRequest(this);
        } 

    } 

}
