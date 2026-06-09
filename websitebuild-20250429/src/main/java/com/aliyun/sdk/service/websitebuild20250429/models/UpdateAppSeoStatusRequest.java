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
 * {@link UpdateAppSeoStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppSeoStatusRequest</p>
 */
public class UpdateAppSeoStatusRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SeAuthInfo")
    private String seAuthInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeType")
    private String seType;

    private UpdateAppSeoStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.domain = builder.domain;
        this.seAuthInfo = builder.seAuthInfo;
        this.seType = builder.seType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppSeoStatusRequest create() {
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
     * @return seAuthInfo
     */
    public String getSeAuthInfo() {
        return this.seAuthInfo;
    }

    /**
     * @return seType
     */
    public String getSeType() {
        return this.seType;
    }

    public static final class Builder extends Request.Builder<UpdateAppSeoStatusRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String domain; 
        private String seAuthInfo; 
        private String seType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppSeoStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.domain = request.domain;
            this.seAuthInfo = request.seAuthInfo;
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
         * <p>Business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801154628000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>Domain Name</p>
         * 
         * <strong>example:</strong>
         * <p>yjdw.bpu.edu.cn-waf</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * SeAuthInfo.
         */
        public Builder seAuthInfo(String seAuthInfo) {
            this.putQueryParameter("SeAuthInfo", seAuthInfo);
            this.seAuthInfo = seAuthInfo;
            return this;
        }

        /**
         * <p>Search Engine Type</p>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        public Builder seType(String seType) {
            this.putQueryParameter("SeType", seType);
            this.seType = seType;
            return this;
        }

        @Override
        public UpdateAppSeoStatusRequest build() {
            return new UpdateAppSeoStatusRequest(this);
        } 

    } 

}
