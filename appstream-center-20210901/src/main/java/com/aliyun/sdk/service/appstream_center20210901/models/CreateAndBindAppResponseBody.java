// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateAndBindAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndBindAppResponseBody</p>
 */
public class CreateAndBindAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateAndBindAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndBindAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateAndBindAppResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned by the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error or result message. This field describes the cause when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. Provide this value when you troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is processed successfully. A value of true indicates that the request is processed successfully. To determine whether an asynchronous task is completed, query the task status separately.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAndBindAppResponseBody build() {
            return new CreateAndBindAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndBindAppResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAndBindAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersionId")
        private String appVersionId;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appVersionId = builder.appVersionId;
            this.imageId = builder.imageId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appVersionId
         */
        public String getAppVersionId() {
            return this.appVersionId;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String appId; 
            private String appVersionId; 
            private String imageId; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appVersionId = model.appVersionId;
                this.imageId = model.imageId;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The application ID, which is used to query the application or dissociate the image later.</p>
             * 
             * <strong>example:</strong>
             * <p>app-bp1example****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application version ID, which is used to locate a specified version of the application. This field is not the image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apv-bp1example****</p>
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * <p>The image ID, which is used to query or modify the image later.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-bp1example****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image version ID, which is used to query or manage a specified version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-bp1example****</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
