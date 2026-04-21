// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link ListVoicesRequest} extends {@link RequestModel}
 *
 * <p>ListVoicesRequest</p>
 */
public class ListVoicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsAccessType")
    private String nlsAccessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsEngine")
    private String nlsEngine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListVoicesRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.nlsAccessType = builder.nlsAccessType;
        this.nlsEngine = builder.nlsEngine;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return nlsAccessType
     */
    public String getNlsAccessType() {
        return this.nlsAccessType;
    }

    /**
     * @return nlsEngine
     */
    public String getNlsEngine() {
        return this.nlsEngine;
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

    public static final class Builder extends Request.Builder<ListVoicesRequest, Builder> {
        private String businessUnitId; 
        private String nlsAccessType; 
        private String nlsEngine; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListVoicesRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.nlsAccessType = request.nlsAccessType;
            this.nlsEngine = request.nlsEngine;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * NlsAccessType.
         */
        public Builder nlsAccessType(String nlsAccessType) {
            this.putBodyParameter("NlsAccessType", nlsAccessType);
            this.nlsAccessType = nlsAccessType;
            return this;
        }

        /**
         * NlsEngine.
         */
        public Builder nlsEngine(String nlsEngine) {
            this.putBodyParameter("NlsEngine", nlsEngine);
            this.nlsEngine = nlsEngine;
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

        @Override
        public ListVoicesRequest build() {
            return new ListVoicesRequest(this);
        } 

    } 

}
