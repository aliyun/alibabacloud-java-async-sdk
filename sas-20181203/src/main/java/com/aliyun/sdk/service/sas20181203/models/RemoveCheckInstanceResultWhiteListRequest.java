// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveCheckInstanceResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>RemoveCheckInstanceResultWhiteListRequest</p>
 */
public class RemoveCheckInstanceResultWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private RemoveCheckInstanceResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveCheckInstanceResultWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<RemoveCheckInstanceResultWhiteListRequest, Builder> {
        private Long checkId; 
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveCheckInstanceResultWhiteListRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The IDs of instances. Separate multiple IDs with commas (,).</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public RemoveCheckInstanceResultWhiteListRequest build() {
            return new RemoveCheckInstanceResultWhiteListRequest(this);
        } 

    } 

}
