// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppVersionsResponseBody</p>
 */
public class ListAppVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAppVersionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppVersionsResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates whether the historical versions of the application were obtained. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the historical versions of the application were obtained.
         * *   **false**: indicates that the historical versions of the application could not be obtained.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The deployment method of the application. Valid values:
         * <p>
         * 
         * *   **image**: indicates that the application was deployed by using an image.
         * *   **upload**: indicates that the application was deployed by uploading a WAR or JAR package.
         * *   **url**: indicates that the application was deployed by specifying the URL of a WAR or JAR package.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The information about the versions.
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

        public ListAppVersionsResponseBody build() {
            return new ListAppVersionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BuildPackageUrl")
        private String buildPackageUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("Type")
        private String type;

        @NameInMap("WarUrl")
        private String warUrl;

        private Data(Builder builder) {
            this.buildPackageUrl = builder.buildPackageUrl;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.type = builder.type;
            this.warUrl = builder.warUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buildPackageUrl
         */
        public String getBuildPackageUrl() {
            return this.buildPackageUrl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return warUrl
         */
        public String getWarUrl() {
            return this.warUrl;
        }

        public static final class Builder {
            private String buildPackageUrl; 
            private String createTime; 
            private String id; 
            private String type; 
            private String warUrl; 

            /**
             * *   The address of the image. This parameter is returned when the **Type** parameter is set to **image**.
             * <p>
             * *   The download link of the WAR or JAR package. This parameter is returned when the **Type** parameter is set to **upload**.
             */
            public Builder buildPackageUrl(String buildPackageUrl) {
                this.buildPackageUrl = buildPackageUrl;
                return this;
            }

            /**
             * The download link of the WAR or JAR package. This parameter is returned when the **Type** parameter is set to **url**.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The error code.
             * <p>
             * 
             * *   The **ErrorCode** parameter is not returned when the request succeeds.
             * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder warUrl(String warUrl) {
                this.warUrl = warUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
