// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyAndroidInstanceRequest</p>
 */
public class ModifyAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
    private String androidInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAndroidInstanceName")
    private String newAndroidInstanceName;

    private ModifyAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.androidInstanceId = builder.androidInstanceId;
        this.newAndroidInstanceName = builder.newAndroidInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAndroidInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceId
     */
    public String getAndroidInstanceId() {
        return this.androidInstanceId;
    }

    /**
     * @return newAndroidInstanceName
     */
    public String getNewAndroidInstanceName() {
        return this.newAndroidInstanceName;
    }

    public static final class Builder extends Request.Builder<ModifyAndroidInstanceRequest, Builder> {
        private String androidInstanceId; 
        private String newAndroidInstanceName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAndroidInstanceRequest request) {
            super(request);
            this.androidInstanceId = request.androidInstanceId;
            this.newAndroidInstanceName = request.newAndroidInstanceName;
        } 

        /**
         * <p>The ID of the cloud phone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-8v5bjld0r7tkl****</p>
         */
        public Builder androidInstanceId(String androidInstanceId) {
            this.putQueryParameter("AndroidInstanceId", androidInstanceId);
            this.androidInstanceId = androidInstanceId;
            return this;
        }

        /**
         * <p>The new name of the cloud phone instance.</p>
         * <blockquote>
         * <p> The name can be up to 30 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), or hyphens (-). It must start with letters but cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>new_name</p>
         */
        public Builder newAndroidInstanceName(String newAndroidInstanceName) {
            this.putQueryParameter("NewAndroidInstanceName", newAndroidInstanceName);
            this.newAndroidInstanceName = newAndroidInstanceName;
            return this;
        }

        @Override
        public ModifyAndroidInstanceRequest build() {
            return new ModifyAndroidInstanceRequest(this);
        } 

    } 

}
