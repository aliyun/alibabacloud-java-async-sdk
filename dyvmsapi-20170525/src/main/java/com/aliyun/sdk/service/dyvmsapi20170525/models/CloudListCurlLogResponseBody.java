// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudListCurlLogResponseBody} extends {@link TeaModel}
 *
 * <p>CloudListCurlLogResponseBody</p>
 */
public class CloudListCurlLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudListCurlLogResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListCurlLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public Data getData() {
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudListCurlLogResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudListCurlLogResponseBody build() {
            return new CloudListCurlLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudListCurlLogResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListCurlLogResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private Long contentType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentMonth")
        private String currentMonth;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private String headers;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ResultText")
        private String resultText;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Long retry;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private String timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("TypeStr")
        private String typeStr;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private List(Builder builder) {
            this.contentType = builder.contentType;
            this.createTime = builder.createTime;
            this.currentMonth = builder.currentMonth;
            this.delay = builder.delay;
            this.endTime = builder.endTime;
            this.enterpriseId = builder.enterpriseId;
            this.headers = builder.headers;
            this.id = builder.id;
            this.level = builder.level;
            this.method = builder.method;
            this.params = builder.params;
            this.position = builder.position;
            this.requestTime = builder.requestTime;
            this.result = builder.result;
            this.resultText = builder.resultText;
            this.retry = builder.retry;
            this.startTime = builder.startTime;
            this.statusCode = builder.statusCode;
            this.timeout = builder.timeout;
            this.type = builder.type;
            this.typeStr = builder.typeStr;
            this.uniqueId = builder.uniqueId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public Long getContentType() {
            return this.contentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentMonth
         */
        public String getCurrentMonth() {
            return this.currentMonth;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return headers
         */
        public String getHeaders() {
            return this.headers;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return resultText
         */
        public String getResultText() {
            return this.resultText;
        }

        /**
         * @return retry
         */
        public Long getRetry() {
            return this.retry;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return typeStr
         */
        public String getTypeStr() {
            return this.typeStr;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long contentType; 
            private String createTime; 
            private String currentMonth; 
            private Long delay; 
            private String endTime; 
            private String enterpriseId; 
            private String headers; 
            private String id; 
            private Long level; 
            private String method; 
            private String params; 
            private String position; 
            private String requestTime; 
            private String result; 
            private String resultText; 
            private Long retry; 
            private String startTime; 
            private String statusCode; 
            private String timeout; 
            private Long type; 
            private String typeStr; 
            private String uniqueId; 
            private String url; 

            private Builder() {
            } 

            private Builder(List model) {
                this.contentType = model.contentType;
                this.createTime = model.createTime;
                this.currentMonth = model.currentMonth;
                this.delay = model.delay;
                this.endTime = model.endTime;
                this.enterpriseId = model.enterpriseId;
                this.headers = model.headers;
                this.id = model.id;
                this.level = model.level;
                this.method = model.method;
                this.params = model.params;
                this.position = model.position;
                this.requestTime = model.requestTime;
                this.result = model.result;
                this.resultText = model.resultText;
                this.retry = model.retry;
                this.startTime = model.startTime;
                this.statusCode = model.statusCode;
                this.timeout = model.timeout;
                this.type = model.type;
                this.typeStr = model.typeStr;
                this.uniqueId = model.uniqueId;
                this.url = model.url;
            } 

            /**
             * <p>文本类型</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder contentType(Long contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1774822134415</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>当月</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder currentMonth(String currentMonth) {
                this.currentMonth = currentMonth;
                return this;
            }

            /**
             * <p>延迟推送时间</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>推送结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1774822137959</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>企业id</p>
             * 
             * <strong>example:</strong>
             * <p>7122600</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>请求头</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder headers(String headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>日志id</p>
             * 
             * <strong>example:</strong>
             * <p>12715</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>推送登记</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>推送方法</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>推送参数</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>推送位置</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>推送时间</p>
             * 
             * <strong>example:</strong>
             * <p>1774822137191</p>
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>推送状态</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>返回文本</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder resultText(String resultText) {
                this.resultText = resultText;
                return this;
            }

            /**
             * <p>重试次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retry(Long retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>推送开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1774822134132</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>状态码</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>超时时间</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>推送类型</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * <p>推送类型字符串</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder typeStr(String typeStr) {
                this.typeStr = typeStr;
                return this;
            }

            /**
             * <p>唯一标示</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * <p>推送url</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aaa.com/index.htm">https://www.aaa.com/index.htm</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudListCurlLogResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListCurlLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * <p>返回数据JSON格式</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
