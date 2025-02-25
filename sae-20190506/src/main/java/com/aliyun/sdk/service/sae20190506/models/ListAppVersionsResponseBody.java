// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAppVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppVersionsResponseBody</p>
 */
public class ListAppVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates whether the historical versions of the application were obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the historical versions of the application were obtained.</li>
         * <li><strong>false</strong>: indicates that the historical versions of the application could not be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The deployment method of the application. Valid values:</p>
         * <ul>
         * <li><strong>image</strong>: indicates that the application was deployed by using an image.</li>
         * <li><strong>upload</strong>: indicates that the application was deployed by uploading a WAR or JAR package.</li>
         * <li><strong>url</strong>: indicates that the application was deployed by specifying the URL of a WAR or JAR package.</li>
         * </ul>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about the versions.</p>
         * 
         * <strong>example:</strong>
         * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
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

    /**
     * 
     * {@link ListAppVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppVersionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildPackageUrl")
        private String buildPackageUrl;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WarUrl")
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
             * <ul>
             * <li>The address of the image. This parameter is returned when the <strong>Type</strong> parameter is set to <strong>image</strong>.</li>
             * <li>The download link of the WAR or JAR package. This parameter is returned when the <strong>Type</strong> parameter is set to <strong>upload</strong>.</li>
             * </ul>
             */
            public Builder buildPackageUrl(String buildPackageUrl) {
                this.buildPackageUrl = buildPackageUrl;
                return this;
            }

            /**
             * <p>The download link of the WAR or JAR package. This parameter is returned when the <strong>Type</strong> parameter is set to <strong>url</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1590124643553</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code.</p>
             * <ul>
             * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
             * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>a0ce266c-d354-423a-9bd6-4083405a****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the version.</p>
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
