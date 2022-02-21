// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultDetailRequest} extends {@link RequestModel}
 *
 * <p>GetMediaAuditResultDetailRequest</p>
 */
public class GetMediaAuditResultDetailRequest extends Request {
    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
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

        private Builder(GetMediaAuditResultDetailRequest response) {
            super(response);
            this.mediaId = response.mediaId;
            this.pageNo = response.pageNo;
        } 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * PageNo.
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
