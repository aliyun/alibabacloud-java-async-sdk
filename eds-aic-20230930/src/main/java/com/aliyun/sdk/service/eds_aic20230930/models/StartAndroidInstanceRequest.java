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
 * {@link StartAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartAndroidInstanceRequest</p>
 */
public class StartAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    private StartAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAndroidInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public static final class Builder extends Request.Builder<StartAndroidInstanceRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(StartAndroidInstanceRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        @Override
        public StartAndroidInstanceRequest build() {
            return new StartAndroidInstanceRequest(this);
        } 

    } 

}
