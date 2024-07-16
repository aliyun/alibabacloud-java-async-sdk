// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardAreaLimitSupportAreaRequest} extends {@link RequestModel}
 *
 * <p>ListCardAreaLimitSupportAreaRequest</p>
 */
public class ListCardAreaLimitSupportAreaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceName")
    private String provinceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListCardAreaLimitSupportAreaRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.provinceName = builder.provinceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardAreaLimitSupportAreaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return provinceName
     */
    public String getProvinceName() {
        return this.provinceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListCardAreaLimitSupportAreaRequest, Builder> {
        private String acceptLanguage; 
        private String provinceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCardAreaLimitSupportAreaRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.provinceName = request.provinceName;
            this.regionId = request.regionId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ProvinceName.
         */
        public Builder provinceName(String provinceName) {
            this.putQueryParameter("ProvinceName", provinceName);
            this.provinceName = provinceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListCardAreaLimitSupportAreaRequest build() {
            return new ListCardAreaLimitSupportAreaRequest(this);
        } 

    } 

}
