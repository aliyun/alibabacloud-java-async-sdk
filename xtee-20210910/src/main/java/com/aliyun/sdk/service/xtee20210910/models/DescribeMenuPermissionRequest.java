// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Sets the language type for requests and responses, with a default value of <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Permission type</p>
         * 
         * <strong>example:</strong>
         * <p>MENU</p>
         */
        public Builder permissionType(String permissionType) {
            this.putQueryParameter("permissionType", permissionType);
            this.permissionType = permissionType;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
