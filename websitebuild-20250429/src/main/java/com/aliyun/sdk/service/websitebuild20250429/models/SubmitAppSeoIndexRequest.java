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
 * {@link SubmitAppSeoIndexRequest} extends {@link RequestModel}
 *
 * <p>SubmitAppSeoIndexRequest</p>
 */
public class SubmitAppSeoIndexRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmitLater")
    private Boolean submitLater;

    private SubmitAppSeoIndexRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.domain = builder.domain;
        this.seType = builder.seType;
        this.submitLater = builder.submitLater;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAppSeoIndexRequest create() {
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

    /**
     * @return submitLater
     */
    public Boolean getSubmitLater() {
        return this.submitLater;
    }

    public static final class Builder extends Request.Builder<SubmitAppSeoIndexRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String domain; 
        private String seType; 
        private Boolean submitLater; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAppSeoIndexRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.domain = request.domain;
            this.seType = request.seType;
            this.submitLater = request.submitLater;
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

        /**
         * SubmitLater.
         */
        public Builder submitLater(Boolean submitLater) {
            this.putQueryParameter("SubmitLater", submitLater);
            this.submitLater = submitLater;
            return this;
        }

        @Override
        public SubmitAppSeoIndexRequest build() {
            return new SubmitAppSeoIndexRequest(this);
        } 

    } 

}
