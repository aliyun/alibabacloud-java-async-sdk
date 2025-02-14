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
 * {@link DescribePropertyScaProcessDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScaProcessDetailRequest</p>
 */
public class DescribePropertyScaProcessDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cmdline")
    private String cmdline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribePropertyScaProcessDetailRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.cmdline = builder.cmdline;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.remark = builder.remark;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScaProcessDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return cmdline
     */
    public String getCmdline() {
        return this.cmdline;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertyScaProcessDetailRequest, Builder> {
        private String bizType; 
        private String cmdline; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String pid; 
        private String remark; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyScaProcessDetailRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.cmdline = request.cmdline;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.remark = request.remark;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The type of the application process. Default value: <strong>java</strong>. Valid values:</p>
         * <ul>
         * <li><strong>java</strong>: Java process.</li>
         * <li><strong>php</strong>: PHP process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The startup parameter.</p>
         * <blockquote>
         * <p> This parameter supports only prefix queries. Fuzzy match is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>java -jar</p>
         */
        public Builder cmdline(String cmdline) {
            this.putQueryParameter("Cmdline", cmdline);
            this.cmdline = cmdline;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The process ID.</p>
         * <blockquote>
         * <p> Only exact match is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>756</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The information about the server that you want to query. The value can be the public IP address, private IP address, or name of the server. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.167.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </li>
         * <li><p>Only exact match is supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyScaProcessDetailRequest build() {
            return new DescribePropertyScaProcessDetailRequest(this);
        } 

    } 

}
