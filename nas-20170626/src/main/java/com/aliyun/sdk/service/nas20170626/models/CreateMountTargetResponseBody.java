// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMountTargetResponseBody</p>
 */
public class CreateMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @com.aliyun.core.annotation.NameInMap("MountTargetExtra")
    private MountTargetExtra mountTargetExtra;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The IPv4 domain name of the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>174494b666-x****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * <p>The information about the mount target.</p>
         */
        public Builder mountTargetExtra(MountTargetExtra mountTargetExtra) {
            this.mountTargetExtra = mountTargetExtra;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70EACC9C-D07A-4A34-ADA4-77506C42****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMountTargetResponseBody build() {
            return new CreateMountTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMountTargetResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMountTargetResponseBody</p>
     */
    public static class MountTargetExtra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DualStackMountTargetDomain")
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
             * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
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
