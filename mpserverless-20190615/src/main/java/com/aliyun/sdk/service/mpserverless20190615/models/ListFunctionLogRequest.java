// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionLogRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionLogRequest</p>
 */
public class ListFunctionLogRequest extends Request {
    @Body
    @NameInMap("FromDate")
    private Long fromDate;

    @Body
    @NameInMap("LogRequestId")
    private String logRequestId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("ToDate")
    private Long toDate;

    private ListFunctionLogRequest(Builder builder) {
        super(builder);
        this.fromDate = builder.fromDate;
        this.logRequestId = builder.logRequestId;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.spaceId = builder.spaceId;
        this.status = builder.status;
        this.toDate = builder.toDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromDate
     */
    public Long getFromDate() {
        return this.fromDate;
    }

    /**
     * @return logRequestId
     */
    public String getLogRequestId() {
        return this.logRequestId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return toDate
     */
    public Long getToDate() {
        return this.toDate;
    }

    public static final class Builder extends Request.Builder<ListFunctionLogRequest, Builder> {
        private Long fromDate; 
        private String logRequestId; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String spaceId; 
        private String status; 
        private Long toDate; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionLogRequest request) {
            super(request);
            this.fromDate = request.fromDate;
            this.logRequestId = request.logRequestId;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.spaceId = request.spaceId;
            this.status = request.status;
            this.toDate = request.toDate;
        } 

        /**
         * FromDate.
         */
        public Builder fromDate(Long fromDate) {
            this.putBodyParameter("FromDate", fromDate);
            this.fromDate = fromDate;
            return this;
        }

        /**
         * LogRequestId.
         */
        public Builder logRequestId(String logRequestId) {
            this.putBodyParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * ToDate.
         */
        public Builder toDate(Long toDate) {
            this.putBodyParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        @Override
        public ListFunctionLogRequest build() {
            return new ListFunctionLogRequest(this);
        } 

    } 

}
