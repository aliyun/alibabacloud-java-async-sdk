// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateApplicationBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationBaseInfoRequest</p>
 */
public class UpdateApplicationBaseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    private UpdateApplicationBaseInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.desc = builder.desc;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationBaseInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationBaseInfoRequest, Builder> {
        private String appId; 
        private String appName; 
        private String desc; 
        private String owner; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationBaseInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.desc = request.desc;
            this.owner = request.owner;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d-43ff-<strong><strong>-</strong></strong>********</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the application. The name must start with a letter, and can contain letters, digits, underscores (_), and hyphens (-). The name can be up to 36 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>hello-edas</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The description of the application. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Test application</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The owner of the application. The value can be up to 127 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun_xxx.com">test@aliyun_xxx.com</a></p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        @Override
        public UpdateApplicationBaseInfoRequest build() {
            return new UpdateApplicationBaseInfoRequest(this);
        } 

    } 

}
