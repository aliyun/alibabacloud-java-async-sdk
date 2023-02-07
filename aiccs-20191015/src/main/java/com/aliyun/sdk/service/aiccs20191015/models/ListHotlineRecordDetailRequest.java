// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineRecordDetailRequest} extends {@link RequestModel}
 *
 * <p>ListHotlineRecordDetailRequest</p>
 */
public class ListHotlineRecordDetailRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CloseTimeEnd")
    private Long closeTimeEnd;

    @Query
    @NameInMap("CloseTimeStart")
    private Long closeTimeStart;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageSize")
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
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 热线挂断的时间范围
         */
        public Builder closeTimeEnd(Long closeTimeEnd) {
            this.putQueryParameter("CloseTimeEnd", closeTimeEnd);
            this.closeTimeEnd = closeTimeEnd;
            return this;
        }

        /**
         * 热线挂断的时间范围
         */
        public Builder closeTimeStart(Long closeTimeStart) {
            this.putQueryParameter("CloseTimeStart", closeTimeStart);
            this.closeTimeStart = closeTimeStart;
            return this;
        }

        /**
         * 当前页
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 每页数据量
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
