// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BaseAlbumFileOperationResult} extends {@link TeaModel}
 *
 * <p>BaseAlbumFileOperationResult</p>
 */
public class BaseAlbumFileOperationResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_message")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("file")
    private CommonFileItem file;

    @com.aliyun.core.annotation.NameInMap("is_succeed")
    private Boolean isSucceed;

    private BaseAlbumFileOperationResult(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.file = builder.file;
        this.isSucceed = builder.isSucceed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BaseAlbumFileOperationResult create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return file
     */
    public CommonFileItem getFile() {
        return this.file;
    }

    /**
     * @return isSucceed
     */
    public Boolean getIsSucceed() {
        return this.isSucceed;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private CommonFileItem file; 
        private Boolean isSucceed; 

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * file.
         */
        public Builder file(CommonFileItem file) {
            this.file = file;
            return this;
        }

        /**
         * is_succeed.
         */
        public Builder isSucceed(Boolean isSucceed) {
            this.isSucceed = isSucceed;
            return this;
        }

        public BaseAlbumFileOperationResult build() {
            return new BaseAlbumFileOperationResult(this);
        } 

    } 

}
