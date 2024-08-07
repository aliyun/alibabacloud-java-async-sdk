// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoSelfDelegateRequest} extends {@link RequestModel}
 *
 * <p>DoSelfDelegateRequest</p>
 */
public class DoSelfDelegateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aliUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DelegateOrNot")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer delegateOrNot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * The Alibaba Cloud account of an ordinary member of the threat analysis feature.
         */
        public Builder aliUid(Long aliUid) {
            this.putBodyParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Specifies whether to use a delegated administrator account. Valid values:
         * <p>
         * 
         * *   1: use a delegated administrator account.
         * *   0: do not use a delegated administrator account.
         */
        public Builder delegateOrNot(Integer delegateOrNot) {
            this.putBodyParameter("DelegateOrNot", delegateOrNot);
            this.delegateOrNot = delegateOrNot;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
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
