// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDlpOutboundLogsRequest} extends {@link RequestModel}
 *
 * <p>ListDlpOutboundLogsRequest</p>
 */
public class ListDlpOutboundLogsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogId")
    private String logId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyAction")
    private String policyAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcFileName")
    private String srcFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubChannelType")
    private String subChannelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListDlpOutboundLogsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.logId = builder.logId;
        this.pageSize = builder.pageSize;
        this.policyAction = builder.policyAction;
        this.srcFileName = builder.srcFileName;
        this.startTime = builder.startTime;
        this.subChannelType = builder.subChannelType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDlpOutboundLogsRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyAction
     */
    public String getPolicyAction() {
        return this.policyAction;
    }

    /**
     * @return srcFileName
     */
    public String getSrcFileName() {
        return this.srcFileName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subChannelType
     */
    public String getSubChannelType() {
        return this.subChannelType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListDlpOutboundLogsRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private String logId; 
        private Integer pageSize; 
        private String policyAction; 
        private String srcFileName; 
        private Long startTime; 
        private String subChannelType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListDlpOutboundLogsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.logId = request.logId;
            this.pageSize = request.pageSize;
            this.policyAction = request.policyAction;
            this.srcFileName = request.srcFileName;
            this.startTime = request.startTime;
            this.subChannelType = request.subChannelType;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1754956800</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * LogId.
         */
        public Builder logId(String logId) {
            this.putBodyParameter("LogId", logId);
            this.logId = logId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PolicyAction.
         */
        public Builder policyAction(String policyAction) {
            this.putBodyParameter("PolicyAction", policyAction);
            this.policyAction = policyAction;
            return this;
        }

        /**
         * SrcFileName.
         */
        public Builder srcFileName(String srcFileName) {
            this.putBodyParameter("SrcFileName", srcFileName);
            this.srcFileName = srcFileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1754870400</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SubChannelType.
         */
        public Builder subChannelType(String subChannelType) {
            this.putBodyParameter("SubChannelType", subChannelType);
            this.subChannelType = subChannelType;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListDlpOutboundLogsRequest build() {
            return new ListDlpOutboundLogsRequest(this);
        } 

    } 

}
