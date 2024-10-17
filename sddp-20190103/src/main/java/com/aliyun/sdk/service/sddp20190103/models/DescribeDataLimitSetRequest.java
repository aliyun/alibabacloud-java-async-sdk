// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataLimitSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitSetRequest</p>
 */
public class DescribeDataLimitSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private String parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private Integer resourceType;

    private DescribeDataLimitSetRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.parentId = builder.parentId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitSetRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeDataLimitSetRequest, Builder> {
        private Integer featureType; 
        private String lang; 
        private String parentId; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataLimitSetRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.parentId = request.parentId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese (default)</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The parent asset ID of the data asset.</p>
         * <p>You can call the <a href="~~DescribeDataLimitDetail~~">DescribeDataLimitDetail</a> or <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to obtain the parent asset ID of the data asset from the value of the <strong>ParentId</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The type of service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: AnalyticDB for MySQL</li>
         * <li><strong>4</strong>: Tablestore</li>
         * <li><strong>5</strong>: ApsaraDB RDS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeDataLimitSetRequest build() {
            return new DescribeDataLimitSetRequest(this);
        } 

    } 

}
