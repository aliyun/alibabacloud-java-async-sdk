// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortRequest} extends {@link RequestModel}
 *
 * <p>DescribePortRequest</p>
 */
public class DescribePortRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    private Integer frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendProtocol")
    private String frontendProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribePortRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.frontendPort = builder.frontendPort;
        this.frontendProtocol = builder.frontendProtocol;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return frontendPort
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return frontendProtocol
     */
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribePortRequest, Builder> {
        private String regionId; 
        private Integer frontendPort; 
        private String frontendProtocol; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePortRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.frontendPort = request.frontendPort;
            this.frontendProtocol = request.frontendProtocol;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The forward port to query. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder frontendPort(Integer frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * <p>The Forwarding Protocol type to query. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: TCP protocol.</li>
         * <li><strong>udp</strong>: UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder frontendProtocol(String frontendProtocol) {
            this.putQueryParameter("FrontendProtocol", frontendProtocol);
            this.frontendProtocol = frontendProtocol;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to query.</p>
         * <blockquote>
         * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-7e225i41****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number to return in a paged query. For example, set this parameter to <strong>1</strong> to return the first page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on each page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribePortRequest build() {
            return new DescribePortRequest(this);
        } 

    } 

}
