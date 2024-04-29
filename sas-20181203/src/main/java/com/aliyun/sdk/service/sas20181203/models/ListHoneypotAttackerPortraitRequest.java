// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotAttackerPortraitRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotAttackerPortraitRequest</p>
 */
public class ListHoneypotAttackerPortraitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeStamp")
    private Long startTimeStamp;

    private ListHoneypotAttackerPortraitRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTimeStamp = builder.endTimeStamp;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.srcIp = builder.srcIp;
        this.startTimeStamp = builder.startTimeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotAttackerPortraitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public static final class Builder extends Request.Builder<ListHoneypotAttackerPortraitRequest, Builder> {
        private Integer currentPage; 
        private Long endTimeStamp; 
        private String lang; 
        private Integer pageSize; 
        private String srcIp; 
        private Long startTimeStamp; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotAttackerPortraitRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTimeStamp = request.endTimeStamp;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.srcIp = request.srcIp;
            this.startTimeStamp = request.startTimeStamp;
        } 

        /**
         * The page number. Default value: **1**. Pages start from page 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The source IP address of the attack.
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp.
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        @Override
        public ListHoneypotAttackerPortraitRequest build() {
            return new ListHoneypotAttackerPortraitRequest(this);
        } 

    } 

}
