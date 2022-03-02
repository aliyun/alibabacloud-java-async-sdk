// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ErrorDocument} extends {@link TeaModel}
 *
 * <p>ErrorDocument</p>
 */
public class ErrorDocument extends TeaModel {
    @NameInMap("HttpStatus")
    private String httpStatus;

    @NameInMap("Key")
    private String key;

    private ErrorDocument(Builder builder) {
        this.httpStatus = builder.httpStatus;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ErrorDocument create() {
        return builder().build();
    }

    /**
     * @return httpStatus
     */
    public String getHttpStatus() {
        return this.httpStatus;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder {
        private String httpStatus; 
        private String key; 

        /**
         * description
         */
        public Builder httpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        /**
         * description
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        public ErrorDocument build() {
            return new ErrorDocument(this);
        } 

    } 

}
