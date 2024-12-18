// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link QueryNotifyRequest} extends {@link RequestModel}
 *
 * <p>QueryNotifyRequest</p>
 */
public class QueryNotifyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithConfirmed")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean withConfirmed;

    private QueryNotifyRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.to = builder.to;
        this.withConfirmed = builder.withConfirmed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNotifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return withConfirmed
     */
    public Boolean getWithConfirmed() {
        return this.withConfirmed;
    }

    public static final class Builder extends Request.Builder<QueryNotifyRequest, Builder> {
        private String from; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String to; 
        private Boolean withConfirmed; 

        private Builder() {
            super();
        } 

        private Builder(QueryNotifyRequest request) {
            super(request);
            this.from = request.from;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.to = request.to;
            this.withConfirmed = request.withConfirmed;
        } 

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-02T08:38:37Z</p>
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.****</p>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-09T08:38:37Z</p>
         */
        public Builder to(String to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>Specifies whether the query results contain confirmed notifications. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> A confirmed notification is a notification that has been marked as confirmed by calling the ConfirmNotify operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withConfirmed(Boolean withConfirmed) {
            this.putBodyParameter("WithConfirmed", withConfirmed);
            this.withConfirmed = withConfirmed;
            return this;
        }

        @Override
        public QueryNotifyRequest build() {
            return new QueryNotifyRequest(this);
        } 

    } 

}
