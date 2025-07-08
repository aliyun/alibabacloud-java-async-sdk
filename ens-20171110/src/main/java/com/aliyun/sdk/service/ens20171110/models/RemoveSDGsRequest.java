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
 * {@link RemoveSDGsRequest} extends {@link RequestModel}
 *
 * <p>RemoveSDGsRequest</p>
 */
public class RemoveSDGsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdgIds")
    private java.util.List<String> sdgIds;

    private RemoveSDGsRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.sdgIds = builder.sdgIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSDGsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return sdgIds
     */
    public java.util.List<String> getSdgIds() {
        return this.sdgIds;
    }

    public static final class Builder extends Request.Builder<RemoveSDGsRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private java.util.List<String> sdgIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveSDGsRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.sdgIds = request.sdgIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * SdgIds.
         */
        public Builder sdgIds(java.util.List<String> sdgIds) {
            String sdgIdsShrink = shrink(sdgIds, "SdgIds", "json");
            this.putQueryParameter("SdgIds", sdgIdsShrink);
            this.sdgIds = sdgIds;
            return this;
        }

        @Override
        public RemoveSDGsRequest build() {
            return new RemoveSDGsRequest(this);
        } 

    } 

}
