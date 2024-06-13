// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopAndroidInstanceRequest</p>
 */
public class StopAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List < String > androidInstanceIds;

    private StopAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAndroidInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List < String > getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public static final class Builder extends Request.Builder<StopAndroidInstanceRequest, Builder> {
        private java.util.List < String > androidInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(StopAndroidInstanceRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List < String > androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        @Override
        public StopAndroidInstanceRequest build() {
            return new StopAndroidInstanceRequest(this);
        } 

    } 

}
