// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventTypesRequest</p>
 */
public class DescribeEventTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTypeId")
    private Long parentTypeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private Integer resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeEventTypesRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.parentTypeId = builder.parentTypeId;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventTypesRequest create() {
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
     * @return parentTypeId
     */
    public Long getParentTypeId() {
        return this.parentTypeId;
    }

    /**
     * @return resourceId
     */
    public Integer getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeEventTypesRequest, Builder> {
        private Integer featureType; 
        private String lang; 
        private Long parentTypeId; 
        private Integer resourceId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventTypesRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.parentTypeId = request.parentTypeId;
            this.resourceId = request.resourceId;
            this.status = request.status;
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
         * <li><strong>zh</strong>: Chinese</li>
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
         * <p>The type of anomalous event for which you want to query the anomalous events of subtypes. Valid values:</p>
         * <ul>
         * <li><strong>01</strong>: anomalous permission usage</li>
         * <li><strong>02</strong>: anomalous data flow</li>
         * <li><strong>03</strong>: anomalous data operation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder parentTypeId(Long parentTypeId) {
            this.putQueryParameter("ParentTypeId", parentTypeId);
            this.parentTypeId = parentTypeId;
            return this;
        }

        /**
         * <p>The type of the resource. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder resourceId(Integer resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The status of the anomalous event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>2</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeEventTypesRequest build() {
            return new DescribeEventTypesRequest(this);
        } 

    } 

}
