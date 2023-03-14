// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLayer4RulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeLayer4RulesRequest</p>
 */
public class DescribeLayer4RulesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ForwardProtocol")
    private String forwardProtocol;

    @Query
    @NameInMap("FrontendPort")
    private Integer frontendPort;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Offset")
    @Validation(required = true)
    private Integer offset;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeLayer4RulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.instanceId = builder.instanceId;
        this.offset = builder.offset;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLayer4RulesRequest create() {
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
     * @return forwardProtocol
     */
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    /**
     * @return frontendPort
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeLayer4RulesRequest, Builder> {
        private String regionId; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 
        private Integer offset; 
        private String pageSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLayer4RulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.forwardProtocol = request.forwardProtocol;
            this.frontendPort = request.frontendPort;
            this.instanceId = request.instanceId;
            this.offset = request.offset;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
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
         * ForwardProtocol.
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.putQueryParameter("ForwardProtocol", forwardProtocol);
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * FrontendPort.
         */
        public Builder frontendPort(Integer frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeLayer4RulesRequest build() {
            return new DescribeLayer4RulesRequest(this);
        } 

    } 

}
