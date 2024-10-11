// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListListenersByConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersByConfigResponseBody</p>
 */
public class ListListenersByConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersByConfigResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.listeners = builder.listeners;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersByConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String httpCode; 
        private java.util.List < Listeners> listeners; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The information about listeners.</p>
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>75E1442F-11EC-567A-9CF0-5A36F7904F39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersByConfigResponseBody build() {
            return new ListListenersByConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListListenersByConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersByConfigResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map < String, String > labels;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Listeners(Builder builder) {
            this.ip = builder.ip;
            this.labels = builder.labels;
            this.md5 = builder.md5;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return labels
         */
        public java.util.Map < String, String > getLabels() {
            return this.labels;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String ip; 
            private java.util.Map < String, String > labels; 
            private String md5; 
            private String status; 
            private String version; 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The label of the listener.</p>
             */
            public Builder labels(java.util.Map < String, String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The verification string.</p>
             * 
             * <strong>example:</strong>
             * <p>23sdfdf</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>beta</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The current version of the listener. Valid values: gray and normal.</p>
             * 
             * <strong>example:</strong>
             * <p>gray</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
