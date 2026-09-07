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
    @com.aliyun.core.annotation.NameInMap("AfterStatus")
    private String afterStatus;

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
        this.afterStatus = builder.afterStatus;
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
     * @return afterStatus
     */
    public String getAfterStatus() {
        return this.afterStatus;
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
        private String afterStatus; 
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
            this.afterStatus = request.afterStatus;
            this.desktopId = request.desktopId;
            this.imageId = request.imageId;
            this.language = request.language;
            this.operateType = request.operateType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The target status of the cloud computer after the rebuild is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder afterStatus(String afterStatus) {
            this.putQueryParameter("AfterStatus", afterStatus);
            this.afterStatus = afterStatus;
            return this;
        }

        /**
         * <p>The cloud computer ID. You can specify 1 to 20 IDs.</p>
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
         * <p>The ID of the new image to use after the change.</p>
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
         * <p>The operating system language. Currently, only system images are supported, and Linux computers only support English.</p>
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
         * <p>The operation type for the data cloud disk.</p>
         * <blockquote>
         * <p>Regardless of whether the cloud computer has a data cloud disk, no field value is passed in by default when you call this operation.</p>
         * </blockquote>
         * <ul>
         * <li>If the cloud computer has no data cloud disk:<br>  No data cloud disk operation is performed regardless of the field value passed in.</li>
         * <li>If the cloud computer has a data cloud disk:<ol>
         * <li>When the operating system of the cloud computer is the same as that of the target image:<ul>
         * <li>If the field value is <code>replace</code>, the data cloud disk of the cloud computer is replaced.</li>
         * <li>If no field value is passed in, the original data cloud disk of the cloud computer is retained.</li>
         * </ul>
         * </li>
         * <li>When the operating system of the cloud computer is different from that of the target image:<ul>
         * <li>If the field value is <code>replace</code>, the data cloud disk of the cloud computer is replaced.</li>
         * <li>If no field value is passed in, the data cloud disk of the cloud computer is cleared.</li>
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
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
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
