// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeNoticeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNoticeConfigResponseBody</p>
 */
public class DescribeNoticeConfigResponseBody extends TeaModel {
    @NameInMap("NoticeConfigList")
    private java.util.List < NoticeConfigList> noticeConfigList;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeNoticeConfigResponseBody(Builder builder) {
        this.noticeConfigList = builder.noticeConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNoticeConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return noticeConfigList
     */
    public java.util.List < NoticeConfigList> getNoticeConfigList() {
        return this.noticeConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < NoticeConfigList> noticeConfigList; 
        private String requestId; 

        /**
         * <p>NoticeConfigList.</p>
         */
        public Builder noticeConfigList(java.util.List < NoticeConfigList> noticeConfigList) {
            this.noticeConfigList = noticeConfigList;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNoticeConfigResponseBody build() {
            return new DescribeNoticeConfigResponseBody(this);
        } 

    } 

    public static class NoticeConfigList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("Project")
        private String project;

        @NameInMap("Route")
        private Integer route;

        @NameInMap("TimeLimit")
        private Integer timeLimit;


        private NoticeConfigList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.currentPage = builder.currentPage;
            this.project = builder.project;
            this.route = builder.route;
            this.timeLimit = builder.timeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeConfigList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return route
         */
        public Integer getRoute() {
            return this.route;
        }

        /**
         * @return timeLimit
         */
        public Integer getTimeLimit() {
            return this.timeLimit;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer currentPage; 
            private String project; 
            private Integer route; 
            private Integer timeLimit; 

            /**
             * <p>AliUid.</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Project.</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>Route.</p>
             */
            public Builder route(Integer route) {
                this.route = route;
                return this;
            }

            /**
             * <p>TimeLimit.</p>
             */
            public Builder timeLimit(Integer timeLimit) {
                this.timeLimit = timeLimit;
                return this;
            }

            public NoticeConfigList build() {
                return new NoticeConfigList(this);
            } 

        } 

    }
}
