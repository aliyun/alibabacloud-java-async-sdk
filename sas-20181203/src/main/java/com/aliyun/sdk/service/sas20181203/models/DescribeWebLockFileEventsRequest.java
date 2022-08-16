// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockFileEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebLockFileEventsRequest</p>
 */
public class DescribeWebLockFileEventsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProcessName")
    private String processName;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("TsBegin")
    private Long tsBegin;

    @Query
    @NameInMap("TsEnd")
    private Long tsEnd;

    private DescribeWebLockFileEventsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.pageSize = builder.pageSize;
        this.processName = builder.processName;
        this.remark = builder.remark;
        this.tsBegin = builder.tsBegin;
        this.tsEnd = builder.tsEnd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockFileEventsRequest create() {
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
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return tsBegin
     */
    public Long getTsBegin() {
        return this.tsBegin;
    }

    /**
     * @return tsEnd
     */
    public Long getTsEnd() {
        return this.tsEnd;
    }

    public static final class Builder extends Request.Builder<DescribeWebLockFileEventsRequest, Builder> {
        private Integer currentPage; 
        private String dealed; 
        private Integer pageSize; 
        private String processName; 
        private String remark; 
        private Long tsBegin; 
        private Long tsEnd; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebLockFileEventsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.pageSize = request.pageSize;
            this.processName = request.processName;
            this.remark = request.remark;
            this.tsBegin = request.tsBegin;
            this.tsEnd = request.tsEnd;
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
         * Dealed.
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
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
         * ProcessName.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * TsBegin.
         */
        public Builder tsBegin(Long tsBegin) {
            this.putQueryParameter("TsBegin", tsBegin);
            this.tsBegin = tsBegin;
            return this;
        }

        /**
         * TsEnd.
         */
        public Builder tsEnd(Long tsEnd) {
            this.putQueryParameter("TsEnd", tsEnd);
            this.tsEnd = tsEnd;
            return this;
        }

        @Override
        public DescribeWebLockFileEventsRequest build() {
            return new DescribeWebLockFileEventsRequest(this);
        } 

    } 

}
