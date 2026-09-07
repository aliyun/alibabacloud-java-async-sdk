// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link BatchUpdateNoticeStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateNoticeStatusRequest</p>
 */
public class BatchUpdateNoticeStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoticeBiz")
    private String noticeBiz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoticeStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String noticeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private BatchUpdateNoticeStatusRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.lang = builder.lang;
        this.noticeBiz = builder.noticeBiz;
        this.noticeStatus = builder.noticeStatus;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateNoticeStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return noticeBiz
     */
    public String getNoticeBiz() {
        return this.noticeBiz;
    }

    /**
     * @return noticeStatus
     */
    public String getNoticeStatus() {
        return this.noticeStatus;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<BatchUpdateNoticeStatusRequest, Builder> {
        private String ids; 
        private String lang; 
        private String noticeBiz; 
        private String noticeStatus; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateNoticeStatusRequest request) {
            super(request);
            this.ids = request.ids;
            this.lang = request.lang;
            this.noticeBiz = request.noticeBiz;
            this.noticeStatus = request.noticeStatus;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The list of primary key identifiers to be synchronized to Certificate Management Service. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>888</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The language type for the request and the received message. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The business code of message notification. The value is fixed as ssl.</p>
         * 
         * <strong>example:</strong>
         * <p>ssl</p>
         */
        public Builder noticeBiz(String noticeBiz) {
            this.putQueryParameter("NoticeBiz", noticeBiz);
            this.noticeBiz = noticeBiz;
            return this;
        }

        /**
         * <p>Specifies whether to enable message notification.
         * \--enable: enables message notification.
         * \--disable: disables message notification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder noticeStatus(String noticeStatus) {
            this.putQueryParameter("NoticeStatus", noticeStatus);
            this.noticeStatus = noticeStatus;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.242.200</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public BatchUpdateNoticeStatusRequest build() {
            return new BatchUpdateNoticeStatusRequest(this);
        } 

    } 

}
