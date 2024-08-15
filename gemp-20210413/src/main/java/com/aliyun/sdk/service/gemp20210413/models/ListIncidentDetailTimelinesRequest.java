// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailTimelinesRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentDetailTimelinesRequest</p>
 */
public class ListIncidentDetailTimelinesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idSort")
    private String idSort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentId")
    private Long incidentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    private ListIncidentDetailTimelinesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.idSort = builder.idSort;
        this.incidentId = builder.incidentId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentDetailTimelinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return idSort
     */
    public String getIdSort() {
        return this.idSort;
    }

    /**
     * @return incidentId
     */
    public Long getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListIncidentDetailTimelinesRequest, Builder> {
        private String clientToken; 
        private String idSort; 
        private Long incidentId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIncidentDetailTimelinesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.idSort = request.idSort;
            this.incidentId = request.incidentId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * idSort.
         */
        public Builder idSort(String idSort) {
            this.putBodyParameter("idSort", idSort);
            this.idSort = idSort;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListIncidentDetailTimelinesRequest build() {
            return new ListIncidentDetailTimelinesRequest(this);
        } 

    } 

}
