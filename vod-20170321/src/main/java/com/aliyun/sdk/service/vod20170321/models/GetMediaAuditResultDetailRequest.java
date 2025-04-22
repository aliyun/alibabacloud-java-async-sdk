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
         * <p>The ID of the video.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f*****54b6e91d24d81d4</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The page number. The default value is <strong>1</strong>. A maximum of <strong>20</strong> records can be returned on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
