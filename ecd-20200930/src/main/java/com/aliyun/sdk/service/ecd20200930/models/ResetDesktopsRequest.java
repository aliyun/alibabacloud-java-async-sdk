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
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resetScope = request.resetScope;
            this.resetType = request.resetType;
        } 

        /**
         * <p>The ID of the cloud computer share.</p>
         * <ul>
         * <li>If you specify <code>DesktopId</code>, ignore <code>DesktopGroupId</code>.</li>
         * <li>If you leave <code>DesktopId</code> empty, the system obtains the IDs of all cloud computers within the share specified by <code>DesktopGroupId</code>.``</li>
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
         * <p>The IDs of the cloud computer shares.</p>
         */
        public Builder desktopGroupIds(java.util.List<String> desktopGroupIds) {
            this.putQueryParameter("DesktopGroupIds", desktopGroupIds);
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * <p>The IDs of the cloud computers. You can specify the IDs of 1 to 100 cloud computers.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the image.</p>
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
         * <p>The billing method of the cloud computer share.</p>
         * <blockquote>
         * <p> This parameter takes effect when you reset a cloud computer share. If you leave this parameter empty, all cloud computers in that share are reset.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/436773.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The reset scope. You can configure this parameter to reset the image or cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ALL (default): resets the image and cloud computer.</li>
         * <li>IMAGE: resets only the image.</li>
         * </ul>
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
         * <p>The disk reset type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: does not reset disks.</li>
         * <li>1: resets only the system disk.</li>
         * <li>2: resets only the user disk.</li>
         * <li>3: resets the system disk and the user disk.</li>
         * </ul>
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
