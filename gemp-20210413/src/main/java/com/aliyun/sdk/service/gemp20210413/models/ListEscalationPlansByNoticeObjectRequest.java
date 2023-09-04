// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlansByNoticeObjectRequest} extends {@link RequestModel}
 *
 * <p>ListEscalationPlansByNoticeObjectRequest</p>
 */
public class ListEscalationPlansByNoticeObjectRequest extends Request {
    @Body
    @NameInMap("noticeObjectId")
    private Long noticeObjectId;

    @Body
    @NameInMap("noticeObjectType")
    private Long noticeObjectType;

    private ListEscalationPlansByNoticeObjectRequest(Builder builder) {
        super(builder);
        this.noticeObjectId = builder.noticeObjectId;
        this.noticeObjectType = builder.noticeObjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEscalationPlansByNoticeObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noticeObjectId
     */
    public Long getNoticeObjectId() {
        return this.noticeObjectId;
    }

    /**
     * @return noticeObjectType
     */
    public Long getNoticeObjectType() {
        return this.noticeObjectType;
    }

    public static final class Builder extends Request.Builder<ListEscalationPlansByNoticeObjectRequest, Builder> {
        private Long noticeObjectId; 
        private Long noticeObjectType; 

        private Builder() {
            super();
        } 

        private Builder(ListEscalationPlansByNoticeObjectRequest request) {
            super(request);
            this.noticeObjectId = request.noticeObjectId;
            this.noticeObjectType = request.noticeObjectType;
        } 

        /**
         * noticeObjectId.
         */
        public Builder noticeObjectId(Long noticeObjectId) {
            this.putBodyParameter("noticeObjectId", noticeObjectId);
            this.noticeObjectId = noticeObjectId;
            return this;
        }

        /**
         * noticeObjectType.
         */
        public Builder noticeObjectType(Long noticeObjectType) {
            this.putBodyParameter("noticeObjectType", noticeObjectType);
            this.noticeObjectType = noticeObjectType;
            return this;
        }

        @Override
        public ListEscalationPlansByNoticeObjectRequest build() {
            return new ListEscalationPlansByNoticeObjectRequest(this);
        } 

    } 

}
