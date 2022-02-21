// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhoneTagsRequest} extends {@link RequestModel}
 *
 * <p>ListPhoneTagsRequest</p>
 */
public class ListPhoneTagsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Number")
    private String number;

    @Query
    @NameInMap("NumberGroupIds")
    private java.util.List < String > numberGroupIds;

    @Query
    @NameInMap("OutboundOnly")
    @Validation(required = true)
    private Boolean outboundOnly;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListPhoneTagsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.number = builder.number;
        this.numberGroupIds = builder.numberGroupIds;
        this.outboundOnly = builder.outboundOnly;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhoneTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return numberGroupIds
     */
    public java.util.List < String > getNumberGroupIds() {
        return this.numberGroupIds;
    }

    /**
     * @return outboundOnly
     */
    public Boolean getOutboundOnly() {
        return this.outboundOnly;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListPhoneTagsRequest, Builder> {
        private Integer currentPage; 
        private String instanceId; 
        private String number; 
        private java.util.List < String > numberGroupIds; 
        private Boolean outboundOnly; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListPhoneTagsRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.instanceId = response.instanceId;
            this.number = response.number;
            this.numberGroupIds = response.numberGroupIds;
            this.outboundOnly = response.outboundOnly;
            this.pageSize = response.pageSize;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * NumberGroupIds.
         */
        public Builder numberGroupIds(java.util.List < String > numberGroupIds) {
            this.putQueryParameter("NumberGroupIds", numberGroupIds);
            this.numberGroupIds = numberGroupIds;
            return this;
        }

        /**
         * OutboundOnly.
         */
        public Builder outboundOnly(Boolean outboundOnly) {
            this.putQueryParameter("OutboundOnly", outboundOnly);
            this.outboundOnly = outboundOnly;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListPhoneTagsRequest build() {
            return new ListPhoneTagsRequest(this);
        } 

    } 

}
