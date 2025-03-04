// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20221230.models;

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
 * {@link NoticeInstanceUserRequest} extends {@link RequestModel}
 *
 * <p>NoticeInstanceUserRequest</p>
 */
public class NoticeInstanceUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeParam")
    private String noticeParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NoticeType")
    private Long noticeType;

    private NoticeInstanceUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.noticeParam = builder.noticeParam;
        this.noticeType = builder.noticeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NoticeInstanceUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return noticeParam
     */
    public String getNoticeParam() {
        return this.noticeParam;
    }

    /**
     * @return noticeType
     */
    public Long getNoticeType() {
        return this.noticeType;
    }

    public static final class Builder extends Request.Builder<NoticeInstanceUserRequest, Builder> {
        private Long instanceId; 
        private String noticeParam; 
        private Long noticeType; 

        private Builder() {
            super();
        } 

        private Builder(NoticeInstanceUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.noticeParam = request.noticeParam;
            this.noticeType = request.noticeType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NoticeParam.
         */
        public Builder noticeParam(String noticeParam) {
            this.putBodyParameter("NoticeParam", noticeParam);
            this.noticeParam = noticeParam;
            return this;
        }

        /**
         * NoticeType.
         */
        public Builder noticeType(Long noticeType) {
            this.putBodyParameter("NoticeType", noticeType);
            this.noticeType = noticeType;
            return this;
        }

        @Override
        public NoticeInstanceUserRequest build() {
            return new NoticeInstanceUserRequest(this);
        } 

    } 

}
