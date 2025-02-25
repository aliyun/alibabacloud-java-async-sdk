// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventTopologyDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventTopologyDetailRequest</p>
 */
public class DescribeEventTopologyDetailRequest extends Request {
    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("TagId")
    private Long tagId;

    private DescribeEventTopologyDetailRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.operaUid = builder.operaUid;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventTopologyDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return tagId
     */
    public Long getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<DescribeEventTopologyDetailRequest, Builder> {
        private String eventId; 
        private String operaUid; 
        private Long tagId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventTopologyDetailRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.operaUid = request.operaUid;
            this.tagId = request.tagId;
        } 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(Long tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public DescribeEventTopologyDetailRequest build() {
            return new DescribeEventTopologyDetailRequest(this);
        } 

    } 

}
