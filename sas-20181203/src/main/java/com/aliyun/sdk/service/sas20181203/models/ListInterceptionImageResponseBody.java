// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionImageResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterceptionImageResponseBody</p>
 */
public class ListInterceptionImageResponseBody extends TeaModel {
    @NameInMap("ImageList")
    private java.util.List < ImageList> imageList;

    @NameInMap("RequestId")
    private String requestId;

    private ListInterceptionImageResponseBody(Builder builder) {
        this.imageList = builder.imageList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageList
     */
    public java.util.List < ImageList> getImageList() {
        return this.imageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ImageList> imageList; 
        private String requestId; 

        /**
         * ImageList.
         */
        public Builder imageList(java.util.List < ImageList> imageList) {
            this.imageList = imageList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInterceptionImageResponseBody build() {
            return new ListInterceptionImageResponseBody(this);
        } 

    } 

    public static class ImageList extends TeaModel {
        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageUuid")
        private String imageUuid;

        private ImageList(Builder builder) {
            this.imageName = builder.imageName;
            this.imageUuid = builder.imageUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageList create() {
            return builder().build();
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageUuid
         */
        public String getImageUuid() {
            return this.imageUuid;
        }

        public static final class Builder {
            private String imageName; 
            private String imageUuid; 

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageUuid.
             */
            public Builder imageUuid(String imageUuid) {
                this.imageUuid = imageUuid;
                return this;
            }

            public ImageList build() {
                return new ImageList(this);
            } 

        } 

    }
}
