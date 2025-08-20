// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

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
 * {@link WakeUpAppRequest} extends {@link RequestModel}
 *
 * <p>WakeUpAppRequest</p>
 */
public class WakeUpAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDebug")
    private Boolean isDebug;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>应用拉起路径</p>
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link WakeUpAppRequest} extends {@link TeaModel}
     *
     * <p>WakeUpAppRequest</p>
     */
    public static class TargetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("TargetIdentity")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetIdentity;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(TargetInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.organizationId = model.organizationId;
                this.targetIdentity = model.targetIdentity;
                this.targetType = model.targetType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>apk包名</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PACKAGE_NAME</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2VpiDQ6aMjxz******Eo7r6e08oIVZ3fKrm5TyEfY=</p>
             */
            public Builder targetIdentity(String targetIdentity) {
                this.targetIdentity = targetIdentity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEVICE_OPEN_ID</p>
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
