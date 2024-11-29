// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVbrHaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVbrHaResponseBody</p>
 */
public class DescribeVbrHaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PeerVbrId")
    private String peerVbrId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VbrHaId")
    private String vbrHaId;

    @com.aliyun.core.annotation.NameInMap("VbrId")
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
         * <p>The time when the VBR was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the VBR failover group.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the VBR failover group.</p>
         * 
         * <strong>example:</strong>
         * <p>VBRHa</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the other VBR in the VBR failover group.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp12mw1f8k3jgygk9****</p>
         */
        public Builder peerVbrId(String peerVbrId) {
            this.peerVbrId = peerVbrId;
            return this;
        }

        /**
         * <p>The ID of the region in which the VBR is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the VBR failover group.</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Active</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the VBR failover group.</p>
         * 
         * <strong>example:</strong>
         * <p>vbrha-sa1sxheuxtd98****</p>
         */
        public Builder vbrHaId(String vbrHaId) {
            this.vbrHaId = vbrHaId;
            return this;
        }

        /**
         * <p>The VBR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp1jcg5cmxjbl9xgc****</p>
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
