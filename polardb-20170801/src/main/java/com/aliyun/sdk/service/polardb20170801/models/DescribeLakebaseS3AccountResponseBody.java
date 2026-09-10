// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeLakebaseS3AccountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLakebaseS3AccountResponseBody</p>
 */
public class DescribeLakebaseS3AccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserAccAk")
    private String userAccAk;

    @com.aliyun.core.annotation.NameInMap("UserAccPolicy")
    private String userAccPolicy;

    @com.aliyun.core.annotation.NameInMap("UserAccSk")
    private String userAccSk;

    private DescribeLakebaseS3AccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userAccAk = builder.userAccAk;
        this.userAccPolicy = builder.userAccPolicy;
        this.userAccSk = builder.userAccSk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseS3AccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userAccAk
     */
    public String getUserAccAk() {
        return this.userAccAk;
    }

    /**
     * @return userAccPolicy
     */
    public String getUserAccPolicy() {
        return this.userAccPolicy;
    }

    /**
     * @return userAccSk
     */
    public String getUserAccSk() {
        return this.userAccSk;
    }

    public static final class Builder {
        private String requestId; 
        private String userAccAk; 
        private String userAccPolicy; 
        private String userAccSk; 

        private Builder() {
        } 

        private Builder(DescribeLakebaseS3AccountResponseBody model) {
            this.requestId = model.requestId;
            this.userAccAk = model.userAccAk;
            this.userAccPolicy = model.userAccPolicy;
            this.userAccSk = model.userAccSk;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Access Key of the S3 account.</p>
         * 
         * <strong>example:</strong>
         * <p>accname</p>
         */
        public Builder userAccAk(String userAccAk) {
            this.userAccAk = userAccAk;
            return this;
        }

        /**
         * <p>The policy document of the S3 account.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;s3:<em>&quot;],&quot;Resource&quot;:[&quot;</em>&quot;]}]}</p>
         */
        public Builder userAccPolicy(String userAccPolicy) {
            this.userAccPolicy = userAccPolicy;
            return this;
        }

        /**
         * <p>The Secret Key of the S3 account (masked).</p>
         * 
         * <strong>example:</strong>
         * <p>password***</p>
         */
        public Builder userAccSk(String userAccSk) {
            this.userAccSk = userAccSk;
            return this;
        }

        public DescribeLakebaseS3AccountResponseBody build() {
            return new DescribeLakebaseS3AccountResponseBody(this);
        } 

    } 

}
