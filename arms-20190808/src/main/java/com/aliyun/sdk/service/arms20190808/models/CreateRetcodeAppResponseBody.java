// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRetcodeAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRetcodeAppResponseBody</p>
 */
public class CreateRetcodeAppResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetcodeAppDataBean")
    private RetcodeAppDataBean retcodeAppDataBean;

    @NameInMap("Success")
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
         * The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The return detail.
         */
        public Builder retcodeAppDataBean(RetcodeAppDataBean retcodeAppDataBean) {
            this.retcodeAppDataBean = retcodeAppDataBean;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateRetcodeAppResponseBody build() {
            return new CreateRetcodeAppResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class RetcodeAppDataBeanTags extends TeaModel {
        @NameInMap("Tags")
        private java.util.List < Tags> tags;

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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < Tags> tags; 

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeAppDataBeanTags build() {
                return new RetcodeAppDataBeanTags(this);
            } 

        } 

    }
    public static class RetcodeAppDataBean extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
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
             * The application ID.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * PID。
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The ID of the resource group.
             * <p>
             * 
             * If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags.
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
