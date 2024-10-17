// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRumAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRumAppResponseBody</p>
 */
public class CreateRumAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateRumAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRumAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String resourceGroupId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. 2XX indicates that the request was successful. 3XX indicates that the request was redirected. 4XX indicates that a request error occurred. 5XX indicates that a server error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application ID and domain names. This parameter is returned if the application is created. Multiple domain names are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ggxxxnjuz@xxxx,xxxxxx-default-cn.rum.aliyuncs.com</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>1A474FF8-7861-4D00-81B5-5BC3DA4E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateRumAppResponseBody build() {
            return new CreateRumAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRumAppResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRumAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnDomain")
        private String cdnDomain;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        private Data(Builder builder) {
            this.cdnDomain = builder.cdnDomain;
            this.endpoint = builder.endpoint;
            this.pid = builder.pid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdnDomain
         */
        public String getCdnDomain() {
            return this.cdnDomain;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        public static final class Builder {
            private String cdnDomain; 
            private String endpoint; 
            private String pid; 

            /**
             * <p>The domain name of the SDK.</p>
             * 
             * <strong>example:</strong>
             * <p>bxxxxxxx-sdk.rum.aliyuncs.com/v2/browser-sdk.js</p>
             */
            public Builder cdnDomain(String cdnDomain) {
                this.cdnDomain = cdnDomain;
                return this;
            }

            /**
             * <p>The endpoint that is used to report application data.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx-default-cn.rum.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The process ID (PID) of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>avccccxxxx@24cxxxxbf384dc6</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
