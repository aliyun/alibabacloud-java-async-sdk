// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNotifyRequest} extends {@link RequestModel}
 *
 * <p>QueryNotifyRequest</p>
 */
public class QueryNotifyRequest extends Request {
    @Body
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("To")
    @Validation(required = true)
    private String to;

    @Body
    @NameInMap("WithConfirmed")
    @Validation(required = true)
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
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The number of the page to return. Valid values: any **non-zero** positive integer.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values:
         * <p>
         * 
         * *   **30**
         * *   **50**
         * *   **100**
         * 
         * Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder to(String to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * Specifies whether the query results contain confirmed notifications. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > You can call the [ConfirmNotify](~~610444~~) operation to confirm notifications of an instance.
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
