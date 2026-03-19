// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListEventRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListEventRecordsRequest</p>
 */
public class ListEventRecordsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("eventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginTime")
    private String beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("termContent")
    private String termContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("termType")
    private String termType;

    private ListEventRecordsRequest(Builder builder) {
        super(builder);
        this.eventType = builder.eventType;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.size = builder.size;
        this.termContent = builder.termContent;
        this.termType = builder.termType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return termContent
     */
    public String getTermContent() {
        return this.termContent;
    }

    /**
     * @return termType
     */
    public String getTermType() {
        return this.termType;
    }

    public static final class Builder extends Request.Builder<ListEventRecordsRequest, Builder> {
        private String eventType; 
        private String beginTime; 
        private String endTime; 
        private Integer page; 
        private Integer size; 
        private String termContent; 
        private String termType; 

        private Builder() {
            super();
        } 

        private Builder(ListEventRecordsRequest request) {
            super(request);
            this.eventType = request.eventType;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.page = request.page;
            this.size = request.size;
            this.termContent = request.termContent;
            this.termType = request.termType;
        } 

        /**
         * eventType.
         */
        public Builder eventType(String eventType) {
            this.putPathParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * beginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * termContent.
         */
        public Builder termContent(String termContent) {
            this.putQueryParameter("termContent", termContent);
            this.termContent = termContent;
            return this;
        }

        /**
         * termType.
         */
        public Builder termType(String termType) {
            this.putQueryParameter("termType", termType);
            this.termType = termType;
            return this;
        }

        @Override
        public ListEventRecordsRequest build() {
            return new ListEventRecordsRequest(this);
        } 

    } 

}
