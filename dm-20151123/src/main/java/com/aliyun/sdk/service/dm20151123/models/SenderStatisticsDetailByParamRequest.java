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
 * {@link SenderStatisticsDetailByParamRequest} extends {@link RequestModel}
 *
 * <p>SenderStatisticsDetailByParamRequest</p>
 */
public class SenderStatisticsDetailByParamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Length")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer length;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextStart")
    private String nextStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(maximum = 4)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToAddress")
    private String toAddress;

    private SenderStatisticsDetailByParamRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.endTime = builder.endTime;
        this.length = builder.length;
        this.nextStart = builder.nextStart;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tagName = builder.tagName;
        this.toAddress = builder.toAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SenderStatisticsDetailByParamRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return nextStart
     */
    public String getNextStart() {
        return this.nextStart;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return toAddress
     */
    public String getToAddress() {
        return this.toAddress;
    }

    public static final class Builder extends Request.Builder<SenderStatisticsDetailByParamRequest, Builder> {
        private String accountName; 
        private String endTime; 
        private Integer length; 
        private String nextStart; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private Integer status; 
        private String tagName; 
        private String toAddress; 

        private Builder() {
            super();
        } 

        private Builder(SenderStatisticsDetailByParamRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.endTime = request.endTime;
            this.length = request.length;
            this.nextStart = request.nextStart;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tagName = request.tagName;
            this.toAddress = request.toAddress;
        } 

        /**
         * <p>Sending address. If not filled, it represents all addresses.</p>
         * <blockquote>
         * <p><strong>AccountName</strong>, <strong>TagName</strong>, and <strong>ToAddress</strong> can all be left unfilled. If any are filled, only one of these parameters can be passed; you cannot pass a combination of two or more.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s***@example.net</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>End time. The span between start and end times cannot exceed 30 days, format: yyyy-MM-dd HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-29 00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies the number of results to return in this request. Range is 1~100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>Used for pagination. Specifies the offset for this request. If there are more results, set this returned value to the NextStart in the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>90f0243616#203#a***@example.net-1658817837#a***@example.net.247475288187</p>
         */
        public Builder nextStart(String nextStart) {
            this.putQueryParameter("NextStart", nextStart);
            this.nextStart = nextStart;
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
         * <p>Start time. The span between start and end times cannot exceed 30 days, format: yyyy-MM-dd HH:mm</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-28 00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Delivery result. If not filled, it represents all statuses. Values:</p>
         * <ul>
         * <li>0: Success</li>
         * <li>2: Invalid Address</li>
         * <li>3: Spam</li>
         * <li>4: Failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Email tag. If not filled, it represents all tags.</p>
         * 
         * <strong>example:</strong>
         * <p>EmailQuestionnaireHelioscam</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>Recipient address. If not filled, it represents all recipient addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>b***@example.net</p>
         */
        public Builder toAddress(String toAddress) {
            this.putQueryParameter("ToAddress", toAddress);
            this.toAddress = toAddress;
            return this;
        }

        @Override
        public SenderStatisticsDetailByParamRequest build() {
            return new SenderStatisticsDetailByParamRequest(this);
        } 

    } 

}
