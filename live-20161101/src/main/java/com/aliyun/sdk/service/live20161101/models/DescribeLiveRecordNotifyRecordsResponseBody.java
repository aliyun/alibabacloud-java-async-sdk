// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveRecordNotifyRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordNotifyRecordsResponseBody</p>
 */
public class DescribeLiveRecordNotifyRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallbackList")
    private java.util.List<CallbackList> callbackList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveRecordNotifyRecordsResponseBody(Builder builder) {
        this.callbackList = builder.callbackList;
        this.code = builder.code;
        this.msg = builder.msg;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRecordNotifyRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackList
     */
    public java.util.List<CallbackList> getCallbackList() {
        return this.callbackList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<CallbackList> callbackList; 
        private Integer code; 
        private String msg; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveRecordNotifyRecordsResponseBody model) {
            this.callbackList = model.callbackList;
            this.code = model.code;
            this.msg = model.msg;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The callback records.</p>
         */
        public Builder callbackList(java.util.List<CallbackList> callbackList) {
            this.callbackList = callbackList;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>180FA0D2-1A02-5158-A36B-115DBF7B218D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveRecordNotifyRecordsResponseBody build() {
            return new DescribeLiveRecordNotifyRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveRecordNotifyRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordNotifyRecordsResponseBody</p>
     */
    public static class CallbackList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("NotifyContent")
        private String notifyContent;

        @com.aliyun.core.annotation.NameInMap("NotifyResult")
        private String notifyResult;

        @com.aliyun.core.annotation.NameInMap("NotifyTime")
        private String notifyTime;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private String notifyType;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
        private String notifyUrl;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private CallbackList(Builder builder) {
            this.appName = builder.appName;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.notifyContent = builder.notifyContent;
            this.notifyResult = builder.notifyResult;
            this.notifyTime = builder.notifyTime;
            this.notifyType = builder.notifyType;
            this.notifyUrl = builder.notifyUrl;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return notifyContent
         */
        public String getNotifyContent() {
            return this.notifyContent;
        }

        /**
         * @return notifyResult
         */
        public String getNotifyResult() {
            return this.notifyResult;
        }

        /**
         * @return notifyTime
         */
        public String getNotifyTime() {
            return this.notifyTime;
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String description; 
            private String domainName; 
            private String notifyContent; 
            private String notifyResult; 
            private String notifyTime; 
            private String notifyType; 
            private String notifyUrl; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(CallbackList model) {
                this.appName = model.appName;
                this.description = model.description;
                this.domainName = model.domainName;
                this.notifyContent = model.notifyContent;
                this.notifyResult = model.notifyResult;
                this.notifyTime = model.notifyTime;
                this.notifyType = model.notifyType;
                this.notifyUrl = model.notifyUrl;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The description of the result. A value of success indicates that the request is successful. If the request fails, an error message is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The callback content.</p>
             * 
             * <strong>example:</strong>
             * <p>July 26,  16:14{&quot;domain&quot;:&quot;al.xxxx.com&quot;,&quot;stream&quot;:&quot;livestream01&quot;,&quot;pull _stream_result&quot;:true,&quot;cdn&quot;:&quot;al&quot;}</p>
             */
            public Builder notifyContent(String notifyContent) {
                this.notifyContent = notifyContent;
                return this;
            }

            /**
             * <p>The callback result. Valid values:</p>
             * <ul>
             * <li>success</li>
             * <li>failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder notifyResult(String notifyResult) {
                this.notifyResult = notifyResult;
                return this;
            }

            /**
             * <p>The time when the callback was returned. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-19T19:09:28Z</p>
             */
            public Builder notifyTime(String notifyTime) {
                this.notifyTime = notifyTime;
                return this;
            }

            /**
             * <p>The callback type. Valid values:</p>
             * <ul>
             * <li>file_created: The recording file is created.</li>
             * <li>record_error: A recording error occurs.</li>
             * <li>record_started: Recording is started.</li>
             * <li>record_paused: Recording is paused.</li>
             * <li>record_resumed: Recording is resumed.</li>
             * <li>record_force_transcode_fail: The recording task fails to trigger transcoding.</li>
             * <li>transformat_error: An error occurs when the live stream is parsed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record_started</p>
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * <p>The recording callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://learn.aliyundoc.com/examplecallback.action">http://learn.aliyundoc.com/examplecallback.action</a></p>
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public CallbackList build() {
                return new CallbackList(this);
            } 

        } 

    }
}
