// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link StopWuyingServerRequest} extends {@link RequestModel}
 *
 * <p>StopWuyingServerRequest</p>
 */
public class StopWuyingServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerIdList")
    private java.util.List<String> wuyingServerIdList;

    private StopWuyingServerRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.wuyingServerIdList = builder.wuyingServerIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopWuyingServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return wuyingServerIdList
     */
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

    public static final class Builder extends Request.Builder<StopWuyingServerRequest, Builder> {
        private Boolean force; 
        private java.util.List<String> wuyingServerIdList; 

        private Builder() {
            super();
        } 

        private Builder(StopWuyingServerRequest request) {
            super(request);
            this.force = request.force;
            this.wuyingServerIdList = request.wuyingServerIdList;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * WuyingServerIdList.
         */
        public Builder wuyingServerIdList(java.util.List<String> wuyingServerIdList) {
            this.putBodyParameter("WuyingServerIdList", wuyingServerIdList);
            this.wuyingServerIdList = wuyingServerIdList;
            return this;
        }

        @Override
        public StopWuyingServerRequest build() {
            return new StopWuyingServerRequest(this);
        } 

    } 

}
