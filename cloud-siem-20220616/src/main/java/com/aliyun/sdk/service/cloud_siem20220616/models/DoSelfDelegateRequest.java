// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoSelfDelegateRequest} extends {@link RequestModel}
 *
 * <p>DoSelfDelegateRequest</p>
 */
public class DoSelfDelegateRequest extends Request {
    @Body
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Body
    @NameInMap("DelegateOrNot")
    @Validation(required = true)
    private Integer delegateOrNot;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DoSelfDelegateRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.delegateOrNot = builder.delegateOrNot;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoSelfDelegateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return delegateOrNot
     */
    public Integer getDelegateOrNot() {
        return this.delegateOrNot;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DoSelfDelegateRequest, Builder> {
        private Long aliUid; 
        private Integer delegateOrNot; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DoSelfDelegateRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.delegateOrNot = request.delegateOrNot;
            this.regionId = request.regionId;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putBodyParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * DelegateOrNot.
         */
        public Builder delegateOrNot(Integer delegateOrNot) {
            this.putBodyParameter("DelegateOrNot", delegateOrNot);
            this.delegateOrNot = delegateOrNot;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DoSelfDelegateRequest build() {
            return new DoSelfDelegateRequest(this);
        } 

    } 

}
