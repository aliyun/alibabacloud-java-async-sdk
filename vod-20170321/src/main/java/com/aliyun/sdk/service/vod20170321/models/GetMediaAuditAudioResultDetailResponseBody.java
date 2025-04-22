// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetMediaAuditAudioResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaAuditAudioResultDetailResponseBody</p>
 */
public class GetMediaAuditAudioResultDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaAuditAudioResultDetail")
    private MediaAuditAudioResultDetail mediaAuditAudioResultDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMediaAuditAudioResultDetailResponseBody model) {
            this.mediaAuditAudioResultDetail = model.mediaAuditAudioResultDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of review results.</p>
         */
        public Builder mediaAuditAudioResultDetail(MediaAuditAudioResultDetail mediaAuditAudioResultDetail) {
            this.mediaAuditAudioResultDetail = mediaAuditAudioResultDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB7D7232-1AB2-40FE-B8D3-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaAuditAudioResultDetailResponseBody build() {
            return new GetMediaAuditAudioResultDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaAuditAudioResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditAudioResultDetailResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Text")
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

            private Builder() {
            } 

            private Builder(List model) {
                this.endTime = model.endTime;
                this.label = model.label;
                this.startTime = model.startTime;
                this.text = model.text;
            } 

            /**
             * <p>The end time of the audio that failed the review. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The review results. Valid values:</p>
             * <ul>
             * <li><strong>spam</strong></li>
             * <li><strong>ad</strong></li>
             * <li><strong>abuse</strong></li>
             * <li><strong>flood</strong></li>
             * <li><strong>contraband</strong></li>
             * <li><strong>meaningless</strong></li>
             * <li><strong>normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abuse</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The start time of the audio that failed the review. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The text that corresponds to the audio.</p>
             * 
             * <strong>example:</strong>
             * <p>beauty</p>
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
    /**
     * 
     * {@link GetMediaAuditAudioResultDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaAuditAudioResultDetailResponseBody</p>
     */
    public static class MediaAuditAudioResultDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageTotal")
        private Integer pageTotal;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageTotal; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(MediaAuditAudioResultDetail model) {
                this.list = model.list;
                this.pageTotal = model.pageTotal;
                this.total = model.total;
            } 

            /**
             * <p>The list of results.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
