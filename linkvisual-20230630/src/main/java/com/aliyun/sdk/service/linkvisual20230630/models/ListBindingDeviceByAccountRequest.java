// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindingDeviceByAccountRequest} extends {@link RequestModel}
 *
 * <p>ListBindingDeviceByAccountRequest</p>
 */
public class ListBindingDeviceByAccountRequest extends Request {
    @Query
    @NameInMap("IdentityId")
    private String identityId;

    @Query
    @NameInMap("OpenId")
    private String openId;

    @Query
    @NameInMap("OpenIdAppKey")
    private String openIdAppKey;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SubDevice")
    private Boolean subDevice;

    private ListBindingDeviceByAccountRequest(Builder builder) {
        super(builder);
        this.identityId = builder.identityId;
        this.openId = builder.openId;
        this.openIdAppKey = builder.openIdAppKey;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.subDevice = builder.subDevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindingDeviceByAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return openId
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * @return openIdAppKey
     */
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subDevice
     */
    public Boolean getSubDevice() {
        return this.subDevice;
    }

    public static final class Builder extends Request.Builder<ListBindingDeviceByAccountRequest, Builder> {
        private String identityId; 
        private String openId; 
        private String openIdAppKey; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Boolean subDevice; 

        private Builder() {
            super();
        } 

        private Builder(ListBindingDeviceByAccountRequest request) {
            super(request);
            this.identityId = request.identityId;
            this.openId = request.openId;
            this.openIdAppKey = request.openIdAppKey;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.subDevice = request.subDevice;
        } 

        /**
         * IdentityId.
         */
        public Builder identityId(String identityId) {
            this.putQueryParameter("IdentityId", identityId);
            this.identityId = identityId;
            return this;
        }

        /**
         * OpenId.
         */
        public Builder openId(String openId) {
            this.putQueryParameter("OpenId", openId);
            this.openId = openId;
            return this;
        }

        /**
         * OpenIdAppKey.
         */
        public Builder openIdAppKey(String openIdAppKey) {
            this.putQueryParameter("OpenIdAppKey", openIdAppKey);
            this.openIdAppKey = openIdAppKey;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SubDevice.
         */
        public Builder subDevice(Boolean subDevice) {
            this.putQueryParameter("SubDevice", subDevice);
            this.subDevice = subDevice;
            return this;
        }

        @Override
        public ListBindingDeviceByAccountRequest build() {
            return new ListBindingDeviceByAccountRequest(this);
        } 

    } 

}
