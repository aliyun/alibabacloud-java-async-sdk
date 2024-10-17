// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataLimitDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitDetailRequest</p>
 */
public class DescribeDataLimitDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The unique ID of the data asset that you want to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to query the ID of the data asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12300</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Simplified Chinese.</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>The network type of the data asset that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: virtual private cloud (VPC)</li>
         * <li><strong>2</strong>: classic network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
