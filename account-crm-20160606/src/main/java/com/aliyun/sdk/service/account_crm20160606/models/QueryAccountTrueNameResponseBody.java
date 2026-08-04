// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryAccountTrueNameResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccountTrueNameResponseBody</p>
 */
public class QueryAccountTrueNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProfileInfo")
    private ProfileInfo profileInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAccountTrueNameResponseBody(Builder builder) {
        this.profileInfo = builder.profileInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountTrueNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profileInfo
     */
    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProfileInfo profileInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAccountTrueNameResponseBody model) {
            this.profileInfo = model.profileInfo;
            this.requestId = model.requestId;
        } 

        /**
         * ProfileInfo.
         */
        public Builder profileInfo(ProfileInfo profileInfo) {
            this.profileInfo = profileInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAccountTrueNameResponseBody build() {
            return new QueryAccountTrueNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccountTrueNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccountTrueNameResponseBody</p>
     */
    public static class ProfileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrueName")
        private String trueName;

        private ProfileInfo(Builder builder) {
            this.trueName = builder.trueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProfileInfo create() {
            return builder().build();
        }

        /**
         * @return trueName
         */
        public String getTrueName() {
            return this.trueName;
        }

        public static final class Builder {
            private String trueName; 

            private Builder() {
            } 

            private Builder(ProfileInfo model) {
                this.trueName = model.trueName;
            } 

            /**
             * TrueName.
             */
            public Builder trueName(String trueName) {
                this.trueName = trueName;
                return this;
            }

            public ProfileInfo build() {
                return new ProfileInfo(this);
            } 

        } 

    }
}
