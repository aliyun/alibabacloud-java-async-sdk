// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationConfigTimelinesRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationConfigTimelinesRequest</p>
 */
public class ListIntegrationConfigTimelinesRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("integrationConfigId")
    private Long integrationConfigId;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    private ListIntegrationConfigTimelinesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.integrationConfigId = builder.integrationConfigId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationConfigTimelinesRequest create() {
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
     * @return integrationConfigId
     */
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
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

    public static final class Builder extends Request.Builder<ListIntegrationConfigTimelinesRequest, Builder> {
        private String clientToken; 
        private Long integrationConfigId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationConfigTimelinesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.integrationConfigId = response.integrationConfigId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * 幂等参数
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 集成配置id
         */
        public Builder integrationConfigId(Long integrationConfigId) {
            this.putBodyParameter("integrationConfigId", integrationConfigId);
            this.integrationConfigId = integrationConfigId;
            return this;
        }

        /**
         * 分页参数
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页参数
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListIntegrationConfigTimelinesRequest build() {
            return new ListIntegrationConfigTimelinesRequest(this);
        } 

    } 

}
