// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetOpsNoticeRequest} extends {@link RequestModel}
 *
 * <p>GetOpsNoticeRequest</p>
 */
public class GetOpsNoticeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoticeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String noticeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetOpsNoticeRequest(Builder builder) {
        super(builder);
        this.noticeId = builder.noticeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpsNoticeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noticeId
     */
    public String getNoticeId() {
        return this.noticeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetOpsNoticeRequest, Builder> {
        private String noticeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOpsNoticeRequest request) {
            super(request);
            this.noticeId = request.noticeId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notice-2338dxxxxxx</p>
         */
        public Builder noticeId(String noticeId) {
            this.putQueryParameter("NoticeId", noticeId);
            this.noticeId = noticeId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetOpsNoticeRequest build() {
            return new GetOpsNoticeRequest(this);
        } 

    } 

}
