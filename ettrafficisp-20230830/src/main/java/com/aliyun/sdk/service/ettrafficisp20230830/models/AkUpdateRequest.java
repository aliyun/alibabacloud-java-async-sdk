// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AkUpdateRequest} extends {@link RequestModel}
 *
 * <p>AkUpdateRequest</p>
 */
public class AkUpdateRequest extends Request {
    @Body
    @NameInMap("accessKeyId")
    private String accessKeyId;

    @Body
    @NameInMap("accessKeyName")
    private String accessKeyName;

    @Body
    @NameInMap("permissions")
    private java.util.List < String > permissions;

    private AkUpdateRequest(Builder builder) {
        super(builder);
        this.accessKeyId = builder.accessKeyId;
        this.accessKeyName = builder.accessKeyName;
        this.permissions = builder.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AkUpdateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
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

    public static final class Builder extends Request.Builder<AkUpdateRequest, Builder> {
        private String accessKeyId; 
        private String accessKeyName; 
        private java.util.List < String > permissions; 

        private Builder() {
            super();
        } 

        private Builder(AkUpdateRequest request) {
            super(request);
            this.accessKeyId = request.accessKeyId;
            this.accessKeyName = request.accessKeyName;
            this.permissions = request.permissions;
        } 

        /**
         * accessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.putBodyParameter("accessKeyId", accessKeyId);
            this.accessKeyId = accessKeyId;
            return this;
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

        @Override
        public AkUpdateRequest build() {
            return new AkUpdateRequest(this);
        } 

    } 

}
