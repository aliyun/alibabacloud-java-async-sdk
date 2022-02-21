// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailTimelinesRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentDetailTimelinesRequest</p>
 */
public class ListIncidentDetailTimelinesRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("incidentId")
    private Long incidentId;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    private ListIncidentDetailTimelinesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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
        private Long incidentId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIncidentDetailTimelinesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.incidentId = response.incidentId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * 幂等校验
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 事件ID
         */
        public Builder incidentId(Long incidentId) {
            this.putBodyParameter("incidentId", incidentId);
            this.incidentId = incidentId;
            return this;
        }

        /**
         * 页
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 行
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
