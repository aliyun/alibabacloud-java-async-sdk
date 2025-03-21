// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeWebLockFileEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebLockFileEventsRequest</p>
 */
public class DescribeWebLockFileEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TsBegin")
    private Long tsBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TsEnd")
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>Specifies whether the event on web tamper proofing is handled. Valid values:</p>
         * <ul>
         * <li><strong>n</strong>: The event on web tamper proofing is handled.</li>
         * <li><strong>y</strong>: The event on web tamper proofing is not handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>n</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>sys_create</p>
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * <p>The name of the asset.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the names of assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test-ecs</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1660649981419</p>
         */
        public Builder tsBegin(Long tsBegin) {
            this.putQueryParameter("TsBegin", tsBegin);
            this.tsBegin = tsBegin;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1660649981419</p>
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
