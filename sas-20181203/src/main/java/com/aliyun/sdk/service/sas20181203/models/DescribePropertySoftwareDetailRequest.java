// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertySoftwareDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertySoftwareDetailRequest</p>
 */
public class DescribePropertySoftwareDetailRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Extend")
    private String extend;

    @Query
    @NameInMap("InstallTimeEnd")
    private Long installTimeEnd;

    @Query
    @NameInMap("InstallTimeStart")
    private Long installTimeStart;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SoftwareVersion")
    private String softwareVersion;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribePropertySoftwareDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.extend = builder.extend;
        this.installTimeEnd = builder.installTimeEnd;
        this.installTimeStart = builder.installTimeStart;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.remark = builder.remark;
        this.softwareVersion = builder.softwareVersion;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertySoftwareDetailRequest create() {
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
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return installTimeEnd
     */
    public Long getInstallTimeEnd() {
        return this.installTimeEnd;
    }

    /**
     * @return installTimeStart
     */
    public Long getInstallTimeStart() {
        return this.installTimeStart;
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
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertySoftwareDetailRequest, Builder> {
        private Integer currentPage; 
        private String extend; 
        private Long installTimeEnd; 
        private Long installTimeStart; 
        private String name; 
        private Integer pageSize; 
        private String path; 
        private String remark; 
        private String softwareVersion; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertySoftwareDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.extend = request.extend;
            this.installTimeEnd = request.installTimeEnd;
            this.installTimeStart = request.installTimeStart;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.remark = request.remark;
            this.softwareVersion = request.softwareVersion;
            this.uuid = request.uuid;
        } 

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether fuzzy search by software name is supported. If you want to use fuzzy search, set the parameter to 1. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * The timestamp generated when the software update ends. Unit: milliseconds.
         */
        public Builder installTimeEnd(Long installTimeEnd) {
            this.putQueryParameter("InstallTimeEnd", installTimeEnd);
            this.installTimeEnd = installTimeEnd;
            return this;
        }

        /**
         * The timestamp generated when the software update starts. Unit: milliseconds.
         */
        public Builder installTimeStart(Long installTimeStart) {
            this.putQueryParameter("InstallTimeStart", installTimeStart);
            this.installTimeStart = installTimeStart;
            return this;
        }

        /**
         * The name of the software.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The installation path of the software.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
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
         * The version of the software.
         */
        public Builder softwareVersion(String softwareVersion) {
            this.putQueryParameter("SoftwareVersion", softwareVersion);
            this.softwareVersion = softwareVersion;
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
        public DescribePropertySoftwareDetailRequest build() {
            return new DescribePropertySoftwareDetailRequest(this);
        } 

    } 

}
