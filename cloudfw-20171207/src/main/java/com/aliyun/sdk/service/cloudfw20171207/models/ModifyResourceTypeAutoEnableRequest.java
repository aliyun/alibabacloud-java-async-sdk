// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyResourceTypeAutoEnableRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourceTypeAutoEnableRequest</p>
 */
public class ModifyResourceTypeAutoEnableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypeAutoEnable")
    private String resourceTypeAutoEnable;

    private ModifyResourceTypeAutoEnableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
        this.resourceTypeAutoEnable = builder.resourceTypeAutoEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceTypeAutoEnableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceTypeAutoEnable
     */
    public String getResourceTypeAutoEnable() {
        return this.resourceTypeAutoEnable;
    }

    public static final class Builder extends Request.Builder<ModifyResourceTypeAutoEnableRequest, Builder> {
        private String lang; 
        private String regionNo; 
        private String resourceTypeAutoEnable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourceTypeAutoEnableRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionNo = request.regionNo;
            this.resourceTypeAutoEnable = request.resourceTypeAutoEnable;
        } 

        /**
         * <p>The language of the response message.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic protection for the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SlbEIP&quot;:true,&quot;GaEIP&quot;:false,&quot;EcsIPv6&quot;:true,&quot;NatPublicIP&quot;:true,&quot;SlbIPv6&quot;:false,&quot;BastionHostIngressIP&quot;:false,&quot;EIP&quot;:true,&quot;NatEIP&quot;:true,&quot;SlbPublicIP&quot;:true,&quot;EcsEIP&quot;:true,&quot;EniEIP&quot;:true,&quot;HAVIP&quot;:true,&quot;NlbEIP&quot;:true,&quot;NlbIPv6&quot;:false,&quot;EniEIPv6&quot;:false,&quot;EcsPublicIP&quot;:true,&quot;AlbIPv6&quot;:true,&quot;BastionHostIP&quot;:false,&quot;BastionHostEgressIP&quot;:true,&quot;GaEIPV6&quot;:false,&quot;AlbEIP&quot;:false}</p>
         */
        public Builder resourceTypeAutoEnable(String resourceTypeAutoEnable) {
            this.putQueryParameter("ResourceTypeAutoEnable", resourceTypeAutoEnable);
            this.resourceTypeAutoEnable = resourceTypeAutoEnable;
            return this;
        }

        @Override
        public ModifyResourceTypeAutoEnableRequest build() {
            return new ModifyResourceTypeAutoEnableRequest(this);
        } 

    } 

}
