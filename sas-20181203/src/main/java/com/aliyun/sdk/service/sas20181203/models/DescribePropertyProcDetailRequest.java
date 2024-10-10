// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePropertyProcDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyProcDetailRequest</p>
 */
public class DescribePropertyProcDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cmdline")
    private String cmdline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcTimeEnd")
    private Long procTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcTimeStart")
    private Long procTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribePropertyProcDetailRequest(Builder builder) {
        super(builder);
        this.cmdline = builder.cmdline;
        this.currentPage = builder.currentPage;
        this.extend = builder.extend;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.procTimeEnd = builder.procTimeEnd;
        this.procTimeStart = builder.procTimeStart;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.user = builder.user;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyProcDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return procTimeEnd
     */
    public Long getProcTimeEnd() {
        return this.procTimeEnd;
    }

    /**
     * @return procTimeStart
     */
    public Long getProcTimeStart() {
        return this.procTimeStart;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertyProcDetailRequest, Builder> {
        private String cmdline; 
        private Integer currentPage; 
        private String extend; 
        private String name; 
        private Integer pageSize; 
        private Long procTimeEnd; 
        private Long procTimeStart; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyProcDetailRequest request) {
            super(request);
            this.cmdline = request.cmdline;
            this.currentPage = request.currentPage;
            this.extend = request.extend;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.procTimeEnd = request.procTimeEnd;
            this.procTimeStart = request.procTimeStart;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The startup parameter of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>./8888</p>
         */
        public Builder cmdline(String cmdline) {
            this.putQueryParameter("Cmdline", cmdline);
            this.cmdline = cmdline;
            return this;
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
         * <p>Specifies whether fuzzy search by process name is supported. If you want to use fuzzy search, set the parameter to 1. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The name of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
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
         * <p>The timestamp when the process ends. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649587453000</p>
         */
        public Builder procTimeEnd(Long procTimeEnd) {
            this.putQueryParameter("ProcTimeEnd", procTimeEnd);
            this.procTimeEnd = procTimeEnd;
            return this;
        }

        /**
         * <p>The timestamp when the process starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1648809853000</p>
         */
        public Builder procTimeStart(Long procTimeStart) {
            this.putQueryParameter("ProcTimeStart", procTimeStart);
            this.procTimeStart = procTimeStart;
            return this;
        }

        /**
         * <p>The name or IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the account ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The user who runs the process.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyProcDetailRequest build() {
            return new DescribePropertyProcDetailRequest(this);
        } 

    } 

}
