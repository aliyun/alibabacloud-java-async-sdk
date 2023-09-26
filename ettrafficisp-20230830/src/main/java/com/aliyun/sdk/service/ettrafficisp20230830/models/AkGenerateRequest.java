// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AkGenerateRequest} extends {@link RequestModel}
 *
 * <p>AkGenerateRequest</p>
 */
public class AkGenerateRequest extends Request {
    @Body
    @NameInMap("accessKeyName")
    private String accessKeyName;

    @Body
    @NameInMap("permissions")
    private java.util.List < String > permissions;

    @Body
    @NameInMap("userId")
    private Long userId;

    private AkGenerateRequest(Builder builder) {
        super(builder);
        this.accessKeyName = builder.accessKeyName;
        this.permissions = builder.permissions;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AkGenerateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyName
     */
    public String getAccessKeyName() {
        return this.accessKeyName;
    }

    /**
     * @return permissions
     */
    public java.util.List < String > getPermissions() {
        return this.permissions;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AkGenerateRequest, Builder> {
        private String accessKeyName; 
        private java.util.List < String > permissions; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(AkGenerateRequest request) {
            super(request);
            this.accessKeyName = request.accessKeyName;
            this.permissions = request.permissions;
            this.userId = request.userId;
        } 

        /**
         * accessKeyName.
         */
        public Builder accessKeyName(String accessKeyName) {
            this.putBodyParameter("accessKeyName", accessKeyName);
            this.accessKeyName = accessKeyName;
            return this;
        }

        /**
         * permissions.
         */
        public Builder permissions(java.util.List < String > permissions) {
            this.putBodyParameter("permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AkGenerateRequest build() {
            return new AkGenerateRequest(this);
        } 

    } 

}
