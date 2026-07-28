// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProfileResponseBody</p>
 */
public class DescribeProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("ProfileSummary")
    private Object profileSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProfileResponseBody(Builder builder) {
        this.profile = builder.profile;
        this.profileSummary = builder.profileSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProfileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return profileSummary
     */
    public Object getProfileSummary() {
        return this.profileSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String profile; 
        private Object profileSummary; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeProfileResponseBody model) {
            this.profile = model.profile;
            this.profileSummary = model.profileSummary;
            this.requestId = model.requestId;
        } 

        /**
         * Profile.
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * ProfileSummary.
         */
        public Builder profileSummary(Object profileSummary) {
            this.profileSummary = profileSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProfileResponseBody build() {
            return new DescribeProfileResponseBody(this);
        } 

    } 

}
