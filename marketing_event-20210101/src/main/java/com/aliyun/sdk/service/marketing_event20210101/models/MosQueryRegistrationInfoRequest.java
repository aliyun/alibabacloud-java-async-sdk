// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link MosQueryRegistrationInfoRequest} extends {@link RequestModel}
 *
 * <p>MosQueryRegistrationInfoRequest</p>
 */
public class MosQueryRegistrationInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckinStatus")
    private String checkinStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private String page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QrCode")
    private String qrCode;

    private MosQueryRegistrationInfoRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.checkinStatus = builder.checkinStatus;
        this.keyword = builder.keyword;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.qrCode = builder.qrCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MosQueryRegistrationInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return checkinStatus
     */
    public String getCheckinStatus() {
        return this.checkinStatus;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return qrCode
     */
    public String getQrCode() {
        return this.qrCode;
    }

    public static final class Builder extends Request.Builder<MosQueryRegistrationInfoRequest, Builder> {
        private String activityId; 
        private String checkinStatus; 
        private String keyword; 
        private String page; 
        private String pageSize; 
        private String qrCode; 

        private Builder() {
            super();
        } 

        private Builder(MosQueryRegistrationInfoRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.checkinStatus = request.checkinStatus;
            this.keyword = request.keyword;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.qrCode = request.qrCode;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * CheckinStatus.
         */
        public Builder checkinStatus(String checkinStatus) {
            this.putQueryParameter("CheckinStatus", checkinStatus);
            this.checkinStatus = checkinStatus;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QrCode.
         */
        public Builder qrCode(String qrCode) {
            this.putQueryParameter("QrCode", qrCode);
            this.qrCode = qrCode;
            return this;
        }

        @Override
        public MosQueryRegistrationInfoRequest build() {
            return new MosQueryRegistrationInfoRequest(this);
        } 

    } 

}
