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
 * {@link UpdateInstanceImageRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceImageRequest</p>
 */
public class UpdateInstanceImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private java.util.List<String> instanceIdList;

    private UpdateInstanceImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceIdList = builder.instanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceImageRequest create() {
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
     * @return instanceIdList
     */
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceImageRequest, Builder> {
        private String imageId; 
        private java.util.List<String> instanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.instanceIdList = request.instanceIdList;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceIdList.
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        @Override
        public UpdateInstanceImageRequest build() {
            return new UpdateInstanceImageRequest(this);
        } 

    } 

}
