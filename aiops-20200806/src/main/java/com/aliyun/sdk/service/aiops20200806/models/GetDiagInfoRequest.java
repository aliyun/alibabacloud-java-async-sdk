// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDiagInfoRequest</p>
 */
public class GetDiagInfoRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("DiagnosticId")
    private String diagnosticId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    private GetDiagInfoRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.diagnosticId = builder.diagnosticId;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagInfoRequest create() {
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
     * @return diagnosticId
     */
    public String getDiagnosticId() {
        return this.diagnosticId;
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
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetDiagInfoRequest, Builder> {
        private Integer currentPage; 
        private String diagnosticId; 
        private Long endTime; 
        private Integer pageSize; 
        private Long startTime; 
        private String status; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagInfoRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.diagnosticId = request.diagnosticId;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.status = request.status;
            this.uid = request.uid;
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
         * DiagnosticId.
         */
        public Builder diagnosticId(String diagnosticId) {
            this.putQueryParameter("DiagnosticId", diagnosticId);
            this.diagnosticId = diagnosticId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetDiagInfoRequest build() {
            return new GetDiagInfoRequest(this);
        } 

    } 

}
