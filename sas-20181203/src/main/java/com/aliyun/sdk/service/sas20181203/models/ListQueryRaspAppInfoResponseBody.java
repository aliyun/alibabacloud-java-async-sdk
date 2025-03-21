// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListQueryRaspAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryRaspAppInfoResponseBody</p>
 */
public class ListQueryRaspAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQueryRaspAppInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryRaspAppInfoResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The installation information of the RASP-enabled application.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1A975D03-5F49-5354-B2CB-3918D5DA431A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQueryRaspAppInfoResponseBody build() {
            return new ListQueryRaspAppInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueryRaspAppInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueryRaspAppInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RaspAppName")
        private String raspAppName;

        @com.aliyun.core.annotation.NameInMap("RaspOnlineStatus")
        private Integer raspOnlineStatus;

        @com.aliyun.core.annotation.NameInMap("RaspStatus")
        private String raspStatus;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.raspAppName = builder.raspAppName;
            this.raspOnlineStatus = builder.raspOnlineStatus;
            this.raspStatus = builder.raspStatus;
            this.result = builder.result;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return raspAppName
         */
        public String getRaspAppName() {
            return this.raspAppName;
        }

        /**
         * @return raspOnlineStatus
         */
        public Integer getRaspOnlineStatus() {
            return this.raspOnlineStatus;
        }

        /**
         * @return raspStatus
         */
        public String getRaspStatus() {
            return this.raspStatus;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String raspAppName; 
            private Integer raspOnlineStatus; 
            private String raspStatus; 
            private String result; 
            private String uuid; 

            /**
             * <p>The name of the RASP-enabled application.</p>
             * 
             * <strong>example:</strong>
             * <p>rasp-app</p>
             */
            public Builder raspAppName(String raspAppName) {
                this.raspAppName = raspAppName;
                return this;
            }

            /**
             * <p>The online status of the RASP-enabled applications. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: All RASP-enabled applications are online.</li>
             * <li><strong>1</strong>: Part of the RASP-enabled applications are online.</li>
             * <li><strong>2</strong>: All RASP-enabled applications are offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder raspOnlineStatus(Integer raspOnlineStatus) {
                this.raspOnlineStatus = raspOnlineStatus;
                return this;
            }

            /**
             * <p>The installation status of the RASP-enabled application. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong>: The RASP-enabled application is installed.</li>
             * <li><strong>FAIL</strong>: The RASP-enabled application fails to be installed.</li>
             * <li><strong>INSTALL</strong>: The RASP-enabled application is being installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder raspStatus(String raspStatus) {
                this.raspStatus = raspStatus;
                return this;
            }

            /**
             * <p>The result returned if the push fails.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT_OFFLINE</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
