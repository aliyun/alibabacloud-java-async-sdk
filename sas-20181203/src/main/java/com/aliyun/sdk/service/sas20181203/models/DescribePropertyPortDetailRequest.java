// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @NameInMap("Extend")
    private String extend;

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
        this.extend = builder.extend;
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
     * @return extend
     */
    public String getExtend() {
        return this.extend;
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
        private String extend; 
        private Integer pageSize; 
        private String port; 
        private String procName; 
        private String remark; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyPortDetailRequest request) {
            super(request);
            this.bindIp = request.bindIp;
            this.currentPage = request.currentPage;
            this.extend = request.extend;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.procName = request.procName;
            this.remark = request.remark;
            this.uuid = request.uuid;
        } 

        /**
         * The network protocol that is used by the listening port.
         */
        public Builder bindIp(String bindIp) {
            this.putQueryParameter("BindIp", bindIp);
            this.bindIp = bindIp;
            return this;
        }

        /**
         * The name of the server process.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The listening port.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * 50d213b4-3a35-427a-b8a5-04b0c7e1****
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The public IP address of the server.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The IP address that is bound to the listening port.
         */
        public Builder procName(String procName) {
            this.putQueryParameter("ProcName", procName);
            this.procName = procName;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The listening port of the server.
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
