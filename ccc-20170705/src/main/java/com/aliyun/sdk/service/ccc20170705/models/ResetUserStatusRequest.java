// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserStatusRequest} extends {@link RequestModel}
 *
 * <p>ResetUserStatusRequest</p>
 */
public class ResetUserStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RamIdList")
    private java.util.List < Long > ramIdList;

    private ResetUserStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ramIdList = builder.ramIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserStatusRequest create() {
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
     * @return ramIdList
     */
    public java.util.List < Long > getRamIdList() {
        return this.ramIdList;
    }

    public static final class Builder extends Request.Builder<ResetUserStatusRequest, Builder> {
        private String instanceId; 
        private java.util.List < Long > ramIdList; 

        private Builder() {
            super();
        } 

        private Builder(ResetUserStatusRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.ramIdList = response.ramIdList;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RamIdList.
         */
        public Builder ramIdList(java.util.List < Long > ramIdList) {
            this.putQueryParameter("RamIdList", ramIdList);
            this.ramIdList = ramIdList;
            return this;
        }

        @Override
        public ResetUserStatusRequest build() {
            return new ResetUserStatusRequest(this);
        } 

    } 

}
