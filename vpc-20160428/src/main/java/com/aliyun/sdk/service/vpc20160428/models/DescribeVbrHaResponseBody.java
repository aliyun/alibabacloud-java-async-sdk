// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVbrHaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVbrHaResponseBody</p>
 */
public class DescribeVbrHaResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    private String name;

    @NameInMap("PeerVbrId")
    private String peerVbrId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("VbrHaId")
    private String vbrHaId;

    @NameInMap("VbrId")
    private String vbrId;

    private DescribeVbrHaResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.name = builder.name;
        this.peerVbrId = builder.peerVbrId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.vbrHaId = builder.vbrHaId;
        this.vbrId = builder.vbrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVbrHaResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return peerVbrId
     */
    public String getPeerVbrId() {
        return this.peerVbrId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vbrHaId
     */
    public String getVbrHaId() {
        return this.vbrHaId;
    }

    /**
     * @return vbrId
     */
    public String getVbrId() {
        return this.vbrId;
    }

    public static final class Builder {
        private String creationTime; 
        private String description; 
        private String name; 
        private String peerVbrId; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String vbrHaId; 
        private String vbrId; 

        /**
         * The time when the VBR was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The description of the VBR failover group.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The name of the VBR failover group.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the other VBR in the VBR failover group.
         */
        public Builder peerVbrId(String peerVbrId) {
            this.peerVbrId = peerVbrId;
            return this;
        }

        /**
         * The ID of the region in which the VBR is deployed.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the VBR failover group.
         * <p>
         * 
         * *   **Creating**
         * *   **Active**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The ID of the VBR failover group.
         */
        public Builder vbrHaId(String vbrHaId) {
            this.vbrHaId = vbrHaId;
            return this;
        }

        /**
         * The VBR ID.
         */
        public Builder vbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }

        public DescribeVbrHaResponseBody build() {
            return new DescribeVbrHaResponseBody(this);
        } 

    } 

}
