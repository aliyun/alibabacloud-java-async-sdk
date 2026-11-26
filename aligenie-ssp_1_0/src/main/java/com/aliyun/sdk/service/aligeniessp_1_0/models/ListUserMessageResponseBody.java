// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListUserMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserMessageResponseBody</p>
 */
public class ListUserMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListUserMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserMessageResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListUserMessageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.result = model.result;
        } 

        /**
         * <p>Status code returned by the service. SUCCESS indicates success; otherwise, it indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>外部userId映射关系不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>List of user message query results</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListUserMessageResponseBody build() {
            return new ListUserMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserMessageResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserMessageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Pic")
        private String pic;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceUuid")
        private String sourceUuid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Result(Builder builder) {
            this.content = builder.content;
            this.deviceName = builder.deviceName;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.pic = builder.pic;
            this.source = builder.source;
            this.sourceUuid = builder.sourceUuid;
            this.status = builder.status;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return pic
         */
        public String getPic() {
            return this.pic;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceUuid
         */
        public String getSourceUuid() {
            return this.sourceUuid;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String content; 
            private String deviceName; 
            private String gmtCreate; 
            private String id; 
            private String pic; 
            private String source; 
            private String sourceUuid; 
            private Integer status; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.deviceName = model.deviceName;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.pic = model.pic;
                this.source = model.source;
                this.sourceUuid = model.sourceUuid;
                this.status = model.status;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>Message text</p>
             * 
             * <strong>example:</strong>
             * <p>哈哈哈</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Device name</p>
             * 
             * <strong>example:</strong>
             * <p>卧室的小芳</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>Time when the message was sent</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-27 14:06:27.000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Message ID</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Device Image</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xx">http://xx</a></p>
             */
            public Builder pic(String pic) {
                this.pic = pic;
                return this;
            }

            /**
             * <p>Message source: app or box</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Source Device ID</p>
             * 
             * <strong>example:</strong>
             * <p>AF188<strong>065EE4B</strong>DD68CE**951D84D4</p>
             */
            public Builder sourceUuid(String sourceUuid) {
                this.sourceUuid = sourceUuid;
                return this;
            }

            /**
             * <p>Message status: 0 indicates unread, and 1 indicates read.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Currently only audio is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Audio message link</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xx">http://xx</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
