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
         * <p>Instance ID.</p>
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
         * <p>The new name of the instance.</p>
         * <blockquote>
         * <ul>
         * <li>The instance name must not exceed 30 characters; it should start with a letter (uppercase or lowercase) or a Chinese character, and cannot begin with http:// or https://. Only supports Chinese, English, numbers, colon (:), underscore (_), period (.), or hyphen (-).</li>
         * </ul>
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
