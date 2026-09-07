// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ResetDesktopsRequest} extends {@link RequestModel}
 *
 * <p>ResetDesktopsRequest</p>
 */
public class ResetDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupIds")
    private java.util.List<String> desktopGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastRetryTime")
    private Long lastRetryTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetScope")
    private String resetScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resetType;

    private ResetDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupIds = builder.desktopGroupIds;
        this.desktopId = builder.desktopId;
        this.imageId = builder.imageId;
        this.lastRetryTime = builder.lastRetryTime;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resetScope = builder.resetScope;
        this.resetType = builder.resetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopGroupIds
     */
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return lastRetryTime
     */
    public Long getLastRetryTime() {
        return this.lastRetryTime;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetScope
     */
    public String getResetScope() {
        return this.resetScope;
    }

    /**
     * @return resetType
     */
    public String getResetType() {
        return this.resetType;
    }

    public static final class Builder extends Request.Builder<ResetDesktopsRequest, Builder> {
        private String desktopGroupId; 
        private java.util.List<String> desktopGroupIds; 
        private java.util.List<String> desktopId; 
        private String imageId; 
        private Long lastRetryTime; 
        private String payType; 
        private String regionId; 
        private String resetScope; 
        private String resetType; 

        private Builder() {
            super();
        } 

        private Builder(ResetDesktopsRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.desktopGroupIds = request.desktopGroupIds;
            this.desktopId = request.desktopId;
            this.imageId = request.imageId;
            this.lastRetryTime = request.lastRetryTime;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resetScope = request.resetScope;
            this.resetType = request.resetType;
        } 

        /**
         * <p>The shared cloud computer ID.</p>
         * <ul>
         * <li>If DesktopId is specified, DesktopGroupId is ignored.</li>
         * <li>If DesktopId is empty, the system retrieves the DesktopId of all cloud computers within the shared cloud computer based on DesktopGroupId.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dg-07if7qsxoxkb6****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The shared cloud computer IDs.</p>
         */
        public Builder desktopGroupIds(java.util.List<String> desktopGroupIds) {
            this.putQueryParameter("DesktopGroupIds", desktopGroupIds);
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * <p>The cloud computer IDs. You can specify 1 to 100 IDs.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The timestamp of the last retry. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1699960800000</p>
         */
        public Builder lastRetryTime(Long lastRetryTime) {
            this.putQueryParameter("LastRetryTime", lastRetryTime);
            this.lastRetryTime = lastRetryTime;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * <blockquote>
         * <p>This parameter takes effect only for resetting shared cloud computers. If this parameter is left empty, all cloud computers of all billing methods within the shared cloud computer are reset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The reset scope. You can configure this parameter to specify whether to reset the image or the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder resetScope(String resetScope) {
            this.putQueryParameter("ResetScope", resetScope);
            this.resetScope = resetScope;
            return this;
        }

        /**
         * <p>The reset type, which determines whether to reset and the scope of cloud disks to reset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resetType(String resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        @Override
        public ResetDesktopsRequest build() {
            return new ResetDesktopsRequest(this);
        } 

    } 

}
