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
 * {@link DescribePlayEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayEventListRequest</p>
 */
public class DescribePlayEventListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTs")
    private String playTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private DescribePlayEventListRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.playTs = builder.playTs;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayEventListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playTs
     */
    public String getPlayTs() {
        return this.playTs;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DescribePlayEventListRequest, Builder> {
        private String language; 
        private Long pageNo; 
        private Long pageSize; 
        private String playTs; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayEventListRequest request) {
            super(request);
            this.language = request.language;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.playTs = request.playTs;
            this.sessionId = request.sessionId;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlayTs.
         */
        public Builder playTs(String playTs) {
            this.putQueryParameter("PlayTs", playTs);
            this.playTs = playTs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DescribePlayEventListRequest build() {
            return new DescribePlayEventListRequest(this);
        } 

    } 

}
