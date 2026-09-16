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
 * {@link DescribeVerifyPersonasDeviceModelStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyPersonasDeviceModelStatisticsRequest</p>
 */
public class DescribeVerifyPersonasDeviceModelStatisticsRequest extends Request {
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

    private DescribeVerifyPersonasDeviceModelStatisticsRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
        this.sceneId = builder.sceneId;
        this.serviceCode = builder.serviceCode;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyPersonasDeviceModelStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeVerifyPersonasDeviceModelStatisticsRequest, Builder> {
        private String productCode; 
        private Long sceneId; 
        private String serviceCode; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyPersonasDeviceModelStatisticsRequest request) {
            super(request);
            this.productCode = request.productCode;
            this.sceneId = request.sceneId;
            this.serviceCode = request.serviceCode;
            this.timeRange = request.timeRange;
        } 

        /**
         * <p>The product code.</p>
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
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000015316</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>antcloudauth</strong>: financial-grade ID Verification.</li>
         * <li><strong>cloudauthst</strong> (discontinued): ID Verification enhanced edition.</li>
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
         * <p>The time range for the query, indicating the number of preceding days. Format: a numeric string. Unit: days (d). A value of 30 indicates the preceding 30 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public DescribeVerifyPersonasDeviceModelStatisticsRequest build() {
            return new DescribeVerifyPersonasDeviceModelStatisticsRequest(this);
        } 

    } 

}
