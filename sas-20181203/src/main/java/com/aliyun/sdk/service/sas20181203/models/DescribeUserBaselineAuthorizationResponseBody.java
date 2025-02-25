// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeUserBaselineAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBaselineAuthorizationResponseBody</p>
 */
public class DescribeUserBaselineAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserBaselineAuthorization")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AF20EB0-EBBC-4B94-9B84-F3BAFAC53EDE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about whether Security Center is authorized to run configuration checks on cloud services.</p>
         */
        public Builder userBaselineAuthorization(UserBaselineAuthorization userBaselineAuthorization) {
            this.userBaselineAuthorization = userBaselineAuthorization;
            return this;
        }

        public DescribeUserBaselineAuthorizationResponseBody build() {
            return new DescribeUserBaselineAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserBaselineAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserBaselineAuthorizationResponseBody</p>
     */
    public static class UserBaselineAuthorization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>Indicates whether Security Center is authorized to run configuration checks on cloud services.</p>
             * <ul>
             * <li><strong>0</strong>: no. Security Center is not authorized to run configuration checks on cloud services.</li>
             * <li><strong>1</strong>: yes. Security Center is authorized to run configuration checks on cloud services.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
