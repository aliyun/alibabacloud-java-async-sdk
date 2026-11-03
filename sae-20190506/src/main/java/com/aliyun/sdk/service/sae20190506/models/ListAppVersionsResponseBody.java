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

        private Builder() {
        } 

        private Builder(ListAppVersionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: The call is successful.</p>
         * </li>
         * <li><p><strong>3xx</strong>: The call is redirected.</p>
         * </li>
         * <li><p><strong>4xx</strong>: A request error occurred.</p>
         * </li>
         * <li><p><strong>5xx</strong>: A server error occurred.</p>
         * </li>
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
         * <p>The version information.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * <ul>
         * <li><p>This parameter is not returned if the request is successful.</p>
         * </li>
         * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidApplication.NotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>Additional information about the call.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the historical versions of the application were successfully queried. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The query was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The query failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.buildPackageUrl = model.buildPackageUrl;
                this.createTime = model.createTime;
                this.id = model.id;
                this.type = model.type;
                this.warUrl = model.warUrl;
            } 

            /**
             * <p>The download URL of the code package. If you uploaded the package using SAE, note the following:</p>
             * <ul>
             * <li><p>This URL is not a direct download link. You must call the GetPackageVersionAccessableUrl operation to obtain a downloadable URL that is valid for 10 minutes.</p>
             * </li>
             * <li><p>SAE stores the package for a maximum of 90 days. After this period, the URL is not returned and the package cannot be downloaded.</p>
             * </li>
             * </ul>
             */
            public Builder buildPackageUrl(String buildPackageUrl) {
                this.buildPackageUrl = buildPackageUrl;
                return this;
            }

            /**
             * <p>The time when the version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1590124643553</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a0ce266c-d354-423a-9bd6-4083405a****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The application type. Valid values:</p>
             * <ul>
             * <li><p><strong>image</strong>: The application is deployed using an image.</p>
             * </li>
             * <li><p><strong>url</strong>: The application is deployed using a code package.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the WAR package.</p>
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
