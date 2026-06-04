// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppSeoStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAppSeoStatusRequest</p>
 */
public class GetAppSeoStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeType")
    private String seType;

    private GetAppSeoStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.domain = builder.domain;
        this.seType = builder.seType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppSeoStatusRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return seType
     */
    public String getSeType() {
        return this.seType;
    }

    public static final class Builder extends Request.Builder<GetAppSeoStatusRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String domain; 
        private String seType; 

        private Builder() {
            super();
        } 

        private Builder(GetAppSeoStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.domain = request.domain;
            this.seType = request.seType;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * SeType.
         */
        public Builder seType(String seType) {
            this.putQueryParameter("SeType", seType);
            this.seType = seType;
            return this;
        }

        @Override
        public GetAppSeoStatusRequest build() {
            return new GetAppSeoStatusRequest(this);
        } 

    } 

}
