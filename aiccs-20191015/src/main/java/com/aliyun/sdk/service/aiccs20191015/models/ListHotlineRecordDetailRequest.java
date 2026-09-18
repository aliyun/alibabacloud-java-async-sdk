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
 * {@link ListHotlineRecordDetailRequest} extends {@link RequestModel}
 *
 * <p>ListHotlineRecordDetailRequest</p>
 */
public class ListHotlineRecordDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloseTimeEnd")
    private Long closeTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloseTimeStart")
    private Long closeTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListHotlineRecordDetailRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.closeTimeEnd = builder.closeTimeEnd;
        this.closeTimeStart = builder.closeTimeStart;
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotlineRecordDetailRequest create() {
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
     * @return closeTimeEnd
     */
    public Long getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    /**
     * @return closeTimeStart
     */
    public Long getCloseTimeStart() {
        return this.closeTimeStart;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListHotlineRecordDetailRequest, Builder> {
        private String clientToken; 
        private Long closeTimeEnd; 
        private Long closeTimeStart; 
        private Integer currentPage; 
        private String instanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListHotlineRecordDetailRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.closeTimeEnd = request.closeTimeEnd;
            this.closeTimeStart = request.closeTimeStart;
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>A unique ID for the customer request. Used for idempotency validation and can be generated using UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The start time when the hotline call ends. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614582000000</p>
         */
        public Builder closeTimeEnd(Long closeTimeEnd) {
            this.putQueryParameter("CloseTimeEnd", closeTimeEnd);
            this.closeTimeEnd = closeTimeEnd;
            return this;
        }

        /**
         * <p>The end time when the hotline call ends. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614578400000</p>
         */
        public Builder closeTimeStart(Long closeTimeStart) {
            this.putQueryParameter("CloseTimeStart", closeTimeStart);
            this.closeTimeStart = closeTimeStart;
            return this;
        }

        /**
         * <p>Current page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page size. Default value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListHotlineRecordDetailRequest build() {
            return new ListHotlineRecordDetailRequest(this);
        } 

    } 

}
