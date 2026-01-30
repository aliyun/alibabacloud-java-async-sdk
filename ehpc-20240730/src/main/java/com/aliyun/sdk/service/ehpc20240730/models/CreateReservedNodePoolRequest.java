// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link CreateReservedNodePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateReservedNodePoolRequest</p>
 */
public class CreateReservedNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostPostfix")
    private String hostPostfix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostPrefix")
    private String hostPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateReservedNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.count = builder.count;
        this.description = builder.description;
        this.hostPostfix = builder.hostPostfix;
        this.hostPrefix = builder.hostPrefix;
        this.name = builder.name;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReservedNodePoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hostPostfix
     */
    public String getHostPostfix() {
        return this.hostPostfix;
    }

    /**
     * @return hostPrefix
     */
    public String getHostPrefix() {
        return this.hostPrefix;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateReservedNodePoolRequest, Builder> {
        private String clusterId; 
        private Integer count; 
        private String description; 
        private String hostPostfix; 
        private String hostPrefix; 
        private String name; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReservedNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.count = request.count;
            this.description = request.description;
            this.hostPostfix = request.hostPostfix;
            this.hostPrefix = request.hostPrefix;
            this.name = request.name;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * HostPostfix.
         */
        public Builder hostPostfix(String hostPostfix) {
            this.putQueryParameter("HostPostfix", hostPostfix);
            this.hostPostfix = hostPostfix;
            return this;
        }

        /**
         * HostPrefix.
         */
        public Builder hostPrefix(String hostPrefix) {
            this.putQueryParameter("HostPrefix", hostPrefix);
            this.hostPrefix = hostPrefix;
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
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateReservedNodePoolRequest build() {
            return new CreateReservedNodePoolRequest(this);
        } 

    } 

}
