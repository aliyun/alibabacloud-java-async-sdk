// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultDetailRequest} extends {@link RequestModel}
 *
 * <p>GetMediaAuditResultDetailRequest</p>
 */
public class GetMediaAuditResultDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    private GetMediaAuditResultDetailRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
        this.pageNo = builder.pageNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditResultDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    public static final class Builder extends Request.Builder<GetMediaAuditResultDetailRequest, Builder> {
        private String mediaId; 
        private Integer pageNo; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaAuditResultDetailRequest request) {
            super(request);
            this.mediaId = request.mediaId;
            this.pageNo = request.pageNo;
        } 

        /**
         * The ID of the video.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The page number of the review result to return. The default value is **1**. A maximum of **20** records can be returned on each page.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        @Override
        public GetMediaAuditResultDetailRequest build() {
            return new GetMediaAuditResultDetailRequest(this);
        } 

    } 

}
