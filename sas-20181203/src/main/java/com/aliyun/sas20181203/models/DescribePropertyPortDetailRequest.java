// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyPortDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyPortDetailRequest</p>
 */
public class DescribePropertyPortDetailRequest extends Request {
    @Query
    @NameInMap("BindIp")
    private String bindIp;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("ProcName")
    private String procName;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribePropertyPortDetailRequest(Builder builder) {
        super(builder);
        this.bindIp = builder.bindIp;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.procName = builder.procName;
        this.remark = builder.remark;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyPortDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindIp
     */
    public String getBindIp() {
        return this.bindIp;
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return procName
     */
    public String getProcName() {
        return this.procName;
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

    public static final class Builder extends Request.Builder<DescribePropertyPortDetailRequest, Builder> {
        private String bindIp; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String port; 
        private String procName; 
        private String remark; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyPortDetailRequest response) {
            super(response);
            this.bindIp = response.bindIp;
            this.currentPage = response.currentPage;
            this.pageSize = response.pageSize;
            this.port = response.port;
            this.procName = response.procName;
            this.remark = response.remark;
            this.uuid = response.uuid;
        } 

        /**
         * BindIp.
         */
        public Builder bindIp(String bindIp) {
            this.putQueryParameter("BindIp", bindIp);
            this.bindIp = bindIp;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * ProcName.
         */
        public Builder procName(String procName) {
            this.putQueryParameter("ProcName", procName);
            this.procName = procName;
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
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyPortDetailRequest build() {
            return new DescribePropertyPortDetailRequest(this);
        } 

    } 

}
