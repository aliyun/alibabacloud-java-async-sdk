// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeUserBaselineAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBaselineAuthorizationResponseBody</p>
 */
public class DescribeUserBaselineAuthorizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserBaselineAuthorization")
    private UserBaselineAuthorization userBaselineAuthorization;


    private DescribeUserBaselineAuthorizationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userBaselineAuthorization = builder.userBaselineAuthorization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBaselineAuthorizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userBaselineAuthorization
     */
    public UserBaselineAuthorization getUserBaselineAuthorization() {
        return this.userBaselineAuthorization;
    }

    public static final class Builder {
        private String requestId; 
        private UserBaselineAuthorization userBaselineAuthorization; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>UserBaselineAuthorization.</p>
         */
        public Builder userBaselineAuthorization(UserBaselineAuthorization userBaselineAuthorization) {
            this.userBaselineAuthorization = userBaselineAuthorization;
            return this;
        }

        public DescribeUserBaselineAuthorizationResponseBody build() {
            return new DescribeUserBaselineAuthorizationResponseBody(this);
        } 

    } 

    public static class UserBaselineAuthorization extends TeaModel {
        @NameInMap("Status")
        private Integer status;


        private UserBaselineAuthorization(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserBaselineAuthorization create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer status; 

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public UserBaselineAuthorization build() {
                return new UserBaselineAuthorization(this);
            } 

        } 

    }
}
