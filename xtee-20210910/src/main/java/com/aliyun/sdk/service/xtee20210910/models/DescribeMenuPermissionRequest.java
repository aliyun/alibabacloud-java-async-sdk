// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMenuPermissionRequest} extends {@link RequestModel}
 *
 * <p>DescribeMenuPermissionRequest</p>
 */
public class DescribeMenuPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("permissionType")
    private String permissionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeMenuPermissionRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.permissionType = builder.permissionType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMenuPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return permissionType
     */
    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeMenuPermissionRequest, Builder> {
        private String lang; 
        private String permissionType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMenuPermissionRequest request) {
            super(request);
            this.lang = request.lang;
            this.permissionType = request.permissionType;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * permissionType.
         */
        public Builder permissionType(String permissionType) {
            this.putQueryParameter("permissionType", permissionType);
            this.permissionType = permissionType;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeMenuPermissionRequest build() {
            return new DescribeMenuPermissionRequest(this);
        } 

    } 

}
