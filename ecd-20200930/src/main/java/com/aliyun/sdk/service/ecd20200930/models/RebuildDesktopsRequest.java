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
 * {@link RebuildDesktopsRequest} extends {@link RequestModel}
 *
 * <p>RebuildDesktopsRequest</p>
 */
public class RebuildDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RebuildDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.imageId = builder.imageId;
        this.language = builder.language;
        this.operateType = builder.operateType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RebuildDesktopsRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String imageId; 
        private String language; 
        private String operateType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildDesktopsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.imageId = request.imageId;
            this.language = request.language;
            this.operateType = request.operateType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cloud computer IDs. You can specify the IDs of 1 to 20 cloud computers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the new image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-84mztzatmlnys****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The OS language. Only system images are supported, and Linux cloud computers support only English.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>en-US: English</li>
         * <li>zh-HK: Traditional Chinese (Hong Kong, China)</li>
         * <li>zh-CN: Simplified Chinese</li>
         * <li>ja-JP: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The operation type on the data disk.</p>
         * <blockquote>
         * <p> This parameter is empty by default regardless of whether data disks are attached to the cloud computer.</p>
         * </blockquote>
         * <ul>
         * <li><p>No data disks are attached to the cloud computer:<br>No operation is performed on the data disks of the cloud computer regardless of the value of this parameter.</p>
         * </li>
         * <li><p>Data disks are attached to the cloud computer:</p>
         * <ol>
         * <li><p>The OS of the cloud computer is the same as the OS of the destination image:</p>
         * <ul>
         * <li>If you set the OperateType parameter to <code>replace</code>, the data in the data disks of the cloud computer is replaced.</li>
         * <li>If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is retained.</li>
         * </ul>
         * </li>
         * <li><p>The OS of the cloud computer is different from the OS of the destination image:</p>
         * <ul>
         * <li>If you set the OperateType parameter to <code>replace</code>, the data in the data disks of the cloud computer is replaced.</li>
         * <li>If you leave the OperateType parameter empty, the data in the data disks of the cloud computer is cleared.</li>
         * </ul>
         * </li>
         * </ol>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replace</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
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

        @Override
        public RebuildDesktopsRequest build() {
            return new RebuildDesktopsRequest(this);
        } 

    } 

}
