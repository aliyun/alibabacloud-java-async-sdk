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
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>UserOperator</p>
         */
        public Builder eventType(String eventType) {
            this.putPathParameter("eventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The start time of the event query.</p>
         * 
         * <strong>example:</strong>
         * <p>1746516590000</p>
         */
        public Builder beginTime(String beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end time of the event query.</p>
         * 
         * <strong>example:</strong>
         * <p>1746775790000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The filter object content. If this parameter is left empty, event records of all instances are returned. The value varies based on the filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        public Builder termContent(String termContent) {
            this.putQueryParameter("termContent", termContent);
            this.termContent = termContent;
            return this;
        }

        /**
         * <p>The filter object type. If this parameter is left empty, event records of all types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
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
