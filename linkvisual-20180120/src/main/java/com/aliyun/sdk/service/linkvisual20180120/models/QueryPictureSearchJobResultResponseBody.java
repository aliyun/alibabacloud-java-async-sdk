// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryPictureSearchJobResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPictureSearchJobResultResponseBody</p>
 */
public class QueryPictureSearchJobResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryPictureSearchJobResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPictureSearchJobResultResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryPictureSearchJobResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceId is mandatory for this action.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a06c4750-7cce-11eb-8010-557d50136505</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPictureSearchJobResultResponseBody build() {
            return new QueryPictureSearchJobResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPictureSearchJobResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPictureSearchJobResultResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceNickName")
        private String deviceNickName;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("GatewayIotId")
        private String gatewayIotId;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("PicUrl")
        private String picUrl;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("VectorId")
        private String vectorId;

        private PageData(Builder builder) {
            this.deviceNickName = builder.deviceNickName;
            this.eventTime = builder.eventTime;
            this.gatewayIotId = builder.gatewayIotId;
            this.iotId = builder.iotId;
            this.picUrl = builder.picUrl;
            this.threshold = builder.threshold;
            this.vectorId = builder.vectorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return deviceNickName
         */
        public String getDeviceNickName() {
            return this.deviceNickName;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return gatewayIotId
         */
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return vectorId
         */
        public String getVectorId() {
            return this.vectorId;
        }

        public static final class Builder {
            private String deviceNickName; 
            private Long eventTime; 
            private String gatewayIotId; 
            private String iotId; 
            private String picUrl; 
            private Float threshold; 
            private String vectorId; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.deviceNickName = model.deviceNickName;
                this.eventTime = model.eventTime;
                this.gatewayIotId = model.gatewayIotId;
                this.iotId = model.iotId;
                this.picUrl = model.picUrl;
                this.threshold = model.threshold;
                this.vectorId = model.vectorId;
            } 

            /**
             * <p>The alias of the device.</p>
             * <blockquote>
             * <p>If no alias is set for the device, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>camera1</p>
             */
            public Builder deviceNickName(String deviceNickName) {
                this.deviceNickName = deviceNickName;
                return this;
            }

            /**
             * <p>The time when the event was created. The value is a 13-digit timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614333155075</p>
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The IoT ID of the V-series edge all-in-one device.</p>
             * 
             * <strong>example:</strong>
             * <p>pZJUqijOyfpFOOGNPF7S00****</p>
             */
            public Builder gatewayIotId(String gatewayIotId) {
                this.gatewayIotId = gatewayIotId;
                return this;
            }

            /**
             * <p>The IoT ID of the queried device.</p>
             * 
             * <strong>example:</strong>
             * <p>5RUngwC1RknD4lPiHgH300****</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The URL of the image to be searched.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.xxx.xxx.com/xxx">https://xxx.xxx.xxx.com/xxx</a></p>
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * <p>The face similarity.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The ID of the image feature.</p>
             * 
             * <strong>example:</strong>
             * <p>vectorId86d9a5c32b9947278e526c2eef8a****</p>
             */
            public Builder vectorId(String vectorId) {
                this.vectorId = vectorId;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPictureSearchJobResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPictureSearchJobResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Integer pageCount;

        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageCount = builder.pageCount;
            this.pageData = builder.pageData;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageData
         */
        public java.util.List<PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageCount; 
            private java.util.List<PageData> pageData; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageCount = model.pageCount;
                this.pageData = model.pageData;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * <p>The query results.</p>
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
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
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
