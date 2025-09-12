// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link GetYzdInstanceTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetYzdInstanceTaskResultResponseBody</p>
 */
public class GetYzdInstanceTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Boolean code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetYzdInstanceTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYzdInstanceTaskResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Boolean getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Boolean code; 
        private java.util.List<Data> data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetYzdInstanceTaskResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Boolean code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetYzdInstanceTaskResultResponseBody build() {
            return new GetYzdInstanceTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetYzdInstanceTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetYzdInstanceTaskResultResponseBody</p>
     */
    public static class DownloadUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pwd")
        private String pwd;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private DownloadUrls(Builder builder) {
            this.pwd = builder.pwd;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadUrls create() {
            return builder().build();
        }

        /**
         * @return pwd
         */
        public String getPwd() {
            return this.pwd;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String pwd; 
            private String url; 

            private Builder() {
            } 

            private Builder(DownloadUrls model) {
                this.pwd = model.pwd;
                this.url = model.url;
            } 

            /**
             * pwd.
             */
            public Builder pwd(String pwd) {
                this.pwd = pwd;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public DownloadUrls build() {
                return new DownloadUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetYzdInstanceTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetYzdInstanceTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appid")
        private String appid;

        @com.aliyun.core.annotation.NameInMap("bcid")
        private String bcid;

        @com.aliyun.core.annotation.NameInMap("datasetIds")
        private String datasetIds;

        @com.aliyun.core.annotation.NameInMap("downloadUrls")
        private java.util.List<DownloadUrls> downloadUrls;

        @com.aliyun.core.annotation.NameInMap("resultCnt")
        private String resultCnt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("timeDuration")
        private String timeDuration;

        private Data(Builder builder) {
            this.appid = builder.appid;
            this.bcid = builder.bcid;
            this.datasetIds = builder.datasetIds;
            this.downloadUrls = builder.downloadUrls;
            this.resultCnt = builder.resultCnt;
            this.status = builder.status;
            this.timeDuration = builder.timeDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appid
         */
        public String getAppid() {
            return this.appid;
        }

        /**
         * @return bcid
         */
        public String getBcid() {
            return this.bcid;
        }

        /**
         * @return datasetIds
         */
        public String getDatasetIds() {
            return this.datasetIds;
        }

        /**
         * @return downloadUrls
         */
        public java.util.List<DownloadUrls> getDownloadUrls() {
            return this.downloadUrls;
        }

        /**
         * @return resultCnt
         */
        public String getResultCnt() {
            return this.resultCnt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeDuration
         */
        public String getTimeDuration() {
            return this.timeDuration;
        }

        public static final class Builder {
            private String appid; 
            private String bcid; 
            private String datasetIds; 
            private java.util.List<DownloadUrls> downloadUrls; 
            private String resultCnt; 
            private String status; 
            private String timeDuration; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appid = model.appid;
                this.bcid = model.bcid;
                this.datasetIds = model.datasetIds;
                this.downloadUrls = model.downloadUrls;
                this.resultCnt = model.resultCnt;
                this.status = model.status;
                this.timeDuration = model.timeDuration;
            } 

            /**
             * appid.
             */
            public Builder appid(String appid) {
                this.appid = appid;
                return this;
            }

            /**
             * bcid.
             */
            public Builder bcid(String bcid) {
                this.bcid = bcid;
                return this;
            }

            /**
             * datasetIds.
             */
            public Builder datasetIds(String datasetIds) {
                this.datasetIds = datasetIds;
                return this;
            }

            /**
             * downloadUrls.
             */
            public Builder downloadUrls(java.util.List<DownloadUrls> downloadUrls) {
                this.downloadUrls = downloadUrls;
                return this;
            }

            /**
             * resultCnt.
             */
            public Builder resultCnt(String resultCnt) {
                this.resultCnt = resultCnt;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * timeDuration.
             */
            public Builder timeDuration(String timeDuration) {
                this.timeDuration = timeDuration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
