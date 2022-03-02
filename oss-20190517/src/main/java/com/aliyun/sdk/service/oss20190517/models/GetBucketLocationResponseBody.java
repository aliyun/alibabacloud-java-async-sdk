// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketLocationResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketLocationResponseBody</p>
 */
public class GetBucketLocationResponseBody extends TeaModel {
    @NameInMap("LocationConstraint")
    private String locationConstraint;

    private GetBucketLocationResponseBody(Builder builder) {
        this.locationConstraint = builder.locationConstraint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketLocationResponseBody create() {
        return builder().build();
    }

    /**
     * @return locationConstraint
     */
    public String getLocationConstraint() {
        return this.locationConstraint;
    }

    public static final class Builder {
        private String locationConstraint; 

        /**
         * LocationConstraint.
         */
        public Builder locationConstraint(String locationConstraint) {
            this.locationConstraint = locationConstraint;
            return this;
        }

        public GetBucketLocationResponseBody build() {
            return new GetBucketLocationResponseBody(this);
        } 

    } 

}
