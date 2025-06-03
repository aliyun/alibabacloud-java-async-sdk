// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link ListSurveyResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListSurveyResourceTypesRequest</p>
 */
public class ListSurveyResourceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ak")
    private String ak;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cloudType")
    private String cloudType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sk")
    private String sk;

    private ListSurveyResourceTypesRequest(Builder builder) {
        super(builder);
        this.ak = builder.ak;
        this.cloudType = builder.cloudType;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.sk = builder.sk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSurveyResourceTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ak
     */
    public String getAk() {
        return this.ak;
    }

    /**
     * @return cloudType
     */
    public String getCloudType() {
        return this.cloudType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sk
     */
    public String getSk() {
        return this.sk;
    }

    public static final class Builder extends Request.Builder<ListSurveyResourceTypesRequest, Builder> {
        private String ak; 
        private String cloudType; 
        private String region; 
        private String regionId; 
        private String sk; 

        private Builder() {
            super();
        } 

        private Builder(ListSurveyResourceTypesRequest request) {
            super(request);
            this.ak = request.ak;
            this.cloudType = request.cloudType;
            this.region = request.region;
            this.regionId = request.regionId;
            this.sk = request.sk;
        } 

        /**
         * ak.
         */
        public Builder ak(String ak) {
            this.putQueryParameter("ak", ak);
            this.ak = ak;
            return this;
        }

        /**
         * cloudType.
         */
        public Builder cloudType(String cloudType) {
            this.putQueryParameter("cloudType", cloudType);
            this.cloudType = cloudType;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * sk.
         */
        public Builder sk(String sk) {
            this.putQueryParameter("sk", sk);
            this.sk = sk;
            return this;
        }

        @Override
        public ListSurveyResourceTypesRequest build() {
            return new ListSurveyResourceTypesRequest(this);
        } 

    } 

}
