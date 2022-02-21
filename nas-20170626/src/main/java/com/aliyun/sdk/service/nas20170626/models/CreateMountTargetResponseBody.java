// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMountTargetResponseBody</p>
 */
public class CreateMountTargetResponseBody extends TeaModel {
    @NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @NameInMap("MountTargetExtra")
    private MountTargetExtra mountTargetExtra;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMountTargetResponseBody(Builder builder) {
        this.mountTargetDomain = builder.mountTargetDomain;
        this.mountTargetExtra = builder.mountTargetExtra;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMountTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    /**
     * @return mountTargetExtra
     */
    public MountTargetExtra getMountTargetExtra() {
        return this.mountTargetExtra;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mountTargetDomain; 
        private MountTargetExtra mountTargetExtra; 
        private String requestId; 

        /**
         * MountTargetDomain.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * MountTargetExtra.
         */
        public Builder mountTargetExtra(MountTargetExtra mountTargetExtra) {
            this.mountTargetExtra = mountTargetExtra;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMountTargetResponseBody build() {
            return new CreateMountTargetResponseBody(this);
        } 

    } 

    public static class MountTargetExtra extends TeaModel {
        @NameInMap("DualStackMountTargetDomain")
        private String dualStackMountTargetDomain;

        private MountTargetExtra(Builder builder) {
            this.dualStackMountTargetDomain = builder.dualStackMountTargetDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargetExtra create() {
            return builder().build();
        }

        /**
         * @return dualStackMountTargetDomain
         */
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        public static final class Builder {
            private String dualStackMountTargetDomain; 

            /**
             * DualStackMountTargetDomain.
             */
            public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
                this.dualStackMountTargetDomain = dualStackMountTargetDomain;
                return this;
            }

            public MountTargetExtra build() {
                return new MountTargetExtra(this);
            } 

        } 

    }
}
