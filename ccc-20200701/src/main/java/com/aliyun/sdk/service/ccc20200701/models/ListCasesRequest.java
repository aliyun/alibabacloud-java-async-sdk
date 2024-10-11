// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCasesRequest} extends {@link RequestModel}
 *
 * <p>ListCasesRequest</p>
 */
public class ListCasesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CampaignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String campaignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private ListCasesRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListCasesRequest, Builder> {
        private String campaignId; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String phoneNumber; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListCasesRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.state = request.state;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6badb397-a8b5-40b6-21019d382a09</p>
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListCasesRequest build() {
            return new ListCasesRequest(this);
        } 

    } 

}
