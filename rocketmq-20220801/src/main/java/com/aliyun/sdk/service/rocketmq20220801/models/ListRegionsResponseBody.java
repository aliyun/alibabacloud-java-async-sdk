// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegionsResponseBody</p>
 */
public class ListRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListRegionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionsResponseBody create() {
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
        private java.util.List < Data> data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRegionsResponseBody build() {
            return new ListRegionsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagCode")
        private String tagCode;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private Object tagValue;

        private Tags(Builder builder) {
            this.tagCode = builder.tagCode;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagCode
         */
        public String getTagCode() {
            return this.tagCode;
        }

        /**
         * @return tagValue
         */
        public Object getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagCode; 
            private Object tagValue; 

            /**
             * The tag code.
             */
            public Builder tagCode(String tagCode) {
                this.tagCode = tagCode;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(Object tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("regionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("supportRocketmqV4")
        private Boolean supportRocketmqV4;

        @com.aliyun.core.annotation.NameInMap("supportRocketmqV5")
        private Boolean supportRocketmqV5;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.supportRocketmqV4 = builder.supportRocketmqV4;
            this.supportRocketmqV5 = builder.supportRocketmqV5;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return supportRocketmqV4
         */
        public Boolean getSupportRocketmqV4() {
            return this.supportRocketmqV4;
        }

        /**
         * @return supportRocketmqV5
         */
        public Boolean getSupportRocketmqV5() {
            return this.supportRocketmqV5;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String regionId; 
            private String regionName; 
            private Boolean supportRocketmqV4; 
            private Boolean supportRocketmqV5; 
            private java.util.List < Tags> tags; 
            private String updateTime; 

            /**
             * The time when the ApsaraMQ for RocketMQ instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The region name.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * Indicates whether ApsaraMQ for RocketMQ V4 is activated.
             */
            public Builder supportRocketmqV4(Boolean supportRocketmqV4) {
                this.supportRocketmqV4 = supportRocketmqV4;
                return this;
            }

            /**
             * Indicates whether ApsaraMQ for RocketMQ V5 is activated.
             */
            public Builder supportRocketmqV5(Boolean supportRocketmqV5) {
                this.supportRocketmqV5 = supportRocketmqV5;
                return this;
            }

            /**
             * The region tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the ApsaraMQ for RocketMQ instance was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
