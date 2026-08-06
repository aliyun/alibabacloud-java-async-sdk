// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link DeleteOutboundCallRestrictionRequest} extends {@link RequestModel}
 *
 * <p>DeleteOutboundCallRestrictionRequest</p>
 */
public class DeleteOutboundCallRestrictionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RestrictionIdList")
    private java.util.List<String> restrictionIdList;

    private DeleteOutboundCallRestrictionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.restrictionIdList = builder.restrictionIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOutboundCallRestrictionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return restrictionIdList
     */
    public java.util.List<String> getRestrictionIdList() {
        return this.restrictionIdList;
    }

    public static final class Builder extends Request.Builder<DeleteOutboundCallRestrictionRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> restrictionIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOutboundCallRestrictionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.restrictionIdList = request.restrictionIdList;
        } 

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>外呼限制ID列表</p>
         */
        public Builder restrictionIdList(java.util.List<String> restrictionIdList) {
            String restrictionIdListShrink = shrink(restrictionIdList, "RestrictionIdList", "json");
            this.putBodyParameter("RestrictionIdList", restrictionIdListShrink);
            this.restrictionIdList = restrictionIdList;
            return this;
        }

        @Override
        public DeleteOutboundCallRestrictionRequest build() {
            return new DeleteOutboundCallRestrictionRequest(this);
        } 

    } 

}
