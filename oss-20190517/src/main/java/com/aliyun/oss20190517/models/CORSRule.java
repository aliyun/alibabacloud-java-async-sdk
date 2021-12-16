// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CORSRule} extends {@link TeaModel}
 *
 * <p>CORSRule</p>
 */
public class CORSRule extends TeaModel {
    @NameInMap("AllowedHeader")
    private String allowedHeader;

    @NameInMap("AllowedMethod")
    private java.util.List < String > allowedMethod;

    @NameInMap("AllowedOrigin")
    private java.util.List < String > allowedOrigin;

    @NameInMap("ExposeHeader")
    private java.util.List < String > exposeHeader;

    @NameInMap("MaxAgeSeconds")
    private Long maxAgeSeconds;


    private CORSRule(Builder builder) {
        this.allowedHeader = builder.allowedHeader;
        this.allowedMethod = builder.allowedMethod;
        this.allowedOrigin = builder.allowedOrigin;
        this.exposeHeader = builder.exposeHeader;
        this.maxAgeSeconds = builder.maxAgeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CORSRule create() {
        return builder().build();
    }

    /**
     * @return allowedHeader
     */
    public String getAllowedHeader() {
        return this.allowedHeader;
    }

    /**
     * @return allowedMethod
     */
    public java.util.List < String > getAllowedMethod() {
        return this.allowedMethod;
    }

    /**
     * @return allowedOrigin
     */
    public java.util.List < String > getAllowedOrigin() {
        return this.allowedOrigin;
    }

    /**
     * @return exposeHeader
     */
    public java.util.List < String > getExposeHeader() {
        return this.exposeHeader;
    }

    /**
     * @return maxAgeSeconds
     */
    public Long getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public static final class Builder {
        private String allowedHeader; 
        private java.util.List < String > allowedMethod; 
        private java.util.List < String > allowedOrigin; 
        private java.util.List < String > exposeHeader; 
        private Long maxAgeSeconds; 

        /**
         * <p>description</p>
         */
        public Builder allowedHeader(String allowedHeader) {
            this.allowedHeader = allowedHeader;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder allowedMethod(java.util.List < String > allowedMethod) {
            this.allowedMethod = allowedMethod;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder allowedOrigin(java.util.List < String > allowedOrigin) {
            this.allowedOrigin = allowedOrigin;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder exposeHeader(java.util.List < String > exposeHeader) {
            this.exposeHeader = exposeHeader;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder maxAgeSeconds(Long maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }

        public CORSRule build() {
            return new CORSRule(this);
        } 

    } 

}
