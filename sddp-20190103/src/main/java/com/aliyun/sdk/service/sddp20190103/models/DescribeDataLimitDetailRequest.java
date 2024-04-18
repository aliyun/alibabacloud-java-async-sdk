// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitDetailRequest</p>
 */
public class DescribeDataLimitDetailRequest extends Request {
    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NetworkType")
    private Integer networkType;

    private DescribeDataLimitDetailRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
        this.id = builder.id;
        this.lang = builder.lang;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return networkType
     */
    public Integer getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<DescribeDataLimitDetailRequest, Builder> {
        private Integer featureType; 
        private Long id; 
        private String lang; 
        private Integer networkType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataLimitDetailRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.id = request.id;
            this.lang = request.lang;
            this.networkType = request.networkType;
        } 

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The unique ID of the data asset that you want to query.
         * <p>
         * 
         * > You can call the [DescribeDataLimits](~~DescribeDataLimits~~) operation to query the ID of the data asset.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Simplified Chinese.
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The network type of the data asset that you want to query. Valid values:
         * <p>
         * 
         * *   **1**: virtual private cloud (VPC)
         * *   **2**: classic network
         */
        public Builder networkType(Integer networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public DescribeDataLimitDetailRequest build() {
            return new DescribeDataLimitDetailRequest(this);
        } 

    } 

}
