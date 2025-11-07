// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyPersonasProvinceStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyPersonasProvinceStatisticsRequest</p>
 */
public class DescribeVerifyPersonasProvinceStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeRange;

    private DescribeVerifyPersonasProvinceStatisticsRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
        this.sceneId = builder.sceneId;
        this.serviceCode = builder.serviceCode;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyPersonasProvinceStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<DescribeVerifyPersonasProvinceStatisticsRequest, Builder> {
        private String productCode; 
        private Long sceneId; 
        private String serviceCode; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyPersonasProvinceStatisticsRequest request) {
            super(request);
            this.productCode = request.productCode;
            this.sceneId = request.sceneId;
            this.serviceCode = request.serviceCode;
            this.timeRange = request.timeRange;
        } 

        /**
         * <p>Cloud product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000004071</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>Service type:</p>
         * <ul>
         * <li><strong>antcloudauth</strong>: Financial-grade real-person authentication.</li>
         * <li><strong>cloudauthst</strong> (discontinued): Enhanced real-person authentication.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Time range, search range is for the previous N days, TimeRange of 1 indicates the previous 1 day.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public DescribeVerifyPersonasProvinceStatisticsRequest build() {
            return new DescribeVerifyPersonasProvinceStatisticsRequest(this);
        } 

    } 

}
