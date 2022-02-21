// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMixStreamListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMixStreamListResponseBody</p>
 */
public class DescribeMixStreamListResponseBody extends TeaModel {
    @NameInMap("MixStreamList")
    private java.util.List < MixStreamList> mixStreamList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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

    /**
     * @return mixStreamList
     */
    public java.util.List < MixStreamList> getMixStreamList() {
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
        private java.util.List < MixStreamList> mixStreamList; 
        private String requestId; 
        private Integer total; 

        /**
         * MixStreamList.
         */
        public Builder mixStreamList(java.util.List < MixStreamList> mixStreamList) {
            this.mixStreamList = mixStreamList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMixStreamListResponseBody build() {
            return new DescribeMixStreamListResponseBody(this);
        } 

    } 

    public static class MixStreamList extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InputStreamNumber")
        private Integer inputStreamNumber;

        @NameInMap("LayoutId")
        private String layoutId;

        @NameInMap("MixStreamTemplate")
        private String mixStreamTemplate;

        @NameInMap("MixstreamId")
        private String mixstreamId;

        @NameInMap("StreamName")
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

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InputStreamNumber.
             */
            public Builder inputStreamNumber(Integer inputStreamNumber) {
                this.inputStreamNumber = inputStreamNumber;
                return this;
            }

            /**
             * LayoutId.
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * MixStreamTemplate.
             */
            public Builder mixStreamTemplate(String mixStreamTemplate) {
                this.mixStreamTemplate = mixStreamTemplate;
                return this;
            }

            /**
             * MixstreamId.
             */
            public Builder mixstreamId(String mixstreamId) {
                this.mixstreamId = mixstreamId;
                return this;
            }

            /**
             * StreamName.
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
