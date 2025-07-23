// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link CopyImageRequest} extends {@link RequestModel}
 *
 * <p>CopyImageRequest</p>
 */
public class CopyImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUid")
    private String imageUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetRegionId")
    private String targetRegionId;

    private CopyImageRequest(Builder builder) {
        super(builder);
        this.imageUid = builder.imageUid;
        this.targetRegionId = builder.targetRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUid
     */
    public String getImageUid() {
        return this.imageUid;
    }

    /**
     * @return targetRegionId
     */
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    public static final class Builder extends Request.Builder<CopyImageRequest, Builder> {
        private String imageUid; 
        private String targetRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CopyImageRequest request) {
            super(request);
            this.imageUid = request.imageUid;
            this.targetRegionId = request.targetRegionId;
        } 

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>image-hafiudfahdd****</p>
         */
        public Builder imageUid(String imageUid) {
            this.putBodyParameter("ImageUid", imageUid);
            this.imageUid = imageUid;
            return this;
        }

        /**
         * <p>The ID of the destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder targetRegionId(String targetRegionId) {
            this.putBodyParameter("TargetRegionId", targetRegionId);
            this.targetRegionId = targetRegionId;
            return this;
        }

        @Override
        public CopyImageRequest build() {
            return new CopyImageRequest(this);
        } 

    } 

}
