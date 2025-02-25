// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link SelectedDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>SelectedDomainListResponseBody</p>
 */
public class SelectedDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SelectedDomainListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectedDomainListResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>80011ABC-F573-4795-B0E8-377BFBBA3422</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SelectedDomainListResponseBody build() {
            return new SelectedDomainListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SelectedDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>SelectedDomainListResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        private Module(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static final class Builder {
            private String downloadUrl; 

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
