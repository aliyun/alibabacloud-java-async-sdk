// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLockRequest} extends {@link RequestModel}
 *
 * <p>CreateLockRequest</p>
 */
public class CreateLockRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LockObjList")
    private java.util.List < LockObj > lockObjList;

    private CreateLockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lockObjList = builder.lockObjList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return lockObjList
     */
    public java.util.List < LockObj > getLockObjList() {
        return this.lockObjList;
    }

    public static final class Builder extends Request.Builder<CreateLockRequest, Builder> {
        private String regionId; 
        private java.util.List < LockObj > lockObjList; 

        private Builder() {
            super();
        } 

        private Builder(CreateLockRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lockObjList = request.lockObjList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * LockObjList
         */
        public Builder lockObjList(java.util.List < LockObj > lockObjList) {
            this.putBodyParameter("LockObjList", lockObjList);
            this.lockObjList = lockObjList;
            return this;
        }

        @Override
        public CreateLockRequest build() {
            return new CreateLockRequest(this);
        } 

    } 

}
