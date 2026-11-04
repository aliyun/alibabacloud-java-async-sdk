// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link UpdatePictureSearchAppRequest} extends {@link RequestModel}
 *
 * <p>UpdatePictureSearchAppRequest</p>
 */
public class UpdatePictureSearchAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdatePictureSearchAppRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePictureSearchAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdatePictureSearchAppRequest, Builder> {
        private String appInstanceId; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePictureSearchAppRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>Instance ID of the image search application instance. You can call the <a href="206608">QueryPictureSearchApps</a> operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3e429560124b44b685095df81a27****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The description of the image search application instance.</p>
         * <p>The description can contain Chinese characters, uppercase and lowercase letters, digits, underscores (_), and hyphens (-). It can be up to 1,024 characters in length, and each Chinese character counts as two characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>以图搜图Demo2</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the image search application instance. </p>
         * <p>The name can contain Chinese characters, uppercase and lowercase letters, digits, underscores (_), and hyphens (-). It can be up to 64 characters in length, and each Chinese character counts as two characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>新以图搜图</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdatePictureSearchAppRequest build() {
            return new UpdatePictureSearchAppRequest(this);
        } 

    } 

}
