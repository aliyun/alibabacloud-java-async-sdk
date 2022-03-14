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
    @NameInMap("User")
    private String user;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribePropertyProcDetailRequest(Builder builder) {
        super(builder);
        this.cmdline = builder.cmdline;
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.procTimeEnd = builder.procTimeEnd;
        this.procTimeStart = builder.procTimeStart;
        this.remark = builder.remark;
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
        private String name; 
        private Integer pageSize; 
        private Long procTimeEnd; 
        private Long procTimeStart; 
        private String remark; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyProcDetailRequest request) {
            super(request);
            this.cmdline = request.cmdline;
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.procTimeEnd = request.procTimeEnd;
            this.procTimeStart = request.procTimeStart;
            this.remark = request.remark;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * Cmdline.
         */
        public Builder cmdline(String cmdline) {
            this.putQueryParameter("Cmdline", cmdline);
            this.cmdline = cmdline;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * ProcTimeEnd.
         */
        public Builder procTimeEnd(Long procTimeEnd) {
            this.putQueryParameter("ProcTimeEnd", procTimeEnd);
            this.procTimeEnd = procTimeEnd;
            return this;
        }

        /**
         * ProcTimeStart.
         */
        public Builder procTimeStart(Long procTimeStart) {
            this.putQueryParameter("ProcTimeStart", procTimeStart);
            this.procTimeStart = procTimeStart;
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
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * Uuid.
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
