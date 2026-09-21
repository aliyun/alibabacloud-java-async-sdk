// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link UpdateCloudPhoneNodeSystemImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudPhoneNodeSystemImageRequest</p>
 */
public class UpdateCloudPhoneNodeSystemImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    private UpdateCloudPhoneNodeSystemImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudPhoneNodeSystemImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<UpdateCloudPhoneNodeSystemImageRequest, Builder> {
        private String imageId; 
        private java.util.List<String> nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudPhoneNodeSystemImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.nodeIds = request.nodeIds;
        } 

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The list of cloud phone normal matrix IDs.</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        @Override
        public UpdateCloudPhoneNodeSystemImageRequest build() {
            return new UpdateCloudPhoneNodeSystemImageRequest(this);
        } 

    } 

}
