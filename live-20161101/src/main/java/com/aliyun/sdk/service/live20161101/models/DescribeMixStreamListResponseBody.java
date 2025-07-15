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
 * {@link DescribeMixStreamListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMixStreamListResponseBody</p>
 */
public class DescribeMixStreamListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MixStreamList")
    private java.util.List<MixStreamList> mixStreamList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeMixStreamListResponseBody(Builder builder) {
        this.mixStreamList = builder.mixStreamList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMixStreamListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mixStreamList
     */
    public java.util.List<MixStreamList> getMixStreamList() {
        return this.mixStreamList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MixStreamList> mixStreamList; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeMixStreamListResponseBody model) {
            this.mixStreamList = model.mixStreamList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>Details about the stream mixing tasks.</p>
         */
        public Builder mixStreamList(java.util.List<MixStreamList> mixStreamList) {
            this.mixStreamList = mixStreamList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BC1E78D3-FA8B-4457-DEE2-6093E1232254</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMixStreamListResponseBody build() {
            return new DescribeMixStreamListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMixStreamListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMixStreamListResponseBody</p>
     */
    public static class MixStreamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InputStreamNumber")
        private Integer inputStreamNumber;

        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private String layoutId;

        @com.aliyun.core.annotation.NameInMap("MixStreamTemplate")
        private String mixStreamTemplate;

        @com.aliyun.core.annotation.NameInMap("MixstreamId")
        private String mixstreamId;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private MixStreamList(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.inputStreamNumber = builder.inputStreamNumber;
            this.layoutId = builder.layoutId;
            this.mixStreamTemplate = builder.mixStreamTemplate;
            this.mixstreamId = builder.mixstreamId;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MixStreamList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return inputStreamNumber
         */
        public Integer getInputStreamNumber() {
            return this.inputStreamNumber;
        }

        /**
         * @return layoutId
         */
        public String getLayoutId() {
            return this.layoutId;
        }

        /**
         * @return mixStreamTemplate
         */
        public String getMixStreamTemplate() {
            return this.mixStreamTemplate;
        }

        /**
         * @return mixstreamId
         */
        public String getMixstreamId() {
            return this.mixstreamId;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer inputStreamNumber; 
            private String layoutId; 
            private String mixStreamTemplate; 
            private String mixstreamId; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(MixStreamList model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.inputStreamNumber = model.inputStreamNumber;
                this.layoutId = model.layoutId;
                this.mixStreamTemplate = model.mixStreamTemplate;
                this.mixstreamId = model.mixstreamId;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * <p>The time when the stream mixing task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-17T08:39:14Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the stream mixing task was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-17T08:39:15Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The number of input streams.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder inputStreamNumber(Integer inputStreamNumber) {
                this.inputStreamNumber = inputStreamNumber;
                return this;
            }

            /**
             * <p>The ID of the layout.</p>
             * 
             * <strong>example:</strong>
             * <p>USERDEFINED</p>
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * <p>The stream mixing template.</p>
             * 
             * <strong>example:</strong>
             * <p>lp_ld</p>
             */
            public Builder mixStreamTemplate(String mixStreamTemplate) {
                this.mixStreamTemplate = mixStreamTemplate;
                return this;
            }

            /**
             * <p>The ID of the stream mixing task. You can specify this parameter in a request to delete the steam mixing task.</p>
             * 
             * <strong>example:</strong>
             * <p>aaf9a50f-c460-3a9b-f180-38dd8f05****</p>
             */
            public Builder mixstreamId(String mixstreamId) {
                this.mixstreamId = mixstreamId;
                return this;
            }

            /**
             * <p>The name of the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public MixStreamList build() {
                return new MixStreamList(this);
            } 

        } 

    }
}
