// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyProcDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyProcDetailRequest</p>
 */
public class DescribePropertyProcDetailRequest extends Request {
    @Query
    @NameInMap("Cmdline")
    private String cmdline;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Extend")
    private String extend;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProcTimeEnd")
    private Long procTimeEnd;

    @Query
    @NameInMap("ProcTimeStart")
    private Long procTimeStart;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @Query
    @NameInMap("User")
    private String user;

    @Query
    @NameInMap("Uuid")
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
         * The startup parameter of the process.
         */
        public Builder cmdline(String cmdline) {
            this.putQueryParameter("Cmdline", cmdline);
            this.cmdline = cmdline;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether fuzzy search by process name is supported. If you want to use fuzzy search, set the parameter to 1. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * The name of the process.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The timestamp when the process ends. Unit: milliseconds.
         */
        public Builder procTimeEnd(Long procTimeEnd) {
            this.putQueryParameter("ProcTimeEnd", procTimeEnd);
            this.procTimeEnd = procTimeEnd;
            return this;
        }

        /**
         * The timestamp when the process starts. Unit: milliseconds.
         */
        public Builder procTimeStart(Long procTimeStart) {
            this.putQueryParameter("ProcTimeStart", procTimeStart);
            this.procTimeStart = procTimeStart;
            return this;
        }

        /**
         * The name or IP address of the server.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The user who runs the process.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * The UUID of the server.
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
