// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListBillingRequest} extends {@link RequestModel}
 *
 * <p>ListBillingRequest</p>
 */
public class ListBillingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ignoreZero")
    private Boolean ignoreZero;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wnUserId")
    private String wnUserId;

    private ListBillingRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.endTime = builder.endTime;
        this.ignoreZero = builder.ignoreZero;
        this.operation = builder.operation;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.wnUserId = builder.wnUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBillingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ignoreZero
     */
    public Boolean getIgnoreZero() {
        return this.ignoreZero;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return wnUserId
     */
    public String getWnUserId() {
        return this.wnUserId;
    }

    public static final class Builder extends Request.Builder<ListBillingRequest, Builder> {
        private String appToken; 
        private String bizId; 
        private String bizType; 
        private String endTime; 
        private Boolean ignoreZero; 
        private String operation; 
        private String opsUserCode; 
        private String opsUserId; 
        private Long page; 
        private Long pageSize; 
        private String startTime; 
        private String status; 
        private String tenantId; 
        private String wnUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListBillingRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.endTime = request.endTime;
            this.ignoreZero = request.ignoreZero;
            this.operation = request.operation;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tenantId = request.tenantId;
            this.wnUserId = request.wnUserId;
        } 

        /**
         * <p>The platform application token issued by the console. If you specify this parameter, the request is executed as the user specified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The unique identifier of the business. When bizType is set to LibraryChat, bizId refers to the ID of the document library.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBizId</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("bizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The business type. Valid values: LlmChat (model Q&amp;A) and LibraryChat (document library Q&amp;A).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The actual end timestamp of the live stream. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to filter out bills with zero credit consumption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreZero(Boolean ignoreZero) {
            this.putBodyParameter("ignoreZero", ignoreZero);
            this.ignoreZero = ignoreZero;
            return this;
        }

        /**
         * <p>The operation item. Valid values:</p>
         * <ul>
         * <li>start: indicates the creation of a task. This is the default value and usually does not need to be explicitly specified.</li>
         * <li>stop: stops a real-time meeting task. This corresponds to the creation of a real-time meeting and is set to stop to trigger a call after the meeting ends. This value is used in real-time meeting scenarios.
         * Note: When you end a real-time recording, you must set this parameter to stop.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operation(String operation) {
            this.putBodyParameter("operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The code of the proxy user, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The ID of the proxy user, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Minimum value: 1. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task status. A status of Running is returned immediately after the task is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. For winnexo-cli, this parameter is explicitly passed by using --tenant-id.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The user ID, which is the WINNEXO platform user ID. This parameter is optional for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wnUserId(String wnUserId) {
            this.putBodyParameter("wnUserId", wnUserId);
            this.wnUserId = wnUserId;
            return this;
        }

        @Override
        public ListBillingRequest build() {
            return new ListBillingRequest(this);
        } 

    } 

}
