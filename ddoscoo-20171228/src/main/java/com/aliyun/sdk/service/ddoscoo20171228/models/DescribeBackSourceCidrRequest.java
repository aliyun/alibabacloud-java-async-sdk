// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackSourceCidrRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackSourceCidrRequest</p>
 */
public class DescribeBackSourceCidrRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("Line")
    private String line;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeBackSourceCidrRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ipVersion = builder.ipVersion;
        this.line = builder.line;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackSourceCidrRequest create() {
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeBackSourceCidrRequest, Builder> {
        private String regionId; 
        private String ipVersion; 
        private String line; 
        private String resourceGroupId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackSourceCidrRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ipVersion = request.ipVersion;
            this.line = request.line;
            this.resourceGroupId = request.resourceGroupId;
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
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * Line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public DescribeBackSourceCidrRequest build() {
            return new DescribeBackSourceCidrRequest(this);
        } 

    } 

}
