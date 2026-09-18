// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiCallDetailPageRequest} extends {@link RequestModel}
 *
 * <p>QueryAiCallDetailPageRequest</p>
 */
public class QueryAiCallDetailPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallResult")
    private String callResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetailIds")
    private java.util.List<Long> detailIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionType")
    private Long encryptionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCallingTime")
    private Long endCallingTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndImportedTime")
    private Long endImportedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MajorIntent")
    private String majorIntent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConversationDuration")
    private Long maxConversationDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinConversationDuration")
    private Long minConversationDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartCallingTime")
    private Long startCallingTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartImportedTime")
    private Long startImportedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private QueryAiCallDetailPageRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.callResult = builder.callResult;
        this.calledNumber = builder.calledNumber;
        this.detailIds = builder.detailIds;
        this.encryptionType = builder.encryptionType;
        this.endCallingTime = builder.endCallingTime;
        this.endImportedTime = builder.endImportedTime;
        this.majorIntent = builder.majorIntent;
        this.maxConversationDuration = builder.maxConversationDuration;
        this.minConversationDuration = builder.minConversationDuration;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startCallingTime = builder.startCallingTime;
        this.startImportedTime = builder.startImportedTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiCallDetailPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return callResult
     */
    public String getCallResult() {
        return this.callResult;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return detailIds
     */
    public java.util.List<Long> getDetailIds() {
        return this.detailIds;
    }

    /**
     * @return encryptionType
     */
    public Long getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * @return endCallingTime
     */
    public Long getEndCallingTime() {
        return this.endCallingTime;
    }

    /**
     * @return endImportedTime
     */
    public Long getEndImportedTime() {
        return this.endImportedTime;
    }

    /**
     * @return majorIntent
     */
    public String getMajorIntent() {
        return this.majorIntent;
    }

    /**
     * @return maxConversationDuration
     */
    public Long getMaxConversationDuration() {
        return this.maxConversationDuration;
    }

    /**
     * @return minConversationDuration
     */
    public Long getMinConversationDuration() {
        return this.minConversationDuration;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
     * @return startCallingTime
     */
    public Long getStartCallingTime() {
        return this.startCallingTime;
    }

    /**
     * @return startImportedTime
     */
    public Long getStartImportedTime() {
        return this.startImportedTime;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryAiCallDetailPageRequest, Builder> {
        private String batchId; 
        private String callResult; 
        private String calledNumber; 
        private java.util.List<Long> detailIds; 
        private Long encryptionType; 
        private Long endCallingTime; 
        private Long endImportedTime; 
        private String majorIntent; 
        private Long maxConversationDuration; 
        private Long minConversationDuration; 
        private String outId; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long startCallingTime; 
        private Long startImportedTime; 
        private Long status; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAiCallDetailPageRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.callResult = request.callResult;
            this.calledNumber = request.calledNumber;
            this.detailIds = request.detailIds;
            this.encryptionType = request.encryptionType;
            this.endCallingTime = request.endCallingTime;
            this.endImportedTime = request.endImportedTime;
            this.majorIntent = request.majorIntent;
            this.maxConversationDuration = request.maxConversationDuration;
            this.minConversationDuration = request.minConversationDuration;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startCallingTime = request.startCallingTime;
            this.startImportedTime = request.startImportedTime;
            this.status = request.status;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The batch ID. On the <strong>Call Task Management</strong> page, click Details to view the batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1183**************</p>
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The call result. Valid values:</p>
         * <ul>
         * <li>CALL_FORWARDING: call forwarding.</li>
         * <li>INCOMING_CALL_BARRED: incoming call barred.</li>
         * <li>CALL_REJECTED: call rejected.</li>
         * <li>ANSWERED: answered.</li>
         * <li>USER_BUSY: user busy.</li>
         * <li>POWERED_OFF: powered off.</li>
         * <li>NO_USER_RESPONSE: out of service area.</li>
         * <li>OPERATOR_BLOCK: blocked by carrier.</li>
         * <li>OTHERS: other status.</li>
         * <li>SUSPEND: suspended.</li>
         * <li>CANCEL: canceled by caller.</li>
         * <li>INVALID_NUMBER: invalid number.</li>
         * <li>UNAVAILABLE: temporarily unavailable.</li>
         * <li>NETWORK_BUSY: network busy.</li>
         * <li>NO_ANSWER: no answer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        public Builder callResult(String callResult) {
            this.putQueryParameter("CallResult", callResult);
            this.callResult = callResult;
            return this;
        }

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>053714454****</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The list of task detail IDs. A maximum of 100 IDs can be specified.</p>
         */
        public Builder detailIds(java.util.List<Long> detailIds) {
            String detailIdsShrink = shrink(detailIds, "DetailIds", "json");
            this.putQueryParameter("DetailIds", detailIdsShrink);
            this.detailIds = detailIds;
            return this;
        }

        /**
         * <p>The encryption type. Valid values: 0: no encryption. 1: MD5. 2: SHA256. 3: SM3.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder encryptionType(Long encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * <p>The end calling time. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        public Builder endCallingTime(Long endCallingTime) {
            this.putQueryParameter("EndCallingTime", endCallingTime);
            this.endCallingTime = endCallingTime;
            return this;
        }

        /**
         * <p>The end import time. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        public Builder endImportedTime(Long endImportedTime) {
            this.putQueryParameter("EndImportedTime", endImportedTime);
            this.endImportedTime = endImportedTime;
            return this;
        }

        /**
         * <p>The major intent. On the <a href="https://aiccs.console.aliyun.com/agent/customize">Communication Agent Management</a> page, click agent details to view the major intent.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder majorIntent(String majorIntent) {
            this.putQueryParameter("MajorIntent", majorIntent);
            this.majorIntent = majorIntent;
            return this;
        }

        /**
         * <p>The maximum conversation duration. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxConversationDuration(Long maxConversationDuration) {
            this.putQueryParameter("MaxConversationDuration", maxConversationDuration);
            this.maxConversationDuration = maxConversationDuration;
            return this;
        }

        /**
         * <p>The minimum conversation duration. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minConversationDuration(Long minConversationDuration) {
            this.putQueryParameter("MinConversationDuration", minConversationDuration);
            this.minConversationDuration = minConversationDuration;
            return this;
        }

        /**
         * <p>The ID reserved for the caller. This ID is returned to the caller in the receipt message.</p>
         * 
         * <strong>example:</strong>
         * <p>94ba739b-c01a-ef91-335d-4be006c34899</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
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
         * <p>The start calling time. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        public Builder startCallingTime(Long startCallingTime) {
            this.putQueryParameter("StartCallingTime", startCallingTime);
            this.startCallingTime = startCallingTime;
            return this;
        }

        /**
         * <p>The start import time. This value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        public Builder startImportedTime(Long startImportedTime) {
            this.putQueryParameter("StartImportedTime", startImportedTime);
            this.startImportedTime = startImportedTime;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p>0: pending.</p>
         * </li>
         * <li><p>1: completed.</p>
         * </li>
         * <li><p>2: failed.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1187**************</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryAiCallDetailPageRequest build() {
            return new QueryAiCallDetailPageRequest(this);
        } 

    } 

}
