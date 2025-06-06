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
 * {@link ListDynamicDisposalProcessesRequest} extends {@link RequestModel}
 *
 * <p>ListDynamicDisposalProcessesRequest</p>
 */
public class ListDynamicDisposalProcessesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevTag")
    private String devTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisposalAction")
    private String disposalAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisposalProcessId")
    private String disposalProcessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryType")
    private String recoveryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListDynamicDisposalProcessesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.devTag = builder.devTag;
        this.disposalAction = builder.disposalAction;
        this.disposalProcessId = builder.disposalProcessId;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.recoveryType = builder.recoveryType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicDisposalProcessesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return disposalAction
     */
    public String getDisposalAction() {
        return this.disposalAction;
    }

    /**
     * @return disposalProcessId
     */
    public String getDisposalProcessId() {
        return this.disposalProcessId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recoveryType
     */
    public String getRecoveryType() {
        return this.recoveryType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListDynamicDisposalProcessesRequest, Builder> {
        private Long currentPage; 
        private String devTag; 
        private String disposalAction; 
        private String disposalProcessId; 
        private Long endTime; 
        private Long pageSize; 
        private String recoveryType; 
        private Long startTime; 
        private String status; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListDynamicDisposalProcessesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.devTag = request.devTag;
            this.disposalAction = request.disposalAction;
            this.disposalProcessId = request.disposalProcessId;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.recoveryType = request.recoveryType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.userName = request.userName;
        } 

        /**
         * <p>The page number to display in the paginated query. Range: 1~10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Terminal device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7798391-2554-FE83-E0B7-045DDED629A8</p>
         */
        public Builder devTag(String devTag) {
            this.putQueryParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>Disposal action.</p>
         * <ul>
         * <li><strong>ztna_connect</strong>: Prohibit connection to the zero-trust intranet.</li>
         * <li><strong>nac_connect</strong>: Prohibit connection to the office network access.</li>
         * <li><strong>none</strong>: No disposal action.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder disposalAction(String disposalAction) {
            this.putQueryParameter("DisposalAction", disposalAction);
            this.disposalAction = disposalAction;
            return this;
        }

        /**
         * <p>Disposal process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dp-xxxxxxxx</p>
         */
        public Builder disposalProcessId(String disposalProcessId) {
            this.putQueryParameter("DisposalProcessId", disposalProcessId);
            this.disposalProcessId = disposalProcessId;
            return this;
        }

        /**
         * <p>The end time for querying dynamic disposal processes. Format: Unix timestamp (in seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1743143296</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of items per page in the paginated query. Range: 1~1000.</p>
         * <p>This parameter is required.</p>
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
         * <p>Recovery type.</p>
         * <ul>
         * <li><strong>auto</strong>: Automatic recovery.</li>
         * <li><strong>console</strong>: Console recovery.</li>
         * <li><strong>auth</strong>: Recovery by authentication and reporting.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder recoveryType(String recoveryType) {
            this.putQueryParameter("RecoveryType", recoveryType);
            this.recoveryType = recoveryType;
            return this;
        }

        /**
         * <p>The start time for querying dynamic disposal processes. Format: Unix timestamp (in seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1743143296</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Disposal status. Values:</p>
         * <ul>
         * <li><strong>disposal</strong>: In the disposal state.</li>
         * <li><strong>finished</strong>: Already automatically recovered.</li>
         * <li><strong>recovery</strong>: Recovered by authentication and reporting or console recovery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disposal</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoming</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListDynamicDisposalProcessesRequest build() {
            return new ListDynamicDisposalProcessesRequest(this);
        } 

    } 

}
