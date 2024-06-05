// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FaceThumbnail} extends {@link TeaModel}
 *
 * <p>FaceThumbnail</p>
 */
public class FaceThumbnail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("face_group_id")
    private String faceGroupId;

    @com.aliyun.core.annotation.NameInMap("face_id")
    private String faceId;

    @com.aliyun.core.annotation.NameInMap("face_thumbnail")
    @Deprecated
    private String faceThumbnail;

    private FaceThumbnail(Builder builder) {
        this.faceGroupId = builder.faceGroupId;
        this.faceId = builder.faceId;
        this.faceThumbnail = builder.faceThumbnail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceThumbnail create() {
        return builder().build();
    }

    /**
     * @return faceGroupId
     */
    public String getFaceGroupId() {
        return this.faceGroupId;
    }

    /**
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * @return faceThumbnail
     */
    public String getFaceThumbnail() {
        return this.faceThumbnail;
    }

    public static final class Builder {
        private String faceGroupId; 
        private String faceId; 
        private String faceThumbnail; 

        /**
         * face_group_id.
         */
        public Builder faceGroupId(String faceGroupId) {
            this.faceGroupId = faceGroupId;
            return this;
        }

        /**
         * face_id.
         */
        public Builder faceId(String faceId) {
            this.faceId = faceId;
            return this;
        }

        /**
         * face_thumbnail.
         */
        public Builder faceThumbnail(String faceThumbnail) {
            this.faceThumbnail = faceThumbnail;
            return this;
        }

        public FaceThumbnail build() {
            return new FaceThumbnail(this);
        } 

    } 

}
