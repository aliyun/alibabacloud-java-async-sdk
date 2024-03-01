// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCfwRiskLevelSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCfwRiskLevelSummaryRequest</p>
 */
public class DescribeCfwRiskLevelSummaryRequest extends Request {
    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeCfwRiskLevelSummaryRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCfwRiskLevelSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCfwRiskLevelSummaryRequest, Builder> {
        private String instanceType; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCfwRiskLevelSummaryRequest request) {
            super(request);
            this.instanceType = request.instanceType;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
        public DescribeCfwRiskLevelSummaryRequest build() {
            return new DescribeCfwRiskLevelSummaryRequest(this);
        } 

    } 

}
