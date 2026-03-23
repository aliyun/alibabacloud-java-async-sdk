// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link NewApgroupConfigRequest} extends {@link RequestModel}
 *
 * <p>NewApgroupConfigRequest</p>
 */
public class NewApgroupConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentApgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentApgroupId;

    private NewApgroupConfigRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.name = builder.name;
        this.parentApgroupId = builder.parentApgroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NewApgroupConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentApgroupId
     */
    public String getParentApgroupId() {
        return this.parentApgroupId;
    }

    public static final class Builder extends Request.Builder<NewApgroupConfigRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String name; 
        private String parentApgroupId; 

        private Builder() {
            super();
        } 

        private Builder(NewApgroupConfigRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.name = request.name;
            this.parentApgroupId = request.parentApgroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder parentApgroupId(String parentApgroupId) {
            this.putQueryParameter("ParentApgroupId", parentApgroupId);
            this.parentApgroupId = parentApgroupId;
            return this;
        }

        @Override
        public NewApgroupConfigRequest build() {
            return new NewApgroupConfigRequest(this);
        } 

    } 

}
