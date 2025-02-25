// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateRetcodeAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRetcodeAppResponseBody</p>
 */
public class CreateRetcodeAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetcodeAppDataBean")
    private RetcodeAppDataBean retcodeAppDataBean;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateRetcodeAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.retcodeAppDataBean = builder.retcodeAppDataBean;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRetcodeAppResponseBody create() {
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
    public String getData() {
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
     * @return retcodeAppDataBean
     */
    public RetcodeAppDataBean getRetcodeAppDataBean() {
        return this.retcodeAppDataBean;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 
        private RetcodeAppDataBean retcodeAppDataBean; 
        private Boolean success; 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>bdidt76ehx@d5cf1cd3f7df411</p>
         */
        public Builder data(String data) {
            this.data = data;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C647A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the Browser Monitoring task.</p>
         */
        public Builder retcodeAppDataBean(RetcodeAppDataBean retcodeAppDataBean) {
            this.retcodeAppDataBean = retcodeAppDataBean;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateRetcodeAppResponseBody build() {
            return new CreateRetcodeAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRetcodeAppResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRetcodeAppResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRetcodeAppResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRetcodeAppResponseBody</p>
     */
    public static class RetcodeAppDataBeanTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private RetcodeAppDataBeanTags(Builder builder) {
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeAppDataBeanTags create() {
            return builder().build();
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<Tags> tags; 

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeAppDataBeanTags build() {
                return new RetcodeAppDataBeanTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRetcodeAppResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRetcodeAppResponseBody</p>
     */
    public static class RetcodeAppDataBean extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private RetcodeAppDataBeanTags tags;

        private RetcodeAppDataBean(Builder builder) {
            this.appId = builder.appId;
            this.pid = builder.pid;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeAppDataBean create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public RetcodeAppDataBeanTags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long appId; 
            private String pid; 
            private String resourceGroupId; 
            private RetcodeAppDataBeanTags tags; 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>135143</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The process identifier (PID) of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>aokcdqn3ly@a195c6d6421****</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
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
             * <p>The tags of the task.</p>
             */
            public Builder tags(RetcodeAppDataBeanTags tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeAppDataBean build() {
                return new RetcodeAppDataBean(this);
            } 

        } 

    }
}
