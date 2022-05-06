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
         * From.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * To.
         */
        public Builder to(String to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * WithConfirmed.
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
