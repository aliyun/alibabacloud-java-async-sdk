// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditAudioResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditAudioResultDetailResponseBody</p>
 */
public class GetMediaAuditAudioResultDetailResponseBody extends TeaModel {
    @NameInMap("MediaAuditAudioResultDetail")
    private MediaAuditAudioResultDetail mediaAuditAudioResultDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetMediaAuditAudioResultDetailResponseBody(Builder builder) {
        this.mediaAuditAudioResultDetail = builder.mediaAuditAudioResultDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditAudioResultDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaAuditAudioResultDetail
     */
    public MediaAuditAudioResultDetail getMediaAuditAudioResultDetail() {
        return this.mediaAuditAudioResultDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaAuditAudioResultDetail mediaAuditAudioResultDetail; 
        private String requestId; 

        /**
         * MediaAuditAudioResultDetail.
         */
        public Builder mediaAuditAudioResultDetail(MediaAuditAudioResultDetail mediaAuditAudioResultDetail) {
            this.mediaAuditAudioResultDetail = mediaAuditAudioResultDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditAudioResultDetailResponseBody build() {
            return new GetMediaAuditAudioResultDetailResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Label")
        private String label;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Text")
        private String text;

        private List(Builder builder) {
            this.endTime = builder.endTime;
            this.label = builder.label;
            this.startTime = builder.startTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endTime; 
            private String label; 
            private Long startTime; 
            private String text; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class MediaAuditAudioResultDetail extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("Total")
        private Integer total;

        private MediaAuditAudioResultDetail(Builder builder) {
            this.list = builder.list;
            this.pageTotal = builder.pageTotal;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaAuditAudioResultDetail create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageTotal; 
            private Integer total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageTotal.
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public MediaAuditAudioResultDetail build() {
                return new MediaAuditAudioResultDetail(this);
            } 

        } 

    }
}
