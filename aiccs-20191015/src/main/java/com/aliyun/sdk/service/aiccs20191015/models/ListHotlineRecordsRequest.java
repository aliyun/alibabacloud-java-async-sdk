// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListHotlineRecordsRequest</p>
 */
public class ListHotlineRecordsRequest extends Request {
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
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListHotlineRecordsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.closeTimeEnd = builder.closeTimeEnd;
        this.closeTimeStart = builder.closeTimeStart;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotlineRecordsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListHotlineRecordsRequest, Builder> {
        private String clientToken; 
        private Long closeTimeEnd; 
        private Long closeTimeStart; 
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListHotlineRecordsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.closeTimeEnd = response.closeTimeEnd;
            this.closeTimeStart = response.closeTimeStart;
            this.instanceId = response.instanceId;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
        public ListHotlineRecordsRequest build() {
            return new ListHotlineRecordsRequest(this);
        } 

    } 

}
