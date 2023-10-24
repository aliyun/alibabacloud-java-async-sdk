// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetImageSensitiveFileStatusRequest} extends {@link RequestModel}
 *
 * <p>SetImageSensitiveFileStatusRequest</p>
 */
public class SetImageSensitiveFileStatusRequest extends Request {
    @Query
    @NameInMap("ImageUuids")
    private String imageUuids;

    @Query
    @NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

    @Query
    @NameInMap("Status")
    private Integer status;

    private SetImageSensitiveFileStatusRequest(Builder builder) {
        super(builder);
        this.imageUuids = builder.imageUuids;
        this.sensitiveFileKey = builder.sensitiveFileKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetImageSensitiveFileStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUuids
     */
    public String getImageUuids() {
        return this.imageUuids;
    }

    /**
     * @return sensitiveFileKey
     */
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetImageSensitiveFileStatusRequest, Builder> {
        private String imageUuids; 
        private String sensitiveFileKey; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(SetImageSensitiveFileStatusRequest request) {
            super(request);
            this.imageUuids = request.imageUuids;
            this.sensitiveFileKey = request.sensitiveFileKey;
            this.status = request.status;
        } 

        /**
         * ImageUuids.
         */
        public Builder imageUuids(String imageUuids) {
            this.putQueryParameter("ImageUuids", imageUuids);
            this.imageUuids = imageUuids;
            return this;
        }

        /**
         * SensitiveFileKey.
         */
        public Builder sensitiveFileKey(String sensitiveFileKey) {
            this.putQueryParameter("SensitiveFileKey", sensitiveFileKey);
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetImageSensitiveFileStatusRequest build() {
            return new SetImageSensitiveFileStatusRequest(this);
        } 

    } 

}
