// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLockRequest} extends {@link RequestModel}
 *
 * <p>CreateLockRequest</p>
 */
public class CreateLockRequest extends Request {
    @Body
    @NameInMap("LockObjList")
    private java.util.List < LockObj > lockObjList;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateLockRequest(Builder builder) {
        super(builder);
        this.lockObjList = builder.lockObjList;
        this.regionId = builder.regionId;
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
     * @return lockObjList
     */
    public java.util.List < LockObj > getLockObjList() {
        return this.lockObjList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateLockRequest, Builder> {
        private java.util.List < LockObj > lockObjList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLockRequest response) {
            super(response);
            this.lockObjList = response.lockObjList;
            this.regionId = response.regionId;
        } 

        /**
         * LockObjList
         */
        public Builder lockObjList(java.util.List < LockObj > lockObjList) {
            this.putBodyParameter("LockObjList", lockObjList);
            this.lockObjList = lockObjList;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateLockRequest build() {
            return new CreateLockRequest(this);
        } 

    } 

}
