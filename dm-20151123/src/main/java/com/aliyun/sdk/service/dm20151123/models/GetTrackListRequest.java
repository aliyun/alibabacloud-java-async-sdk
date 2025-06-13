// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetTrackListRequest} extends {@link RequestModel}
 *
 * <p>GetTrackListRequest</p>
 */
public class GetTrackListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedIp")
    private String dedicatedIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedIpPoolId")
    private String dedicatedIpPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Esp")
    private String esp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private String offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OffsetCreateTime")
    private String offsetCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OffsetCreateTimeDesc")
    private String offsetCreateTimeDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private GetTrackListRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dedicatedIp = builder.dedicatedIp;
        this.dedicatedIpPoolId = builder.dedicatedIpPoolId;
        this.endTime = builder.endTime;
        this.esp = builder.esp;
        this.offset = builder.offset;
        this.offsetCreateTime = builder.offsetCreateTime;
        this.offsetCreateTimeDesc = builder.offsetCreateTimeDesc;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.tagName = builder.tagName;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrackListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return dedicatedIp
     */
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    /**
     * @return dedicatedIpPoolId
     */
    public String getDedicatedIpPoolId() {
        return this.dedicatedIpPoolId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return esp
     */
    public String getEsp() {
        return this.esp;
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * @return offsetCreateTime
     */
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    /**
     * @return offsetCreateTimeDesc
     */
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder extends Request.Builder<GetTrackListRequest, Builder> {
        private String accountName; 
        private String dedicatedIp; 
        private String dedicatedIpPoolId; 
        private String endTime; 
        private String esp; 
        private String offset; 
        private String offsetCreateTime; 
        private String offsetCreateTimeDesc; 
        private Long ownerId; 
        private String pageNumber; 
        private String pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private String tagName; 
        private String total; 

        private Builder() {
            super();
        } 

        private Builder(GetTrackListRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dedicatedIp = request.dedicatedIp;
            this.dedicatedIpPoolId = request.dedicatedIpPoolId;
            this.endTime = request.endTime;
            this.esp = request.esp;
            this.offset = request.offset;
            this.offsetCreateTime = request.offsetCreateTime;
            this.offsetCreateTimeDesc = request.offsetCreateTimeDesc;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.tagName = request.tagName;
            this.total = request.total;
        } 

        /**
         * <p>Sender address.</p>
         * <blockquote>
         * <p>If not filled, it represents all addresses; if TagName is provided, this parameter must not be empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.com">test@example.com</a></p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * DedicatedIp.
         */
        public Builder dedicatedIp(String dedicatedIp) {
            this.putQueryParameter("DedicatedIp", dedicatedIp);
            this.dedicatedIp = dedicatedIp;
            return this;
        }

        /**
         * DedicatedIpPoolId.
         */
        public Builder dedicatedIpPoolId(String dedicatedIpPoolId) {
            this.putQueryParameter("DedicatedIpPoolId", dedicatedIpPoolId);
            this.dedicatedIpPoolId = dedicatedIpPoolId;
            return this;
        }

        /**
         * <p>End time, the span between start and end time cannot exceed 7 days. Format: yyyy-MM-dd.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-29</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Esp.
         */
        public Builder esp(String esp) {
            this.putQueryParameter("Esp", esp);
            this.esp = esp;
            return this;
        }

        /**
         * <p>For the first query, set to 0; for subsequent queries, fixed at 1. 1 indicates pagination in ascending order by time. (This field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>(This field is deprecated)</p>
         */
        public Builder offset(String offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>Used for pagination. Not set for the first query, but for subsequent queries, it should be set to the value of OffsetCreateTime from the previous response. (This field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>(This field is deprecated)</p>
         */
        public Builder offsetCreateTime(String offsetCreateTime) {
            this.putQueryParameter("OffsetCreateTime", offsetCreateTime);
            this.offsetCreateTime = offsetCreateTime;
            return this;
        }

        /**
         * <p>(This field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>(This field is deprecated)</p>
         */
        public Builder offsetCreateTimeDesc(String offsetCreateTimeDesc) {
            this.putQueryParameter("OffsetCreateTimeDesc", offsetCreateTimeDesc);
            this.offsetCreateTimeDesc = offsetCreateTimeDesc;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Start time, which cannot be earlier than 30 days. Format: yyyy-MM-dd.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-29</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Tag name</p>
         * 
         * <strong>example:</strong>
         * <p>tagname</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>(This field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>(This field is deprecated)</p>
         */
        public Builder total(String total) {
            this.putQueryParameter("Total", total);
            this.total = total;
            return this;
        }

        @Override
        public GetTrackListRequest build() {
            return new GetTrackListRequest(this);
        } 

    } 

}
