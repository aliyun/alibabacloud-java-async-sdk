// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageSnapshotAuthRequest} extends {@link RequestModel}
 *
 * <p>ManageSnapshotAuthRequest</p>
 */
public class ManageSnapshotAuthRequest extends Request {
    @Query
    @NameInMap("CallBackFunction")
    private String callBackFunction;

    @Query
    @NameInMap("CallBackKey")
    private String callBackKey;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ManageSnapshotAuthRequest(Builder builder) {
        super(builder);
        this.callBackFunction = builder.callBackFunction;
        this.callBackKey = builder.callBackKey;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageSnapshotAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callBackFunction
     */
    public String getCallBackFunction() {
        return this.callBackFunction;
    }

    /**
     * @return callBackKey
     */
    public String getCallBackKey() {
        return this.callBackKey;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ManageSnapshotAuthRequest, Builder> {
        private String callBackFunction; 
        private String callBackKey; 
        private String domainName; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ManageSnapshotAuthRequest response) {
            super(response);
            this.callBackFunction = response.callBackFunction;
            this.callBackKey = response.callBackKey;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * CallBackFunction.
         */
        public Builder callBackFunction(String callBackFunction) {
            this.putQueryParameter("CallBackFunction", callBackFunction);
            this.callBackFunction = callBackFunction;
            return this;
        }

        /**
         * CallBackKey.
         */
        public Builder callBackKey(String callBackKey) {
            this.putQueryParameter("CallBackKey", callBackKey);
            this.callBackKey = callBackKey;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ManageSnapshotAuthRequest build() {
            return new ManageSnapshotAuthRequest(this);
        } 

    } 

}
