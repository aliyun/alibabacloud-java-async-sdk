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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CloseTimeEnd.
         */
        public Builder closeTimeEnd(Long closeTimeEnd) {
            this.putQueryParameter("CloseTimeEnd", closeTimeEnd);
            this.closeTimeEnd = closeTimeEnd;
            return this;
        }

        /**
         * CloseTimeStart.
         */
        public Builder closeTimeStart(Long closeTimeStart) {
            this.putQueryParameter("CloseTimeStart", closeTimeStart);
            this.closeTimeStart = closeTimeStart;
            return this;
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
         * PageSize.
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
