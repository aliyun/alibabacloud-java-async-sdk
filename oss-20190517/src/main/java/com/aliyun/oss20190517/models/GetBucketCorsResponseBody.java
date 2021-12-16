// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketCorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketCorsResponseBody</p>
 */
public class GetBucketCorsResponseBody extends TeaModel {
    @ParentIgnore("CORSConfiguration")
    @NameInMap("CORSRule")
    private java.util.List < CORSRule > CORSRule;

    @ParentIgnore("CORSConfiguration")
    @NameInMap("ResponseVary")
    private Boolean responseVary;


    private GetBucketCorsResponseBody(Builder builder) {
        this.CORSRule = builder.CORSRule;
        this.responseVary = builder.responseVary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketCorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return CORSRule
     */
    public java.util.List < CORSRule > getCORSRule() {
        return this.CORSRule;
    }

    /**
     * @return responseVary
     */
    public Boolean getResponseVary() {
        return this.responseVary;
    }

    public static final class Builder {
        private java.util.List < CORSRule > CORSRule; 
        private Boolean responseVary; 

        /**
         * <p>CORSRule.</p>
         */
        public Builder CORSRule(java.util.List < CORSRule > CORSRule) {
            this.CORSRule = CORSRule;
            return this;
        }

        /**
         * <p>ResponseVary.</p>
         */
        public Builder responseVary(Boolean responseVary) {
            this.responseVary = responseVary;
            return this;
        }

        public GetBucketCorsResponseBody build() {
            return new GetBucketCorsResponseBody(this);
        } 

    } 

}
