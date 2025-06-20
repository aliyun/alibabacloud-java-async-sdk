// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeChangeStartRequest} extends {@link RequestModel}
 *
 * <p>SafeChangeStartRequest</p>
 */
public class SafeChangeStartRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeEndTime")
    private Long changeEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeObject")
    private String changeObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeOptType")
    private String changeOptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeStartTime")
    private Long changeStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeTitle")
    private String changeTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorEmpId")
    private String creatorEmpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurBatchNo")
    private Integer curBatchNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutorEmpId")
    private String executorEmpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOrderId")
    private String sourceOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TotalBatchNo")
    private Integer totalBatchNo;

    private SafeChangeStartRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.changeEndTime = builder.changeEndTime;
        this.changeObject = builder.changeObject;
        this.changeOptType = builder.changeOptType;
        this.changeStartTime = builder.changeStartTime;
        this.changeTitle = builder.changeTitle;
        this.creatorEmpId = builder.creatorEmpId;
        this.curBatchNo = builder.curBatchNo;
        this.executorEmpId = builder.executorEmpId;
        this.reqTimestamp = builder.reqTimestamp;
        this.sourceOrderId = builder.sourceOrderId;
        this.totalBatchNo = builder.totalBatchNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeStartRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return changeEndTime
     */
    public Long getChangeEndTime() {
        return this.changeEndTime;
    }

    /**
     * @return changeObject
     */
    public String getChangeObject() {
        return this.changeObject;
    }

    /**
     * @return changeOptType
     */
    public String getChangeOptType() {
        return this.changeOptType;
    }

    /**
     * @return changeStartTime
     */
    public Long getChangeStartTime() {
        return this.changeStartTime;
    }

    /**
     * @return changeTitle
     */
    public String getChangeTitle() {
        return this.changeTitle;
    }

    /**
     * @return creatorEmpId
     */
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    /**
     * @return curBatchNo
     */
    public Integer getCurBatchNo() {
        return this.curBatchNo;
    }

    /**
     * @return executorEmpId
     */
    public String getExecutorEmpId() {
        return this.executorEmpId;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return sourceOrderId
     */
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    /**
     * @return totalBatchNo
     */
    public Integer getTotalBatchNo() {
        return this.totalBatchNo;
    }

    public static final class Builder extends Request.Builder<SafeChangeStartRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private Long changeEndTime; 
        private String changeObject; 
        private String changeOptType; 
        private Long changeStartTime; 
        private String changeTitle; 
        private String creatorEmpId; 
        private Integer curBatchNo; 
        private String executorEmpId; 
        private Long reqTimestamp; 
        private String sourceOrderId; 
        private Integer totalBatchNo; 

        private Builder() {
            super();
        } 

        private Builder(SafeChangeStartRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.changeEndTime = request.changeEndTime;
            this.changeObject = request.changeObject;
            this.changeOptType = request.changeOptType;
            this.changeStartTime = request.changeStartTime;
            this.changeTitle = request.changeTitle;
            this.creatorEmpId = request.creatorEmpId;
            this.curBatchNo = request.curBatchNo;
            this.executorEmpId = request.executorEmpId;
            this.reqTimestamp = request.reqTimestamp;
            this.sourceOrderId = request.sourceOrderId;
            this.totalBatchNo = request.totalBatchNo;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * ChangeEndTime.
         */
        public Builder changeEndTime(Long changeEndTime) {
            this.putBodyParameter("ChangeEndTime", changeEndTime);
            this.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * ChangeObject.
         */
        public Builder changeObject(String changeObject) {
            this.putBodyParameter("ChangeObject", changeObject);
            this.changeObject = changeObject;
            return this;
        }

        /**
         * ChangeOptType.
         */
        public Builder changeOptType(String changeOptType) {
            this.putBodyParameter("ChangeOptType", changeOptType);
            this.changeOptType = changeOptType;
            return this;
        }

        /**
         * ChangeStartTime.
         */
        public Builder changeStartTime(Long changeStartTime) {
            this.putBodyParameter("ChangeStartTime", changeStartTime);
            this.changeStartTime = changeStartTime;
            return this;
        }

        /**
         * ChangeTitle.
         */
        public Builder changeTitle(String changeTitle) {
            this.putBodyParameter("ChangeTitle", changeTitle);
            this.changeTitle = changeTitle;
            return this;
        }

        /**
         * CreatorEmpId.
         */
        public Builder creatorEmpId(String creatorEmpId) {
            this.putBodyParameter("CreatorEmpId", creatorEmpId);
            this.creatorEmpId = creatorEmpId;
            return this;
        }

        /**
         * CurBatchNo.
         */
        public Builder curBatchNo(Integer curBatchNo) {
            this.putBodyParameter("CurBatchNo", curBatchNo);
            this.curBatchNo = curBatchNo;
            return this;
        }

        /**
         * ExecutorEmpId.
         */
        public Builder executorEmpId(String executorEmpId) {
            this.putBodyParameter("ExecutorEmpId", executorEmpId);
            this.executorEmpId = executorEmpId;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * SourceOrderId.
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.putBodyParameter("SourceOrderId", sourceOrderId);
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        /**
         * TotalBatchNo.
         */
        public Builder totalBatchNo(Integer totalBatchNo) {
            this.putBodyParameter("TotalBatchNo", totalBatchNo);
            this.totalBatchNo = totalBatchNo;
            return this;
        }

        @Override
        public SafeChangeStartRequest build() {
            return new SafeChangeStartRequest(this);
        } 

    } 

}
