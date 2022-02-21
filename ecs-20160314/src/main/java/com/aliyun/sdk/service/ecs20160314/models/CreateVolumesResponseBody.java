// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVolumesResponseBody</p>
 */
public class CreateVolumesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VolumeIds")
    private VolumeIds volumeIds;

    private CreateVolumesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.volumeIds = builder.volumeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVolumesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return volumeIds
     */
    public VolumeIds getVolumeIds() {
        return this.volumeIds;
    }

    public static final class Builder {
        private String requestId; 
        private VolumeIds volumeIds; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VolumeIds.
         */
        public Builder volumeIds(VolumeIds volumeIds) {
            this.volumeIds = volumeIds;
            return this;
        }

        public CreateVolumesResponseBody build() {
            return new CreateVolumesResponseBody(this);
        } 

    } 

    public static class VolumeIds extends TeaModel {
        @NameInMap("VolumeId")
        private java.util.List < String > volumeId;

        private VolumeIds(Builder builder) {
            this.volumeId = builder.volumeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeIds create() {
            return builder().build();
        }

        /**
         * @return volumeId
         */
        public java.util.List < String > getVolumeId() {
            return this.volumeId;
        }

        public static final class Builder {
            private java.util.List < String > volumeId; 

            /**
             * VolumeId.
             */
            public Builder volumeId(java.util.List < String > volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            public VolumeIds build() {
                return new VolumeIds(this);
            } 

        } 

    }
}
