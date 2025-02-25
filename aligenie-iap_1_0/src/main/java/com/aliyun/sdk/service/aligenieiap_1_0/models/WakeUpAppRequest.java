// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WakeUpAppRequest} extends {@link RequestModel}
 *
 * <p>WakeUpAppRequest</p>
 */
public class WakeUpAppRequest extends Request {
    @Body
    @NameInMap("IsDebug")
    private Boolean isDebug;

    @Body
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Body
    @NameInMap("TargetInfo")
    @Validation(required = true)
    private TargetInfo targetInfo;

    private WakeUpAppRequest(Builder builder) {
        super(builder);
        this.isDebug = builder.isDebug;
        this.path = builder.path;
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WakeUpAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDebug
     */
    public Boolean getIsDebug() {
        return this.isDebug;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return targetInfo
     */
    public TargetInfo getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder extends Request.Builder<WakeUpAppRequest, Builder> {
        private Boolean isDebug; 
        private String path; 
        private TargetInfo targetInfo; 

        private Builder() {
            super();
        } 

        private Builder(WakeUpAppRequest request) {
            super(request);
            this.isDebug = request.isDebug;
            this.path = request.path;
            this.targetInfo = request.targetInfo;
        } 

        /**
         * IsDebug.
         */
        public Builder isDebug(Boolean isDebug) {
            this.putBodyParameter("IsDebug", isDebug);
            this.isDebug = isDebug;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * TargetInfo.
         */
        public Builder targetInfo(TargetInfo targetInfo) {
            this.putBodyParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        @Override
        public WakeUpAppRequest build() {
            return new WakeUpAppRequest(this);
        } 

    } 

    public static class TargetInfo extends TeaModel {
        @NameInMap("EncodeKey")
        @Validation(required = true)
        private String encodeKey;

        @NameInMap("EncodeType")
        @Validation(required = true)
        private String encodeType;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("TargetIdentity")
        @Validation(required = true)
        private String targetIdentity;

        @NameInMap("TargetType")
        @Validation(required = true)
        private String targetType;

        private TargetInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.organizationId = builder.organizationId;
            this.targetIdentity = builder.targetIdentity;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return targetIdentity
         */
        public String getTargetIdentity() {
            return this.targetIdentity;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String organizationId; 
            private String targetIdentity; 
            private String targetType; 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * TargetIdentity.
             */
            public Builder targetIdentity(String targetIdentity) {
                this.targetIdentity = targetIdentity;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetInfo build() {
                return new TargetInfo(this);
            } 

        } 

    }
}
